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
        Numbers number = new Numbers();
        String expected = "149162536496481100";
        //: When
        String actual = number.squares();
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given
        Numbers number = new Numbers();
        String expected = "6472";
        //: When
        String actual = number.random4();
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTest(){
        //: Given
        Numbers number = new Numbers();
        String Expected="2468101214161820";
        //: When
        String Actual = number.even(20);
        //: Then

        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers number = new Numbers();
        String Expected="248163264128";
        
        //: When
        String Actual = number.powers(7);

        //: Then
        Assert.assertEquals(Expected, Actual);
    }

}
