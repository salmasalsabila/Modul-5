/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author lenovo
 */
public class Throws {
    public static void main(String[] args) {
        try
        {
            f();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void f() throws NullPointerException,ArrayIndexOutOfBoundsException
    {
        //implementasi method
        throw new NullPointerException();
        //throw new ArrayIndexOutOfBoundsException
    }
}
