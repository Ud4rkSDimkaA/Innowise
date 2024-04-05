package org.example;

import org.example.service.FileSystemManager;

public class Main {
    public static void main(String[] args) {
        FileSystemManager fileSystemManager = new FileSystemManager();
        fileSystemManager.startFileSystemInput();
    }
}
