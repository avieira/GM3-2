#!/bin/bash

basename `pwd`
a=`dirname $PWD`
basename $a
basename $(dirname `pwd`)

nb=0
nbDossier=0
nbVideExec=0

for i in `ls`
do
	if [ -d $i  ]
	then
		nbDossier=$(($nbDossier+1))
	fi
	if [ -x $i ]
	then
		echo "Le fichier $i est executable (${i##*.})"
	fi
	if ! [ -s $i ]
	then
		echo "Le fichier $i est vide"
	elif ! [ -x $i ] 
	then
		nbVideExec=$(($nbVideExec+1))
	fi
done

echo "Il y a aussi $nbDossier dossiers dans ce répertoire"
echo "Il y a aussi $nbVideExec fichiers non vide et non exécutable dans ce répertoire"
