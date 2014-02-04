#!/bin/bash

LeChiffre=""
while [ -z "${LeChiffre}" ] 
do
	read LeChiffre
done
echo ${LeChiffre}

i=0
while [ $i -le ${LeChiffre} ] && [ $i -le 25  ]
do
	if [ $i != 13 ]
	then
		echo $i
	fi
	i=$(($i+1))
done


