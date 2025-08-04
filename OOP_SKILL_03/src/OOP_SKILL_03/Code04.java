package OOP_SKILL_03;
import java.util.*;

public class Code04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");

        }

}
}
