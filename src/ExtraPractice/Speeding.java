package ExtraPractice;

import java.sql.SQLOutput;

public class Speeding {
    public static void main(String[] args) {


    /*
    create a class called Speeding, and write a program to determine if the
      car is speeding
      declare 3 variables:
      current speed, speed limit, speeding boolean
      print
       "Are you speeding? " true/fa
     */

        int CurrentSpeed = 60;
        int SpeedLimit = 55;
        boolean IsSpeeding = CurrentSpeed>=SpeedLimit;

        System.out.println("Are you Speeding ? " + IsSpeeding);

    }}
