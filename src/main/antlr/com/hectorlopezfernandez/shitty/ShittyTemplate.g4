grammar ShittyTemplate;

@header {package com.hectorlopezfernandez.shitty;
}

template  : content* ;
content : TEXT | writer ;
writer : WRITER_START ID WRITER_END ;

WRITER_START : '{{' ;
WRITER_END : '}}' ;
ID : [a-z]+ ;
TEXT : [a-z| ]+ ;