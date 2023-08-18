package com.kostyanetskaya.epamjavastudy.lesson13.tasks;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private final int degrees;

    public int getDegrees() {
        return degrees;
    }

    public static Direction ofDegrees(int degrees) {
        degrees = (degrees % 360 + 360) % 360;

        for (Direction d : Direction.values()) {
            if (d.getDegrees() == degrees)
                return d;
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        if (degrees > 360 || degrees < -360) {
            int ost = degrees / 360;
            degrees = degrees - (360*ost);

            innerClosestToDegrees(degrees);
        }

        return innerClosestToDegrees(degrees);

    }
    private static Direction innerClosestToDegrees(int degrees) {
        for (Direction d : Direction.values()) {
            if (ofDegrees(degrees) != null) {
                return ofDegrees(degrees);
            }
            if (degrees < d.getDegrees() && degrees >= d.getDegrees() - 22) {
                return d;
            }

            if (degrees > d.getDegrees() && degrees <= d.getDegrees() + 22) {
                return d;
            }
        }
        return null;
    }

    public Direction opposite() {
        for (Direction d: Direction.values()) {
            if(d.getDegrees()==this.getDegrees() - 180 || d.getDegrees() == this.getDegrees() + 180) {
                return d;
            }
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        if (this.getDegrees() == 0 && direction.getDegrees() > 180) {
            return 360 - direction.getDegrees();
        }
        return Math.abs(this.getDegrees() - direction.getDegrees());
    }
}
