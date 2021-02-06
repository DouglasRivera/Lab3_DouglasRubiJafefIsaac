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
public class Hatchback extends Modelo{
    int Capacidad;
    int TotalLongitd;
    int CantidadBolsasAire;

    public Hatchback(int Capacidad, int TotalLongitd, int CantidadBolsasAire) {
        this.Capacidad = Capacidad;
        this.TotalLongitd = TotalLongitd;
        this.CantidadBolsasAire = CantidadBolsasAire;
    }

    public Hatchback() {
    }

    public Hatchback(String Nombre, int yearFabricacion, String TipoMotor, int CilindradaMotor, int Precio, String Tecnologias) {
        super(Nombre, yearFabricacion, TipoMotor, CilindradaMotor, Precio, Tecnologias);
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getTotalLongitd() {
        return TotalLongitd;
    }

    public void setTotalLongitd(int TotalLongitd) {
        this.TotalLongitd = TotalLongitd;
    }

    public int getCantidadBolsasAire() {
        return CantidadBolsasAire;
    }

    public void setCantidadBolsasAire(int CantidadBolsasAire) {
        this.CantidadBolsasAire = CantidadBolsasAire;
    }

    @Override
    public String toString() {
        return "Hatchback:" + "Capacidad de maletero=" + Capacidad + ", Total de longitd=" + TotalLongitd + ", Cantidad de bolsas de aire=" + CantidadBolsasAire;
    }
    
}
