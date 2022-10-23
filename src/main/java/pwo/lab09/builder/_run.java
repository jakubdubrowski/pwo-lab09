/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.builder;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class _run {

    public static void main(String[] args) {
        TxtPic1 txtPic = new TxtPic1('.', '*', 20, "txtpic1.txt");

        txtPic.save();
        TxtPic2 txtPic2 = new TxtPic2();
        txtPic2
                .setBackground('_')
                .setForeground('*')
                .setSize(20)
                .setFileName("txtpic2.txt")
                .createTxtPic()
                .save();

        System.out.print("podaj rozmiar: ");
        int getSize = 0;
        Scanner in = new Scanner(System.in);
        getSize = in.nextInt();
        if (getSize <= 0) {
            System.out.println("podany rozmiar: " + getSize + " jest błedny!");
        } else {
            System.out.println("rozmiar: " + getSize);

            TxtPic3 txtPic3 = new TxtPic3();
            txtPic3
                    .setBackground('_')
                    .setForeground('*')
                    .setSize(getSize)
                    .setFileName("txtpic3.txt")
                    .createTxtPic()
                    .save();
        }

    }
}
