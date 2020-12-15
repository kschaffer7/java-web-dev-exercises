package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.junit.Before;


public class CarTest {

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest() {
//        assertEquals(10,10,.001);
//    }
    //TODO: constructor sets gasTankLevel properly
    //The @Before annotation can be used to set up some data or a condition that you want to have for every test in a given class.
    //In the case of CarTest, it would be nice to not need to create a new Car instance for each test we write.
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevelAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testIfGasTankCanBecomeZero() {
        test_car.drive(700);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testForBottomlessGasTank(){
        test_car.addGas(5);
        fail("Should not happen");
    }
}
