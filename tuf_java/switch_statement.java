package tuf_java;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        
        //Given the day number print which day is of the week,
        //assume week starts from monday and ends on sunday
        Scanner sc = new Scanner(System.in);
        int dayNumber =  sc.nextInt();

        switch(dayNumber){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
                default:
                 System.out.println("invalid");    
        }
        sc.close();
    }
}
