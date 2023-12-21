package tugas;

import java.util.Scanner;

public class karyawan {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double gajiBersih;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    public void hitungGajiBersih() {
        double pajak = 0.1;
        gajiBersih = gajiPokok - (gajiPokok * pajak);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        karyawan pegawai = new karyawan();
        try{

        System.out.print("Masukkan nama pegawai: ");
        pegawai.setNama(scanner.nextLine());

        System.out.print("Masukkan jabatan pegawai: ");
        pegawai.setJabatan(scanner.nextLine());

        System.out.print("Masukkan gaji pokok pegawai: ");
        pegawai.setGajiPokok(scanner.nextDouble());

        pegawai.hitungGajiBersih();

        System.out.println("\nDetail Pegawai:");
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Jabatan: " + pegawai.getJabatan());
        System.out.println("Gaji Pokok: " + pegawai.getGajiPokok());
        System.out.println("Gaji Bersih: " + pegawai.getGajiBersih());
        }finally{

             // Menutup objek Scanner
            scanner.close();
        }
    }
    
    
}
