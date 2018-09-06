/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author lenovo
 */
public class RuntimeException {
    public static void main(String[] args) { // pemanggilan fungsi main
        int a=35;
        int b=5;
        try{
            int x= a/b;
            System.out.println("Hasil: "+x);
            int[] angka = {1, 2, 3, 4, 5}; // array dengan 5 elemen
            angka[24] = 72; // mengakses indeks ke 24
            //int y = x/0;
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); //blok jika terjadi kesalahan
        }
        System.out.println("Selesai");

        }
    }

