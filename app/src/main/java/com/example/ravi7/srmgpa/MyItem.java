package com.example.ravi7.srmgpa;

/**
 * Created by ravi7 on 02-09-2017.
 */

public class MyItem {
    int subgrade;
    int credits;

    public MyItem(int subgrade, int credits) {
        this.subgrade = subgrade;
        this.credits = credits;
    }

    public int getSubgrade() {
        return subgrade;
    }

    public void setSubgrade(int subgrade) {
        this.subgrade = subgrade;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
