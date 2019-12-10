package com.tw.model;

import com.tw.parser.CommandParser;
import java.util.List;

public class Robot {
    private Position position;
    private final CommandParser commandParser;

    public Robot(Position position, CommandParser commandParser) {
        this.position = position;
        this.commandParser  = commandParser;
    }

    String move(Coordinate outerMostCoordinate) {
        List<Command> commands = commandParser.parse();
        commands.forEach(command -> position = command.execute(position));
        if(position.isOutsideOf(outerMostCoordinate))
            throw new IndexOutOfBoundsException("Robot cannot move outside of the Plateau");
        return position.toString();
    }
}
