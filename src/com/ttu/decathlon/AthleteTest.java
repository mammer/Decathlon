package com.ttu.decathlon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oskar on 16/02/16.
 **/
public class AthleteTest {

    @Test
    public void test100mRunningPoints() {

        Athlete a = new Athlete();
        a.setRunning100m("10.60");

        assertEquals(952, a.getRunning100m(), 0.1);
    }

    @Test
    public void testLongJumpPoints() {

        Athlete a = new Athlete();
        a.setLongJump("763");

        assertEquals(967, a.getLongJump(), 0.1);
    }

    @Test
    public void testShortPutPoints() {

        Athlete a = new Athlete();
        a.setShortPut("14.9");

        assertEquals(784, a.getShortPut(), 0.1);
    }

    @Test
    public void testHighJumpPoints() {

        Athlete a = new Athlete();
        a.setHighJump("203");

        assertEquals(831, a.getHighJump(), 0.1);
    }

    @Test
    public void test400mRunningPoints() {

        Athlete a = new Athlete();
        a.setRunning400m("46.23");

        assertEquals(997, a.getRunning400m(), 0.1);
    }

    @Test
    public void testHurdlesPoints() {

        Athlete a = new Athlete();
        a.setHurdles("14.40");

        assertEquals(924, a.getHurdles(), 0.1);
    }

    @Test
    public void testDiscusThrowPoints() {

        Athlete a = new Athlete();
        a.setDiscusThrow("43.40");

        assertEquals(734, a.getDiscusThrow(), 0.1);
    }

    @Test
    public void testPoleVaultPoints() {

        Athlete a = new Athlete();
        a.setPoleVault("540");

        assertEquals(1035, a.getPoleVault(), 0.1);
    }

    @Test
    public void testJavelinThrowPoints() {

        Athlete a = new Athlete();
        a.setJavelinThrow("67.01");

        assertEquals(844, a.getJavelinThrow(), 0.1);
    }

    @Test
    public void test1500mRunningPoints() {

        Athlete a = new Athlete();
        a.setRunning1500m(269.58);

        assertEquals(747, a.getRunning1500m(), 0.1);
    }

    @Test
    public void testTotalPoints() {

        Athlete a = new Athlete();
        a.setRunning100m("10.60");
        a.setLongJump("763");
        a.setShortPut("14.9");
        a.setHighJump("203");
        a.setRunning400m("46.23");
        a.setHurdles("14.40");
        a.setDiscusThrow("43.40");
        a.setPoleVault("540");
        a.setJavelinThrow("67.01");
        a.setRunning1500m(269.58);

        assertEquals(8815, a.getTotalPoints(), 0.1);
    }

}
