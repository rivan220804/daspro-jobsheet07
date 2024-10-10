import java.util.Scanner;
/**
 * SiakadFor23
 */
public class SiakadFor23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            while (true) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + " (0-100): ");
                nilai = sc.nextDouble();
                if (nilai >= 0 && nilai <= 100) {
                break; 
            } else {
                System.out.println("Nilai tidak valid! Silakan masukkan nilai antara 0 dan 100.");
            }
            }

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.print("Nilai tertinggi: " + tertinggi);
        System.out.print("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}
