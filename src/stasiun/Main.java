/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stasiun;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Manipulasi kode pada kelas Kereta agar kode program di main class dapat berjalan
        // Jangan ubah kedua objek dibawah ini! menambahkan objek diperbolehkan.
        Kereta komuter = new Kereta();
        komuter.tambahTiket("Fadil Kotlin");
        komuter.tambahTiket("Fajar Dart");
        komuter.tambahTiket("Saiful HTML");
        komuter.tampilkanTiket();

        System.out.println();

        //KAJJ memiliki parameter nama kereta dan jumlah tiket tersedia.
        Kereta KAJJ = new Kereta("Jayabaya", 2);
        KAJJ.tambahTiket("Aang", "Malang", "Surabaya Gubeng");
        KAJJ.tambahTiket("Zuko", "Malang", "Sidoarjo");
        KAJJ.tambahTiket("Kora", "Malang", "Surabaya Pasarturi");
        KAJJ.tampilkanTiket();

        //Nama method tambahTiket dan tampilkanTiket tidak perlu diubah, sesuaikan pada kelas Ticket dan Kereta!
    }
    }
    
