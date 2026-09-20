public class Recursion2 {

    public static int calculateFac(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int i = calculateFac(n - 1);

        int m = n * i;

        return m;
    }

    public static void main(String[] args) {

        int n = 5;

        int ans = calculateFac(n);

        System.out.println(ans);
    }
}