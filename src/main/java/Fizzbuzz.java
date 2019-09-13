
public class Fizzbuzz{

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        for (int i = 1; i <= 100; i ++) {
            System.out.println(fizzbuzz.play(i));
        }
    }

    public String play(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else if (input % 3 == 0 ) {
            return "Fizz";
        } else {
            return Integer.toString(input);
        }
     }

}