package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

    	String actual = numbers.oddNumbers();
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void powersTest(){
        //: Given

        //: When

        //: Then
    }

}
