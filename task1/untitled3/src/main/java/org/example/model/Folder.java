package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> folders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Folder getOrCreateFolder(String name) {
        for (Folder folder : folders) {
            if (folder.getName().equals(name)) {
                return folder;
            }
        }
        Folder newFolder = new Folder(name);
        folders.add(newFolder);
        return newFolder;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public List<File> getFiles() {
        return files;
    }
}
