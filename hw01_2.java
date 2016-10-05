/**
* Q2 Write a Java program that takes two arrays a and b of length n storing int values,
* and returns the dot product of a and b. 
* That is, it returns an array c of length n such that c[i]=a[i]*b[i].
*/

class hw01_2 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6};
		int c[] = new int[a.length];

		for (int i = 0; i < a.length ; i++) {
			c [i] = a[i] * b[i];
		}

		for (int i = 0 ; i < a.length ; i++) {
			System.out.println(c[i] + " = " + a[i] + " * " + b[i]);
		}
	}
}