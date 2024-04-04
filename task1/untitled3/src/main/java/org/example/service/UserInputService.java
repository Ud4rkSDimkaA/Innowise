package org.example.service;

import java.util.Scanner;

public class UserInputService {

    private FileSystemManager fileSystemManager;

    public UserInputService() {
        this.fileSystemManager = new FileSystemManager();
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("$> ");
        return scanner.next();
    }

    public void runUserInputs() {
        boolean isWorking = true;

        while (isWorking) {
            String userInput = getUserInput();

            if (userInput.equals("print")) {
                fileSystemManager.printFileSystem();
            } else if (userInput.equals("stop")) {
                isWorking = false;
            } else {
                fileSystemManager.parseInput(userInput);
            }
        }

    }
}
