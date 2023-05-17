/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purnama.sari_2110010634;

/**
 *
 * @author TOSHIBA
 */
public class Kecamatan {
    private int idKecamatan;
    private String namaKecamatan;
    
    // Constructor
    public Kecamatan(int idKecamatan, String namaKecamatan) {
        this.idKecamatan = idKecamatan;
        this.namaKecamatan = namaKecamatan;
    }
    
    // Getter dan Setter untuk properti idKecamatan
    public int getIdKecamatan() {
        return idKecamatan;
    }
    
    public void setIdKecamatan(int idKecamatan) {
        this.idKecamatan = idKecamatan;
    }
    
    // Getter dan Setter untuk properti namaKecamatan
    public String getNamaKecamatan() {
        return namaKecamatan;
    }
    
    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }
}