import java.util.Scanner;
public class mainKonversi {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Conversi konversi=new Conversi();
        String ulang;
        do{
            System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI");
            System.out.println("Menu : ");
            System.out.println("1. Konversi Angka ke Teks");
            System.out.println("2. Konversi Teks ke Angka");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih=in.nextInt();
            System.out.println("-----------------------------------------");
            switch(pilih){
                case 1: System.out.println("Konversi Angka ke Teks");
                    System.out.print("Masukkan Angka : ");
                    konversi.Math(in.nextInt());
                    System.out.println("Hasil : "+konversi.getKonvAngka());
                    System.out.println("-----------------------------------------");
                    break;
                case 2: System.out.println("Konversi Teks ke Angka");
                    System.out.print("Masukkan Teks : ");
                    konversi.Math(in.nextLine());
                    System.out.println("Hasil : "+konversi.getKonvTeks());                   
                    System.out.println("-----------------------------------------");
                    break;       }
            System.out.print("ulangi ? (Y/N)");
            ulang=in.next();
        }while(ulang.equalsIgnoreCase("Y")); 
    }
}