#!/bin/bash

trap 'ArretBrutal' 2

function ArretBrutal (){
	VideFichier
	exit
}

FichierTMP=$0.tmp

function VideFichier(){
	echo " "
	echo "Script terminé"
	rm /tmp/$FichierTMP
}

while true
do
	date
	date >> /tmp/$FichierTMP
	sleep 1
done
