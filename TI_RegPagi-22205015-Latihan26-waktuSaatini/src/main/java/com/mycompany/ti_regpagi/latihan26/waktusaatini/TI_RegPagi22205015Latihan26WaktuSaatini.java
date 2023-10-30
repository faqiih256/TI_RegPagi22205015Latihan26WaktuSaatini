/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ti_regpagi.latihan26.waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang waktu saat ini
 * @author 62895
 */
public class TI_RegPagi22205015Latihan26WaktuSaatini {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 26===");

        LocalDateTime hari = LocalDateTime.now();
        Locale jam = new Locale("id", "ID");
        DateTimeFormatter sekarang = DateTimeFormatter.ofPattern("EEEE,dd MMM yyyy HH:mm:ss", jam);
        System.out.println("Hari ini adalah Hari: " + sekarang.format(hari));
    }
}
