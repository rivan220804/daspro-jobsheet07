import java.util.Scanner;

public class Parkir23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifMobilperjam = 3000, tarifMotorperjam = 2000, tarifTetap = 12500;
        int jenisKendaraan; 
        int durasiParkir;   
        double totalPembayaran = 0;
        
        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Input tidak valid. Silakan masukkan 1 untuk Mobil atau 2 untuk Motor.");
                continue;
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasiParkir = sc.nextInt();

            double pembayaran = 0;

            if (durasiParkir > 5) {
                pembayaran += 12500; 
            } else {
                if (jenisKendaraan == 1) {
                    pembayaran = durasiParkir * tarifMobilperjam; 
                } else {
                    pembayaran = durasiParkir * tarifMotorperjam; 
                }
            }

            totalPembayaran += pembayaran; 
            System.out.println("Total pembayaran untuk kendaraan ini: Rp " + pembayaran);
        }
        System.out.println("Total pembayaran parkir keseluruhan: Rp " + totalPembayaran);
        
      
    }
}

