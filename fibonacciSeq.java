//This class takes input from user and prints the fibonacci sequence of the numbers up to that no
class fibonacciSeq{
	public static void main(String args[]){

        //0 and 1 are created and printed as they will always be present and the first numbers in a fibonacci sequence
        int prevNo = 0, currentNo = 1, sumOfPrev, iterator = 2;
        System.out.println("Enter the no you want the fibonacci sequence to print upto");
        Scanner scanner = new Scanner(System.in);
        int maxInput = scanner.nextInt();
        System.out.print(prevNo+ " " + currentNo);

        //loop calculates the sum of the previous two numbers then replaces the numbers with the new result
        while(iterator < maxInput){
            sumOfPrev = prevNo + currentNo;
            System.out.print(" " + sumOfPrev);
            prevNo = currentNo;
            currentNo = sumOfPrev;
            iterator++;
        }
    }
}
