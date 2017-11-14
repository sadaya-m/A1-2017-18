// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         A1Q2
//
//  Description:	a brief description of the program goes here
//
//  Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import java.text.DecimalFormat;

public class A1Q2/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        String strin;
        int count = 0;
        int list[] = new int[10];
        
        BufferedReader numlist = null;

    // ***** create objects **********


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

        strin = numlist.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            list[count] = Integer.parseInt(strin);
            count++;
            strin = numlist.readLine();
        }

    // ***** processing *****


    // ***** output *****

        System.out.println(numlist);

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class