/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stasiun;

/**
 *
 * @author User
 */
public class Tiket {
    private String namaPenumpang;
    private String asal;
    private String tujuan;

    // Overload constructor untuk tiket KAJJ
    public Tiket(String namaPenumpang, String asal, String tujuan) {
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
    }

    // Getter
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }
}
