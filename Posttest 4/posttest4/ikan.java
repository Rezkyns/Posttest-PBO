
package posttest4;

public class ikan extends user {
    private String nama;
    private String jeniskelamin;
    private int harga;

    public ikan(String namaorang, String umur, String alamat, String nama, String jeniskelamin, int harga) {
        super(namaorang, umur, alamat);
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.harga = harga;
    }

  

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

    /**
     *
     */
    @Override
    public void isAdded() {
        System.out.println("Ikan Baru dengan Jenis " + this. nama);
        System.out.println("Jenis Kelamin " + this.jeniskelamin);
        System.out.println("Dengan Harga " + this.harga);
        System.out.println("Berhasil ditambahkan");
    }
}
