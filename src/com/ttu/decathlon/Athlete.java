package com.ttu.decathlon;

/**
 * Created by Oskar on 16/02/16.
 **/
public class Athlete {
    private String name;
    private double running100m;
    private double longJump;
    private double shortPut;
    private double highJump;
    private double running400m;
    private double hurdles;
    private double discusThrow;
    private double poleVault;
    private double javelinThrow;
    private double running1500m;
    private int totalScore;

    // Constants for each event
    double[] a = new double[]{25.4347, 0.14354, 51.39, 0.8465, 1.53775, 5.74352, 12.91, 0.2797, 10.14, 0.03768};
    double[] b = new double[]{18, 220, 1.5, 75, 82, 28.5, 4, 100, 7, 480};
    double[] c = new double[]{1.81, 1.4, 1.05, 1.42, 1.81, 1.92, 1.1, 1.35, 1.08, 1.85};

    public Athlete() {
    }

    /**
     * Cast to int
     * @return Total points for all the events
     */
    public int getTotalPoints() {
        totalScore = (int) (getRunning100m() + getLongJump() + getShortPut() + getHighJump() + getRunning400m() +
                getHurdles() + getDiscusThrow() + getPoleVault() + getJavelinThrow() + getRunning1500m());

        return totalScore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunning100m() {
        return running100m;
    }

    public void setRunning100m(String running100m) {
        this.running100m = Double.parseDouble(running100m);
        this.running100m = Math.floor(a[0] * Math.pow(b[0] - getRunning100m(), c[0]));

    }

    public double getLongJump() {
        return longJump;
    }

    public void setLongJump(String longJump) {
        this.longJump = Double.parseDouble(longJump);
        this.longJump = Math.floor(a[1] * Math.pow(getLongJump() - b[1], c[1]));
    }

    public double getShortPut() {
        return shortPut;
    }

    public void setShortPut(String shortPut) {
        this.shortPut = Double.parseDouble(shortPut);
        this.shortPut = Math.floor(a[2] * Math.pow(getShortPut() - b[2], c[2]));
    }

    public double getHighJump() {
        return highJump;
    }

    public void setHighJump(String highJump) {
        this.highJump = Double.parseDouble(highJump);
        this.highJump = Math.floor(a[3] * Math.pow(getHighJump() - b[3], c[3]));
    }

    public double getRunning400m() {
        return running400m;
    }

    public void setRunning400m(String running400m) {
        this.running400m = Double.parseDouble(running400m);
        this.running400m = Math.floor(a[4] * Math.pow(b[4] - getRunning400m(), c[4]));
    }

    public double getHurdles() {
        return hurdles;
    }

    public void setHurdles(String hurdles) {
        this.hurdles = Double.parseDouble(hurdles);
        this.hurdles = Math.floor(a[5] * Math.pow(b[5] - getHurdles(), c[5]));
    }

    public double getDiscusThrow() {
        return discusThrow;
    }

    public void setDiscusThrow(String discusThrow) {
        this.discusThrow = Double.parseDouble(discusThrow);
        this.discusThrow = Math.floor(a[6] * Math.pow(getDiscusThrow() - b[6], c[6]));
    }

    public double getPoleVault() {
        return poleVault;
    }

    public void setPoleVault(String poleVault) {
        this.poleVault = Double.parseDouble(poleVault);
        this.poleVault = Math.floor(a[7] * Math.pow(getPoleVault() - b[7], c[7]));
    }

    public double getJavelinThrow() {
        return javelinThrow;
    }

    public void setJavelinThrow(String javelinThrow) {
        this.javelinThrow = Double.parseDouble(javelinThrow);
        this.javelinThrow = Math.floor(a[8] * Math.pow(getJavelinThrow() - b[8], c[8]));

    }

    public double getRunning1500m() {
        return running1500m;
    }

    public void setRunning1500m(double running1500m) {
        this.running1500m = running1500m;
        this.running1500m = Math.floor(a[9] * Math.pow(b[9] - running1500m, c[9]));
    }
}