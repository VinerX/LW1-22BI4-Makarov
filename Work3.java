import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int n;
        double result = 1;

        //Блок ввода
        try {
            x = in.nextInt();
            n = in.nextInt();
            if (n <= -15 || n >= 15) {
                System.out.println("Error: n is not correct");
                return;
            }

        } catch (Exception e) {
            System.out.print("Error: entered data is not correct. Rerun programme and then enter correct numbers");
            return;
        }
        in.close();




        //Блок счета
        if(n>=0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        }
        else {
            for (int i = 0; i > n; i--) {
                result /= x;
            }
        }

        System.out.println("Result: " + result);
    }
}

