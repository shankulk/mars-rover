package com.tw.commands;

import com.tw.model.Command;
import com.tw.model.Direction;
import com.tw.model.Position;

public class MoveRight implements Command {
    @Override
    public Position execute(Position position) {
        switch (position.direction) {
            case E:
                return new Position(position.coordinate, Direction.S);
            case N:
                return new Position(position.coordinate, Direction.E);
            case S:
                return new Position(position.coordinate, Direction.W);
            case W:
                return new Position(position.coordinate, Direction.N);
        }
        return null;
    }
}
