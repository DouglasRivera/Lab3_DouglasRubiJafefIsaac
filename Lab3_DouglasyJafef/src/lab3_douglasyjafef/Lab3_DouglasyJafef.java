/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_douglasyjafef;

import java.util.ArrayList;
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
        ArrayList lista = new ArrayList();
        Corporaciones c = new Corporaciones();
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
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                            String Sede = JOptionPane.showInputDialog("Ingrese sede");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de fundación"));
                            String presi = JOptionPane.showInputDialog("Ingrese nombre del Presidente");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de empleados"));
                            int autos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de autos"));
                            lista.add(new Corporaciones(nombre, Sede, año, presi, empleados, autos));
                            break;}
                        case 2:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Corporaciones) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;}
                        case 3:{
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrsese posición a modificar"));
                            if(lista.get(pos) instanceof Corporaciones){
                                int mod =Integer.parseInt(JOptionPane.showInputDialog("Que desea modificar?\n 1. Nombre\n 2. Sede\n 3. Año de fundación\n 4. Nombre de Presidente \n 5. Cantidad de empleados\n 6. Número de autos"));
                                switch(mod){
                                    case 1:{
                                        String nombre=JOptionPane.showInputDialog("Ingrsese nuevo nombre");
                                        break;}
                                    case 2:{
                                        String sede=JOptionPane.showInputDialog("Ingrsese nueva sede");
                                        break;}
                                    case 3:{
                                        int año=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nuevo año de fundación"));
                                        break;}
                                    case 4:{
                                        String presi=JOptionPane.showInputDialog("Ingrsese nuevo nombre de presidente");
                                        break;}
                                    case 5:{
                                        int empleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nueva cantidad de empleados"));
                                        break;}
                                    case 6:{
                                        int autos=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nuevo número de autos"));
                                        break;}
                                }
                            }else {
                                JOptionPane.showMessageDialog(null, "Posición no válida");
                            }
                            break;}
                        case 4:{
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrsese posición a modificar"));
                            if (lista.get(pos) instanceof Corporaciones){
                                lista.remove(pos);
                            }else{
                                JOptionPane.showMessageDialog(null, "Posición no válida");
                            }
                            break;}
                    }
                    break;
                }
                case 2:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar"));
                    switch(op){
                        case 1:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Corporaciones) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            int pos = Integer.parseInt(JOptionPane.showInputDialog(salida+"Ingrese que la posición de la corperación a la cual le desea añadir una marca"));
                            if(lista.get(pos) instanceof Corporaciones){
                                String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la marca");
                                String Slogan=JOptionPane.showInputDialog("Ingrese slogan de la marca");
                                int yearFundacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de fundación de la marca"));
                                int yearIntegracion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de integración a la copreoración de la marca"));
                                String Fundador=JOptionPane.showInputDialog("Ingrese nombre del fundador");
                                int TotalVentas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de ventas de la marca"));
                                String Presidente=JOptionPane.showInputDialog("Ingrese nombre del presidente de la marca");
                                int NumeroModelos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de modelos que tiene la marca"));
                                new Marca(Nombre, Slogan, yearFundacion, yearIntegracion, Fundador, TotalVentas, Presidente, NumeroModelos);
                                ((Corporaciones).lista.get(pos)).getMarca().add(new Marca(Nombre, Slogan, yearFundacion, yearIntegracion, Fundador, TotalVentas, Presidente, NumeroModelos));
                            }else{
                                JOptionPane.showMessageDialog(null,"No hay Corporación en esa posición");
                            }
                            break;}
                        case 2:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Marca) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
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
