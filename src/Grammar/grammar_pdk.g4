grammar grammar_pdk;
forms : form* EOF ;
form : ( functionDefiniction | attribution)  '.';

variable : VARIABLE;
VARIABLE : [a-zA-Z][a-z0-9A-Z_]*;

tokFloat : FLOAT;
FLOAT : '-'? [0-9]+ '.' [0-9]+ ;

tokInteger : INTEGER ;
INTEGER : '-'? [0-9]+ ;

tokString : STRING;
STRING : '"' ~('"')* '"';

tokTable : ('['expr  (',' expr)* ']') | '[' ']';

varExpr : variable
    | tokFloat
    | tokInteger
    | tokString
    | tokTable
    | 'null'
    ;


COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;

WHITE_SPACE : [ \t\r\n]+ -> skip ;

attribution : variable '=' expr;

functionCall : variable (expr)*;

functionDefiniction : variable (variable)* '->' clauses;

clauses : clause (',' clause)*;

clause : ifClause
    | attribution
    | expr
    | functionCall
    ;


expr : '(' expr ')'
    | expr multOp expr
    | expr addOp expr
    | expr compOp expr
    | prefixOp expr
    | varExpr
    | functionCall
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