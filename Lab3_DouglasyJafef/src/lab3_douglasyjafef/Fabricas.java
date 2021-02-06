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
public class Fabricas {
    String Nombre;
    String Ubicacion;
    int MaxModelos;
    String TipoCarroceria;
    int CantidadEmpleados;
    String NombreMarca;
    int CantidadAutos;

    public Fabricas() {
    }

    public Fabricas(String Nombre, String Ubicacion, int MaxModelos, String TipoCarroceria, int CantidadEmpleados, String NombreMarca, int CantidadAutos) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.MaxModelos = MaxModelos;
        this.TipoCarroceria = TipoCarroceria;
        this.CantidadEmpleados = CantidadEmpleados;
        this.NombreMarca = NombreMarca;
        this.CantidadAutos = CantidadAutos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getMaxModelos() {
        return MaxModelos;
    }

    public void setMaxModelos(int MaxModelos) {
        this.MaxModelos = MaxModelos;
    }

    public String getTipoCarroceria() {
        return TipoCarroceria;
    }

    public void setTipoCarroceria(String TipoCarroceria) {
        this.TipoCarroceria = TipoCarroceria;
    }

    public int getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(int CantidadEmpleados) {
        this.CantidadEmpleados = CantidadEmpleados;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String NombreMarca) {
        this.NombreMarca = NombreMarca;
    }

    public int getCantidadAutos() {
        return CantidadAutos;
    }

    public void setCantidadAutos(int CantidadAutos) {
        this.CantidadAutos = CantidadAutos;
    }

    @Override
    public String toString() {
        return "Nombre de fábrica=" + Nombre + ", Ubicacion de fábrica=" + Ubicacion + ", Cantidad máxima de modelos que se pueden crear=" + MaxModelos + ", Tipo de carrocería=" + TipoCarroceria + ", Cantidad de empleados=" + CantidadEmpleados + ", Nombre de Marca=" + NombreMarca + ", Cantida de autos en la fábrica=" + CantidadAutos;
    }
    
}
