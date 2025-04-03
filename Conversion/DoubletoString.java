
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

// Driver Class
class DoubletoString{
	// Main driver function
	public static void main(String[] args)
	{
		// Declaring and initializing double number
		double number = 123.456;

		// Converting Double data to String data
		String method1 = String.valueOf(number);
		System.out.println("Using valueOf method "+method1);

		// Conversion using format()
		String method2 = String.format("%f", number);
		System.out.println("Using format method "+ method2);

		// Conversion using append()
		String method3 = new StringBuilder().append(number).toString();
		System.out.println("Using append method "+method3);

		// Converting Double data to String data
		String method4 = Double.toString(number);
		System.out.println("Using toString method "+method4);

		// Converting using DecimalFormat
		String method5 = DecimalFormat.getNumberInstance().format(number);
		System.out.println("Using Decimalformat method "+ method5);
	}
}
