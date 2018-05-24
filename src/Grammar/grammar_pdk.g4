grammar grammar_pdk;
forms : form* EOF ;

form : functionDefiniction '.'  #form_functionDefiniction
    | attribution '.'          #form_attribution
    ;

variable : VARIABLE;
VARIABLE : [a-zA-Z][a-z0-9A-Z_]*;

tokFloat : FLOAT;
FLOAT :  [0-9]+ '.' [0-9]+ ;

tokInteger : INTEGER ;
INTEGER :  [0-9]+ ;

tokString : STRING;
STRING : '"' ~('"')* '"';

tokTable : ('['expr  (',' expr)* ']') | '[' ']';

varExpr : variable  #varExpr_variable
    | tokFloat      #varExpr_tokFloat
    | tokInteger    #varExpr_tokInteger
    | tokString     #varExpr_tokString
    | tokTable      #var_Expr_tokTable
    | 'null'        #varExpr_null
    ;


COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;

WHITE_SPACE : [ \t\r\n]+ -> skip ;

attribution : variable '=' expr;

functionCall : variable (expr)*;

functionDefiniction : variable (variable)* '->' clauses;

clauses : clause (',' clause)*;

clause : ifClause       # clause_ifClause
    | attribution       # clause_attribution
    | functionCall      # clause_functionCall
    | expr              # clause_expr
    ;


expr : '(' expr ')'     #expr_bracket
    | expr multOp expr  #expr_mult
    | expr addOp expr   #expr_add
    | expr compOp expr  #expr_comp
    | prefixOp expr     #expr_prefix
    | varExpr           #expr_varExpr
    | functionCall      #expr_functionCall
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