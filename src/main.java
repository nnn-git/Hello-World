import java.util.ArrayList;
import java.util.Scanner;
 
class Main{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
       
        ArrayList<Integer> numbers = new ArrayList<>();
     
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt()); 
        }
       
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        printResults(sum, average);
        scanner.close(); 
}
	public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
	}
	public static int getArrayLength(ArrayList<Integer> numbers) {
        return numbers.size();
    }
	public static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = calculateSum(numbers); 
        int arrayLength = getArrayLength(numbers); 
        return ((double) sum / (double) arrayLength);
    }
	public static void printSum(int sum) {
        System.out.println("Sum = " + sum);
    }
	 public static void printAverage(double average) {
	        System.out.println("Average = " + average);
	    }
	 public static void printResults(int sum, double average) {
	        printSum(sum); 
	        printAverage(average); 
	    }
}



