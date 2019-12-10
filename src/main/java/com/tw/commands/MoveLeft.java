package com.tw.commands;

import com.tw.model.Command;
import com.tw.model.Direction;
import com.tw.model.Position;

public class MoveLeft implements Command {
    @Override
    public Position execute(Position position) {
        switch (position.direction) {
            case E:
                return new Position(position.coordinate, Direction.N);
            case N:
                return new Position(position.coordinate, Direction.W);
            case S:
                return new Position(position.coordinate, Direction.E);
            case W:
                return new Position(position.coordinate, Direction.S);
        }
        return null;
    }
}
