package com.ulan.cube.entity;

public class Point {
    private long pointId;
    private double x;
    private double y;
    private double z;

     public Point (int pointId, double x, double y, double z){
        this.pointId = pointId;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null||getClass()!=obj.getClass()){
            return false;
        }

        Point point = (Point) obj;
        return (pointId == point.pointId
                && Double.compare(x,point.x)==0
                && Double.compare(y,point.y)==0
                && Double.compare(z,point.z)==0);
    }

    @Override
    public String toString() {
        return "Point id="+pointId+", x="+x+", y="+y+", z="+z;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + Double.valueOf(x).hashCode();
        result = prime * result + Double.valueOf(y).hashCode();
        result = prime * result + Double.valueOf(z).hashCode();
        return result;
    }
}
