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
public class Sedan extends Modelo{
    boolean AndroidPlay;
    boolean AndroidAuto;
    String ADAS;

    public Sedan(boolean AndroidPlay, boolean AndroidAuto, String ADAS) {
        this.AndroidPlay = AndroidPlay;
        this.AndroidAuto = AndroidAuto;
        this.ADAS = ADAS;
    }

    public Sedan() {
    }

    public Sedan(String Nombre, int yearFabricacion, String TipoMotor, int CilindradaMotor, int Precio, String Tecnologias) {
        super(Nombre, yearFabricacion, TipoMotor, CilindradaMotor, Precio, Tecnologias);
    }

    public boolean isAndroidPlay() {
        return AndroidPlay;
    }

    public void setAndroidPlay(boolean AndroidPlay) {
        this.AndroidPlay = AndroidPlay;
    }

    public boolean isAndroidAuto() {
        return AndroidAuto;
    }

    public void setAndroidAuto(boolean AndroidAuto) {
        this.AndroidAuto = AndroidAuto;
    }

    public String getADAS() {
        return ADAS;
    }

    public void setADAS(String ADAS) {
        this.ADAS = ADAS;
    }
    
}
