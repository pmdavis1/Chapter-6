/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */

//import BreezySwing.Format;
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.*;

public class ch6notesday1
{




	// good to use constants to define arrays
	final static int MAX = 100;


	  public static void main (String[] args)
   {


/**/

	   Random genarator = new Random();


	   //make int array of 100 and pop with 100 random int' 1-500

		int[] num = new int[200];
		int[] odds = new int[MAX];
		int[] evens = new int[MAX];
		Random gen = new Random();
		mathy test = new mathy();

		for ( int i = 0; i < num.length ; i++)
			num[i] = gen.nextInt(500)+1;

		for(int s:num)
		{
			System.out.print(s+"\t"  );
		}


		System.out.print(  num);


		for(int s:num)
			System.out.print(s+"\t");









/**
System.out.println("---------------------------------------------"  );
		odds = test.getOdd(num);
		test.getEven(num,evens);

		for(int s:odds)
		{
			System.out.print(s+"\t"  );
		}

System.out.println("---------------------------------------------"  );
/*	for(int s:evens)
		{
			System.out.print(s+"\t"  );
		}
		//System.out.println(odds  );




		//initializer list
		//Make an array or strings with 10 names
		String[] names = {"Mike", "Ben", "Thomas", "Jane",
						  "Ania Livia", "Homer", "Alex", "Dalton",
						  "Emy", "Nolan", "Christine", "Dave"};


		// arrays as parameters

		foo(num);
/*

/**/
   }// end of main

	public static void foo ( int[] num1)
	{
		System.out.print("element 1 is" + num1[0]);
		num1[0] = 100;
	}

	/**
		Doubles the size of an array
		@param int []
		@return int [] twice the size, with values copied over
	*/
   public static int[] doubleSize(int[] array)
   {
	   //make temp 2 times the size of array
	   int[] temp = new int[array.length * 2];
	   System.out.println(temp.length +"-" );

		//copy all the values over to new array
	   for (int i = 0; i < array.length; i++)
	   		temp[i] = array[i];

		//old array changes reference to new larger array
       array = temp;

		return array;

   }

}//end of class















