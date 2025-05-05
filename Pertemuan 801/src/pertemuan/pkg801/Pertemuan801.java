/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg801;

import java.util.Scanner;

/**
 *
 * @author Gabriel Friskila Dinzie Suhardiyanto
 * Tgl: 05 Mei 2025
 */
public class Pertemuan801 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buku[] daftarBuku = new Buku[100];
        int jumlahBuku = 0;
        String ulang = "Ya";
        String pilihan;

        do {
            System.out.println("\nAplikasi Perpustakaan");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1/2/3/4/5): ");
            pilihan = input.nextLine();

            switch (pilihan) {
                // ADD BOOKS
                case "1":
                    System.out.println("Menu Tambah Buku");
                    System.out.print("Judul: ");
                    String Judul = input.nextLine();
                    System.out.print("Author: ");
                    String Author = input.nextLine();
                    System.out.print("Genre: ");
                    String Genre = input.nextLine();
                    daftarBuku[jumlahBuku] = new Buku(Judul, Author, Genre);
                    jumlahBuku++;
                    System.out.println("Buku berhasil ditambahkan.");
                    break;

                    // LIST BOOKS
                case "2":
                    System.out.println("Daftar Buku:");
                    if (jumlahBuku == 0) {
                        System.out.println("Belum ada buku.");
                    } else {
                        for (int i = 0; i < jumlahBuku; i++) {
                            System.out.println((i + 1) + ". " + daftarBuku[i].toString());
                        }
                    }
                    break;

                    // EDIT BOOKS
                case "3":
                    System.out.println("Menu Ubah Buku");
                    if (jumlahBuku == 0) {
                        System.out.println("Belum ada buku untuk diubah.");
                    } else {
                        System.out.print("Masukkan nomor buku yang ingin diubah: ");
                        int noUbah = Integer.parseInt(input.nextLine());
                        if (noUbah >= 1 && noUbah <= jumlahBuku) {
                            System.out.print("Judul baru: ");
                            String JudulBaru = input.nextLine();
                            System.out.print("Author baru: ");
                            String AuthorBaru = input.nextLine();
                            System.out.print("Genre: ");
                            String GenreBaru = input.nextLine();
                            daftarBuku[noUbah - 1].setJudul(JudulBaru);
                            daftarBuku[noUbah - 1].setAuthor(AuthorBaru);
                            daftarBuku[noUbah - 1].setGenre(GenreBaru);
                            System.out.println("Buku berhasil diubah.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                    // DELETE BOOKS
                case "4":
                    System.out.println("Menu Hapus Buku");
                    if (jumlahBuku == 0) {
                        System.out.println("Belum ada buku untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor buku yang ingin dihapus: ");
                        int noHapus = Integer.parseInt(input.nextLine());
                        if (noHapus >= 1 && noHapus <= jumlahBuku) {
                            for (int i = noHapus - 1; i < jumlahBuku - 1; i++) {
                                daftarBuku[i] = daftarBuku[i + 1];
                            }
                            daftarBuku[jumlahBuku - 1] = null;
                            jumlahBuku--;
                            System.out.println("Buku berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                    // EXIT
                case "5":
                    ulang = "Tidak";
                    break;

                default:
                    System.out.println("Silakan pilih angka 1-5.");
            }
        } while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Terima kasih telah menggunakan Aplikasi Perpustakaan!");
    }
    
}
