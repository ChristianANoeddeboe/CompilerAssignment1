grammar simpleCalc;
 
start   : sq=statseq EOF  ;

statseq : '{' as+=assign* s+=stat* '}' ;

stat    : e=expr';'
        | c=cond
        | l=loop
        ;

loop    : 'while(' (e=expr|b=bool) ')' sq=statseq
        ;

assign  : x=ID '=' e=expr ';' ;

expr	: e1=expr op=OPERATORLVL1 e2=expr # MulDiv
        | e1=expr op=OPERATORLVL2 e2=expr # AddSub
	    | n=NUM  	        # Constant
	    | x=ID            # Variable
	    | '(' e=expr ')'  # Parenthesis
	    ;

cond    : 'if(' (e=expr|b=bool) ')' sq1=statseq 'else' sq2=statseq #ifelse
        | 'if(' (e=expr|b=bool) ')' sq=statseq #if
        ;

bool    : e1=expr b=BOOLEAN e2=expr;

BOOLEAN : ('=='|'<'|'>'|'!='|'&&'|'||') ;
OPERATORLVL1 : ('*'|'/') ;
OPERATORLVL2 : ('+'|'-') ;
NUM 	: ('0'..'9')+ ;
ID	: ('A'..'Z'|'a'..'z')+ ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT : '//' ~('\n')* -> skip;