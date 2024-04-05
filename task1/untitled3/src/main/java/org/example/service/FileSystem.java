package org.example.service;

import org.example.model.File;
import org.example.model.FileSystemElement;
import org.example.model.Folder;

public class FileSystem {
    private Folder root;

    public FileSystem() {
        this.root = new Folder("root");
    }

    public void buildFileSystem(String input) {
        String[] paths = input.split("/");
        Folder currentFolder = root;

        for (String path : paths) {
            if (path.contains(".")) {
                File file = new File(path);
                currentFolder.addElement(file);
            } else {
                Folder folder = findFolder(currentFolder, path);
                if (folder == null) {
                    folder = new Folder(path);
                    currentFolder.addElement(folder);
                }
                currentFolder = folder;
            }
        }
    }

    private Folder findFolder(Folder folder, String name) {
        for (FileSystemElement element : folder.getElements()) {
            if (element instanceof Folder && element.getName().equals(name)) {
                return (Folder) element;
            }
        }
        return null;
    }

    public Folder getRoot() {
        return root;
    }
}
