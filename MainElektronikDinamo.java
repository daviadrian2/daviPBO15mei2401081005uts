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
public class MainElektronikDinamo {
public class Elektronik {
    protected String nama;
    protected boolean status;


    public Elektronik(String nama) {
        this.nama = nama;
        this.status = false;
    }

    
    public void nyalakan() {
        status = true;
        System.out.println(nama + " telah dinyalakan.");
    }

    
    public void matikan() {
        status = false;
        System.out.println(nama + " telah dimatikan.");
    }


    public void tampilkanStatus() {
        System.out.println(nama + " sedang " + (status ? "menyala" : "mati"));
    }
}

public class Smartphone extends Elektronik {
    private int kapasitasBaterai;

    
    public Smartphone(String nama, int kapasitasBaterai) {
        super(nama);
        this.kapasitasBaterai = kapasitasBaterai;
    }


    public void buatPanggilan(String nomor) {
        if (status) {
            System.out.println("Melakukan panggilan ke " + nomor);
        } else {
            System.out.println("Tidak bisa melakukan panggilan karena " + nama + " masih mati.");
        }
    }
}

// Kelas turunan Smartwatch yang memperluas Elektronik
public class Smartwatch extends Elektronik {
    private boolean sensorDetakJantung;

    // Constructor
    public Smartwatch(String nama, boolean sensorDetakJantung) {
        super(nama);
        this.sensorDetakJantung = sensorDetakJantung;
    }

    // Method khusus Smartwatch
    public void monitorDetakJantung() {
        if (status && sensorDetakJantung) {
            System.out.println(nama + " sedang memonitor detak jantung.");
        } else {
            System.out.println(nama + " tidak dapat memonitor detak jantung.");
        }
    }
}
}