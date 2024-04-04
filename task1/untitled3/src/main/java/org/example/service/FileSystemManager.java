package org.example.service;


import org.example.model.File;
import org.example.model.Folder;

public class FileSystemManager {
    private Folder root;

    public FileSystemManager() {
        this.root = new Folder("root");
    }

    public void parseInput(String input) {
        String[] parts = input.split("/");
        Folder currentFolder = root;

        for (int i = 1; i < parts.length - 1; i++) {
            String name = parts[i];
            Folder folder = currentFolder.getOrCreateFolder(name);
            currentFolder = folder;
        }

        String fileName = parts[parts.length - 1];
        currentFolder.addFile(new File(fileName));
    }

    public void printFileSystem() {
        StringBuilder sb = new StringBuilder();
        sb.append("root\n");
        for (Folder subfolder : root.getFolders()) {
            printFolder(subfolder, 1, sb);
        }
        System.out.print(sb.toString());
    }

    private void printFolder(Folder folder, int depth, StringBuilder sb) {
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append(folder.getName()).append("\n");
        for (Folder subfolder : folder.getFolders()) {
            printFolder(subfolder, depth + 1, sb);
        }
        for (File file : folder.getFiles()) {
            for (int i = 0; i < depth + 1; i++) {
                sb.append("  ");
            }
            sb.append(file.getName()).append("\n");
        }
    }

    public Folder getRoot() {
        return root;
    }
}
