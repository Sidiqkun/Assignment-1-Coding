public class dMenampilkanTipeDataArray{
    public static void main(String[] args){
        // Mendefinisikan sebuah array
        int[] sepuluh = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Menampilkan elemen-elemen array secara berurutan
        System.out.println("Output angka 1 sampai 10 dibawah menggunakan array : ");

        for (int i = 0; i < sepuluh.length; i++) {
            System.out.print(sepuluh[i] + " ");
        }
    }
}