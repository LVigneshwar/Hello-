import java.util.Scanner;
public class Diagonal {
	public static void main (String[]args)
	  {
	    // Input the matrix
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of the square matrix:");
	    int size = input.nextInt(), sum =0 ;
	    int [][]a = new int [size][size];
	    System.out.println("Enter the23  elements of the square matrix:");
	    for (int i=0; i<size; i++)
	    {
	      for (int j=0; j<size;j++)
	      {
	        a[i][j] = input.nextInt();
	      }
	    }
	     
	     // Calculate the sum of the diagonals
	    for (int i=0; i<size; i++)
	    {
	      for (int j=0; j<size;j++)
	      {
	        if (i==j)
	          sum = sum + a[i][j];
	      }
	    }
	    
	    System.out.println (" Diagonal Sum= "+sum);
	  }
	  }



