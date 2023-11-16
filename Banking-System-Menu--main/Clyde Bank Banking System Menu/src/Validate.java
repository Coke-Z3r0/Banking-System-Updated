import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class validates entries for the type required i.e. integers, doubles Strings
 * It also checks the existence of a file
 */
public class Validate
{
	public static Scanner sc=new Scanner(System.in);

	/**
	 * Validates int entries. It keeps on prompting the user to enter an integer  if anything else is entered
	 * @return
	 */
	public static int validateInteger() //validates integer entries
	{
		String input="";
		while (true)
		{
			try
			{
				//You can either use sc.nextInt, but you must make sure the
				//empty line is consumed by using sc.nextLine() with sc.nextInt().
				//or you can just use paresInt which consumes the empty line
				input=sc.nextLine();
				int choice=Integer.parseInt(input);
				return choice;
			}

			catch (InputMismatchException e)
			{

				/*
			   * The next() method must be called in the catch block to dispose of the
			   * users invalid input because the nextDouble() method leaves the input
			   * value in the Scanners input stream if an InputMismatchException is
			   * thrown. If you omit the statement that calls next, the while loop
			   * keeps reading it, throws an exception, and displays an error  
			   * message in an infinite loop
			   */

				System.out.println("Your input \""+input+"\" is not an integer");
				System.out.print("That is not a valid integer, please try again:");
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Your input \""+input+"\" is not an integer");
				System.out.print("That is not a valid integer, please try again:");
			}
		  }
	}

	/**
	 * Validates int entries. It keeps on prompting the user to enter a double if anything else is entered
	 * @return
	 */
	public static double validateDouble() //validates double entries
	{
		while (true)
		{
			String input="";
			try
			{
				double myDouble ;
				
				input=sc.nextLine();
				myDouble=Double.parseDouble(input);
				return myDouble;
			}
			
			catch (InputMismatchException e)
			{
				/*
			   * Same comment as above applies
			   */
				System.out.println("Your input \""+input+"\" is not a double");
				System.out.print("That is not a valid double, please try again:");
			}
			catch (NumberFormatException e) 
			{

				System.out.println("Your input \""+input+"\" is not a double");
				System.out.print("That is not a valid double, please try again:");
			}
		  }
	}

	/**
	 * Validates int entries. It keeps on prompting the user to enter a String if anything else is entered
	 * @return
	 */
	public static String validateString()
	{
		while (true)
		{
			try
			{
				String myString=sc.nextLine();
				return myString;
			}
			
			catch (InputMismatchException e)
			{
				//sc.nextLine();
				/*
			   * Same comment as above applies
			   */
				System.out.println(e.getMessage());
				System.out.print("That is not a valid String, please try again:");
			}
		  }
	}

	/**
	 *This method verifies the existence of the file to read from
	 *It returns an object of type BufferedReader
	 *@param pathAndFile
	 * @return
	 */
	public static BufferedReader checkFileReader(String pathAndFile)
	{
		System.out.println(pathAndFile);
		BufferedReader in = null;
		try
		{
			//We wrap the File class inside the FileReader class which in turn is wrapped in the BufferedReader class
			in = new BufferedReader(new FileReader(new File(pathAndFile)));
			System.out.println("File exists\n");
		}
		catch(FileNotFoundException e)
		{
			System.out.println( "The file doesn't exist.\n");
			System.exit(0);
		}
		return in;
	}//checkFileReader()

	/**
	 * This method verifies the existence of the file to read from
	 * It returns an object of type BufferedWriter
	 * @param pathAndFile
	 * @return
	 * @throws IOException
	 */
	public static BufferedWriter checkFileWriter(String pathAndFile) throws IOException
	{
		System.out.println(pathAndFile);
		BufferedWriter in = null;
		try
		{
			//We wrap the File class inside the FileWriter class which in turn is wrapped in the BufferedWriter class
			//in = new BufferedWriter(new FileWriter(pathAndFile,true));
			in = new BufferedWriter(new FileWriter(new File(pathAndFile),false));
			System.out.println("File exists\n");
		}
		catch(FileNotFoundException e)
		{
			System.out.println( "The file doesn't exist.\n");
			System.exit(0);
		}
		return in;
	}
	
}
