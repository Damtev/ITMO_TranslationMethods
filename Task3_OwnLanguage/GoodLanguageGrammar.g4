grammar GoodLanguageGrammar;

program : blocks EOF;

blocks : (variableDeclaration | functionDeclaration)* mainBlock;

functionDeclaration : type NAME LPAREN args RPAREN functionBlock;
functionBlock : LCURLY statements returnStatement RCURLY;
args : (type NAME (COMMA type NAME)*)?;
returnStatement : RETURN expression SEMICOLON;

variableDeclaration : type NAME ASSIGN expression SEMICOLON;

mainBlock : MAIN codeBlock;

codeBlock : LCURLY statements RCURLY;
statements : (simpleStatement | complexStatement | variableDeclarationInsideCodeBlock)*;
simpleStatement : (assignmentStatement | functionCall) SEMICOLON;
assignmentStatement : NAME ASSIGN expression;
functionCall : NAME LPAREN parameters RPAREN;
parameters : (expression (COMMA expression)*)?;

variableDeclarationInsideCodeBlock : variableDeclaration;

expression : simpleExpression (minimalPriorityOperator expression)?;
simpleExpression : term (middlePriorityOperator simpleExpression)?;
term : signedFactor (maximumPriorityOperator term)? ;
signedFactor : (PLUS | MINUS)? factor;
factor : varName | LPAREN expression RPAREN | functionCall | NOT factor | bool | value;
value : NUMBER #numberConst | LITERAL #literalConst;

varName : NAME;

complexStatement : codeBlock | ifStatement | loopStatement;
ifStatement : IF LPAREN expression RPAREN codeBlock (ELSE codeBlock)?;
loopStatement : whileStatement | forStatement;
whileStatement : WHILE LPAREN expression RPAREN codeBlock;
forStatement : FOR LPAREN NAME IN (NUMBER | NAME) DOUBLEDOT (NUMBER | NAME) (STEP (NUMBER | NAME))? RPAREN codeBlock;

maximumPriorityOperator : MULT | MOD | AND;
middlePriorityOperator : PLUS | MINUS | OR;
minimalPriorityOperator : EQUAL | NOT_EQUAL | LT | LTE | GTE | GT;

type : INT | BOOL | STRING | FLOAT | CHAR;
bool : TRUE | FALSE;

// main keyword
MAIN : 'main';

// types
INT : 'int';
BOOL : 'bool';
STRING : 'string';
FLOAT : 'float';
CHAR : 'char';

// others
LCURLY : '{';
RCURLY : '}';
LPAREN : '(';
RPAREN : ')';
SEMICOLON : ';';
COMMA : ',';
DOT : '.';
DOUBLEDOT : '..';

// arithmetic operators
ASSIGN : '=';
PLUS : '+';
MINUS : '-';
MULT : '*';
MOD : '%';

// comparison operators
EQUAL : '==';
NOT_EQUAL : '!=';
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';

// boolean operations
OR : '|';
AND : '&';
NOT : '!';

// boolean constants
TRUE : 'true';
FALSE : 'false';

// branch
IF : 'if';
ELSE : 'else';

RETURN : 'return';

// loop
FOR : 'for';
WHILE : 'while';
IN : 'in';
STEP : 'step';

LITERAL : '\'' ('\'\'' | ~ ('\''))* '\'';

fragment DIGITS : ('0' .. '9')+;
fragment SIGN : ('+' | '-');
NUMBER : (SIGN)? DIGITS (DOT DIGITS)?;
NAME : ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
WS : [ \t\r\n] -> skip;