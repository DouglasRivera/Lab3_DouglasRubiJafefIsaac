/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_douglasyjafef;

import java.util.ArrayList;

/**
 *
 * @author famii
 */
public class Corporaciones {
    String Nombre;
    String Sede;
    int yearFundacion;
    String Presidente;
    int NumEmpleados;
    int Cantidad_Autos; 
    ArrayList <Marca> Marca = new ArrayList();
    ArrayList <Fabricas> Fabricas = new ArrayList();
    ArrayList <DivisionesTecnologicas> DivisionesTecnologicas = new ArrayList();

    public Corporaciones() {
    }

    public Corporaciones(String Nombre, String Sede, int yearFundacion, String Presidente, int NumEmpleados, int Cantidad_Autos) {
        this.Nombre = Nombre;
        this.Sede = Sede;
        this.yearFundacion = yearFundacion;
        this.Presidente = Presidente;
        this.NumEmpleados = NumEmpleados;
        this.Cantidad_Autos = Cantidad_Autos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(int yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public int getNumEmpleados() {
        return NumEmpleados;
    }

    public void setNumEmpleados(int NumEmpleados) {
        this.NumEmpleados = NumEmpleados;
    }

    public int getCantidad_Autos() {
        return Cantidad_Autos;
    }

    public void setCantidad_Autos(int Cantidad_Autos) {
        this.Cantidad_Autos = Cantidad_Autos;
    }

    public ArrayList<Marca> getMarca() {
        return Marca;
    }

    public void setMarca(ArrayList<Marca> Marca) {
        this.Marca = Marca;
    }

    public ArrayList<Fabricas> getFabricas() {
        return Fabricas;
    }

    public void setFabricas(ArrayList<Fabricas> Fabricas) {
        this.Fabricas = Fabricas;
    }

    public ArrayList<DivisionesTecnologicas> getDivisionesTecnologicas() {
        return DivisionesTecnologicas;
    }

    public void setDivisionesTecnologicas(ArrayList<DivisionesTecnologicas> DivisionesTecnologicas) {
        this.DivisionesTecnologicas = DivisionesTecnologicas;
    }

    @Override
    public String toString() {
        return "Corporaciones{" + "Nombre=" + Nombre + ", Sede=" + Sede + ", yearFundacion=" + yearFundacion + ", Presidente=" + Presidente + ", NumEmpleados=" + NumEmpleados + ", Cantidad_Autos=" + Cantidad_Autos + ", Marca=" + Marca + ", Fabricas=" + Fabricas + ", DivisionesTecnologicas=" + DivisionesTecnologicas + '}';
    }
    
}
