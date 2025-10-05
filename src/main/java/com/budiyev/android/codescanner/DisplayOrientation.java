package com.budiyev.android.codescanner;

public enum DisplayOrientation {
    DEFAULT(-1),
    ROTATED_0(0),
    ROTATED_90(90),
    ROTATED_180(180),
    ROTATED_270(270);

    private final int orientation;

    DisplayOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getOrientation() {
        return orientation;
    }
}
