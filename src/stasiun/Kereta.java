package stasiun;

public class Kereta {
    private String namaKereta;
    private int batasTiket;
    private Tiket[] tiketArray;
    private int jumlahTiketDipesan;

    // Constructor untuk kereta komuter
    public Kereta() {
        this.namaKereta = "Komuter";
        this.batasTiket = 1000;
        this.tiketArray = new Tiket[batasTiket];
    }

    // Overload constructor untuk KAJJ
    public Kereta(String namaKereta, int batasTiket) {
        this.namaKereta = namaKereta;
        this.batasTiket = batasTiket;
        this.tiketArray = new Tiket[batasTiket];
    }

    // Method untuk menambah tiket kereta komuter
    public void tambahTiket(String namaPenumpang) {
        if (jumlahTiketDipesan < batasTiket) {
            tiketArray[jumlahTiketDipesan++] = new Tiket(namaPenumpang, null, null);
            System.out.println("===========================");
            System.out.println("Tiket berhasil dipesan!");
        }
    }

    // Method untuk menambah tiket KAJJ
    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        if (jumlahTiketDipesan < batasTiket) {
            tiketArray[jumlahTiketDipesan++] = new Tiket(namaPenumpang, asal, tujuan);
            System.out.println("===========================");
            System.out.println("Tiket berhasil dipesan. Sisa tiket tersedia: " + (batasTiket - jumlahTiketDipesan));
        } else {
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    // Method untuk menampilkan tiket yang tersedia
    public void tampilkanTiket() {
        System.out.println("===========================");
        System.out.println("Daftar " +" penumpang" +" kereta api " + namaKereta);
        System.out.println("-----------------");
        for (int i = 0; i < jumlahTiketDipesan; i++) {
            Tiket tiket = tiketArray[i];
            if (tiket.getAsal() != null && tiket.getTujuan() != null) {
                System.out.println("Nama Penumpang: " + tiket.getNamaPenumpang());
                System.out.println("Asal: " + tiket.getAsal());
                System.out.println("Tujuan: " + tiket.getTujuan());
                System.out.println("-----------------");
            } else {
                System.out.println("Nama: " + tiket.getNamaPenumpang());
            }
        }
    }
}
