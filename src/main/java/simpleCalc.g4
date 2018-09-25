grammar simpleCalc;
 
start   : as+=assign*  e=expr EOF ;

assign  : x=ID '=' e=expr ;

expr	: e1=expr '*' e2=expr # Multiplication
	| e1=expr op=OPERATOR e2=expr # Addition
	| n=NUM  	        # Constant
	| x=ID            # Variable
	| '(' e=expr ')'  # Parenthesis
	;

OPERATOR : ('+'|'-') ; 
NUM 	: ('0'..'9')+ ;
ID	: ('A'..'Z'|'a'..'z')+ ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT : '//' ~('\n')* -> skip;

