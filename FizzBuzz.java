public class FizzBuzz{    
    public static void main(String[] args) {
        int end = 100;
        for (int i = 1; i <= end; i++) {
            if (i % 5 == 0 && i %7 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 7 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}