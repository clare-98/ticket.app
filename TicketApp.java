package Assignment;
import java.util.Scanner;
public class TicketApp {

    public static String studentNumber;
    public char classif;
    public int speedlimit;
    public int speed;

    public String inputStudentNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student Number : ");
        studentNumber = input.nextLine();
        return studentNumber;
    }
    public char inputYearInSchool(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your classification : ");
        System.out.println("    Freshman <Enter 1>");
        System.out.println("    Sophomore <Enter 2>");
        System.out.println("    Junior <Enter 3>");
        System.out.println("    Senior <Enter 4>");
        int classification = input.nextInt();
        switch (classification){
            case 1:
                classif = 'F';
                 return classif;
            case 2:
                classif = 'M';
                return classif;
            case 3:
                classif = 'J';
                return classif;
            default:
                classif = 'S';
                return classif;
        }
    }
    public int inputSpeed(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ticketed speed: ");
        speed = input.nextInt();
        return speed;
    }
}
