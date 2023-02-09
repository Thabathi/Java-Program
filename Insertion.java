import java.util.Arrays;
import java.util.Scanner;

	public class Insertion {

		public static void main(String[] args) {

			int n, i, j, element;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the size of the array:");
			n = s.nextInt();
			int[] arr = new int[n];
			System.out.println("enter" + n + "Elements:");
			for (i = 0; i < n; i++)
				arr[i] = s.nextInt();
			for (i = 1; i < n; i++)
			{
				element = arr[i];
				for (j = (i - 1); j >= 0 && arr[j] > element; j--)
					arr[j + 1] = arr[j];
				arr[j + 1] = element;
			}
			System.out.println("The new sorted array is:");
			for (i = 0; i < n; i++)
				System.out.print(arr[i] + " ");

		}
	}



