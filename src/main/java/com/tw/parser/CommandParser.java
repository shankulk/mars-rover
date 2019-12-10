package com.tw.parser;

import com.tw.commands.MoveRight;
import com.tw.commands.MoveForward;
import com.tw.commands.MoveLeft;
import com.tw.model.Command;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParser {
    private final String commands;

    public CommandParser(String commands) {
        this.commands = commands;
    }

    public List<Command> parse() {
        List<Command> commandsList = new ArrayList<>();
        Arrays.stream(commands.split("")).forEach(command -> {
            switch (command) {
                case "L":
                    commandsList.add(new MoveLeft());
                    break;
                case "R":
                    commandsList.add(new MoveRight());
                    break;
                case "M":
                    commandsList.add(new MoveForward());
                    break;
                default:
                    throw new UnsupportedOperationException("Wrong command");
            }
        });

        return commandsList;
    }
}
