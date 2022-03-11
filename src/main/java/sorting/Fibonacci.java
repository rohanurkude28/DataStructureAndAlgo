package sorting;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(sumOfFiboNum(10));
    }

    private static int sumOfFiboNum(int num) {
        if (num < 2) return num;
        return sumOfFiboNum(num - 1) + sumOfFiboNum(num - 2);
    }
}
