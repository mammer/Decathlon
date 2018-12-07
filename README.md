# Decathlon

Run main class to calculate Decathlon scores to the athletes on the decathlon.csv

     * Different events are calculated as follows:
     * Track events P=a*(b - T)**c
     * Jumps P=a*(M - b)**c
     * Throws P=a*(D - b)**c
     * a,b and c are constants for each event (taken from double arrays). P is points. M,D and T are Athletes results.
     * We need to use Math.floor, because the points are rounded to the next lower integer (by the rules)
