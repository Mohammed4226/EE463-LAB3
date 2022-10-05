#!/bin/bash 
#mohammed Alshmrani-1847991
#check if user add (*) after bin or not
if [ `expr index "$1" 1*` -ne 0 ] #check the second argument
then
	echo "Symbol * is not required" #if yes 
else
	echo "* is required" #if no
	echo ""$1"/*" 
fi

