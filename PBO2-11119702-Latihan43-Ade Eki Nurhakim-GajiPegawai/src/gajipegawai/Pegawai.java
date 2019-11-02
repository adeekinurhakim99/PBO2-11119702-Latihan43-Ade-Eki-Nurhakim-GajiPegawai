/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;

/**
 *
 * @author Ekiw
 */
public class Pegawai {
    private String nama;
    private String alamat;
    private int uangTransfor; 
    private int Tunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransfor() {
        return uangTransfor;
    }

    public void setUangTransfor(int uangTransfor) {
        this.uangTransfor = uangTransfor;
    }

    public int getTunjangan() {
        return Tunjangan;
    }

    public void setTunjangan(int Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    public int totalGaji(){
        return Tunjangan+uangTransfor+gajiPokok;
    }
}
