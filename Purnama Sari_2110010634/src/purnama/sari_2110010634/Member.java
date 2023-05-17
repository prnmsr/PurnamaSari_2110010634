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

public class Member {
    private int idMember;
    private String nama;
    private String noKTP;
    private String username;
    private String password;
    private String alamat;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String noHP;
    private String email;
    private String attribute52;
    
    // Constructor
    public Member(int idMember, String nama, String noKTP, String username, String password, String alamat, String tempatLahir,
                  Date tanggalLahir, String jenisKelamin, String noHP, String email, String attribute52) {
        this.idMember = idMember;
        this.nama = nama;
        this.noKTP = noKTP;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.noHP = noHP;
        this.email = email;
        this.attribute52 = attribute52;
    }
    
    // Getter dan Setter untuk properti idMember
    public int getIdMember() {
        return idMember;
    }
    
    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }
    
    // Getter dan Setter untuk properti nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter dan Setter untuk properti noKTP
    public String getNoKTP() {
        return noKTP;
    }
    
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    
    // Getter dan Setter untuk properti username
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    // Getter dan Setter untuk properti password
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Getter dan Setter untuk properti alamat
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    // Getter dan Setter untuk properti tempatLahir
    public String getTempatLahir() {
        return tempatLahir;
    }
    
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    
    // Getter dan Setter untuk properti tanggalLahir
    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    // Getter dan Setter untuk properti jenisKelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    // Getter dan Setter untuk properti noHP
    public String getNoHP() {
        return noHP;
    }
    
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}