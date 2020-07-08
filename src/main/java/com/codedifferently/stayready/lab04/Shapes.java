package com.codedifferently.stayready.lab04;


public class Shapes {

    public static String getRow(int numberOfStars) {
        StringBuilder newStr = new StringBuilder();
            String star = "*";
            newStr.append(star.repeat(numberOfStars));  
            return newStr.toString();
    }

    public String triangle(int numOfRows){
        String result = "";
        String star = "*";
        for(int i=1; i<=numOfRows; i++){
            if(i>1){result += "\n";}
            
            for(int n=1; n<=1; n++){
              star = getRow(i);
              result += star;
            }
        }
        return result +"\n";
    }

    public String tableSquare(){
        String result = "";
        int count = 0;
        for(int i=1;i<5;i++){
            int firstMul = i;
            if(count % 5 == 0 && count != 0){
                result+="\n";
            }
            for(int d = 1; d<5; d++){
                int secondMul = d;
              Integer product= firstMul * secondMul;
        
              result += String.format("%4s|", product.toString() + " ");;
              count += 1;
                //String.format("My answer is %15.8f", 47.65734);
                //String.format("| %4.8f", product + "|");
            }
        }
        return result += "\n";
    }

    public String tableSquares(int n){
        String result = "";
        int count = 0;
        for(int i=1;i<n+1;i++){
            int firstMul = i;
            if(count % 5 == 0 && count != 0){
                result+="\n";
            }
            for(int d = 1; d<n+1; d++){
                int secondMul = d;
              Integer product= firstMul * secondMul;
        
              result += String.format("%4s|", product.toString() + " ");;
              count += 1;
                //String.format("My answer is %15.8f", 47.65734);
                //String.format("| %4.8f", product + "|");
            }
        }
        return result += "\n";
    }
}
