package com.logistic.routetracker;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30)
            return (actualDuration - expectedDuration) * 0.5;
        return 0;
    }
}
