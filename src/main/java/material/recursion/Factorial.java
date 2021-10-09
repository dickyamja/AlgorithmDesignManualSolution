package material.recursion;

public class Factorial {

    // 5 = 1 + 2 + 3 + 4 + 5 = 15
    public static long countFactorial(long number){
        if(number == 1){
            return number;
        }
        return number + countFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("factorial of 5 is " + countFactorial(5));
    }
}
