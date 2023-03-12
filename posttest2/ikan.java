/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

public class ikan {
    private String nama;
    private String jeniskelamin;
    private int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
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
