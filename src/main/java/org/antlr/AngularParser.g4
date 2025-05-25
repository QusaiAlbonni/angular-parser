parser grammar AngularParser;

options { tokenVocab = AngularLexer; }

program: statement* # ProgramLable;

// Statement labels
statement
    : variableDeclaration # VariableDeclarationLabel
    | functionDeclaration # FunctionDeclarationLabel
    | classDeclaration # ClassDeclarationLabel
    | enumDeclaration # EnumDeclarationLabel
    | componentDeclaration # ComponentDeclarationLabel
    | serviceDeclaration # ServiceDeclarationLabel
    | importStatement # ImportStmtLabel
    | exportStatement # ExportStmtLabel
    | expressionStatement # ExpressionStmtLabel
    | blockStatement # BlockStmtLabel
    | ifStatement # IfStmtLabel
    | forStatement # ForStmtLabel
    | whileStatement # WhileStmtLabel
    | doWhileStatement # DoWhileStmtLabel
    | switchStatement # SwitchStmtLabel
    | tryCatchStatement # TryCatchStmtLabel
    | returnStatement # ReturnStmtLabel
    | breakStatement # BreakStmtLabel
    | continueStatement # ContinueStmtLabel
    | throwStatement # ThrowStmtLabel
    | decoratorApplication # DecoratorApplicationLabel;

variableDeclaration
    : (LET | CONST) ID ASSIGN expression # InitializedVariableDeclaration
    | (LET | CONST) ID # UninitializedVariableDeclaration;

functionDeclaration
    : FUNCTION ID LPAREN parameterList? RPAREN blockStatement # FunctionDecl;

// Parameter list
parameterList
    : parameter (COMMA parameter)* # ParamListLabel;

parameter
    : expressionStatement # ExpressionParameter
    | ID COLON typeAnnotation # TypedParameter;

typeAnnotation
    : ANY # AnyType
    | NUMBER_TYPE # NumberType
    | STRING_TYPE # StringType
    | BOOLEAN_TYPE # BooleanType
    | VOID_TYPE # VoidType
    | UNKNOWN # UnknownType
    | NEVER # NeverType
    | ID # CustomType;

classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LBRACE classBody RBRACE # ClassDecl;

// Class body
classBody
    : (classMember SEMICOLON?)* # ClassBodyLabel;


classMember
    : PUBLIC? PRIVATE? PROTECTED? STATIC? ID COLON typeAnnotation # PropertyDeclarationLable
    | constructorDeclaration # ConstructorDeclarationLable
    | variableDeclaration # ClassVariableDeclaration
    | expressionStatement # ClassExpressionStatement
    | methodDeclaration # MethodDeclarationLable
    | enumDeclaration # ClassEnumDeclaration
    | functionDeclaration # ClassFunctionDeclaration;

// Object body
objectBody
    : (objectMember (COMMA objectMember)* COMMA?)? # ObjBodyLabel;


objectMember
    : template # TemplateMember
    | ID COLON expression # PropertyMember;

template
    : TEMPLATE SEA_WS* htmlElements* SEA_WS* ESCAPE # TemplateLiteral;

htmlElements:
    htmlMisc* htmlElement htmlMisc* # HtmlElementGroup;

// HTML elements
htmlElement
    : TAG_OPEN TAG_NAME (htmlAttribute | angularAttribute)*
        (
            (TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)
            | TAG_SLASH_CLOSE
        ) # HtmlElementLabel;

htmlAttribute
    : (TAG_NAME) (TAG_EQUALS ATTVALUE_VALUE)? # HtmlAttrLabel;


// Angular attributes
angularAttribute
    : bindingAttribute # BindingAttrLabel
    | eventBindingAttribute # EventBindingAttrLabel
    | forAttribute # ForDirectiveLabel
    | ifAttribute # IfDirectiveLabel;


bindingAttribute
    : TAG_LBRACKET TAG_NAME TAG_RBRACKET (TAG_EQUALS ATTVALUE_VALUE)? # PropertyBinding;

eventBindingAttribute
    : TAG_LPAREN TAG_NAME TAG_RPAREN (TAG_EQUALS ATTVALUE_VALUE)? # EventBinding;

forAttribute
    : ANG_FOR (TAG_EQUALS ATTVALUE_VALUE)? # ForDirective;

ifAttribute
    : ANG_IF (TAG_EQUALS ATTVALUE_VALUE)? # IfDirective;

// Content handling
htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)* # HtmlContentLabel;

htmlMisc
    : htmlComment # HtmlCommentMisc
    | SEA_WS # HtmlWhitespaceMisc;

htmlComment
    : HTML_COMMENT # HtmlCommentLabel
    | HTML_CONDITIONAL_COMMENT # HtmlConditionalCommentLabel;

htmlChardata
    : angularCharData # AngularChardata
    | HTML_TEXT # HtmlTextChardata
    | SEA_WS # HtmlWhitespaceChardata;


