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
 * @author LENOVO daviTk1A
 */
public class Smartwatch extends Elektronik {
    private int ukuranLayar;
    private boolean tahanAir;

    
    public Smartwatch(String merek, int tahunProduksi, int garansi, int ukuranLayar, boolean tahanAir) {
        super(merek, tahunProduksi, garansi); 
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }

    
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

   
    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Spesifikasi Smartwatch:");
        System.out.println("- Ukuran Layar       : " + ukuranLayar + " inci");
        System.out.println("- Tahan Air          : " + (tahanAir ? "Ya" : "Tidak"));
    }

}

    