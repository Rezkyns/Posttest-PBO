
package posttest4;

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
    
    /**
     *
     */
    @Override
    public void isAdded() {
        System.out.println("Penjual baru dengan nama " + this.namaorang);
        System.out.println("Dengan Umur" + this.umurpenjual);
        System.out.println("Berhasil ditambahkan");
    }
}
