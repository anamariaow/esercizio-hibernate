ESERCIZIO:
1.scrivi una applicazione web Spring Boot con le seguenti librerie:
Lombok (non utilizzato, inseriti costruttore e getter e setter manualmente)
Spring Boot DevTools
Spring Web
Spring Data JPA
MySQL Driver
2.usa hibernate e JPA per connettersi alla base dati mysql locale (e.g. devdb)
3.configura il parametro ddl-auto così che hibernate crea e distrugge lo schema alla fine della sessione
4.onsidera questo use case:
1 student ---> n enrollments
1 class ---> n enrollments
5.avendo in mente gli usecase di cui sopra e usando le annotazioni, scrivi il codice per creare:
- la tabella students dove ogni studente avrà:
primary key
colonna lastName (not null)
colonna firstName (not null)
colonna email con valori univoci e not null
- la tabella classes dove ogni classe ha:
primary key
title (not null)
description (not null)
- tabella enrollments per salvare collegamenti tra le tabelle students e classes:
primary key
2 foreign keys
