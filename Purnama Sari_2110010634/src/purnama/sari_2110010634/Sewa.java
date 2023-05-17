/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purnama.sari_2110010634;

/**
 *
 * @author TOSHIBA
 */
import java.util.Date;

public class Sewa {
    private int idSewa;
    private Date tanggal;
    private Date akhirSewa;
    private String status;
    
    public Sewa(int idSewa, Date tanggal, Date akhirSewa, String status) {
        this.idSewa = idSewa;
        this.tanggal = tanggal;
        this.akhirSewa = akhirSewa;
        this.status = status;
    }
    
    // getter dan setter untuk setiap properti
    
    public int getIdSewa() {
        return idSewa;
    }
    
    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }
    
    public Date getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public Date getAkhirSewa() {
        return akhirSewa;
    }
    
    public void setAkhirSewa(Date akhirSewa) {
        this.akhirSewa = akhirSewa;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
