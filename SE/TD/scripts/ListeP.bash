#!/bin/bash

echo "Donnez moi une lettre maître"
read lettre
cut -d: -f1 /etc/passwd | grep -i "${lettre}" 
i=`cut -d: -f1 /etc/passwd | grep -ic "${lettre}"`

echo "$i utilisateurs trouvés"
