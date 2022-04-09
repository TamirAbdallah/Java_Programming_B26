package day18_string;

     public class Contains {
         public static void main(String[] args) {
             String day = "Today it is about 70";
             System.out.println(day.contains("it is")); // true
             System.out.println(day.contains("itis"));  //false
             System.out.println(day.contains("ay is")); // true
             System.out.println(day.contains("7"));   // true
             System.out.println(day.contains("today")); // false becauce we had today with uppercase T
             System.out.println(day.contains("ti7" ));
             /*
             if ypu wanted to check for specific characters
             day contains ("T") && day.contains ("i") && day .contains ("7")
              */


         }
     }
