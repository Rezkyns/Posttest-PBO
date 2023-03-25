
package posttest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Posttest4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ikan> ikan = new ArrayList<ikan>();
    static ArrayList<penjual> penjual = new ArrayList<penjual>();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Sistem Pendataan Penjualan Ikan Hias");
            System.out.println("1. Buat");
            System.out.println("2. Baca");
            System.out.println("3. Update");
            System.out.println("4. Hapus");
            System.out.println("5. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    createData(); 
                    break;
                case 2:
                    readData();  
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    deleteData();  
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }

    public static void createData() throws IOException{
        System.out.println("Tambah Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukan Nama :");
                String addnamaorang = br.readLine();
                System.out.print("Masukan umur :");
                String addumur = br.readLine();
                System.out.print("Masukan alamat :");
                String addalamat = br.readLine();
                System.out.print("Masukan nama Ikan :");
                String addnama = br.readLine();
                System.out.print("Masukan jeniskelamin :");
                String addjeniskelamin = br.readLine();
                System.out.print("Masukan harga :");
                int addharga = Integer.parseInt(br.readLine());
                ikan iknBaru = new ikan(addnamaorang, addumur, addalamat, addnama, addjeniskelamin, addharga);
                ikan.add(iknBaru);
                iknBaru.isAdded();
                break;
            case 2:
                System.out.print("Masukan nama :");
                String addnama1 = br.readLine();
                System.out.print("Masukan umur :");
                String addumur1 = br.readLine();
                System.out.print("Masukan alamat :");
                String addalamat1 = br.readLine();
                System.out.print("Masukan umurpenjual :");
                int addumurpenjual1 = Integer.parseInt(br.readLine());
                penjual pjlBaru = new penjual(addnama1, addumur1, addalamat1, addumurpenjual1);
                penjual.add(pjlBaru);
                pjlBaru.isAdded();
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

    }
    public static void readData() throws IOException{
        System.out.println("Tambah Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println(" Data Ikan Hias");
                for (int i = 0; i < ikan.size(); i++){
                    System.out.println("ikan ke-" + (i+1));
                    System.out.println("Nama  : " + ikan.get(i).getNamaorang());
                    System.out.println("Umur  : " + ikan.get(i).getUmur());
                    System.out.println("Alamat  : " + ikan.get(i).getAlamat());
                    System.out.println("Nama Ikan : " + ikan.get(i).getNama());
                    System.out.println("Jenis Kelamin Ikan : " + ikan.get(i).getJeniskelamin());
                    System.out.println("Harga Ikan : " + ikan.get (i).getHarga());
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println(" Data Penjual");
                for (int i = 0; i < penjual.size(); i++) {
                    System.out.println("Penjual ke-" + (i+1));
                    System.out.println("Nama Orang : " + penjual.get(i).getNamaorang());
                    System.out.println("Umur Orang : " + penjual.get(i).getUmur());
                    System.out.println("Alamat Orang : " + penjual.get(i).getAlamat());
                    System.out.println("Umur Penjual: " + penjual.get(i).getUmurpenjual());
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }

    public static void editData() throws IOException {
        System.out.println("Tambah Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Input indeks Ikan: ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= ikan.size() || idx > 0) {
                    System.out.print("Masukan Nama :");
                    String addnamaorang = br.readLine();
                    System.out.print("Masukan umur :");
                    String addumur = br.readLine();
                    System.out.print("Masukan alamat :");
                    String addalamat = br.readLine();
                    System.out.print("Masukan Nama :");
                    String addnama = br.readLine();
                    System.out.print("Masukan jenis kelamin :");
                    String addjeniskelamin = br.readLine();
                    System.out.print("Masukan harga :");
                    int addharga = Integer.parseInt(br.readLine());
                    
                    ikan.get(idx-1).setNamaorang(addnamaorang);
                    ikan.get(idx-1).setUmur(addumur);
                    ikan.get(idx-1).setAlamat(addalamat);
                    ikan.get(idx-1).setNama(addnama);
                    ikan.get(idx-1).setJeniskelamin(addjeniskelamin);
                    ikan.get(idx-1).setHarga(addharga);
                    
                    System.out.println("Data berhasil diedit!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan indeks Penjual: ");
                int idx1 = Integer.parseInt(br.readLine());

                if(idx1 <= penjual.size() || idx1 > 0) {
                    System.out.print("Masukan namaorang :");
                    String addnamaorang = br.readLine();
                    System.out.print("Masukan umur :");
                    String addumur = br.readLine();
                    System.out.print("Masukan alamat :");
                    String addalamat = br.readLine();
                    System.out.print("Masukan Umurpenjual :");
                    int addumurpenjual = Integer.parseInt(br.readLine());
                    
                    penjual.get(idx1-1).setNamaorang(addnamaorang);
                    penjual.get(idx1-1).setUmur(addumur);
                    penjual.get(idx1-1).setAlamat(addalamat);
                    penjual.get(idx1-1).setUmurpenjual(addumurpenjual);
                    
                    System.out.println("Data berhasil diedit!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }

    }

    public static void deleteData() throws IOException {
        System.out.println("Tambah Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan indeks Ikan: ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= ikan.size() || idx > 0) {
                    ikan.remove(idx - 1);
                    
                    System.out.println("Data berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan indeks Penjual: ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= penjual.size() || idx1 > 0) {
                    penjual.remove(idx1 - 1);
                    
                    System.out.println("Data berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }

    }
}