
public class Main {

    public static final String TEXT = "Hello";


    public static void main(String[] args) {

        System.out.println(TEXT);
        String s = "How are you?";
        print(s);
        int a = 2;
        int b = 1;
        printSum(a, b);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

    //public static void printSum(int a, int b)

