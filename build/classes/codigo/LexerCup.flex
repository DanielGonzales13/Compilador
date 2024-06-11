package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L = [a-zA-Z]
D = [0-9]
AlfaNumerico=({L}+|{L}+{D}+)+
LU={AlfaNumerico} | ( "." | "#" | "?" )
Elementos=({AlfaNumerico} | {AlfaNumerico} " " {AlfaNumerico})+

espacio=[ \t\r\n]+

%{
    private Symbol symbol (int type, Object value){
        return new Symbol (type, yyline, yycolumn, value);
    }

    private Symbol symbol (int type){
        return new Symbol (type, yyline, yycolumn);
    }
%}
%%

"PRINCIPIO" {return new Symbol(sym.PRINCIPIO, yychar, yyline, yytext());}
"si" {return new Symbol(sym.si, yychar, yyline, yytext());}
"contrario_si" {return new Symbol(sym.contrario_si, yychar, yyline, yytext());}
"contrario" {return new Symbol(sym.contrario, yychar, yyline, yytext());}
"mientras" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"por" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"hacer_mientras" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"funcion" {return new Symbol(sym.funcion, yychar, yyline, yytext());}
"retornar" {return new Symbol(sym.retornar, yychar, yyline, yytext());}
"romper" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"interruptor" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"caso" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"otro_caso" {return new Symbol(sym.Reservada, yychar, yyline, yytext());}
"imprimir" {return new Symbol(sym.imprimir, yychar, yyline, yytext());}
"verdadero"|"falso" {return new Symbol(sym.boleana, yychar, yyline, yytext());}
"&&" | "Y" | "O" | "||"  {return new Symbol(sym.operadores_logicos, yychar, yyline, yytext());}
"++" {return new Symbol(sym.incremento, yychar, yyline, yytext());}
"--" {return new Symbol(sym.decremento, yychar, yyline, yytext());}
"==" | "!=" | ">" | "<" | ">=" | "<=" {return new Symbol(sym.operadores_comparacion, yychar, yyline, yytext());}
"nulo" {return new Symbol(sym.nulo, yychar, yyline, yytext());}
"entero" {return new Symbol(sym.entero, yychar, yyline, yytext());}
"cadena" {return new Symbol(sym.cadena, yychar, yyline, yytext());}
"flotante" {return new Symbol(sym.flotante, yychar, yyline, yytext());}
"decimal" {return new Symbol(sym.decimal, yychar, yyline, yytext());}
"boleano" {return new Symbol(sym.boleano, yychar, yyline, yytext());}
"caracter" {return new Symbol(sym.caracter, yychar, yyline, yytext());}
"lista" {return new Symbol(sym.lista, yychar, yyline, yytext());}
"mapa" {return new Symbol(sym.mapa, yychar, yyline, yytext());}
"fecha" {return new Symbol(sym.fecha, yychar, yyline, yytext());}
"hora" {return new Symbol(sym.hora, yychar, yyline, yytext());}
"fechahora" {return new Symbol(sym.fechahora, yychar, yyline, yytext());}
"byte" {return new Symbol(sym.t_byte, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
"//".* {return new Symbol(sym.comentario, yychar, yyline, yytext());}
"+" {return new Symbol(sym.op_suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.op_resta, yychar, yyline, yytext());}
"/" {return new Symbol(sym.op_division, yychar, yyline, yytext());}
"=" {return new Symbol(sym.op_asignacion, yychar, yyline, yytext());}
"*" {return new Symbol(sym.op_multiplicacion, yychar, yyline, yytext());}
"," {return new Symbol(sym.coma, yychar, yyline, yytext());}
";" {return new Symbol(sym.punto_y_coma, yychar, yyline, yytext());}
"(" {return new Symbol(sym.par_abierto, yychar, yyline, yytext());}
")" {return new Symbol(sym.par_cerrado, yychar, yyline, yytext());}
"{" {return new Symbol(sym.llave_abierta, yychar, yyline, yytext());}
"}" {return new Symbol(sym.llave_cerrada, yychar, yyline, yytext());}
"[" {return new Symbol(sym.corchete_abierto, yychar, yyline, yytext());}
"]" {return new Symbol(sym.corchete_cerrado, yychar, yyline, yytext());}
"grp4_"({AlfaNumerico}+) {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
"\""(.)*"\"" {return new Symbol(sym.cadena_literal, yychar, yyline, yytext());}
"'"(.)"'" {return new Symbol(sym.cadena_simple, yychar, yyline, yytext());}
"\"" | "&quot;" {return new Symbol(sym.comillas, yychar, yyline, yytext());}
{D}+ "." {D}+ | "(-" {D}+ "." {D}+ ")" {return new Symbol(sym.Numero_decimal, yychar, yyline, yytext());}
"(-"{D}+")" | {D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
"'".+"'" {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
({LU})+ {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
