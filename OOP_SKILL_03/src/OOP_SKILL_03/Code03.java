package OOP_SKILL_03;
import java.util.*;

public class Code03 {
public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	
	int[] a = new int[5];
	int[] b = new int[5];
	

    for (int i = 0; i < 5; i++) {
        a[i] = sc.nextInt();
    }
    
    for (int i = 5-1; i >= 0; i--) {
        b[i] = a[4-i];
    }
    
    for (int i = 0; i < 5; i++) {
        System.out.print(b[i]+" ");
    }

}
}
