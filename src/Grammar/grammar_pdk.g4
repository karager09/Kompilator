grammar grammar_pdk;
forms : form+ EOF ;
form : ( functionDefiniction | attribution)  '.';

variable : VARIABLE;
VARIABLE : [a-zA-Z][a-z0-9A-Z_]*;

float : FLOAT;
FLOAT : '-'? [0-9]+ '.' [0-9]+ ;

integer : INTEGER ;
INTEGER : '-'? [0-9]+ ;

string : STRING;
STRING : '"' ~('"')* '"';

table : ('['expr  (',' expr)* ']') | '[' ']';

varExpr : variable
    | float
    | integer
    | string
    | table
    | 'null'
    ;


COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;

WHITE_SPACE : [ \t\r\n]+ -> skip ;

attribution : variable '=' expr;

functionCall : variable (expr)*;

functionDefiniction : variable (variable)* '->' clauses;

clauses : clause (',' clause)*;

clause : attribution
    | functionCall
    | expr;


expr : ifClause
    | '(' expr ')'
    | functionCall
    | expr multOp expr
    | expr addOp expr
    | expr compOp expr
    | prefixOp expr
    | varExpr
    ;

ifExpr : '|' expr '->' blockInstruction;

ifClause : ifExpr (';' ifExpr)* ;

blockInstruction :  '{' clauses '}' | clause;

prefixOp : '+'
         | '-'
         | '!'
         ;
multOp : '/'
       | '*'
       | '%'
       | '&&'
       ;
addOp : '+'
      | '-'
      | '||'
      ;

compOp : '=='
       | '!='
       | '=<'
       | '<'
       | '>='
       | '>'
       ;


