/*
NAMA    :DAVI ADRIAN
KELAS   :TEKNIK KOMPUTER 1A
MATKUL  :PBO 15 MEI 2025
S
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsdavi8mei2401081005;

/**
 *
 * @author LENOVO
 */
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;

    public Elektronik(String merek, int tahunProduksi, int garansi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.garansi = garansi;
    }

    
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    
    public void display() {
        System.out.println("=== Informasi Elektronik ===");
        System.out.println("- Merek            : " + merek);
        System.out.println("- Tahun Produksi   : " + tahunProduksi);
        System.out.println("- Garansi          : " + garansi + " tahun");
    }

    
    public static void main(String[] args) {
        Elektronik elektronik1 = new Elektronik("Sony", 2023, 2);
        elektronik1.display();

}
}
