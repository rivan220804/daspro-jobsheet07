import java.util.Scanner;
/**
 * TiketBioskop23
 */
public class TiketBioskop23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        double totalHarga = 0;
        int totalTiketTerjual = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau masukkan -1 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang valid.");
                continue; 
            }
            totalTiketTerjual += jumlahTiket;
            double totalHargaSementara = jumlahTiket * hargaTiket;

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            totalHargaSementara -= totalHargaSementara * diskon;
            totalHarga += totalHargaSementara;

            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Total harga penjualan tiket untuk transaksi ini: Rp " + totalHargaSementara);
        }
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total harga penjualan tiket selama satu hari: Rp " + totalHarga);
    
    }
}