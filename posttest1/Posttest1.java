/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Posttest1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ikan> ikan = new ArrayList<ikan>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        while (true) {
             System.out.println("SISTEM PENDATAAN PENJUAL IKAN CUPANG");
             System.out.println("1. Buat Data");
             System.out.println("2. Lihat Data");
             System.out.println("3. Update Data");
             System.out.println("4. Hapus Data");
             System.out.println("5. Exit");
             System.out.print("Masukan Pilihan :");
             int pilihan = Integer.parseInt(br.readLine());
             switch (pilihan) {
                 case 1:
                     createIkn(); 
                     break;
                 case 2:
                     readIkn();  
                     break;
                 case 3:
                     editIkn();
                     break;
                 case 4:
                     hapusIkn();  
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

     public static void createIkn() throws IOException{
         System.out.print("Masukan nama :");
         String addnama = br.readLine();
         System.out.print("Masukan jeniskelamin :");
         String addjeniskelamin = br.readLine();
         System.out.print("Masukan harga :");
         int addharga = Integer.parseInt(br.readLine());
         ikan iknBaru = new ikan(addnama, addjeniskelamin, addharga);

         ikan.add(iknBaru);
         iknBaru.registrasi();
     }
     public static void readIkn() throws IOException{
         System.out.println(" DATA ikan");
         for (int i = 0; i < ikan.size(); i++){
             System.out.println("PEMASUKAN YANG ke-" + (i+1));
             System.out.println("Nama ikan : " + ikan.get(i).nama);
             System.out.println("Jeniskelamin : " + ikan.get(i).jeniskelamin);
             System.out.println("Harga : " + ikan.get(i).harga);
             System.out.println("\n");
         }
     }
     
     public static void editIkn() throws IOException {
         System.out.print("Masukkan indeks ikan: ");
         int idx = Integer.parseInt(br.readLine());

         if(idx <= ikan.size() || idx > 0) {
             System.out.print("Masukan nama :");
             String addnama = br.readLine();
             System.out.print("Masukan jeniskelamin :");
             String addjeniskelamin = br.readLine();
             System.out.print("Masukan harga :");
             int addharga = Integer.parseInt(br.readLine());
             ikan iknBaru = new ikan(addnama, addjeniskelamin, addharga);
             ikan.set(idx - 1, iknBaru);
            
             System.out.println("Data berhasil diedit!");
         }else{
             System.out.println("Data Tidak ada");
         }
     }

     public static void hapusIkn() throws IOException {
         System.out.print("Masukkan indeks ikan: ");
         int idx = Integer.parseInt(br.readLine());

         if(idx <= ikan.size() || idx > 0) {
             ikan.remove(idx - 1);
            
             System.out.println("Data berhasil dihapus!");
         }else{
             System.out.println("Data Tidak ada");
         }
     }
 }
    