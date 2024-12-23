lexer grammar AngularLexer;

@lexer::members {
    private int currentContext = 0;

    private boolean isLastMode() {
        return _modeStack.size() <= 1;
    }

    private void pushModeWithContext(int mode, int context) {
            pushMode(mode);
            currentContext = context;
    }

    public int getContext(){
        return currentContext;
    }

    public void setContext(int value){
        currentContext = value;
    }
}

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
FUNCTION: 'function';
RETURN: 'return';
LET: 'let';
CONST: 'const';
CLASS: 'class';
INTERFACE: 'interface';
ENUM: 'enum';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
SUPER: 'super';
IMPORT: 'import';
EXPORT: 'export';
AS: 'as';
FROM: 'from';
NEW: 'new';
THIS: 'this';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
STATIC: 'static';
VOID: 'void';
TYPE: 'type';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
THROW: 'throw';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE: 'continue';
DO: 'do';
EVENT: 'event';
DECORATOR: '@';
OF: 'of';
IN: 'in';
INSTANCEOF: 'instanceof';
AWAIT: 'await';
ASYNC: 'async';
YIELD: 'yield';
CONSTRUCTOR: 'constructor';
COMPONENT: 'component';
SERVICE: 'service';
PROPERTY: 'property';
TEMPLATE: 'template' (WS | NEWLINE)* COLON (WS | NEWLINE)* '`' -> pushMode(HTML);

ID: [a-zA-Z_$] [a-zA-Z0-9_$]*;

STRING: DQOUTE_STRING | '\'' (~['\\] | '\\' .)* '\'' | '`' (~[`\\] | '\\' .)* '`';
DQOUTE_STRING: '"' (~["\\] | '\\' .)* '"';

NUMBER: [0-9]+ ( '.' [0-9]+ )? ( [eE] [+-]? [0-9]+ )?;
HEX_NUMBER: '0x' [0-9a-fA-F]+;
OCTAL_NUMBER: '0o' [0-7]+;
BINARY_NUMBER: '0b' [01]+;
BOOLEAN: 'true' | 'false';
NULL: 'null';
UNDEFINED: 'undefined';
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
POWER: '**';
EQUAL: '==';
STRICT_EQUAL: '===';
NOT_EQUAL: '!=';
STRICT_NOT_EQUAL: '!==';
LESS: '<';
GREATER: '>';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
AND: '&&';
OR: '||';
NOT: '!';
BITWISE_AND: '&';
BITWISE_OR: '|';
BITWISE_XOR: '^';
BITWISE_NOT: '~';
SHIFT_LEFT: '<<';
SHIFT_RIGHT: '>>';
UNSIGNED_SHIFT_RIGHT: '>>>';
ARROW: '=>';
OPTIONAL_CHAINING: '?.';
NULLISH_COALESCING: '??';
NULLISH_ASSIGN: '??=';
INCRES:'++';
DECRES:'--';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
ELLIPSIS: '...';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
QUESTION: '?';
PIPE: '|';
BACKTICK: '`';

ANY: 'any';
NUMBER_TYPE: 'number';
STRING_TYPE: 'string';
BOOLEAN_TYPE: 'boolean';
VOID_TYPE: 'void';
UNKNOWN: 'unknown';
NEVER: 'never';

HANDLEBAR_CLOSE: '}}' {(getContext() == 1) && !isLastMode()}? -> popMode;

REGEX: '/' ( ~[/\\\r\n] | '\\' . )+ '/' [gimuy]*;

WS: [ \t]+ -> skip;
NEWLINE: ('\r'? '\n' | '\r') -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

ERROR: . ;

mode HTML;

ESCAPE: '`' -> popMode;

HTML_COMMENT: '<!--' .*? '-->';

HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';

XML: '<?xml' .*? '>';

CDATA: '<![CDATA[' .*? ']]>';

DTD: '<!' .*? '>';

SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS: (' ' | '\t' | '\r'? '\n')+;

SCRIPT_OPEN: '<script' .*? '>';

STYLE_OPEN: '<style' .*? '>';

TAG_OPEN: '<' -> pushMode(TAG);

HANDLEBAR_OPEN: '{{' { setContext(1) } -> pushMode(DEFAULT_MODE);

HTML_TEXT: ~[<`{}]+;

// tag declarations
mode TAG;

TAG_CLOSE: '>' -> popMode;

TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';

TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

TAG_LBRACKET: '[';

TAG_RBRACKET: ']';

TAG_LPAREN: '(';

TAG_RPAREN: ')';

ANG_FOR: '*ngFor';

ANG_IF: '*ngIf';

// lexing mode for attribute values

TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;

fragment HEXDIGIT: [a-fA-F0-9];

fragment DIGIT: [0-9];

fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300' ..'\u036F'
    | '\u203F' ..'\u2040'
;

fragment TAG_NameStartChar:
    [:a-zA-Z]
    | '\u2070' ..'\u218F'
    | '\u2C00' ..'\u2FEF'
    | '\u3001' ..'\uD7FF'
    | '\uF900' ..'\uFDCF'
    | '\uFDF0' ..'\uFFFD'
;

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;

ATTRIBUTE: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;

fragment ATTCHARS: ATTCHAR+ ' '?;

fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';

fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';


