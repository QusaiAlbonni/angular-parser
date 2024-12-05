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
    | throwStatement;

variableDeclaration
    : (LET | CONST) ID ASSIGN expression SEMICOLON?
    | (LET | CONST) ID SEMICOLON?;

functionDeclaration
    : FUNCTION ID LPAREN parameterList? RPAREN blockStatement;

parameterList
    : parameter (COMMA parameter)*;

parameter
    : ID
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
    : classMember*;

classMember
    : PUBLIC? PRIVATE? PROTECTED? STATIC? ID COLON typeAnnotation SEMICOLON
    | constructorDeclaration
    | variableDeclaration
    | methodDeclaration
    | enumDeclaration;// إضافة تعريف المُنشئات;

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
    : IMPORT LBRACE? STAR? (AS)?|( STRING | ID (AS ID)? (COMMA ID)* (AS ID)? RBRACE? FROM STRING) SEMICOLON?;

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

primaryExpression
    : ID
    | STRING
    | THIS
    | NUMBER
    | BOOLEAN
    | NULL
    | UNDEFINED
    | LPAREN expression RPAREN
    | primaryExpression LPAREN argumentList? RPAREN
    | primaryExpression DOT ID
    | NEW ID LPAREN argumentList? RPAREN;  // Handles 'new Greeter("John")'


argumentList
    : (expression (COMMA expression)*)?
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
        (variableDeclaration | assignmentExpression | expression)?
        SEMICOLON
        expression?
        SEMICOLON
        (incrementExpression | assignmentExpression | expression)?  // Handling the increment (i++)
      RPAREN
      statement;

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