package com.tw.model;

public class Position {
    public final Direction direction;
    public final Coordinate coordinate;

    public Position(Coordinate coordinate, Direction direction) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return coordinate + " " + direction;
    }

    boolean isOutsideOf(Coordinate outerMostCoordinate) {
        return this.coordinate.x > outerMostCoordinate.x || this.coordinate.y > outerMostCoordinate.y;
    }
}
