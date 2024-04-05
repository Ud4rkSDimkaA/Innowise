package org.example.service;


import org.example.model.FileSystemElement;
import org.example.model.Folder;

import java.util.Scanner;

public class FileSystemManager {

    private FileSystem fileSystem;

    public FileSystemManager() {
        this.fileSystem = new FileSystem();
    }

    public void startFileSystemInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("%> ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            } else if(input.equals("print")){
                printFileSystem(fileSystem.getRoot(), "");
            }else{
                fileSystem.buildFileSystem(input);
            }

        }
    }

    private void printFileSystem(Folder folder, String indent) {
        System.out.println(indent + folder.getName());
        for (FileSystemElement element : folder.getElements()) {
            if (element instanceof Folder) {
                printFileSystem((Folder) element, indent + "  ");
            } else {
                System.out.println(indent + "  " + element.getName());
            }
        }
    }
}
