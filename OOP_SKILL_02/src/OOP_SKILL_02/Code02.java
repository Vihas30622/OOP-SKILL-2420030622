package OOP_SKILL_02;

public class Code02 {

	public static void main(String[] args) {

		        int a = 20, b = 8;
		        int x = 12, y = 6;

		        System.out.println("Arithmetic Operators:");
		        System.out.println("a + b = " + (a + b));
		        System.out.println("a - b = " + (a - b));
		        System.out.println("a * b = " + (a * b));
		        System.out.println("a / b = " + (a / b));
		        System.out.println("a % b = " + (a % b));

		        System.out.println("\nRelational Operators:");
		        System.out.println("a > b = " + (a > b));
		        System.out.println("a < b = " + (a < b));
		        System.out.println("a == b = " + (a == b));
		        System.out.println("a != b = " + (a != b));

		        System.out.println("\nLogical Operators:");
		        System.out.println("(a > b) && (x > y): " + ((a > b) && (x > y)));
		        System.out.println("(a < b) || (x > y): " + ((a < b) || (x > y)));
		        System.out.println("!(a > b): " + !(a > b));

		        System.out.println("\nAssignment Operators:");
		        int num = 30;
		        System.out.println("num = " + num);
		        num += 10;
		        System.out.println("num += 10 => " + num);
		        num *= 3;
		        System.out.println("num *= 3 => " + num);

		        System.out.println("\nUnary Operators:");
		        int c = 7;
		        System.out.println("c = " + c);
		        System.out.println("++c = " + (++c));
		        System.out.println("c++ = " + (c++));
		        System.out.println("After post-increment, c = " + c);
		        System.out.println("--c = " + (--c));

		        System.out.println("\nBitwise Operators:");
		        int p = 6;
		        int q = 2;
		        System.out.println("p & q = " + (p & q));
		        System.out.println("p | q = " + (p | q));
		        System.out.println("p ^ q = " + (p ^ q));
		        System.out.println("~p = " + (~p));

		        System.out.println("\nTernary Operator:");
		        int max = (x > y) ? x : y;
		        System.out.println("Max of x and y is: " + max);
		    }
		




	}


