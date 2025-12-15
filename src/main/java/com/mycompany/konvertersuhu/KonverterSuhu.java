/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konvertersuhu;

/**
 *
 * @author User
 */
public class KonverterSuhu {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FrameUtama fu = new FrameUtama();
        fu.setLocationRelativeTo(null);
        fu.setVisible(true);
        
        AplikasiPertambahanAngka ap = new AplikasiPertambahanAngka();
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);
    }
}
