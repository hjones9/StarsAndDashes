/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starsanddashes;

import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class StarsAndDashes {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("Please enter the number of stars you would like.");
        int stars = can.nextInt();

        System.out.println("Please enter the number of dashes you would like.");
        int dashes = can.nextInt();

        StarsAndDashes.starsAndDashes(stars, dashes);

    }

    public static void starsAndDashes(int stars, int dashes) {

        for (int i = 1; i <= stars; i++) {
            System.out.print('*');
        }

        for (int i = 1; i <= dashes; i++) {
            System.out.print('-');
        }

    }

}
