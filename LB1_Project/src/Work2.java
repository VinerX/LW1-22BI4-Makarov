import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;

        try {
            // Ввод и проверка дня
            System.out.print("Enter day: ");
            day = in.nextInt();
            if ( !(day >=1 && day<=31) ) {
                System.out.print("Error: day in not correct");
                return;
            }

            // Ввод и проверка месяца, соответсвия дня месяцу
            System.out.print("Enter month: ");
            month = in.nextInt();
            if ( !(month >=1 && month<=12) ){
                System.out.print("Error: month in not correct");
                return;
            }
            if ( (month%2==0 && day==31 ) || ( month==2 && day>=28) ) { // Провека на 31 дни и 29-30 в ферале (без високосных)
                System.out.print("Error: day does not suit month ");
                return;
            }

        }
        catch (Exception e) {
            System.out.print("Error: entered data is not correct. Rerun programme and then enter correct numbers");
            return;
        }
        in.close();


        // Блок выбирающий время года
        System.out.print("Season is ");
        switch (month){
            case 1: System.out.print("Winter"); break;
            case 2: System.out.print("Winter"); break;
            case 3: System.out.print("Spring"); break;
            case 4: System.out.print("Spring"); break;
            case 5: System.out.print("Spring"); break;
            case 6: System.out.print("Summer"); break;
            case 7: System.out.print("Summer"); break;
            case 8: System.out.print("Summer"); break;
            case 9: System.out.print("Autumn"); break;
            case 10: System.out.print("Autumn"); break;
            case 11: System.out.print("Autumn"); break;
            case 12: System.out.print("Winter"); break;
            default: System.out.print("Error: month is not correct"); break;
        }
    }
}