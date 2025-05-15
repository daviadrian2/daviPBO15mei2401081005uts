/*
NAMA    :DAVI ADRIAN
KELAS   :TEKNIK KOMPUTER 1A
MATKUL  :PBO 15 MEI 2025

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsdavi8mei2401081005;

/**
 *
 * @author LENOVO
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi); 
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }


    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    
    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }

    
    @Override
    public void display() {
        super.display(); // Menampilkan informasi dari kelas Elektronik
        System.out.println("Spesifikasi Smartphone:");
        System.out.println("- Kapasitas Baterai  : " + kapasitasBaterai + " mAh");
        System.out.println("- Jumlah Kamera      : " + jumlahKamera);
    }


    public static void main(String[] args) {
        Smartphone smartphoneApple = new Smartphone("Apple", 2025, 1, 5000, 4);
        smartphoneApple.display();
}
}