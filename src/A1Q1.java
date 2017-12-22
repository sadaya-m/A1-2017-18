// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         A1Q1-2017-18
//
//  Description:	process 950-1000 numbers from 1 - 100 int values
//
//  Input:		process random int
//
//  Output:		text file
// ***********************************************************************

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class A1Q1
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
        PrintWriter numlist = new PrintWriter(new FileWriter("listnum.txt"));
    // ***** declaration of constants *****

    // ***** declaration of variables *****

        int list[] = new int[1000];           //declare max array size
        int rnd;                    //random int
        
    // ***** create objects **********

        Random random = new Random();       //random variable generator
    
    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Your Name Here");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  Ax Qy");
        System.out.println("**********************************");

    // ***** get input **************

    // ***** processing *****
        
        for(int i = 0; i < list.length; i++){
            rnd = random.nextInt(100)+1;    //process random numbers from 1-100
            list[i] = rnd;                  //set random number as list[i]
        }//end for loop random variable processing

    // ***** output *****

        for(int i = 0; i < list.length; i++){
            numlist.println(list[i]);
        }//end for loop random variable printing to text file
        
    // ***** closing message *****

        System.out.println("end of processing");

        numlist.println();
        numlist.close();
	}  // end main	
}  // end class