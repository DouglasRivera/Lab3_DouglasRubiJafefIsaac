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
public class SUV extends Modelo {
    boolean Modelo4X4;
    int CantidadPasajero;
    String NombreNavegador;

    public SUV(boolean Modelo4X4, int CantidadPasajero, String NombreNavegador) {
        this.Modelo4X4 = Modelo4X4;
        this.CantidadPasajero = CantidadPasajero;
        this.NombreNavegador = NombreNavegador;
    }

    public SUV() {
    }

    public SUV(String Nombre, int yearFabricacion, String TipoMotor, int CilindradaMotor, int Precio, String Tecnologias) {
        super(Nombre, yearFabricacion, TipoMotor, CilindradaMotor, Precio, Tecnologias);
    }

    public boolean isModelo4X4() {
        return Modelo4X4;
    }

    public void setModelo4X4(boolean Modelo4X4) {
        this.Modelo4X4 = Modelo4X4;
    }

    public int getCantidadPasajero() {
        return CantidadPasajero;
    }

    public void setCantidadPasajero(int CantidadPasajero) {
        this.CantidadPasajero = CantidadPasajero;
    }

    public String getNombreNavegador() {
        return NombreNavegador;
    }

    public void setNombreNavegador(String NombreNavegador) {
        this.NombreNavegador = NombreNavegador;
    }
    
}
