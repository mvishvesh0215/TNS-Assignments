import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary,yrs,retirement_year;
        String date_of_birth,current_year,year1,year2;
        float gs;
        System.out.println("Enter the date of birth (dd/mm/yyyy):");
        date_of_birth = sc.nextLine();
        year1 = date_of_birth.substring(6,10);
//        System.out.println(year1);
        System.out.println("Enter the current year (dd/mm/yyyy):");
        current_year = sc.nextLine();
        year2 = current_year.substring(6,10);
//        System.out.println(year2);
        yrs = Integer.parseInt(year2)-Integer.parseInt(year1);
        if((yrs>=21)&&(yrs<=55)) {
            System.out.println("Enter the Salary:");
            salary = sc.nextInt();
            if ((salary < 6500) && (salary > 4500)) {
                float ta, da, hra, pa;
                ta = salary * 0.01f;
                da = ta;
                hra = salary * 0.03f;
                pa = salary * 0.05f;
                gs = salary - (ta + da + hra + pa);
                System.out.println("The TA is:" + ta);
                System.out.println("The DA is:" + da);
                System.out.println("The HRA is:" + hra);
                System.out.println("The PA is:" + pa);
                System.out.println("The Gross Salary is:" + gs);
            } else if (salary > 10000) {
                gs = salary - 1000;
                System.out.println("The gross salary is:" + gs);
            } else {
                System.out.println("You have not defined proper salary");
            }
            retirement_year = Integer.parseInt(year2)+(55-yrs);
            System.out.println("The retirement date is:"+current_year.substring(0,5)+"/"+retirement_year);
        }
        else if (yrs>55){
            System.out.println("You are already old enough as your age is:"+yrs);
        }
        else {
            System.out.println("You are not eligible with your age criteria:"+yrs);
        }
    }
}
