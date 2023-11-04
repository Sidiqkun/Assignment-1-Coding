import java.util.Scanner;

public class bPerulanganWhileIfElse{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Berikan saya contoh bilangan asli? ");

            int bilangan;
            boolean kondisi = true;

            while (kondisi) {
                System.out.print("Jawaban : ");
                bilangan = Integer.parseInt(scanner.nextLine());

                if (bilangan > 0) {
                    System.out.println("Selamat anda benar, bilangan yang anda masukan adalah bilangan positif yang merupakan bilangan asli.");
                } else if (bilangan < 0) {
                    System.out.println("Sayang sekali, bilangan yang anda masukan adalah bilangan negatif yang bukan merupakan bilangan asli.");
                } else{
                    System.out.println("Sayang sekali, Bilangan yang anda masukan adalah Nol yang bukan merupakan bilangan asli.");
                } break;
            } 
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Mohon masukkan angka bukan huruf.");
        }

        System.out.println("Bilangan asli adalah bilangan yang dimulai dari angka 1 sampai dengan positif tak hingga dan juga bukan dari nol(0).");
    }
}