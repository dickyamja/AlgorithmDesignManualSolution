package material.recursion;

public class Fibonacci {

    // 0 1 1 2 3
    public static int calculateFibonacci(int number){
        if(number < 1){
            throw new IllegalArgumentException("number should be greater than 1");
        }
        if(number == 1|| number == 2){
            return number - 1;
        }
        return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(" fibonacci of 5 is " + calculateFibonacci(5));
    }
}
