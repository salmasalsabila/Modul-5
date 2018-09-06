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
public class ArrayIndexOutBoundsException {
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3};
        nums[2]=4;
        System.out.println("Nilai pada indeks adalah : "+nums[2]);
        
    }
}
