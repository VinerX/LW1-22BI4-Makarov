import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        //Задать день сравнения
        int day_now=25;
        int month_now=11;
        int year_now=2022;



        // Блок ввода
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

            System.out.print("Enter year: ");
            year = in.nextInt();


            //Защита от будущего
            if (year>year_now || year==year_now &&(month>month_now || (month==month_now && day>day_now))){
                System.out.print("Error: entered future date ");
                return;
            }
        }

        catch (Exception e) {
            System.out.print("Error: entered data is not correct. Rerun programme and then enter correct numbers");
            return;
        }
        in.close();


        // Блок счета
        int years=0;
        int months=0;
        int days=0;

        if (month_now > month || (month_now == month && day_now>=day)){
            years = year_now-year;

            if (day_now>=day){
                months = month_now-month;

                days= day_now-day;
            }
            else {

                months = month_now-month-1;
                if (month_now%2==1) days=31-(day-day_now);

                else days=30-(day-day_now);
            }




        }


        else {
            years = year_now-year-1;
            if (day_now>=day){
                months = 12 - (month-month_now);
                days= day_now-day;
            }
            else {
                months = 12 - (month-month_now)- 1;
                if (month_now%2==1) days=31-(day-day_now);
                else days=30-(day-day_now);
            }

        }


        System.out.println(years+" (Y) "+months+" (M) "+days+" (D) "+"in "+day_now+"."+month_now+"."+year_now);

    }
}
