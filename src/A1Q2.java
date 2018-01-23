// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         Assignment1
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

public class A1Q2
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****
        
        final int MAXLISTSIZE = 1000;            //max array size
        final int MAXNUMBERS = 1000;             //max value of numbers
        
    // ***** declaration of variables *****
        
        int count = 0;          //counter
        int n;                  //number
        int n1;                 //number 1
                
        int list[] = new int [MAXLISTSIZE];         //list array that will store the numbers
        int freq[] = new int [MAXNUMBERS];                   //freq array that will count frequency
        
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
        }//end try catch
        

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  Assignment1");
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
        
        strin = JOptionPane.showInputDialog("What number do you want to know the frequency of? [0 to terminate program]");
        n = Integer.parseInt(strin);            //parse strin to int
        
        System.out.println("\nNumber Chosen\tFrequency");
        while(n != 0){
            System.out.println(n+"\t\t"+freq[n]);        //print the freq of the number the user wants
            n = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to know the frequency of? [0 to terminate program]"));
        }//end while loop*
        
        
        strin = JOptionPane.showInputDialog("What range of numbers do you want to know the frequency of? (number-number)[0 to terminate program]"); //do 0-0 to terminate program
        String[] split = strin.split(delim);          //split tokens
        n = Integer.parseInt(split[0]);                 //parse to get first number
        n1 = Integer.parseInt(split[1]);            //parse to get second number
        
        System.out.println("\nNumber\tFrequency");
        while(n != 0){
            String[] tokens = strin.split(delim);          //split tokens
            int firstR = Integer.parseInt(tokens[0]);          
            int secondR = Integer.parseInt(tokens[1]);
            for(int i = firstR; i < secondR+1; i++){
                System.out.println(i + "\t" + freq[i]);       
            }//end for loop to get the first number and second number (the range)
            
            strin = JOptionPane.showInputDialog("What range of numbers do you want to know the frequency of? (number-number) [0-0 to terminate program]");
            n = Integer.parseInt(tokens[0]);
            n1 = Integer.parseInt(tokens[1]);
        }//end while loop
        
    // ***** output *****
        
        System.out.println("\nNumber\t"+"Frequency");
        for(int i = 1; i<=100; i++){
            System.out.println(i+"\t"+freq[i]);    //print final frequency of each number
        }//end for loop

        
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class