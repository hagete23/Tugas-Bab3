
    public class Conversi {
    private static final String angka[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String huruf[] = {
        "", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas" };
    private static String KonvTeks;
    private static String KonvAngka;
    public String getKonvTeks() {
        return KonvTeks;    }
    public String getKonvAngka() {
        return KonvAngka;    }
    public String Math(String a) {
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (a.equalsIgnoreCase(huruf[i])) {
                    KonvTeks = angka[i];                }
                else if (a.equalsIgnoreCase(huruf[i] + " belas")) {
                    KonvTeks = angka[1] + angka[i];    }
                else if (a.equalsIgnoreCase(huruf[i] + " puluh")) {
                    KonvTeks = angka[i] + angka[0];    }
                else if (a.equalsIgnoreCase(huruf[i] + " puluh " + huruf[j])) {
                    KonvTeks = angka[i] + angka[j];  } 
else if (a.equalsIgnoreCase("seratus")) {
                    KonvTeks = "100";   }  }  }
        return KonvTeks;   }    
    public String Math(int a){
        KonvAngka="";
        if(a<12){
            KonvAngka+=huruf[a];
        }else if(a>11&&a<20){
            KonvAngka+=huruf[a-10]+" belas";
        }else if(a<99){
            KonvAngka+=(huruf[a/10]+" puluh "+huruf[a%10]);
        }else if(a>=100){
            KonvAngka="seratus";
        }else if(a>100){
            System.out.println("Nilai tidak ditemukan"); }
        return KonvAngka; }}