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
public class Sedan extends Modelo{
    boolean AndroidPlay;
    boolean AndroidAuto;
    ArrayList <String> ADAS = new ArrayList();

    public Sedan(boolean AndroidPlay, boolean AndroidAuto) {
        this.AndroidPlay = AndroidPlay;
        this.AndroidAuto = AndroidAuto;
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

    public ArrayList<String> getADAS() {
        return ADAS;
    }

    public void setADAS(ArrayList<String> ADAS) {
        this.ADAS = ADAS;
    }

    @Override
    public String toString() {
        return "Sedan:" + "AndroidPlay=" + AndroidPlay + ", AndroidAuto=" + AndroidAuto + ", Asistentes de conducción=" + ADAS + '}';
    }
    

        
}
