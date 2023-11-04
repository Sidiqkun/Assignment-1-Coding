import java.util.Scanner;

public class cProgramZodiak{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menentukan Mengetahui Zodiak");
        System.out.println("Catatan : Tulislah sesuai ketentuan atau error");

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NPM : ");
        String npm = scanner.nextLine();

        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = scanner.nextInt();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = scanner.nextInt();

        String zodiak = tentukanZodiak(tanggal, bulan);
        System.out.println(nama + " (" + npm + ")" + ", zodiak adalah " + zodiak);

        scanner.close();
    }

    static String tentukanZodiak(int tanggal, int bulan) {
        String zodiak = "";

        if (bulan == 1) {
            zodiak = (tanggal >= 20) ? "Aquarius" : "Capricorn";
        } else if (bulan == 2) {
            zodiak = (tanggal >= 19) ? "Pisces" : "Aquarius";
        } else if (bulan == 3) {
            zodiak = (tanggal >= 21) ? "Aries" : "Pisces";
        } else if (bulan == 4) {
            zodiak = (tanggal >= 20) ? "Taurus" : "Aries";
        } else if (bulan == 5) {
            zodiak = (tanggal >= 21) ? "Gemini" : "Taurus";
        } else if (bulan == 6) {
            zodiak = (tanggal >= 21) ? "Cancer" : "Gemini";
        } else if (bulan == 7) {
            zodiak = (tanggal >= 23) ? "Leo" : "Cancer";
        } else if (bulan == 8) {
            zodiak = (tanggal >= 23) ? "Virgo" : "Leo";
        } else if (bulan == 9) {
            zodiak = (tanggal >= 23) ? "Libra" : "Virgo";
        } else if (bulan == 10) {
            zodiak = (tanggal >= 23) ? "Scorpio" : "Libra";
        } else if (bulan == 11) {
            zodiak = (tanggal >= 22) ? "Sagittarius" : "Scorpio";
        } else if (bulan == 12) {
            zodiak = (tanggal >= 22) ? "Capricorn" : "Sagittarius";
        } else {
            zodiak = "Bulan tidak valid.";
        }

        return zodiak;
    }
}