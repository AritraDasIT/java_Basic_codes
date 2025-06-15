public class GCDExample {
    public static void main(String[] args) {
        int num1 = 48; // You can change this value
        int num2 = 18; // You can change this value

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder becomes new b
            a = temp;  // previous b becomes new a
        }
        return a;
    }
}
