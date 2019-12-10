package com.tw.model;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private final Coordinate outerMostCoordinate;
    private List<Robot> robots;

    public Plateau(Coordinate outerMostCoordinate) {
        this.outerMostCoordinate = outerMostCoordinate;
    }

    public void deploy(List<Robot> robots) {
        this.robots = robots;
    }

    public List<String> moveRovers() {
        List<String> finalPositions = new ArrayList<>();
        robots.forEach(robot -> {
            String moved = robot.move(outerMostCoordinate);
            finalPositions.add(moved);
        });

        return finalPositions;
    }
}
