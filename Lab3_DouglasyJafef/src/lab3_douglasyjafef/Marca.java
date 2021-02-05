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
public class Marca {
    String Nombre;
    String Slogan;
    int yearFundacion;
    int yearIntegracion;
    String Fundador;
    int TotalVentas;
    String Presidente;
    int NumeroModelos;
    ArrayList <Modelo> Modelo = new ArrayList();

    public Marca() {
    }

    public Marca(String Nombre, String Slogan, int yearFundacion, int yearIntegracion, String Fundador, int TotalVentas, String Presidente, int NumeroModelos) {
        this.Nombre = Nombre;
        this.Slogan = Slogan;
        this.yearFundacion = yearFundacion;
        this.yearIntegracion = yearIntegracion;
        this.Fundador = Fundador;
        this.TotalVentas = TotalVentas;
        this.Presidente = Presidente;
        this.NumeroModelos = NumeroModelos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String Slogan) {
        this.Slogan = Slogan;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(int yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    public int getYearIntegracion() {
        return yearIntegracion;
    }

    public void setYearIntegracion(int yearIntegracion) {
        this.yearIntegracion = yearIntegracion;
    }

    public String getFundador() {
        return Fundador;
    }

    public void setFundador(String Fundador) {
        this.Fundador = Fundador;
    }

    public int getTotalVentas() {
        return TotalVentas;
    }

    public void setTotalVentas(int TotalVentas) {
        this.TotalVentas = TotalVentas;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public int getNumeroModelos() {
        return NumeroModelos;
    }

    public void setNumeroModelos(int NumeroModelos) {
        this.NumeroModelos = NumeroModelos;
    }

    public ArrayList<Modelo> getModelo() {
        return Modelo;
    }

    public void setModelo(ArrayList<Modelo> Modelo) {
        this.Modelo = Modelo;
    }
    
}
