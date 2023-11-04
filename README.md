# Assignment-1-Coding
## Nama : Sidik Bagus Firmansyah
## NPM  : G1A023027
## Informatika, A

Tugas MKU Komputer dan Pemrograman 

1. Buat program JAVA perulangan hingga 100 dengan output 1 sampai 9 lalu output adalah nama sampai 100
2. Buat program JAVA bebas dengan menggunakan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for

## Penjelasan
1. Pada program yang dilampirkan pada folder ini dengan nama file loop.java. Saya menggunakan perulangan FOR untuk membuat looping dalam program.
   Kemudian untuk membatasi antara angka 1 sampai dengan 9 adalah dengan menggunakan IF, if (i <= 9) itu artinya jika kurang dari sama dengan 9 maka akan mengeluarkan output dari angka 1 -9
   Kemudian kode ELSE IF yang kondisi nya terpenuhi ya itu else if (i == 10) {print(nama)} maka output selanjutnya adalah nama sampai dengan 100 kali.
2. Pada program ini saya menggunakan if else dalam perulangan while yang berfungsi untuk menentukan angka yang dinput adalah bilangan bulat atau tidak jadi logika perulangan while adalah while diikuti dengan (kondisi) lalu {hal yang dieksekusi bila kondisi terpenuhi} yang dapat ditulis sebagai berikut while(kondisi){apabila terpenuhi maka} lalu diakhiri dengan catch apabila ada sesuatu yang tidak diinginkan seperti yang saya lakukan, saya tidak berharap input berupa huruf maka saya menambahkan catch(NumberFormatException e){} agar saat dijalankan apabila input berupa huruf maka output tidak akan error.
3. Program ini saya buat supaya pengguna dapat memasukkan input nama, npm, tanggal dan bulan dan setelah menekan enter pada keyboard akan muncul hasil dari zodiac yang dia cari sesuai dengan tanggal kelahiran dengan cara membuat metode baru berupa tentukanZodiak seperti yang saya gunakan yaitu if else. Setelah memasukkan input, program memanggil fungsi metode tentukanZodiak yang menentukan zodiak apabila kita menginput tanggal dan bulan. Hasilnya akan langsung ditampilkan.
4. Kode ini adalah contoh program dalam bahasa pemrograman Java yang mencetak elemen-elemen dari sebuah array string ke layar.

   * int[] sepuluh = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; : Ini adalah deklarasi dan inisialisasi array string diberi nama sepuluh yang berisi barisan angka 1 sampai sepuluh.
   * for (int i = 0; i < sepuluh.length; i++) { }: Ini adalah loop for yang digunakan untuk mengiterasi melalui setiap elemen dalam array sepuluh jadi sebuah variable dibuat yaitu variable bernama "i" yang berisi 0, lalu "i" itu kurang dari panjang variable sepuluh yang merupakan array, dan "i++" sebuah perintah untuk variable "i" bertambah satu persatu.
   * System.out.print(sepuluh[i] + " "); Di dalam loop, pernyataan ini mencetak elemen array pada indeks ke-i ke layar.
