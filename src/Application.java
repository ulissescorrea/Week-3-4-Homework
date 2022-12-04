
public class Application {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,64,2,8,28,93,}; 
		//1a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
		//(do not use ages [7] in your code)
		System.out.println(ages[0] - ages [ages.length -1]);
		//1b. add a new age to the array and repeat the step above to ensure it is dynamic
		//1c. use a loop to iterate through the array and calculate the average age
		double sum =0;
		for(int numbers : ages)
		{
			sum += numbers;
		}
		System.out.println(sum / ages.length);
		//2. create an array of string called names that contains the following values: "Sam","Tommy","Tim","Sally","Buck","Bob".
		String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//2a. use a loop to iterate through the array and calculate the average number of letters per name.
		int numberOfLetters = 0;
		for(String name : names) {
			numberOfLetters += name.length();
		}
		System.out.println(numberOfLetters);
		System.out.println(numberOfLetters / names.length);
		//2b. use a loop to iterate through the array and concatenate all the names together, separated by spaces. 
	String concatenate = "";
	for(int i = 0; i < names.length; i++) {
		concatenate += names[i] + " ";
	}
		System.out.println(concatenate);
		//3. how do you access the last element of any array? names.length-1
		//4. how do you access the first element of any array? names[0]
		//5. create a new array called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to nameLengths array. 
	for(int i = 0; i < names.length; i++) {
	}
	int[] nameLengths = {3,5,3,5,4,3};
	//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
	int total = 0;
	for(int numbers : nameLengths) {
		total += numbers;
	}
	System.out.println(total);
//
	String trioHello = multiplyString("Hello",3);
	System.out.println(trioHello);
	
	String firstName = "Ulisses";
	String lastName = "Correa";
	String fullName = giveFullName(firstName, lastName);
	System.out.println(fullName);
	
	int[] numbers = {24,25,26,27};
	System.out.println(arraySumOfNumbers(numbers));
	
	double[] one = {2,4,6,8};
	System.out.println(calculateAverage(one));
	
	double[] two = {3,6,9,12};
	System.out.println(calculateAverageTwo(one, two));
	
	boolean isHotOutside = true;
	double moneyInPocket = 11.50;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	int time = 6;
	System.out.println("Too late to eat.");
	System.out.println(dinnerTime(time));
	
}
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	public static String multiplyString(String x, int y) {
		String result = "";
		for(int i=0; i < y; i++) {
			result += x;
		}
			return result;
	}
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name
	public static String giveFullName(String x, String y){
		return x + " " + y;
	}
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean arraySumOfNumbers(int[]numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		}else {
			return false;
		}
	}
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double calculateAverage(double[]array) {
		double total = 0;
		for(double number : array) {
			total += number;
		}
		return total / array.length;
	}
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean calculateAverageTwo(double[] one, double[] two) {
		double sum = 0;
		for(double numbers : one) {
			sum += numbers / one.length;
		}
		double total =0;
		for(double numbers : two) {
			total += numbers / two.length;
		}
		if(sum > total) {
			return true;
		}else {
			return false;
		}
	}
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;		
		}
	}
	//13. This simple boolean method I created will determine whether it is too late for me to eat dinner or not.
	//if it is later than 8 I will not eat dinner if it is before 8 I will eat dinner. 
		public static boolean dinnerTime(int time) {
			if(time>=8) {
				return true;
			}else {
				return false;
			}
		}
}

	