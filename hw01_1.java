/***
* Q1 Write a Java program that reads 10 integers from the keyboard 
* and outputs all the pairs whose sum is 30.
*/
class hw01_1 {

	public static void main(String[] args) {

		int [] ints = {1,2,3,4,5,6,10,30,0,20};

		for (int i = 0; i < ints.length; i++) {
			// j start from i, will remove duplication of same pairs, for example 
			// 30 + 0 = 30
			// 0 + 30 = 30
			for (int j = i ; j < ints.length ; j++ ) {
				if (ints[i] + ints[j] == 30){
					System.out.println(ints[i] + " + " + ints[j] + " = 30" );
				}
			}
		}
	}
}