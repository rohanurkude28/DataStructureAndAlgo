package sorting;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));
    }

    //1! = 1 * 0!
    //2! = 2 * 1!
    //3! = 3 * 2!
    //4! = 4 * 3!
    private static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }

    private static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }

        int factorial=1;
        for(int i =1 ; i<=num; i++){
            factorial *= i;
        }

        return factorial;
    }
}
