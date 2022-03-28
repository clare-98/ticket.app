package Assignment;

import java.util.Scanner;

public class Ticket extends TicketApp {
    public  String studentNumber;
    public  char classif;
    public  int speedLimit;
    public  int speedTravelling;

    public static void main(String [] args){
        Scanner input  = new Scanner(System.in);
        Ticket ticket = new Ticket();
        String studentNumber = ticket.inputStudentNumber();
        System.out.print("Enter the speed limit : ");
        ticket.speedLimit = input.nextInt();
        ticket.speedTravelling = ticket.inputSpeed();
        ticket.classif = ticket.inputYearInSchool();
        System.out.println("Student Number : "+studentNumber);
        System.out.println("Classification: "+ticket.returnNameOfClassification(ticket.classif));
        ticket.setFine(ticket.speedTravelling,ticket.classif);


    }
    public void setFine( int ticketedSpeed,char classif){

        int studentClass;
        int speed = ticketedSpeed - speedLimit;
        double fine = (speed/5 *87.5) + 75;
        System.out.println("Speed Limit :"+speedLimit);
        System.out.println("Reported Speed :"+ticketedSpeed);
        if (classif =='S'){
            if(speed>20){
                fine += 200;
            }else {
                fine +=50;
            }
        }else {
            if (classif =='F'){
                if(speed<20){
                    fine -=50;
                }else {
                    fine = fine +100;
                }
            }else {
                if (speed>19){
                    fine = fine +100;
                }
            }
        }
        System.out.println("Fine : $"+fine);
    }
    public String returnNameOfClassification(char ticketiff){
        switch (ticketiff){
            case 'F':
                return "FreshMan";
            case 'M':
                return "Sophomore";
            case 'J':
                return "Junior";
            case 'S':
                return "Senior";
        }
        return " ";
    }
}
