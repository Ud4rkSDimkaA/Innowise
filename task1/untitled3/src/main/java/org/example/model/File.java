package org.example.model;

public class File implements FileSystemElement {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
