/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author ASUS
 */
public class penjual extends user {
    private int umurpenjual;

    public penjual(String namaorang, String umur, String alamat, int umurpenjual) {
        super(namaorang, umur, alamat);
        this.umurpenjual = umurpenjual;
    }

    public int getUmurpenjual() {
        return umurpenjual;
    }

    public void setUmurpenjual(int umurpenjual) {
        this.umurpenjual = umurpenjual;
    }
}
