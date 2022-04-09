package tamerPractice;
public class T_ShorthandIfStatement {
    public static void main(String[] args) {
/*  int y=1;
        int z = y==1? 2:5;
        System.out.println("z = " + z);
-------------------------------------------------------------
        int Mark ;
        System.out.println("Please Enter your Score: ");
        Mark =in.nextInt();
        if  int Mark ;
        System.out.println("Please Enter your Score: ");
        Mark =in.nextInt();
        if (Mark >= 90)
            System.out.println("Grad = A");
        else if(Mark >= 80)
            System.out.println("Grad = B");
        else if (Mark >= 70)
            System.out.println("Grad = C");
        else if (Mark >= 60)
            System.out.println("Grad = D");
        else
            System.out.println("Fail");
        _______________________________
   */
int Score = 70;
char Grade ;
char Grade2 = (Score >= 90)? 'A' : (Score >= 80)? 'B' : (Score >= 70)? 'C' : (Score >= 60)? 'D' : 'F';
  System.out.println("Score = " + Score);
        System.out.println(Grade2);
    }}