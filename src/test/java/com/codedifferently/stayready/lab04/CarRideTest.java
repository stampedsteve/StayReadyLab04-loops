package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void inputCheckTest(){
        //: Given
        CarRide rideAlong = new CarRide();
        boolean expected1 = false;
        boolean expected2= true;

        //: When
        boolean actual2 = rideAlong.inputCheck("yes");
        boolean actual1 = rideAlong.inputCheck("anything else literally");
        //: Then
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected1, actual1);
    }



   



    

}
