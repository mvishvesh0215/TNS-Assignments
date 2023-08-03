import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        int a,b,c = 0,n;
        System.out.println("Enter 1 For Addition\nEnter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for Divion:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter Num1:");
        a = sc.nextInt();
        System.out.println("Enter Num2:");
        b = sc.nextInt();
        switch (n) {
            case 1:
                c = a+b;
                break;
            case 2:
                c = a-b;
                break;
            case 3:
                c = a*b;
                break;
            case 4:
                c = a/b;
                break;
        }
        System.out.println("Ans:"+c);
    }
}
