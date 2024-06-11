/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

/**
 *
 * @author dan_g
 */
public class Generador {
    public static int contadorTemporales = 0;
    public static String resultado = "";

    // Método para generar un nombre único para una variable temporal
    public static String nuevaTemp() {
        contadorTemporales++;
        return "temp_" + contadorTemporales;
    }

    // Método para generar el código intermedio para una operación aritmética
    private static void gc(String operador, String op1, String op2, String temp) {
        // Aquí puedes implementar la lógica para generar el código intermedio
        resultado += "      " + temp + " = " + op1 + " " + operador + " " + op2 + "\n";
        System.out.println( "        " + temp + " = " + op1 + " " + operador + " " + op2);
        
    }
    
     private static void gc2(String cadena, String temp) {
        // Aquí puedes implementar la lógica para generar el código intermedio
        resultado += "      " + temp + " = " + cadena + "\n";
        System.out.println( "        " + temp + " = " + cadena);
        
    }

    // Función para generar código intermedio para operaciones aritméticas
    public static void generarCodigoIntermedioAritmetico(String op1, String op2, String operador,String temp) {
        gc(operador, op1, op2, temp);
    }
    
      public static void generarCodigoIntermedioCadena(String Cadena, String temp) {
        gc2(Cadena.replace("\"", " "), temp);
    }
    
    public static void generaLabel(String label){
        resultado += label + ": \n";
        System.out.println(label + ":");
    }
}
