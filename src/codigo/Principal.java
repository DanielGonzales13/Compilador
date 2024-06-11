/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grp4
 */
public class Principal {
    public static void main(String[] args) {
        String ruta1 = "G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//Lexer.flex";
        String ruta2 = "G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo///Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    
    
      public static void generar(String ruta1, String ruta2, String[] rutaS) {
          File file; 
          file = new File(ruta1);
          jflex.Main.generate(file);
          file = new File(ruta2);
          jflex.Main.generate(file);
          
        try {
            java_cup.Main.main(rutaS);
            
            Path rutaSym = Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//sym.java");
            if(Files.exists(rutaSym)){
                Files.delete(rutaSym);
            }

            Files.move(Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil/sym.java"),
                    Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//sym.java")
            );

            Path rutaSin = Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//Sintax.java");
            if(Files.exists(rutaSin)){
                Files.delete(rutaSin);
            }
            Files.move(Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil/Sintax.java"),
                    Paths.get("G://proyectocomppiladores//Analizador_Fase1_Compil//src//codigo//Sintax.java")
            ); 
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    

}
