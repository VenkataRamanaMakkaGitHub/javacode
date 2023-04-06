/* 24-01-2023 
 * day 2
 * assignment qustino
 */

/* add comments */



//hibsbdcuysbdcuci
//////////////////////////
///////////////////////////////
////////////////////////////////
package basics_venkat;

import java.util.Scanner;

public class ArrRev {

	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.print("Enter 5 values:");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = obj.nextInt();
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		obj.close();


////////////////////////////////
	}

}
