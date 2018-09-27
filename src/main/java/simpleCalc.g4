grammar simpleCalc;
 
start   : sq=statseq e=expr ';' EOF  ;

statseq : '{' s+=stat* '}' ;

stat    : x=ID '=' e=expr ';'                              # assign
        | 'if(' e=expr ')' sq1=statseq 'else' sq2=statseq  # ifelse
        | 'if(' e=expr ')' sq=statseq                      # if
        | 'while(' e=expr ')' sq=statseq                   # loop
        ;

expr	: <assoc=left> e1=expr op=OPERATORLVL1 e2=expr              # MulDiv
        | <assoc=left> e1=expr op=OPERATORLVL2 e2=expr              # AddSub
	    | n=NUM  	                                                # Constant
	    | x=ID                                                      # Variable
	    | '(' e=expr ')'                                            # Parenthesis
	    | <assoc=left> e1=expr b=BOOLEANLVL1 e2=expr                # BigSmall
	    | <assoc=left> e1=expr b=BOOLEANLVL2 e2=expr                # EqualNot
	    | <assoc=left> e1=expr '&&' e2=expr                         # And
	    | <assoc=left> e1=expr '||' e2=expr                         # Or
	    ;

BOOLEANLVL1 : ('<'|'>') ;
BOOLEANLVL2 : ('=='|'!=') ;
OPERATORLVL1 : ('*'|'/') ;
OPERATORLVL2 : ('+'|'-') ;
NUM 	: ('0'..'9')+ ;
ID	: ('A'..'Z'|'a'..'z')+ ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT : '//' ~('\n')* -> skip;