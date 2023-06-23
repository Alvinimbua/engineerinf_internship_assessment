public class doubleAverage {
    //the average of the array can be in double format therefore the total of the array should be of type double
    //not int
    public static double calculateAverage(int[] numbers) {
        double total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = total / numbers.length;
        return average;
    }
    public static void main(String[] args) {
        int[] data = {1,4,2};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
