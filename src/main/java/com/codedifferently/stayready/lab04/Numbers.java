package com.codedifferently.stayready.lab04;

import java.util.Random;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
    		
        return output;
    }

    public String squares(){
        Integer num = 0;
        String result = "";
        for(int i=1;i<=10;i++){
            num = i * i;
            result += Integer.toString(num);
        }
        return result;
    }

    public String random4(){
        //Seeded with 3, so that testing can be done reliably.
        Random rand = new Random(3);
        String result = "";
        for(int i=0;i<4;i++){
            Integer r1 = rand.nextInt(11);
            result += Integer.toString(r1);
        }
        return result;
    }

    public String even(int n){
      Integer num =1;
      String result =""; 
      for( int i=2; i<=n; i++){
        if ( i%2==0){
            num = i;
            result+= Integer.toString(num);

         }
        }
        return result;
      
    }

    public String powers(int n){
        double num = 0;
        String result="";
        Integer Conversion;
        double PowerResult=0.0;

        for(int i=1; i<=n; i++)
        {
           // Math.pow(2 , i);
            PowerResult = Math.pow(2 ,i);
            Conversion = (int)PowerResult;
            result += String.valueOf(Conversion);
        }

        //math.pow()
        return result;
    }

}
