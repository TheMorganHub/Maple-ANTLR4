grammar Maple;

parse
 : ( maple_stmt_list | error ) EOF
 ;

error
 : UNEXPECTED_CHAR
 ;

maple_stmt_list
 : maple_stmt*
 ;

maple_stmt
 : maple_block | complex_block | ( ( create_table_stmt | insert_stmt
 | delete_stmt | update_stmt | embedded_sql | select_stmt ) ( ';' )? )
 ;

complex_block
 : if_block
 ;

maple_block
 : block_action_name block_name? block_params? '{' block_statement* '}'
 ;

if_block
 : K_IF block_params_expr_declaration '{' block_statement* '}' ( elseif_block )*? ( else_block )?
 ;

elseif_block
 : K_ELSEIF block_params_expr_declaration '{' block_statement* '}'
 ;

else_block
 : K_ELSE '{' block_statement* '}'
 ;

block_params
 : block_params_declaration | block_params_expr_declaration
 ;

block_params_declaration
 : '(' ( block_datatype_param ( ',' block_datatype_param )*? ) ')' | '(' ')'
 ;

block_datatype_param
 : parameter_type any_name
 ;

block_params_expr_declaration
 : '(' expr ( ',' expr )*? ')'
 ;

block_statement
 : ( insert_stmt | delete_stmt | update_stmt
 | embedded_sql | maple_block | complex_block
 | variable_stmt | utility_stmt | select_stmt ) ( ';' )?
 ;

variable_declaration_stmt
 : variable_type any_name ( '=' expr )?
 ;

variable_assignment_stmt
 : any_name '=' expr
 ;

variable_inc_dec_stmt
 : any_name op='++' | any_name op='--' | any_name op='+=' literal_value | any_name op='-=' literal_value
 ;

variable_stmt
 : variable_assignment_stmt | variable_declaration_stmt | variable_inc_dec_stmt
 ;

/*
Personas (
    nombre? int 5,
    apellido varchar(255) 'dorquin',
    grade varchar(255)
)
*/

create_table_stmt
 : table_name '(' ( column_def ( ',' column_def )*? )*? ')'
 ;

column_def
 : ( standard_column_def | fk_column_def )
 ;

fk_column_def
 : column_name ( fk_constraint )? ( default_value )?
 ;

fk_constraint
 : '(' any_stmt ')'
 ;

standard_column_def
 : ( column_modifier )? column_name column_type ( default_value )?
 ;

column_type
 : data_type
 ;

update_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )
 ( K_UPDATE update_value_set | select_stmt ) conditional?
 ;

update_value_set
 : expr ( ',' expr )*?
 ;

delete_stmt
 : ( database_name '.' )? table_name K_INSERT ( conditional )?
 ;

//personas(nombre, apellido) <- ('va', 5);
insert_stmt
 : ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
  K_INSERT ( '('? select_stmt ')'? | ( ( insert_value_set ( ',' insert_value_set )*? ) ) )
 ;

insert_value_set
 : '(' expr ( ',' expr )*? ')'
 ;

select_stmt
 : table_name table_alias? ( K_SELECT ( result_column ( ',' result_column )*? )? ( join_stmt )*? )? ( conditional )?
 ;

join_stmt
 : ( K_JOIN | left=K_LEFT_JOIN | right=K_RIGHT_JOIN ) ('(' select_stmt ')' table_alias
 | table_name table_alias? ) join_constraint?
 ;

utility_stmt
 : print_stmt
 ;

parameter_type
 : data_type
 ;

data_type
 : ( any_name ( '(' signed_number ')' | '(' signed_number ',' signed_number ')' )? )
 ;

variable_type
 : any_name
 ;

default_value
 : ( STRING_LITERAL | NUMERIC_LITERAL )
 ;

join_constraint
 : K_ON expr
 ;

conditional
 : K_WHERE expr
 ;

print_stmt
 : K_PRINT expr
 ;

function
 : function_name '(' ( expr ( ',' expr )* | '*')? ')'
 ;

result_column
 : expr | expr column_alias?
 ;

expr
 : literal_value | prepared_literal_value
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

column_modifier
 : nullable_column='?'
 | primary_key='$'
 ;

//NAMES

block_name
 : any_name
 ;

block_action_name
 : any_name
 ;

column_name
 : any_name | '*'
 ;

table_name
 : any_name
 ;

database_name
 : any_name
 ;

function_name
 : any_name
 ;

table_alias
 : any_name
 ;

column_alias
 : any_name
 ;

signed_number
 : ( '+' | '-' )? NUMERIC_LITERAL
 ;

prepared_literal_value
 : ':?'
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 ;

any_name
 : IDENTIFIER
 ;

embedded_sql
 : '<?' any_stmt '?>'
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
K_WHERE : '?';
K_PK : '$';

K_AND : A N D;
K_NOTBETWEEN : K_NOT SPACES+ K_BETWEEN;
K_BETWEEN : B E T W E E N;
K_IF : I F;
K_ELSEIF : E L S E I F;
K_ELSE : E L S E;
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
K_PRINT : P R I N T;
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
 : '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\''
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
