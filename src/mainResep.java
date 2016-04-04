import java.util.Scanner;
public class mainResep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String obat1[] = {"Bodrex", "Herbangin", "Antangin", "Antimo", "Paramex"};
        int harga1[] = {4000, 3000, 1000, 1500, 5000};
        Resep pelanggan = new Resep();
        System.out.println("----------SELAMAT DATANG DI APOTEK---------");
        System.out.print("Masukkan Nama     : ");
        pelanggan.setNama(in.next());
        System.out.print("Masukkan Alamat   : ");
        pelanggan.setAlamat(in.next());
              
        System.out.println("No. Nama Obat\t\tHarga");
        for (int i = 0; i < obat1.length; i++) {
            System.out.println((i + 1) + ".  " + obat1[i] + "\t\t" + harga1[i]);
                System.out.print("Masukkan Jumlah Obat yang dibeli : ");
        pelanggan.Data(in.nextInt());
        for (int a = 0; i < pelanggan.jumlah; i++) {
            System.out.print("Masukkan Nama Obat : ");
            pelanggan.pilihObat(in.next());   
        }
        System.out.println("");
        pelanggan.Data();    
        }}}