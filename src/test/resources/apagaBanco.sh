#!/bin/bash
source ./SBProjeto.prop
mysqladmin processlist -u root -psenhaDev#123 $NOME_BANCO | \
awk '$2 ~ /^[0-9]/ {print "KILL "$2";"}' | \
mysql -u root -psenhaDev#123
mysqladmin -u root -psenhaDev#123 drop $NOME_BANCO -f
#mysqladmin -u root drop superComprasModel -f