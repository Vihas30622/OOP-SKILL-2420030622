package OOP_SKILL_03;
import java.util.Scanner;

public class Code06 {
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        
        
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
            	
            	
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) 
                {
                	
                	
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) 
        {
        	
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            
            System.out.println();
        }
        
        
    }
	
	
	

}
