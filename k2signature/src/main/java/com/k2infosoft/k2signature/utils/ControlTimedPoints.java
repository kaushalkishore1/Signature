package com.k2infosoft.k2signature.utils;

/**
 * Created by kaushal on 07/12/16.
 */
public class ControlTimedPoints {

    public TimedPoint c1;
    public TimedPoint c2;

    public ControlTimedPoints set(TimedPoint c1, TimedPoint c2) {
        this.c1 = c1;
        this.c2 = c2;
        return this;
    }

}
