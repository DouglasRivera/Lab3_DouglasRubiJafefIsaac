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
public class Premiun extends Marca{
    String DivisionDeportiva;
    String DivisionDelujo;
    String TipoCarroceria;
    
    public Premiun(String DivisionDeportiva, String DivisionDelujo, String TipoCarroceria) {
        this.DivisionDeportiva = DivisionDeportiva;
        this.DivisionDelujo = DivisionDelujo;
        this.TipoCarroceria = TipoCarroceria;
    }

    public Premiun() {
    }

    public Premiun(String Nombre, String Slogan, int yearFundacion, int yearIntegracion, String Fundador, int TotalVentas, String Presidente, int NumeroModelos) {
        super(Nombre, Slogan, yearFundacion, yearIntegracion, Fundador, TotalVentas, Presidente, NumeroModelos);
    }

    public String getDivisionDeportiva() {
        return DivisionDeportiva;
    }

    public void setDivisionDeportiva(String DivisionDeportiva) {
        this.DivisionDeportiva = DivisionDeportiva;
    }

    public String getDivisionDelujo() {
        return DivisionDelujo;
    }

    public void setDivisionDelujo(String DivisionDelujo) {
        this.DivisionDelujo = DivisionDelujo;
    }

    public String getTipoCarroceria() {
        return TipoCarroceria;
    }

    public void setTipoCarroceria(String TipoCarroceria) {
        this.TipoCarroceria = TipoCarroceria;
    }
    
}
