package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens

L = [a-zA-Z]
D = [0-9]
AlfaNumerico=({L}+|({L}{D})+)+
LU={AlfaNumerico} | ( "." | "#" | "?" )
Elementos=({AlfaNumerico} | {AlfaNumerico} " " {AlfaNumerico})+
espacio=[" ",\t,\r]+

%{
    public String lexeme;
%}
%%

// Definición de palabras reservadas, clases y caracteres

"PRINCIPIO" {lexeme=yytext(); return PRINCIPIO;}
si {lexeme=yytext(); return si;}
contrario_si {lexeme=yytext(); return contrario_si ;}
contrario {lexeme=yytext(); return contrario;}
funcion {lexeme=yytext(); return funcion;}
retornar {lexeme=yytext(); return retornar;}
mientras|por|hacer_mientras|mientras|romper|interruptor|caso|otro_caso {lexeme=yytext(); return Reservada;}
"verdadero"|"falso" {lexeme=yytext(); return boleana;}
"imprimir" {lexeme=yytext(); return imprimir;}
"&&" | "Y" | "O" | "||"  {lexeme=yytext(); return operadores_logicos;}
"++" {lexeme=yytext(); return incremento;}
"--" {lexeme=yytext(); return decremento;}
"==" | "!=" | ">" | "<" | ">=" | "<=" {lexeme=yytext(); return operadores_comparacion;}
"nulo" {lexeme=yytext(); return nulo;}
"entero" {lexeme=yytext(); return entero;}
"cadena" {lexeme=yytext(); return cadena;}
"flotante" {lexeme=yytext(); return flotante;}
"decimal" {lexeme=yytext(); return decimal;}
"boleano" {lexeme=yytext(); return boleano;}
"caracter" {lexeme=yytext(); return caracter;}
"lista" {lexeme=yytext(); return lista;}
"mapa" {lexeme=yytext(); return mapa;}
"fecha" {lexeme=yytext(); return fecha;}
"hora" {lexeme=yytext(); return hora;}
"fechahora" {lexeme=yytext(); return fechahora;}
"byte" {lexeme=yytext(); return t_byte;}
"\n" | "\n" {espacio}+ {lexeme=yytext(); return linea;}
{espacio} {/*Ignore*/}
"//".* {lexeme=yytext(); return comentario;}
"INICIO" {/*Ignore*/}
"+" {lexeme=yytext(); return op_suma;}
"-" {lexeme=yytext(); return op_resta;}
"/" {lexeme=yytext(); return op_division;}
"=" {lexeme=yytext(); return op_asignacion;}
"*" {lexeme=yytext(); return op_multiplicacion;}
"," {lexeme=yytext(); return coma;}
";" {lexeme=yytext(); return punto_y_coma;}
"(" {lexeme=yytext(); return par_abierto;}
")" {lexeme=yytext(); return par_cerrado;}
"{" {lexeme=yytext(); return llave_abierta;}
"}" {lexeme=yytext(); return llave_cerrada;}
"[" {lexeme=yytext(); return corchete_abierto;}
"]" {lexeme=yytext(); return corchete_cerrado;}
"grp4_"({AlfaNumerico}+) {lexeme=yytext(); return Identificador;}
"\""(.)*"\"" {lexeme=yytext(); return cadena_literal;}
"'"(.)"'" {lexeme=yytext(); return cadena_simple;}
"\"" | "&quot;" {lexeme=yytext(); return comillas;}
{D}+ "." {D}+ | "(-" {D}+ "." {D}+ ")" {lexeme=yytext(); return Numero_decimal;}
"(-"{D}+")" | {D}+ {lexeme=yytext(); return Numero;}
"'".+"'" {lexeme=yytext(); return ERROR;}
({LU})+ {lexeme=yytext(); return ERROR;}
. {lexeme=yytext(); return ERROR;}
