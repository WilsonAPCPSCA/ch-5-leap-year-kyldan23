import java.util.Scanner;
public class LeapYearBoolean{
    public static void main(String []args){
        int year=0;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Please enter a year that is greater than 1582.");
            year=in.nextInt();
        }
        while(year<1582);
        System.out.print("Leap year? ");
        System.out.print(isLeapYear(year));
        
    }
    public static boolean isLeapYear(int year){
        boolean leapYear=false;
        if(year%4==0&&year%100!=0){
            leapYear=true;
        }
        else if(year%400==0){
            leapYear=true;
        }
        else{
            leapYear=false;
        }
        return leapYear;
    }
}
            