/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_douglasyjafef;

/**
 *
 * @author famii
 */
public class DivisionesTecnologicas {
    String Nombre;
    int yearCreacion;
    String CampoDedicacion;
    String Tecnologias;

    public DivisionesTecnologicas() {
    }

    public DivisionesTecnologicas(String Nombre, int yearCreacion, String CampoDedicacion, String Tecnologias) {
        this.Nombre = Nombre;
        this.yearCreacion = yearCreacion;
        this.CampoDedicacion = CampoDedicacion;
        this.Tecnologias = Tecnologias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getYearCreacion() {
        return yearCreacion;
    }

    public void setYearCreacion(int yearCreacion) {
        this.yearCreacion = yearCreacion;
    }

    public String getCampoDedicacion() {
        return CampoDedicacion;
    }

    public void setCampoDedicacion(String CampoDedicacion) {
        this.CampoDedicacion = CampoDedicacion;
    }

    public String getTecnologias() {
        return Tecnologias;
    }

    public void setTecnologias(String Tecnologias) {
        this.Tecnologias = Tecnologias;
    }
    
}
