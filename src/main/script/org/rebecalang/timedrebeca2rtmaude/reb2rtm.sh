#!/bin/sh  
reportError() {
	echo "[ERROR] $1"
	#exit 0
}

if [ -z "$1" ]
then
	reportError "Timed Rebeca source file must be specified."
else
	if [ -f "$1" ]
	then
		echo
	else
		reportError "Timed Rebeca source file not found."
	fi
fi

if [ -z "$2" ]
then
	reportError "Property specification file must be specified."
else
	if [ -f "$2" ]
	then
		echo
	else
		reportError "Property specification file not found."
	fi
fi
#extract the name of the given Timed Rebeca file
#IFS='.' read -a fileName <<< "$1"
fileName=$1
fileName="${fileName%.*}"

java -jar org.rebecalang.timedrebeca2rtmaude-1.0.0-SNAPSHOT.jar -p Generate -s $1 -o $fileName

#successful operation the above jar file results in creating the following rtmaude file
generatedRTMaudeFileName=./$fileName/$fileName.rtmaude
if [ -f $generatedRTMaudeFileName ];
then
	echo "[INFO] \"$1\" successfully transformed to the realtime maude \"./$fileName/$fileName.rtmaude\"."
else
    reportError "Unsuccessful transformation from \"$1\" to its corresponding realtime maude model."
fi

#Concatenation of property description to the realtime maude model
#sed -i.bak 's/endtom)$//' $generatedRTMaudeFileName 
#rm $generatedRTMaudeFileName.bak
echo "\r\n " >> $generatedRTMaudeFileName
cat $2 >> $generatedRTMaudeFileName
#echo "\r\n " >> $generatedRTMaudeFileName
#echo "endtom)" >> $generatedRTMaudeFileName

echo "quit" >> $generatedRTMaudeFileName

#Try to run the model using realtime maude model checking toolset
. config.properties

if [ -z "$RTMaudeLoc" ]
then
	reportError "Installation location of realtime maude model checking toolset must be set in \"config.properties\" file."
fi

executableFile='unknown'
unamestr=`uname`
if [[ "$unamestr" == 'Linux' ]]; then
   executableFile='maude.linux'
elif [[ "$unamestr" == 'Darwin' ]]; then
   executableFile='maude.intelDarwin'
fi
`$RTMaudeLoc/$executableFile $generatedRTMaudeFileName > maudetemp.txt`

if [ $? -eq 127 ]
then
	reportError "There is a problem for running maude model checker. Check the installed toolset."
fi
#remove header of maudetemp.txt. I have to send counter example to the interpreter
java -jar org.rebecalang.timedrebeca2rtmaude-1.0.0-SNAPSHOT.jar -p InterpretResult -s maudetemp.txt -o $fileName

rm maudetemp.txt
