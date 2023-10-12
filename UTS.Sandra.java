/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;

/**
 *
 * @author LAB1PC233
 */
public class Sandra {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan nomor absen: ");
        String noAbsen = input.nextLine();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Menghitung nilai akhir sesuai dengan bobot yang diberikan
        double nilaiAkhir = (0.1 * nilaiTugas) + (0.3 * nilaiUTS) + (0.6 * nilaiUAS);

        // Menentukan grade berdasarkan nilai akhir
        String grade;
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Menampilkan hasil
        System.out.println("\nHasil Nilai Akhir:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + noAbsen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        // Menutup Scanner
        input.close();
    }
}
