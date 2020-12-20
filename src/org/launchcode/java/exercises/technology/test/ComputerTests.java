package org.launchcode.java.exercises.technology.test;

import org.junit.Test;
import org.launchcode.java.exercises.technology.main.Computer;

import static org.junit.Assert.assertEquals;

public class ComputerTests {

    @Test
    public void canAddRamInIntervalsOf8() {
        Computer computer = new Computer("Dell", 1000, 16);
        computer.addRam(8);
        assertEquals(24, computer.getRam());
    }

}
