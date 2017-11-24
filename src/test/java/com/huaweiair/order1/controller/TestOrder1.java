package com.huaweiair.order1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestOrder1 {

        Order1Delegate order1Delegate = new Order1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = order1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}