package Statements;
import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {
        int age,dist,type;
        double initPrice,secPrice,finalPrice;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance you want to fly in kilometers: ");
        dist = input.nextInt();

        initPrice= dist*0.1;

        System.out.println("Please enter your age: ");
        age=input.nextInt();

        System.out.println("Please enter type of flight what you want (1 ==> One Way, 2 ==> Round Trip) : ");
        type=input.nextInt();

        if ((age>=0)&&(dist>=0)&&(type==1||type==2)){
            isError = false;
        }
        else isError =true;

        if (isError==false){
            System.out.println("PASSANGER INFORMATION"+"\n"+"----------"+"\n"+"Age: "+age+"\n"+"Distance: "+dist+"\n"+"Flight Type: "+type );
                if (age<12){
                secPrice=initPrice*0.5;
                    if (type==2){
                        finalPrice=secPrice*0.8;
                    }
                    else finalPrice=secPrice;
                }
                else if (age<=24) {
                    secPrice=initPrice*0.9;
                    if (type==2){
                        finalPrice=secPrice*0.8;
                    }
                    else finalPrice=secPrice;
                }
                else if (age>25 && age<65){
                    secPrice=initPrice;
                    if (type==2) {
                        finalPrice=secPrice*0.8;
                    }
                    else finalPrice=secPrice;
                }
                else {
                    secPrice=initPrice*0.7;
                    if (type==2){
                        finalPrice=secPrice*0.8;
                    }
                    else finalPrice=secPrice;
                }
            System.out.println("Your ticket price is : " +finalPrice +"$");
        }
        else
            System.out.println("You entered invalid values of age,distance or flight type. Please check your choices and try again... ");



















    }

}
