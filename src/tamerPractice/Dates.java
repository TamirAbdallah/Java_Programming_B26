package tamerPractice;

public class Dates {
    public static void main(String[] args) {

        //  my name is Tamir Abdallah date of Birth 09/15/1978


        String firstName     = "Noah";
        String lastName  = "Smith";
        String company   = "Apple";
        int salary      = 200000;
        byte startday   = 10;
        byte startMonth = 1;
        long startYear  = 2022;
        boolean isFullTime = true;
        byte year     = 2;
        double rate        =salary * (.075*100/100);
        double after2Years= (rate) * (year) + salary;

        String jobTitle="SDET";
        String officeAddress="One Apple Park Way, Cupertino, CA 95014";
        String email ="noah10@apple.com";

        System.out.println("Employee Information");
        System.out.println("We have "+firstName+" "+lastName+" joining "+company);
        System.out.println(firstName+" will start on "+startMonth+"/" +startday+"/"+startYear+" as full time: "+isFullTime);
        System.out.println(firstName+" here is some information about your employment");
        System.out.println("Your email is "+firstName+startday+"@"+company+".com");
        System.out.println("Your base salary is $"+salary+" and after 2 years it will be $"+after2Years);
        System.out.println("Welcome aboard,see you at "+officeAddress);

    }
}






