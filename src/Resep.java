
    public class Resep {
     String nama, alamat, obat;
     int harga, jumlah;
     public Resep (){
     }
    public Resep(String a, String b) {
        nama = a;
        alamat = b;    }
    public void setNama(String a) {
        nama = a;    }
    public void Data(int a) {
        jumlah = a;    }
    public void setAlamat(String a) {
        alamat = a;    }
    public int pilihObat(String a) {
        obat = a;
        if (obat.equals("Bodrex")) {
            harga += 4000;
        } else if (obat.equals("Herbangin")) {
            harga += 3000;
        } else if (obat.equals("Antangin")) {
            harga += 1000;
        } else if (obat.equals("Antimo")) {
            harga += 1500;
        } else if (obat.equals("Paramex")) {
            harga += 5000;
        } else {
            System.out.println("Maaf obat tidak tersedia");   }
        return harga;    }
    public void Data() {
        System.out.println("-------------- APOTEK -------------");
        System.out.println("Nama Anda                       : " + nama);
        System.out.println("Alamat Anda                     : " + alamat);
        System.out.println("Harga Yang Harus Dibayar        : " + harga);   
    }
    }