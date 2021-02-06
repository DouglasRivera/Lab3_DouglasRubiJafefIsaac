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
public class Generalista extends Marca{
    String Tipo;

    public Generalista(String Tipo) {
        this.Tipo = Tipo;
    }

    public Generalista() {
    }

    public Generalista(String Nombre, String Slogan, int yearFundacion, int yearIntegracion, String Fundador, int TotalVentas, String Presidente, int NumeroModelos) {
        super(Nombre, Slogan, yearFundacion, yearIntegracion, Fundador, TotalVentas, Presidente, NumeroModelos);
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Tipo de marca=" + Tipo;
    }
    
    
}
