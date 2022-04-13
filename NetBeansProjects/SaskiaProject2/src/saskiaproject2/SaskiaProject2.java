/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saskiaproject2;
class MenuMakanan{
String nama_makanan;
String harga;
String deskripsi;
}

/**
 *
 * @author saskiaokt
 */
public class SaskiaProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MenuMakanan mkn1 = new MenuMakanan ();
    MenuMakanan mkn2 = new MenuMakanan ();
    MenuMakanan mkn3 = new MenuMakanan ();
    MenuMakanan mkn4 = new MenuMakanan ();
    MenuMakanan mkn5 = new MenuMakanan ();
    
    mkn1.nama_makanan = "Bakso";
    mkn1.harga = "Rp 10.000";
    mkn1.deskripsi = "Bakso dengan daging segar pilihan dan kuah yang nikmat";
    
    mkn2.nama_makanan = "Mie Ayam";
    mkn2.harga = "Rp 15.000";
    mkn2.deskripsi = "Mie Ayam legendaris dengan topping ayam yang melimpah";
    
    mkn3.nama_makanan = "Ketoprak";
    mkn3.harga = "Rp 12.000";
    mkn3.deskripsi = "Ketoprak khas Jawa Tengah yang dilengkapi dengan kerupuk";
    
    mkn4.nama_makanan = "Tahu Gejrot";
    mkn4.harga = "Rp 10.000";
    mkn4.deskripsi = "Makanan asal cirebon yang terdiri dari tahu dengan kuah gula merah";
    
    mkn5.nama_makanan = "Nasi Goreng Kampung";
    mkn5.harga = "Rp 15.000";
    mkn5.deskripsi = "Nasi Goreng buatan rumahan yang menggugah selera dengan berbagai topping";
    
    System.out.println("DAFTAR MENU MAKANAN RESTO INDONESIA");
    System.out.println("");
    
    System.out.println("1. Nama Makanan : " + mkn1.nama_makanan);
    System.out.println("Harga : " + mkn1.harga);
    System.out.println("Deskripsi : " + mkn1.deskripsi);
    System.out.println("");
    
    System.out.println("2. Nama Makanan : " + mkn2.nama_makanan);
    System.out.println("Harga : " + mkn2.harga);
    System.out.println("Deskripsi : " + mkn2.deskripsi);
    System.out.println("");
    
    System.out.println("3. Nama Makanan : " + mkn3.nama_makanan);
    System.out.println("Harga : " + mkn3.harga);
    System.out.println("Deskripsi : " + mkn3.deskripsi);
    System.out.println("");
    
    System.out.println("4. Nama Makanan : " + mkn4.nama_makanan);
    System.out.println("Harga : " + mkn4.harga);
    System.out.println("Deskripsi : " + mkn4.deskripsi);
    System.out.println("");
    
    System.out.println("5. Nama Makanan : " + mkn5.nama_makanan);
    System.out.println("Harga : " + mkn5.harga);
    System.out.println("Deskripsi : " + mkn5.deskripsi);
    System.out.println("");
    }
}
    
    
    
    
    
    
    
    
    
   
