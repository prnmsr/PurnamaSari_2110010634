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

public class User {
    private int idUser;
    private String noIdentitas;
    private String jenisId;
    private String nama;
    private String username;
    private String password;
    private String email;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String telphone;
    private String status;
    
    // Constructor
    public User(int idUser, String noIdentitas, String jenisId, String nama, String username, String password, String email, String tempatLahir, Date tanggalLahir, String jenisKelamin, String telphone, String status) {
        this.idUser = idUser;
        this.noIdentitas = noIdentitas;
        this.jenisId = jenisId;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.email = email;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.telphone = telphone;
        this.status = status;
    }
    
    // Getter dan Setter untuk properti idUser
    public int getIdUser() {
        return idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    // Getter dan Setter untuk properti noIdentitas
    public String getNoIdentitas() {
        return noIdentitas;
    }
    
    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }
    
    // Getter dan Setter untuk properti jenisId
    public String getJenisId() {
        return jenisId;
    }
    
    public void setJenisId(String jenisId) {
        this.jenisId = jenisId;
    }
    
    // Getter dan Setter untuk properti nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
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
    
    // Getter dan Setter untuk properti email
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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
}
    
    // Getter dan
