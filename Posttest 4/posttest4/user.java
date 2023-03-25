
package posttest4;

/**
 *
 * @author ASUS
 */
public class user {
    public String namaorang;
    public String umur;
    public String alamat;

    public user(String namaorang, String umur, String alamat) {
        this.namaorang = namaorang;
        this.umur = umur;
        this.alamat = alamat;
    }                       

    public String getNamaorang() {
        return namaorang;
    }

    public void setNamaorang(String namaorang) {
        this.namaorang = namaorang;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   public void isAdded() {
        System.out.println("User baru dengan nama " + this.namaorang);
        System.out.println("Berhasil ditambahkan");
    }
}
