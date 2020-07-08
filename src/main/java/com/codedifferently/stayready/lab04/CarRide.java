package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {

    public boolean inputCheck(String input){
        if(input == "yes"){
            return true;
        }
        else{
            return false;
        }
    }
        


   public boolean ThereYetInput(String input){
    String areWeThere = "Are we there yet?";
    Scanner scan = new Scanner(System.in);
    boolean notThere = true;
    String check;
    while (notThere) {
        System.out.println(areWeThere);
        check = scan.nextLine();
        if (inputCheck(check)) {
            notThere = false;
        }

    }
    return true;
   }

   }

