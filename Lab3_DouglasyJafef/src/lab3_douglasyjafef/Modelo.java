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
public class Modelo {
    String Nombre;
    int yearFabricacion;
    String TipoMotor;
    int CilindradaMotor;
    int Precio;
    String Tecnologias;

    public Modelo() {
    }

    public Modelo(String Nombre, int yearFabricacion, String TipoMotor, int CilindradaMotor, int Precio, String Tecnologias) {
        this.Nombre = Nombre;
        this.yearFabricacion = yearFabricacion;
        this.TipoMotor = TipoMotor;
        this.CilindradaMotor = CilindradaMotor;
        this.Precio = Precio;
        this.Tecnologias = Tecnologias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String TipoMotor) {
        this.TipoMotor = TipoMotor;
    }

    public int getCilindradaMotor() {
        return CilindradaMotor;
    }

    public void setCilindradaMotor(int CilindradaMotor) {
        this.CilindradaMotor = CilindradaMotor;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getTecnologias() {
        return Tecnologias;
    }

    public void setTecnologias(String Tecnologias) {
        this.Tecnologias = Tecnologias;
    }

    @Override
    public String toString() {
        return  "Nombre de modelo=" + Nombre + ", Año de fabricación=" + yearFabricacion + ", Tipo de motor=" + TipoMotor + ", Cilindrada del motor=" + CilindradaMotor + ", Precio del modelo=" + Precio + ", Tecnologias en el modelo=" + Tecnologias ;
    }
    
}
