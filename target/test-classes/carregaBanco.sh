#!/bin/bash
source ./SBProjeto.prop
mysqladmin -u root -psenhaDev#123 create $NOME_BANCO
mysql -u root -psenhaDev#123  $NOME_BANCO < ./$NOME_BANCO.Homologacao.sql
