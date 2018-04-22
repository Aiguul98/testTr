package main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Programm2Test {
    private hW hw;

    @Before
    public void init(){
    	hw = new hW();
    }

    @Test
    public void Testim {
    	assertEquals("2",hw.main());
    }
}
