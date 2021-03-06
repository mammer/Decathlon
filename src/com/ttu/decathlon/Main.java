package com.ttu.decathlon;

import com.ttu.util.Sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static final Integer MAX_TOTAL_POINTS = 10000;

    /**
     * Different events are calculated as follows:
     * Track events P=a*(b - T)**c
     * Jumps P=a*(M - b)**c
     * Throws P=a*(D - b)**c
     * a,b and c are constants for each event (taken from double arrays). P is points. M,D and T are Athletes results.
     * We need to use Math.floor, because the points are rounded to the next lower integer (by the rules)
     **/

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        TreeMap<String, Integer> pointsList = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File("decathlon.csv"))) {

            while (scanner.hasNext()) {
                Athlete athlete = new Athlete();

                String data = scanner.next();
                data = data.replace(",", ".");

                String[] values = data.split(";");

                athlete.setName(values[0]);
                athlete.setRunning100m(values[1]);
                athlete.setLongJump(values[2]);
                athlete.setShortPut(values[3]);
                athlete.setHighJump(values[4]);
                athlete.setRunning400m(values[5]);
                athlete.setHurdles(values[6]);
                athlete.setDiscusThrow(values[7]);
                athlete.setPoleVault(values[8]);
                athlete.setJavelinThrow(values[9]);

                //Converting to seconds
                String running1500m = values[10];
                String[] time = running1500m.split(":");
                double minutes = Double.parseDouble(time[0]);
                double secondsAndMS = Double.parseDouble(time[1]);
                double timeInSeconds = minutes * 60 + secondsAndMS;
                athlete.setRunning1500m(timeInSeconds);

                // Adding athlete name and score to TreeMap.
                if (athlete.getTotalPoints() <= MAX_TOTAL_POINTS) {
                    pointsList.put(athlete.getName(), athlete.getTotalPoints());
                } else {
                    System.out.println("Check your CSV. Someone scored over 10000 points. ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + e.getMessage().replace("(No such file or directory)", "") + "not found! ");
        }

        //Print to console:
        System.out.println(" " + Sort.sortByValue(pointsList).toString().replaceAll("[\\{\\}\\=,]", ""));

        //Print to txt file:
        PrintWriter writer = new PrintWriter("results.txt", "UTF-8");
        writer.println(" " + Sort.sortByValue(pointsList).toString().replaceAll("[\\{\\}\\=,]", ""));
        writer.close();
    }
}
