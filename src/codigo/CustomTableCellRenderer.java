/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codigo;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
/**
 *
 * @author grp4
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        String token = table.getValueAt(row, 1).toString();
        c.setBackground(Color.white);
        switch(token){
            case "Reservada":
                c.setForeground(Color.blue);
                
                break;
            case "Identificador":
                c.setForeground(Color.orange);
                break;
            case "cadena_literal":
            case "comillas":
                c.setForeground(Color.MAGENTA);
                break;
            case "op_resta":
            case "op_suma":
            case "op_division":
            case "op_asignacion":
            case "op_multiplicacion":
                c.setForeground(Color.PINK);
                break;
            case "punto_y_coma":
                c.setForeground(Color.yellow);
                break;
            case "par_abierto":
            case "par_cerrado":
            case "llave_abierta":
            case "llave_cerrada":
            case "corchete_abierto":
            case "corchete_cerrado":
                c.setForeground(Color.RED);
                break;
            case "Numero_decimal":
            case "Numero":
                c.setForeground(new Color(0xAF9F00));
                break;
            case "comentario":
                c.setForeground(Color.gray);
                break;                
            case "ERROR": 
                c.setBackground(Color.RED);
                c.setForeground(Color.white);
                break;
            default: 
                c.setForeground(Color.black);
                break;
        }
        
        if(isSelected){
            c.setBackground(table.getSelectionBackground());
            c.setForeground(table.getSelectionForeground());
        }
        
        return c;
    }

}
