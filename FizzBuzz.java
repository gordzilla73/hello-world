
public class FizzBuzz {
    
    public String valueOf(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(n);
    }

    public void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(valueOf(n));
        }
    }

}
