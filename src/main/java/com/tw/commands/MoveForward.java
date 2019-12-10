package com.tw.commands;

import com.tw.model.Command;
import com.tw.model.Coordinate;
import com.tw.model.Position;

public class MoveForward implements Command {

    @Override
    public Position execute(Position position) {
        switch (position.direction) {
            case E:
                return new Position(new Coordinate(position.coordinate.x + 1, position.coordinate.y), position.direction);
            case N:
                return new Position(new Coordinate(position.coordinate.x, position.coordinate.y + 1), position.direction);
            case S:
                return new Position(new Coordinate(position.coordinate.x, position.coordinate.y - 1), position.direction);
            case W:
                return new Position(new Coordinate(position.coordinate.x - 1, position.coordinate.y), position.direction);
        }
        return null;
    }
}
