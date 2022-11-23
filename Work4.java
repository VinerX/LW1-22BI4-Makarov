import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double N;
        double R;
        double x;
        double y;
        int count=0;

        try {
            System.out.println("Enter number of points");
            N = in.nextDouble();
            System.out.println("Enter Radius");
            R = in.nextDouble();
            for (int i=0; i<N;i++){
                System.out.println("Enter x"+(i+1));
                x = in.nextDouble();
                System.out.println("Enter y"+(i+1));
                y = in.nextDouble();
                if ( (x*x+y*y)<=R*R){
                    System.out.println("Point is in circle");
                    count+=1;
                }
                else System.out.println("Point is not circle");

            }

        } catch (Exception e) { // Защита от некорректного ввода
            System.out.print("Error: entered data is not correct. Rerun programme and then enter correct numbers");
            return;
        }
        in.close();


        System.out.println("Result:" + count+ " points are in circle");
    }
}
