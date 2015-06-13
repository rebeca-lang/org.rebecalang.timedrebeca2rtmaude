lexer grammar RTMaudeResultLexerRules;


WS : [ \t\r\n()]+ -> skip ; 	// skip spaces, tabs, newlines

IN : 'in'; 
TIME : 'time' ;

COMMA : 	 ',';
OPENBRACE :  '{' ;
CLOSEBRACE : '}';
WITH : 'with';
DMSG : 'delayedMsg' ;


EMPTYVAL : 'emptyValuation';
FROM : 'from';
TO : 'to';
DEADLINE : 'deadline';

STATEVARS : 'stateVars';
IDGEN : '"idgen"' .*? 'nextId';

REBECQUEUE : 'Rebec' .*? 'queue';


TOEXEC : 'toExecute' .*? 'zclassID' ;  



GT : '>' ;
LT : '<' ;

DBCOLON : '::' ;
COLON : ':' ;
 
NIL : 'nil';

ARROW : '|->';
INT : [0-9]+ ;	

BOOL : ('true'|'false');

DASHID : ID'-'ID|ID'--'ID|'self'|'sender'|'constructor'|'\''ID'-'ID;
QID : '"'ID'"';
TQID : '\''ID; 
ID : [a-zA-Z0-9]+ ;

