
package posttest5;

public class penjual extends user {
    private int umurpenjual;
    public final String status= "penjual";

    public penjual(String namaorang, String umur, String alamat, int umurpenjual, String penjual) {
        super(namaorang, umur, alamat);
        this.umurpenjual = umurpenjual;
    }

    public int getUmurpenjual() {
        return umurpenjual;
    }

    public void setUmurpenjual(int umurpenjual) {
        this.umurpenjual = umurpenjual;
    }
    
    /**
     *
     */
    @Override
    public void isAdded() {
        System.out.println("Penjual baru dengan nama " + this.namaorang);
        System.out.println("Dengan Umur" + this.umurpenjual);
        System.out.println("Berhasil ditambahkan");
    }

    @Override   
    public void display() {
        System.out.println("Nama Orang : " + this.namaorang);
        System.out.println("Umur Orang : " + this.umurpenjual);
        System.out.println("Alamat Orang : " + this.alamat);
        System.out.println("Umur Penjual: " + this.umur);
        System.out.println(" Status Penjual : " + this.status);
        System.out.println("\n");
    }
}
