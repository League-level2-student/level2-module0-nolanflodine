package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String [] array = {"Bill","Larry","Bobby","Billy","Sphincter"};	
		//2. print the third element in the array
System.out.println(array [3]);		
		//3. set the third element to a different value
array[3]="Billlllllllllllly";		
		//4. print the third element again
System.out.println(array[3]);		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i =0;i<array.length;i++) {
	System.out.println(array[i]);
}
		
		//6. make an array of 50 integers
int [] fifty=new int [50];		
int minValue=fifty[0];
int maxValue=fifty[0];
		//7. use a for loop to make every value of the integer array a random number
for (int i = 0; i < fifty.length; i++) {
	Random r = new Random();
	int random=r.nextInt(50);
	fifty[i]=random;
	if(fifty[i]<minValue) {
		minValue=fifty[i];
	}
	if(fifty[i]>maxValue) {
		maxValue=fifty[i];
	}
	//System.out.println(random);
}	
System.out.println(minValue);
System.out.println(maxValue);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
