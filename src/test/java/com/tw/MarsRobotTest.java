package com.tw;

import com.tw.model.Coordinate;
import com.tw.model.Direction;
import com.tw.model.Plateau;
import com.tw.model.Position;
import com.tw.model.Robot;
import com.tw.parser.CommandParser;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MarsRobotTest {

    @Test
    public void testMoveRover() {
        Plateau plateau = new Plateau(new Coordinate(5, 5));

        Robot robot1 = new Robot(new Position(new Coordinate(1, 2), Direction.N), new CommandParser("LMLMLMLMM"));
        Robot robot2 = new Robot(new Position(new Coordinate(3, 3), Direction.E), new CommandParser("MMRMMRMRRM"));

        plateau.deploy(Arrays.asList(robot1, robot2));

        List<String> finalPositions = plateau.moveRovers();

        Assert.assertEquals("1 3 N", finalPositions.get(0));
        Assert.assertEquals("5 1 E", finalPositions.get(1));
    }
}
