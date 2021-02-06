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
        ArrayList <Corporaciones> corporaciones = new ArrayList();
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
                                        ( (Corporaciones)lista.get(pos) ).setNombre(nombre);
                                        break;}
                                    case 2:{
                                        String sede=JOptionPane.showInputDialog("Ingrsese nueva sede");
                                        ( (Corporaciones)lista.get(pos) ).setSede(sede);
                                        break;}
                                    case 3:{
                                        int año=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nuevo año de fundación"));
                                        ( (Corporaciones)lista.get(pos) ).setYearFundacion(año);
                                        break;}
                                    case 4:{
                                        String presi=JOptionPane.showInputDialog("Ingrsese nuevo nombre de presidente");
                                        ( (Corporaciones)lista.get(pos) ).setPresidente(presi);
                                        break;}
                                    case 5:{
                                        int empleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nueva cantidad de empleados"));
                                        ( (Corporaciones)lista.get(pos) ).setNumEmpleados(empleados);
                                        break;}
                                    case 6:{
                                        int autos=Integer.parseInt(JOptionPane.showInputDialog("Ingrsese nuevo número de autos"));
                                        ( (Corporaciones)lista.get(pos) ).setCantidad_Autos(autos);
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
                    if(corporaciones.size()==0){ break;}
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Modificar\n 3. Eliminar\n 4. Listar"));
                    switch(op){
                        case 1:{
                            String salida ="";
                            for (Corporaciones t : corporaciones) {
                                if (t instanceof Corporaciones) {
                                    salida += corporaciones.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            int pos = Integer.parseInt(JOptionPane.showInputDialog(salida+"Ingrese que la posición de la corperación a la cual le desea añadir una marca"));
                            if(corporaciones.get(pos) instanceof Corporaciones){
                                String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la marca");
                                String Slogan=JOptionPane.showInputDialog("Ingrese slogan de la marca");
                                int yearFundacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de fundación de la marca"));
                                int yearIntegracion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de integración a la copreoración de la marca"));
                                String Fundador=JOptionPane.showInputDialog("Ingrese nombre del fundador");
                                int TotalVentas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de ventas de la marca"));
                                String Presidente=JOptionPane.showInputDialog("Ingrese nombre del presidente de la marca");
                                int NumeroModelos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de modelos que tiene la marca"));
                               corporaciones.get(pos).getMarca().add(new Marca(Nombre,Slogan,yearFundacion,yearIntegracion,Fundador,TotalVentas,Presidente,NumeroModelos));
                            }else{
                                JOptionPane.showMessageDialog(null,"No hay Corporación en esa posición");
                            }
                            break;}
                        case 2:{
                           
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones+"Ingrese que la posición de la corperación a la cual le desea añadir una marca"));
                             String listaMarcas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().size(); i++) {
                                listaMarcas+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(i).getNombre()+"\n";
                            }
                            int posicionMarcas = Integer.parseInt(JOptionPane.showInputDialog(listaMarcas));
                            Marca marca = corporaciones.get(posicionCorporacion).getMarca().get(posicionMarcas);
                                String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la marca");
                                String Slogan=JOptionPane.showInputDialog("Ingrese slogan de la marca");
                                int yearFundacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de fundación de la marca"));
                                int yearIntegracion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de integración a la copreoración de la marca"));
                                String Fundador=JOptionPane.showInputDialog("Ingrese nombre del fundador");
                                int TotalVentas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de ventas de la marca"));
                                String Presidente=JOptionPane.showInputDialog("Ingrese nombre del presidente de la marca");
                                int NumeroModelos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de modelos que tiene la marca"));
                                marca.setFundador(Fundador);
                                marca.setNombre(Nombre);
                                marca.setNumeroModelos(NumeroModelos);
                                marca.setPresidente(Presidente);
                                marca.setSlogan(Slogan);
                                marca.setTotalVentas(TotalVentas);
                                marca.setYearFundacion(yearFundacion);
                                marca.setYearIntegracion(yearIntegracion);
                            break;}
                        case 3:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones+"Ingrese que la posición de la corperación a la cual le desea añadir una marca"));
                             String listaMarcas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().size(); i++) {
                                listaMarcas+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(i).getNombre()+"\n";
                            }
                            int posicionMarcas = Integer.parseInt(JOptionPane.showInputDialog(listaMarcas));
                            corporaciones.get(posicionCorporacion).getMarca().remove(posicionMarcas);
                            break;}
                        case 4:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Marca) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;}
                    }
                    break;
                }
                case 3:{
                    if(corporaciones.size()==0) break;
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Modificar\n 3.Eliminar\n 4. Listar"));
                    switch(op){
                        case 1:{
                             String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            if(corporaciones.get(posicionCorporacion).getMarca().size()==0) break;
                            String listaMarcas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().size(); i++) {
                                listaMarcas+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(i).getNombre()+"\n";
                            }
                            int posicionMarcas = Integer.parseInt(JOptionPane.showInputDialog(listaMarcas));
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre del modelo");
                            int yearFabricacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String TipoMotor=JOptionPane.showInputDialog("Ingrese el tipo de motor");
                            int Cilindrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de centimetros cubicos del motor"));
                            int precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
                            String Tecno=JOptionPane.showInputDialog("Ingrese el tipo de tecnologia que tiene");
                            corporaciones.get(posicionCorporacion).getMarca().get(posicionMarcas).getModelo().add(new Modelo(Nombre, yearFabricacion,TipoMotor,Cilindrada,precio,Tecno));
                            break;}
                        case 2:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            if(corporaciones.get(posicionCorporacion).getMarca().size()==0) break;
                            String listaMarcas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().size(); i++) {
                                listaMarcas+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(i).getNombre()+"\n";
                            }
                            int posicionMarca = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                              String listaModelo = "Ingresa el indice de una de las siguientes modelos\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().size(); i++) {
                                listaModelo+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().get(i).getNombre()+"\n";
                            }
                            int posicionModelo = Integer.parseInt(JOptionPane.showInputDialog(listaModelo));
                            Modelo Md =corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().get(posicionModelo);
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre del modelo");
                            int yearFabricacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String TipoMotor=JOptionPane.showInputDialog("Ingrese el tipo de motor");
                            int Cilindrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de centimetros cubicos del motor"));
                            int precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
                            String Tecno=JOptionPane.showInputDialog("Ingrese el tipo de tecnologia que tiene");
                            
                            Md.setCilindradaMotor(Cilindrada);
                            Md.setNombre(Nombre);
                            Md.setPrecio(precio);
                            Md.setTecnologias(Tecno);
                            Md.setTipoMotor(TipoMotor);
                            Md.setYearFabricacion(yearFabricacion);
                            break;}
                        case 3:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            if(corporaciones.get(posicionCorporacion).getMarca().size()==0) break;
                            String listaMarcas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().size(); i++) {
                                listaMarcas+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(i).getNombre()+"\n";
                            }
                            int posicionMarca = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                              String listaModelo = "Ingresa el indice de una de las siguientes modelos\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().size(); i++) {
                                listaModelo+=i+". "+corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().get(i).getNombre()+"\n";
                            }
                            int posicionModelo = Integer.parseInt(JOptionPane.showInputDialog(listaModelo));
                            corporaciones.get(posicionCorporacion).getMarca().get(posicionMarca).getModelo().remove(posicionModelo);
                            break;}
                        case 4:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Modelo) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;}
                    }
                    break;
                }
                case 4:{
                     if(corporaciones.size()==0) break;
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Listar\n 3.Modificar\n 4. Eliminar\n"));
                    switch(op){
                        case 1:{
                            
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la fabrica");
                            String Ubicacion=JOptionPane.showInputDialog("Ingrese la ubicacion");
                            int MaxModelos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String TipoCarroceria=JOptionPane.showInputDialog("Ingrese lel tipo de carroceria");
                            int CantidadEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String NombreMarca=JOptionPane.showInputDialog("Ingrese el nombre de la marca");
                            int CantidadAutos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de autos"));
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            corporaciones.get(posicionCorporacion).getFabricas().add(new Fabricas(Nombre, Ubicacion, MaxModelos,TipoCarroceria,CantidadEmpleados,NombreMarca,CantidadAutos));
                            break;}
                        case 2:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            String ListaFabricas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getFabricas().size(); i++) {
                                ListaFabricas+=i+". "+corporaciones.get(posicionCorporacion).getFabricas().get(i).getNombre()+"\n";
                            }
                             int posicionFabrica = Integer.parseInt(JOptionPane.showInputDialog(ListaFabricas));
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la marca");
                            String Ubicacion=JOptionPane.showInputDialog("Ingrese la ubicacion");
                            int MaxModelos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String TipoCarroceria=JOptionPane.showInputDialog("Ingrese lel tipo de carroceria");
                            int CantidadEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de modelos"));
                            String NombreMarca=JOptionPane.showInputDialog("Ingrese el nombre de la marca");
                            int CantidadAutos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de autos"));
                            Fabricas Fb = corporaciones.get(posicionCorporacion).getFabricas().get(posicionFabrica);
                            Fb.setCantidadAutos(CantidadAutos);
                            Fb.setCantidadEmpleados(CantidadEmpleados);
                            Fb.setMaxModelos(MaxModelos);
                            Fb.setNombre(Nombre);
                            Fb.setNombreMarca(NombreMarca);
                            Fb.setTipoCarroceria(TipoCarroceria);
                            Fb.setUbicacion(Ubicacion);
                            break;}
                        case 3:{ 
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            String ListaFabricas = "Ingresa el indice de una de las siguientes fabricas\n";
                            for (int i = 0; i < corporaciones.get(posicionCorporacion).getFabricas().size(); i++) {
                                ListaFabricas+=i+". "+corporaciones.get(posicionCorporacion).getFabricas().get(i).getNombre()+"\n";
                            }
                            int posicionFabrica = Integer.parseInt(JOptionPane.showInputDialog(ListaFabricas));
                            corporaciones.get(posicionCorporacion).getFabricas().remove(posicionFabrica);
                            break;}
                        case 4:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof Fabricas) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;}
                    }
                    break;
                }
                case 5:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Modificar\n 3.Eliminar\n 4. Listar"));
                    switch(op){
                        case 1:{
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la fabrica");
                            int yearCreacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de creacion"));
                            String CampoDedicacion=JOptionPane.showInputDialog("Ingrese el campo de dedicacion");
                            String Tecnologias=JOptionPane.showInputDialog("Ingrese la tecnologias");
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            corporaciones.get(posicionCorporacion).getDivisionesTecnologicas().add(new DivisionesTecnologicas(Nombre, yearCreacion,CampoDedicacion,Tecnologias));
                            break;}
                        case 2:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            String listaDivision = "Ingresa el indice de una de las siguientes Divisiones tecnologicas\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaDivision+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            int posicionDivision = Integer.parseInt(JOptionPane.showInputDialog(listaDivision));
                            String Nombre=JOptionPane.showInputDialog("Ingrese nombre de la fabrica");
                            int yearCreacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de creacion"));
                            String CampoDedicacion=JOptionPane.showInputDialog("Ingrese el campo de dedicacion");
                            String Tecnologias=JOptionPane.showInputDialog("Ingrese la tecnologias");
                            DivisionesTecnologicas DT = corporaciones.get(posicionCorporacion).getDivisionesTecnologicas().get(posicionDivision);
                            DT.setCampoDedicacion(CampoDedicacion);
                            DT.setNombre(Nombre);
                            DT.setTecnologias(Tecnologias);
                            DT.setYearCreacion(yearCreacion);
                            break;}
                        case 3:{
                            String listaCorporaciones = "Ingresa el indice de una de las siguientes corporaciones\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaCorporaciones+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            String listaDivision = "Ingresa el indice de una de las siguientes Divisiones tecnologicas\n";
                            for (int i = 0; i < corporaciones.size(); i++) {
                                listaDivision+=i+". "+corporaciones.get(i).getNombre()+"\n";
                            }
                            int posicionCorporacion = Integer.parseInt(JOptionPane.showInputDialog(listaCorporaciones));
                            int posicionDivision = Integer.parseInt(JOptionPane.showInputDialog(listaDivision));
                            corporaciones.get(posicionCorporacion).getDivisionesTecnologicas().remove(posicionDivision);
                            break;}
                        case 4:{
                            String salida ="";
                            for (Object t : lista) {
                                if (t instanceof DivisionesTecnologicas) {
                                    salida += lista.indexOf(t)+"- "+t+"\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;}
                    }
                    break;
                }
                case 6:{
                    String salida ="";
                    for (Object t : lista) {
                        salida += lista.indexOf(t)+"- "+t+"\n";
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    break;
                }
            }   
        }
        
        
    }
    
}
