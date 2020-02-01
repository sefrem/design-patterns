package com.company.command;

import com.company.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
//        var command = new AddCustomerCommand(service);
//        var button = new Button(command);
//        button.click();
        var commands = new CompositeCommand();
        commands.addCommand(new BlackAndWhiteCommand());
        commands.addCommand(new ResizeCommand());
        commands.addCommand(new AddCustomerCommand(service));
        commands.addCommand(new ResizeCommand());
        commands.execute();
    }
}
