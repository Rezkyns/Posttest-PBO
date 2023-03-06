/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author ASUS
 */
public class ikan {
    String nama;
    String jeniskelamin;
    int harga;
    
    
    
    public ikan(String nama, String jeniskelamin, int harga){
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.harga = harga;
    }
    public void registrasi(){
        System.out.println("nama, " + this.nama);
        System.out.println("jeniskelamin " + this.jeniskelamin);
        System.out.println("dengan harga " + this.harga);
        System.out.println("SUDAH MASUK DALAM DATA");
    }
    public void terupdate(){
        System.out.println("nama, " + this.nama);
        System.out.println("jeniskelamin " + this.jeniskelamin);
        System.out.println("dengan harga " + this.harga);
        System.out.println("SUDAH DI UPDATE DALAM DATA");
    }
}
