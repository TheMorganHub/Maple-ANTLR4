grammar Maple;

parse
 : ( maple_stmt_list | error ) EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

maple_stmt_list
 : maple_stmt ( ';' )? ( ';' maple_stmt ( ';' )? )*?
 ;

maple_stmt
 : ( select_stmt
 | create_table_stmt
 | insert_stmt
 | delete_stmt
 | update_stmt
 | embedded_sql )
 ;

/*
Personas (
    nombre? int 5,
    apellido varchar(255) 'dorquin',
    grade varchar(255)
)
*/

create_table_stmt
 : table_name '(' ( column_def ( ',' column_def )*? )*? ')' ( foreign_key_create_table )*?
 ;

foreign_key_create_table
 : K_JOIN table_name
 ;

update_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )
 ( K_UPDATE update_value_set | select_stmt ) conditional?
 ;

delete_stmt
 : ( database_name '.' )? table_name K_INSERT ( conditional )?
 ;

//personas(nombre, apellido) <- ('va', 5);
insert_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
 ( K_INSERT ( insert_value_set | ( '(' insert_value_set ')' ( ',' '(' insert_value_set ')' )*? ) )
 | select_stmt
 )
 ;

insert_value_set
 : expr ( ',' expr )*?
 ;

update_value_set
 : expr ( ',' expr )*?
 ;

select_stmt
 : table_name table_alias? ( K_SELECT ( result_column ( ',' result_column )*? )? ( join_stmt )*? )? ( conditional )?
 ;

join_stmt
 : ( K_JOIN | left=K_LEFT_JOIN | right=K_RIGHT_JOIN ) ('(' select_stmt ')' table_alias
 | table_name table_alias? ) join_constraint?
 ;

join_constraint
 : K_ON expr
 ;

conditional
 : K_WHERE expr
 ;

column_def
 : column_name ( column_modifier )? column_type ( default_value )?
 ;

column_type
 : ( any_name ( '(' signed_number ')'
         | '(' signed_number ',' signed_number ')' )? )
 ;

default_value
 : ( STRING_LITERAL | NUMERIC_LITERAL )
 ;

expr
 : literal_value
 | ( ( database_name '.' )? table_name '.' )? column_name
 | left=expr operator=( '*' | '/' | '%' ) right=expr
 | left=expr operator=( '+' | '-' ) right=expr
 | left=expr operator=( '=' | '==' | '!=' | '<' | '<=' | '>' | '>=' | K_IS | K_ISNOT | K_LIKE | K_NOTLIKE | K_NOTIN | K_IN | K_BETWEEN | K_NOTBETWEEN ) right=expr
 | left=expr operator=( K_ISNOTNULL | K_ISNULL )
 | left=expr operator=K_AND right=expr
 | left=expr operator=K_OR right=expr
 | function
 | '(' select_stmt ')'
 | '(' expr ')'
 ;

function
 : function_name '(' ( expr ( ',' expr )* | '*')? ')'
 ;

result_column
 : expr | expr column_alias?
 ;

column_modifier
 : nullable_column='?'
 | primary_key='$'
 ;

column_name
 : any_name | '*'
 ;

table_name
 : any_name
 ;

table_alias
 : any_name
 ;

column_alias
 : any_name
 ;

database_name
 : any_name
 ;

function_name
 : any_name
 ;

signed_number
 : ( '+' | '-' )? NUMERIC_LITERAL
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 ;

any_name
 : IDENTIFIER
 | '(' any_name ')'
 ;

embedded_sql
 : K_OPEN_SQL_STMT any_stmt K_CLOSE_SQL_STMT
 ;

any_stmt
 : .*?
 ;

K_SELECT : '->';
K_INSERT : '<-';
K_UPDATE : '<<-';
K_LEFT_JOIN : '<<>';
K_RIGHT_JOIN : '<>>';
K_JOIN : '<>';
K_OPEN_SQL_STMT : '<?';
K_CLOSE_SQL_STMT : '?>';
K_WHERE : '?';
K_PK : '$';

K_AND : A N D;
K_NOTBETWEEN : K_NOT SPACES+ K_BETWEEN;
K_BETWEEN : B E T W E E N;
K_IN : I N;
K_INNER : I N N E R;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S SPACES+ N U L L;
K_ISNOTNULL : K_ISNOT SPACES+ K_NULL;
K_ISNOT : I S SPACES+ N O T;
K_NOTIN: N O T SPACES+ I N;
K_NOTLIKE: N O T SPACES+ K_LIKE;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_NOT : N O T;
K_NOTNULL : N O T SPACES+ N U L L;
K_NULL : N U L L;
K_OF : O F;
K_ON : O N;
K_OR : O R;
K_WHEN : W H E N;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | [a-zA-Z_] [a-zA-Z_0-9]*
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
