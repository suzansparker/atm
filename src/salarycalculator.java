
import java.util.Scanner;
public class salarycalculator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int sunday = scanner.nextInt();
        int monday = scanner.nextInt();
        int tuesday = scanner.nextInt();
        int wednestday = scanner.nextInt();
        int thursday = scanner.nextInt();
        int friday = scanner.nextInt();
        int saturday = scanner.nextInt();
        int weeklysal, bonus, weeklyBonus, extraWeeklySalary=0;
        int salaryMonday, salaryTuesday, salaryWednestday, salaryThursday, salaryFriday, extraHour=0;


        int salarySaturday= saturday * 125;
        int salarySunday= sunday * 150;

        if(monday > 8){
            extraHour = monday-8;
            bonus = extraHour*115;
            salaryMonday = bonus + 800;
        }
        else{
            salaryMonday = monday*100;
        }
        if(tuesday > 8){
            extraHour = tuesday-8;
            bonus = extraHour*115;
            salaryTuesday = bonus + 800;
        }
        else{
            salaryTuesday = tuesday*100;
        }
        if(wednestday > 8){
            extraHour = wednestday-8;
            bonus = extraHour*115;
            salaryWednestday = bonus + 800;
        }
        else{
            salaryWednestday = wednestday*100;
        }
        if(thursday > 8){
            extraHour = thursday-8;
            bonus = extraHour*115;
            salaryThursday = bonus + 800;
        }
        else{
            salaryThursday = thursday*100;
        }
        if(friday > 8){
            extraHour = friday-8;
            bonus = extraHour*115;
            salaryFriday = bonus + 800;
        }
        else{
            salaryFriday = friday*100;
        }
        int totalHours = monday + tuesday + wednestday + thursday + friday;
        if(totalHours > 40){
            weeklyBonus  = totalHours-40;
            extraWeeklySalary = weeklyBonus * 125;
        }
        weeklysal = salaryMonday + salaryTuesday + salaryWednestday + salaryThursday + salaryFriday + salarySaturday + salarySunday + extraWeeklySalary;
        System.out.println(weeklysal);

    }

}