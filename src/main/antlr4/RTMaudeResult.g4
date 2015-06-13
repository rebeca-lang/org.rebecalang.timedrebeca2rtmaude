grammar RTMaudeResult;

import RTMaudeResultLexerRules;

reactiveClassDeclaration returns [String res,int id]
	: {$res = "<counter-example-trace>"; $id=0;} (resConf = configuration {$id+=1; $res = $res+"\n<state id="+$id+">"+$resConf.retConf+"\n</state>";}) ((COMMA)* resConf = configuration {$id+=1; $res =$res+"\n<state id="+$id+">"+$resConf.retConf+"\n</state>";})* { $res = $res+"\n</counter-example-trace>\n";} ;        
	
configuration returns [String retConf]
	: {$retConf = "";} OPENBRACE (resSt = state {$retConf = $retConf+$resSt.retSt;}) (IN TIME INT)*  (COMMA (ID|TQID|DASHID))* CLOSEBRACE ;        
	
state returns [String retSt]
	: {$retSt = "\n<floatBag>";} OPENBRACE (resdMsg = delayedMsg{$retSt =$retSt+"\n<delayedMSG after="+$resdMsg.dAfter+" deadline="+$resdMsg.dDeadline+" sender="+$resdMsg.dSender+" receiver="+$resdMsg.dReceiver+">"+$resdMsg.retdMsg+$resdMsg.dArguments+"</delayedMSG>";})*  {$retSt=$retSt+"\n</floatBag>";} (resRebec = rebec{$retSt=$retSt+$resRebec.retRebec;})* {$retSt+="\n<undeliveredMSG>";} (resMsg=msg{$retSt =$retSt+"\n<message deadline="+$resMsg.Deadline+" sender="+$resMsg.Sender+" receiver="+$resMsg.Receiver+">"+$resMsg.retMsg+$resMsg.Arguments+"</message>";})* CLOSEBRACE {$retSt+="\n</undeliveredMSG>";};

	
rebec returns [String retRebec]
	: {$retRebec = "\n<rebec name=";} LT (RebecName=QID {$retRebec=$retRebec+$RebecName.text+">";}) COLON REBECQUEUE COLON {$retRebec=$retRebec+"\n<queue>";} (NIL| (inMsg=inQueue{$retRebec=$retRebec+"\n<qMSG deadline="+$inMsg.iDeadline+" sender="+$inMsg.iSender+">"+$inMsg.retMsgName+$inMsg.iArguments+"</qMSG>";}) (DBCOLON)* )+ {$retRebec=$retRebec+"\n</queue>";} COMMA (resStVar = stateVariables {$retRebec=$retRebec+" "+$resStVar.retStVar;}) COMMA TOEXEC COLON ID GT {$retRebec +="\n</rebec>";} 
	| {$retRebec = " ";} LT IDGEN COLON INT GT;

  
delayedMsg  returns [String retdMsg,String dArguments,String dDeadline,String dSender,String dReceiver,String dAfter] 
	: {$retdMsg="";$dArguments="(";} DMSG (resDMDash=DASHID {$retdMsg+=$resDMDash.text;}) WITH (par=params {$dArguments=$dArguments+$par.retVal+",";})+ FROM (sendr=QID{$dSender=$sendr.text;}) TO (rcvr=QID{$dReceiver=$rcvr.text;}) DEADLINE (ddline=INT{$dDeadline=$ddline.text;}) COMMA (after=INT{$dAfter=$after.text;}) {$dArguments+=")";};

msg returns [String retMsg,String Arguments,String Deadline,String Sender,String Receiver]
 : {$retMsg="";$Arguments="(";} (resMDash=DASHID {$retMsg+=$resMDash.text;}) WITH (par=params {$Arguments=$Arguments+$par.retVal+",";})+ FROM (sendr=QID{$Sender=$sendr.text;}) TO (rcvr=QID{$Receiver=$rcvr.text;}) DEADLINE (ddline=INT{$Deadline=$ddline.text;}) {$Arguments+=")";};

	
inQueue returns [String retMsgName,String iArguments,String iDeadline,String iSender]
	: {$retMsgName="";$iArguments="(";} (retDash= DASHID {$retMsgName = $retDash.text;}) WITH (par=params {$iArguments=$iArguments+$par.retVal+",";})+ FROM (sendr=QID {$iSender=$sendr.text;}) DEADLINE (ddline=INT{$iDeadline=$ddline.text;}) {$iArguments+=")";};  

stateVariables returns [String retStVar] 
	: {$retStVar="\n<statevariables>";} STATEVARS COLON (StVar = params{$retStVar = $retStVar+"\n<variable name="+$StVar.retParam+">"+$StVar.retVal+"</variable>";})+  {$retStVar+="\n</statevariables>";};

	
params returns [String retParam,String retVal] 
	: {$retParam=""; } EMPTYVAL | {$retParam="";} (StName = DASHID{$retParam = $retParam+$StName.text;}) ARROW (val = (INT|BOOL|QID)) {$retVal = $val.text;} ;	
			 
    
    