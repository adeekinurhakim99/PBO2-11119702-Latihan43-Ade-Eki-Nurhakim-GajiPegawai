/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Pegawai p = new Pegawai();
    Scanner i = new Scanner(System.in);
    System.out.println("======= Data Gaji Karyawan Kakatu =======");
        System.out.println("Nama Karyawan: ");
        p.setNama(i.nextLine());
        System.out.println("Alamat: ");
        p.setAlamat(i.nextLine());
        System.out.println("Uang Tunjangan: ");
        p.setTunjangan(i.nextInt());
        System.out.println("Uang Transfor: ");
        p.setUangTransfor(i.nextInt());
        System.out.println("Gaji Pokok: ");
        p.setGajiPokok(i.nextInt());
        System.out.println("Total Gaji: "+p.totalGaji());
    }
}
