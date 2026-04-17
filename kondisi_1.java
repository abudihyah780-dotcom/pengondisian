public class Kondisi_1 {

    public static void main(String[] args) {
         // Lengkapi variabel di bawah ini dengan nilai uji
        
         int usia = 20; // Contoh: 20 tahun
        double totalBelanja = 175000; // Contoh: 175.000

        if (usia < 18) {
            System.out.println("Akses dibatasi: Di bawah 18 tahun.");
        } else if (totalBelanja >= 150000) {
            System.out.println("Akses diberikan + Diskon 15%");
        } else {
            System.out.println("Akses diberikan, tanpa diskon.");
        }
    }
}