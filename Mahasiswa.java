/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak15_salsabilajuandiraa;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private  String Npm;
    private String Nama;
    private String Alamat;

    public Mahasiswa(String Npm, String Nama, String Alamat) {
        this.Npm = Npm;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getNpm() {
        return Npm;
    }

    public void setNpm(String Npm) {
        this.Npm = Npm;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
}
