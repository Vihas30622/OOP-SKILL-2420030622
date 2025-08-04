package OOP_SKILL_03;
import java.util.*;

public class Code02 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        int MIN=a[0];
        int MAX=a[0];
        
        for (int i = 0; i < 5; i++) {
            
        	if(a[i]>MAX)
        		MAX = a[i];
        }
        
        for (int i = 0; i < 5; i++) {
            
        	if(a[i]<MIN)
        		MIN = a[i];
        }
        
        System.out.println("Smallest: " + MIN);
        System.out.println("Biggest: " + MAX);
	}

}
