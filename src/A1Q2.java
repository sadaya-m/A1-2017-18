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
        
        int count = 0;
        int list[] = new int [MAXLISTSIZE];
        
        String l;
        
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
            list[count] = Integer.parseInt(l);
            count++;
            l = numlist.readLine();
        }
        
    // ***** processing *****

        
    // ***** output *****

       //System.out.println(list);
        
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class