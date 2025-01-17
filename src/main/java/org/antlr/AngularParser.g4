parser grammar AngularParser;

options { tokenVocab = AngularLexer; }

program: statement*;

statement
    : variableDeclaration
    | functionDeclaration
    | classDeclaration
    | enumDeclaration
    | componentDeclaration
    | serviceDeclaration
    | importStatement
    | exportStatement
    | expressionStatement
    | blockStatement
    | ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    | tryCatchStatement
    | returnStatement
    | breakStatement
    | continueStatement
    | throwStatement
    | decoratorApplication;

variableDeclaration
    : (LET | CONST) ID ASSIGN expression
    | (LET | CONST) ID;

functionDeclaration
    : FUNCTION ID LPAREN parameterList? RPAREN blockStatement;

parameterList
    : parameter (COMMA parameter)*;

parameter
    : expressionStatement
    | ID COLON typeAnnotation;

typeAnnotation
    : ANY
    | NUMBER_TYPE
    | STRING_TYPE
    | BOOLEAN_TYPE
    | VOID_TYPE
    | UNKNOWN
    | NEVER
    | ID;

classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LBRACE classBody RBRACE;

classBody
    : (classMember SEMICOLON?)*;

classMember
    : PUBLIC? PRIVATE? PROTECTED? STATIC? ID COLON typeAnnotation
    | constructorDeclaration
    | variableDeclaration
    | expressionStatement
    | methodDeclaration
    | enumDeclaration
    |functionDeclaration
    ;

objectBody
    : ( objectMember (COMMA objectMember)* COMMA? )?
    ;

objectMember
    : template
    | ID COLON expression
    ;

template
    : TEMPLATE SEA_WS* htmlElements* SEA_WS* ESCAPE
    ;

htmlElements:
    htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    :
    TAG_OPEN TAG_NAME (htmlAttribute | angularAttribute)*
            ((TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)) | TAG_SLASH_CLOSE)
    ;

htmlAttribute
    : ( TAG_NAME) (TAG_EQUALS ATTVALUE_VALUE)?
    ;

angularAttribute
    :
    bindingAttribute
    | eventBindingAttribute
    | forAttribute
    | ifAttribute
    ;

bindingAttribute
    :
    TAG_LBRACKET TAG_NAME TAG_RBRACKET (TAG_EQUALS ATTVALUE_VALUE)?
    ;

eventBindingAttribute
    :
    TAG_LPAREN TAG_NAME TAG_RPAREN (TAG_EQUALS ATTVALUE_VALUE)?
    ;

forAttribute
    :
    ANG_FOR (TAG_EQUALS ATTVALUE_VALUE)?
    ;

ifAttribute
    :
    ANG_IF (TAG_EQUALS ATTVALUE_VALUE)?
    ;


htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

htmlChardata
    :
    angularCharData
    | HTML_TEXT
    | SEA_WS
    ;

angularCharData
    :
    HTML_TEXT? SEA_WS? HANDLEBAR_OPEN expressionStatement? HANDLEBAR_CLOSE SEA_WS? HTML_TEXT?
    ;

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN blockStatement;


methodDeclaration
    : ID LPAREN parameterList? RPAREN  typeAnnotation? blockStatement;

enumDeclaration
    : ENUM ID LBRACE enumMember (COMMA enumMember)* RBRACE;

enumMember
    : ID (ASSIGN expression)?;

componentDeclaration
    : COMPONENT ID LBRACE propertyDeclaration* RBRACE;

serviceDeclaration
    : SERVICE ID LBRACE methodDeclaration* RBRACE;

propertyDeclaration
    : PROPERTY ID COLON typeAnnotation SEMICOLON;

importStatement
    : IMPORT LBRACE? STAR?(AS)?( STRING | ID (AS ID)? (COMMA ID)* (AS ID)? RBRACE? FROM STRING) SEMICOLON?;

exportStatement
    : EXPORT variableDeclaration SEMICOLON?
    | EXPORT functionDeclaration SEMICOLON?
    | EXPORT classDeclaration SEMICOLON?
    | EXPORT ID SEMICOLON?;  // For exporting just a simple identifier (e.g., a constant)

expressionStatement
    : expression
    | incrementExpression;

expression
    : conditionalExpression
    ;

conditionalExpression
    : logicalExpression (QUESTION expression COLON expression)?
    ;

logicalExpression
    : binaryExpression ( (AND | OR | BITWISE_AND | BITWISE_OR | BITWISE_XOR | BITWISE_NOT) binaryExpression )*
    ;

binaryExpression
    : primaryExpression ( (PLUS | MINUS | MULTIPLY | DIVIDE | MODULO | POWER | ASSIGN|NOT_EQUAL|LESS|GREATER|LESS_EQUAL|GREATER_EQUAL|STRICT_NOT_EQUAL|STRICT_EQUAL|EQUAL|INCRES|DECRES) primaryExpression )*
    ;

arrayDeclaration:
LBRACKET argumentList RBRACKET;

objectDeclaration:
'{' objectBody '}';

primaryExpression
    : ID
    | STRING
    | THIS
    | NUMBER
    | BOOLEAN
    | NULL
    | UNDEFINED
    | THIS
    | LPAREN expression RPAREN
    | objectDeclaration
    | arrayDeclaration
    | primaryExpression LPAREN argumentList? RPAREN //function call
    | primaryExpression DOT primaryExpression //dot notation
    | NEW ID LPAREN argumentList? RPAREN;  // object instantiation 'new Greeter("John")'

argumentList
    : (expression (COMMA expression)* COMMA?)?
    ;

assignmentExpression
    : ID ASSIGN expression
    ;

blockStatement
    : LBRACE  statement*  SEMICOLON? RBRACE ;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?;

forStatement
    : FOR LPAREN
        (forOf
        | ((variableDeclaration | assignmentExpression | expression)?
        SEMICOLON
        expression?
        SEMICOLON
        (incrementExpression | assignmentExpression | expression)?))  // Handling the increment (i++)
      RPAREN
      (blockStatement
      | expressionStatement)
      ;
forOf
    :
    variableDeclaration OF expression
    ;

incrementExpression
    : ID (INCRES | DECRES);  // Handles i++ or i--


whileStatement
    : WHILE LPAREN expression RPAREN statement;


doWhileStatement
    : DO statement WHILE LPAREN expression RPAREN SEMICOLON?;

switchStatement
    : SWITCH LPAREN expression RPAREN LBRACE caseStatement* RBRACE;

caseStatement
    : CASE expression COLON statement*
    | DEFAULT COLON statement*;

tryCatchStatement
    : TRY blockStatement CATCH LPAREN ID RPAREN blockStatement (FINALLY blockStatement)?;

returnStatement
    : RETURN expression? SEMICOLON?;

breakStatement
    : BREAK SEMICOLON?;

continueStatement
    : CONTINUE SEMICOLON;

throwStatement
    : THROW expression SEMICOLON;
readError
    : ID ASSIGN expression SEMICOLON
    | ID SEMICOLON;

decoratorApplication:
    DECORATOR ID (LPAREN parameterList? RPAREN)?;