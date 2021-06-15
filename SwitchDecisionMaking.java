/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdecisionmaking;

/**
 *
 * @author Sushil Kumar
 */
import java.util.Scanner;
public class SwitchDecisionMaking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.HII\n2.HEY\n3.HELLO");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("HII");
                    break;
            case 2:System.out.println("HEY");
                    break;
            case 3:System.out.println("HELLO");
                    break;
            default:System.out.println("YOU DID NOT ENTER YOUR CHOICE FROM THE GIVEN LIST");
        }
    }
    
