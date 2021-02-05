/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_douglasyjafef;

import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class Lab3_DouglasyJafef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        while(opcion!=7){
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Corporaciones\n" +
                    "2. Marcas\n" +
                    "3. Modelos\n" +
                    "4. Fábricas\n" +
                    "5. Divisiones tecnológicas.\n" +
                    "6. Informe total.\n"
                    + "7. Salir"));
            switch(opcion){
                case 1:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar"));
                    switch(op){
                        case 1:{
                            
                            break;}
                        case 2:{
                            
                            break;}
                        case 3:{
                            
                            break;}
                        case 4:{
                            
                            break;}
                    }
                    break;
                }
                case 2:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar"));
                    switch(op){
                        case 1:{
                            
                            break;}
                        case 2:{
                            
                            break;}
                        case 3:{
                            
                            break;}
                        case 4:{
                            
                            break;}
                    }
                    break;
                }
                case 3:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar"));
                    switch(op){
                        case 1:{
                            
                            break;}
                        case 2:{
                            
                            break;}
                        case 3:{
                            
                            break;}
                        case 4:{
                            
                            break;}
                    }
                    break;
                }
                case 4:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar\n 5. Agregar modelo"));
                    switch(op){
                        case 1:{
                            
                            break;}
                        case 2:{
                            
                            break;}
                        case 3:{
                            
                            break;}
                        case 4:{
                            
                            break;}
                        case 5:{
                            
                            break;}
                    }
                    break;
                }
                case 5:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar\n 5. Asignar vehiculo"));
                    switch(op){
                        case 1:{
                            
                            break;}
                        case 2:{
                            
                            break;}
                        case 3:{
                            
                            break;}
                        case 4:{
                            
                            break;}
                        case 5:{
                            
                            break;}
                    }
                    break;
                }
                case 6:{
                    JOptionPane.showMessageDialog(null, "");
                    break;
                }
            }   
        }
        
        
    }
    
}