angularCharData
    : HTML_TEXT? SEA_WS? HANDLEBAR_OPEN expressionStatement? HANDLEBAR_CLOSE SEA_WS? HTML_TEXT? # Interpolation;

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN blockStatement # ConstructorDecl;

methodDeclaration
    : ID LPAREN parameterList? RPAREN typeAnnotation? blockStatement # MethodDecl;

enumDeclaration
    : ENUM ID LBRACE enumMember (COMMA enumMember)* RBRACE # EnumDecl;

enumMember
    : ID (ASSIGN expression)? # EnumMemberDecl;

componentDeclaration
    : COMPONENT ID LBRACE propertyDeclaration* RBRACE # ComponentDecl;

serviceDeclaration
    : SERVICE ID LBRACE methodDeclaration* RBRACE # ServiceDecl;

propertyDeclaration
    : PROPERTY ID COLON typeAnnotation SEMICOLON # PropertyDecl;

importStatement
    : IMPORT LBRACE? STAR?(AS)?(STRING | ID (AS ID)? (COMMA ID)* (AS ID)? RBRACE? FROM STRING) SEMICOLON? # ImportDecl;

exportStatement
    : EXPORT variableDeclaration SEMICOLON? # ExportVariable
    | EXPORT functionDeclaration SEMICOLON? # ExportFunction
    | EXPORT classDeclaration SEMICOLON? # ExportClass
    | EXPORT ID SEMICOLON? # ExportIdentifier;

expressionStatement
    : expression # ExpressionLable
    | incrementExpression # IncrementExpressionLable;

// Expressions
expression
    : conditionalExpression # ConditionalExprLabel;

conditionalExpression
    : logicalExpression (QUESTION expression COLON expression)? # TernaryExpression;

logicalExpression
    : binaryExpression ((AND | OR | BITWISE_AND | BITWISE_OR | BITWISE_XOR | BITWISE_NOT) binaryExpression)* # LogicalExpr;

binaryExpression
    : primaryExpression ((PLUS | MINUS | MULTIPLY | DIVIDE | MODULO | POWER | ASSIGN | NOT_EQUAL | LESS | GREATER | LESS_EQUAL | GREATER_EQUAL | STRICT_NOT_EQUAL | STRICT_EQUAL | EQUAL | INCRES | DECRES) primaryExpression)* # BinaryExpr;

arrayDeclaration
    : LBRACKET argumentList RBRACKET # ArrayLiteral;

objectDeclaration
    : '{' objectBody '}' # ObjectLiteral;

primaryExpression
    : ID # Identifier
    | STRING # StringLiteral
    | THIS # ThisLiteral
    | NUMBER # NumberLiteral
    | BOOLEAN # BooleanLiteral
    | NULL # NullLiteral
    | UNDEFINED # UndefinedLiteral
    | THIS # ThisReference
    | LPAREN expression RPAREN # ParenthesizedExpression
    | objectDeclaration # ObjectExpression
    | arrayDeclaration # ArrayExpression
    | primaryExpression LPAREN argumentList? RPAREN # FunctionCall
    | primaryExpression DOT primaryExpression # MemberAccess
    | NEW ID LPAREN argumentList? RPAREN # NewExpression;

argumentList
    : (expression (COMMA expression)* COMMA?)? # Arguments;

assignmentExpression
    : ID ASSIGN expression # Assignment;

blockStatement
    : LBRACE statement* SEMICOLON? RBRACE # Block;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)? # IfElseStatement;

forStatement
    : FOR LPAREN
        (forOf
        | ((variableDeclaration | assignmentExpression | expression)?
        SEMICOLON
        expression?
        SEMICOLON
        (incrementExpression | assignmentExpression | expression)?))
      RPAREN
      (blockStatement
      | expressionStatement) # ForLoop;

forOf
    : variableDeclaration OF expression # ForOfLoop;

incrementExpression
    : ID (INCRES | DECRES) # IncrementDecrLabel;

whileStatement
    : WHILE LPAREN expression RPAREN statement # WhileLoop;

doWhileStatement
    : DO statement WHILE LPAREN expression RPAREN SEMICOLON? # DoWhileLoop;

switchStatement
    : SWITCH LPAREN expression RPAREN LBRACE caseStatement* RBRACE # Switch;

caseStatement
    : CASE expression COLON statement* # Case
    | DEFAULT COLON statement* # DefaultCase;

tryCatchStatement
    : TRY blockStatement CATCH LPAREN ID RPAREN blockStatement (FINALLY blockStatement)? # TryCatchFinally;

returnStatement
    : RETURN expression? SEMICOLON? # Return;

breakStatement
    : BREAK SEMICOLON? # Break;

continueStatement
    : CONTINUE SEMICOLON # Continue;

throwStatement
    : THROW expression SEMICOLON # Throw;

readError
    : ID ASSIGN expression SEMICOLON # ReadErrorAssignment
    | ID SEMICOLON # ReadErrorIdentifier;

decoratorApplication
    : DECORATOR ID (LPAREN parameterList? RPAREN)? # Decorator;
