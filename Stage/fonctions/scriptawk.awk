#!/usr/bin/awk -f

BEGIN {
    FS=" "                 #Separateur de champ
}

{                          #Pour chaque ligne
	for (i=2;i<=NF;i++){   #Jusqu'a la fin de la ligne, en oubliant le premier champ
		printf $i " "
	}
	if ($1=="F:")          #Apres avoir traite toute la ligne, on regarde 
						   #la premiere colonne
		print "-1"
	else
		print "1"
}
