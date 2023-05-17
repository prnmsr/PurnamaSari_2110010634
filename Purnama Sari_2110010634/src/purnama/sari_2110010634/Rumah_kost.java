/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purnama.sari_2110010634;

/**
 *
 * @author TOSHIBA
 */
public class Rumah_kost {
    private int idRumahKost;
    private String namaKost;
    private String alamatKost;
    private String fasilitas;
    private double latitude;
    private double longitude;
    private double hargaTerendah;
    private String jenisKost;
    private String attribute52;
    
    public Rumah_kost(int idRumahKost, String namaKost, String alamatKost, String fasilitas, double latitude, double longitude, double hargaTerendah, String jenisKost, String attribute52) {
        this.idRumahKost = idRumahKost;
        this.namaKost = namaKost;
        this.alamatKost = alamatKost;
        this.fasilitas = fasilitas;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hargaTerendah = hargaTerendah;
        this.jenisKost = jenisKost;
        this.attribute52 = attribute52;
    }
    
    // getter dan setter untuk setiap properti
    
    public int getIdRumahKost() {
        return idRumahKost;
    }
    
    public void setIdRumahKost(int idRumahKost) {
        this.idRumahKost = idRumahKost;
    }
    
    public String getNamaKost() {
        return namaKost;
    }
    
    public void setNamaKost(String namaKost) {
        this.namaKost = namaKost;
    }
    
    public String getAlamatKost() {
        return alamatKost;
    }
    
    public void setAlamatKost(String alamatKost) {
        this.alamatKost = alamatKost;
    }
    
    public String getFasilitas() {
        return fasilitas;
    }
    
    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public double getHargaTerendah() {
        return hargaTerendah;
    }
    
    public void setHargaTerendah(double hargaTerendah) {
        this.hargaTerendah = hargaTerendah;
    }
    
    public String getJenisKost() {
        return jenisKost;
    }
    
    public void setJenisKost(String jenisKost) {
        this.jenisKost = jenisKost;
    }
    
    public String getAttribute52() {
        return attribute52;
    }
    
    public void setAttribute52(String attribute52) {
        this.attribute52 = attribute52;
    }
}
