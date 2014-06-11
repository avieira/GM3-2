#!/usr/bin/awk -f

BEGIN {
    FS=" "
}

{
	if ($2=="1:"){                #S'il s'agit bien d'une ligne ou une seule main 
								  #a ete utilisee
		for (i=3;i<=NF;i++){
			printf $i " "
		}
		if ($1=="F:")
			print "-1"
		else
			print "1"
	}
}
