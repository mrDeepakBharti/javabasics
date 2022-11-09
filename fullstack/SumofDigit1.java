package fullstack;

public class SumofDigit1 {
    public static int digitsum(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        System.out.println("n = " + n + "    sum = " + sum);
        sum = sum + n % 10;
        n = n / 10;
        int res = digitsum(n, sum);
        return res;
    }

    public static void main(String[] args) {
        int n = 12345;
        int res = digitsum(n, 0);

        System.out.print("sum of digit: "+res);

}
}