package com.ulan.cube.entity;

import java.util.Objects;

public class Cube {
    private long cubeId;
    private Point startPoint;
    private double sideLength;


    public Cube (int cubeId, Point startPoint, double sideLength){
        this.cubeId = cubeId;
        this.startPoint=startPoint;
        this.sideLength=sideLength;
    }

    public long getCubeId() {
        return cubeId;
    }

    public void setCubeId(long cubeId) {
        this.cubeId = cubeId;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return cubeId == cube.cubeId &&
                Double.compare(cube.sideLength, sideLength) == 0 &&
                Objects.equals(startPoint, cube.startPoint);
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + Double.valueOf(cubeId).hashCode();
        result = prime * result + startPoint.hashCode();
        result = prime * result + Double.valueOf(sideLength).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "cubeId=" + cubeId +
                ", startPoint=" + startPoint +
                ", sideLength=" + sideLength +
                '}';
    }
}
