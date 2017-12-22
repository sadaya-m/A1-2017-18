// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         aX qy
//
//  Description:	a brief description of the program goes here
//
//
//  Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*;

public class A1Q2/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****
        
        final int MAXLISTSIZE = 10;
        
    // ***** declaration of variables *****
        
        int count = 0;          //counter
        int n;                  //number
        int n1;                 //number 1
                
        int list[] = new int [MAXLISTSIZE];         //list array that will store the numbers
        int freq[] = new int [4];                   //freq array that will count frequency
        
        String l;               //string
        String strin;               //string
        String delim = "[ -]+";         // delimiter for parsing input strings
        
        BufferedReader numlist = null;

    // ***** create objects *****


    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);
        
        try{
    	numlist = new BufferedReader(new FileReader("listnum.txt"));
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"file not found");
        }
        

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Your Name Here");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  Ax Qy");
        System.out.println("**********************************");

    // ***** get input *****

        l = numlist.readLine();
        
        while(l != null){
            //System.out.println(l);
            list[count] = Integer.parseInt(l);
            count++;
            l = numlist.readLine();
        }//end eof loop   
        
    // ***** processing *****
        
        for(int i = 0; i < list.length; i++){
            ++freq[list[i]];    //+freq increments 1 everytime it lands in list[i]
        }//end for loop
        
        /*strin = JOptionPane.showInputDialog("What number do you want to know the frequency of?");
        int n = Integer.parseInt(strin);
        
        while(n != -1){
            System.out.println(freq[n]);        //print the freq of the number the user wants
            n = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to know the frequency of?"));
        }//end while loop*/
        
        strin = JOptionPane.showInputDialog("What range of numbers do you want to know the frequency of? (number-number)"); //do 0-0 to terminate program
        String[] split = strin.split(delim);          //split tokens
        n = Integer.parseInt(split[0]);
        n1 = Integer.parseInt(split[1]);
        
        while(n != 0){
            String[] tokens = strin.split(delim);          //split tokens
            int firstR = Integer.parseInt(tokens[0]);
            int secondR = Integer.parseInt(tokens[1]);
            for(int i = firstR; i < secondR+1; i++){
                System.out.println(i + "\t" + freq[i]);       
            }//end for loop
            
            strin = JOptionPane.showInputDialog("What range of numbers do you want to know the frequency of? (number-number)");
            n = Integer.parseInt(tokens[0]);
            n1 = Integer.parseInt(tokens[1]);
        }//end while loop
        
    // ***** output *****
        
        System.out.println("\nNumber" +"    "+"Frequency");
        for(int i = 1; i<freq.length; i++){
            System.out.println(i+"          "+freq[i]);    //print frequency of each number
        }//end for loop

        
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class