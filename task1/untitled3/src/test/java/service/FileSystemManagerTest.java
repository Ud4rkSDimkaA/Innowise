package service;

import org.example.model.File;
import org.example.model.Folder;
import org.example.service.FileSystemManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FileSystemManagerTest {

    /*private FileSystemManager fileSystemManager;

    @BeforeEach
    void setUp(){
        fileSystemManager = new FileSystemManager();
    }

    @Test
    public void testGettingRoot(){
        Folder root = fileSystemManager.getRoot();
        assertEquals("root", root.getName());
    }
    @Test
    public void testParseInput() {
        fileSystemManager.parseInput("root/folder1/folder2/test.txt");

        Folder root = fileSystemManager.getRoot();

        assertEquals(1, root.getFolders().size());
        assertEquals(1, root.getOrCreateFolder("folder1").getFolders().size());
        assertEquals(1, root.getOrCreateFolder("folder1").getOrCreateFolder("folder2").getFiles().size());
    }

    @Test
    public void testPrintFileSystem() {
        fileSystemManager.parseInput("root/folder1/folder2/test.txt");
        fileSystemManager.parseInput("root/folder1/folder3/image.txt");
        fileSystemManager.parseInput("root/folder4/file.txt");
        fileSystemManager.printFileSystem();
    }

    @Test
    public void testFolderMethods() {
        Folder folder = new Folder("test");
        assertEquals("test", folder.getName());

        Folder subfolder = folder.getOrCreateFolder("subfolder");
        assertEquals("subfolder", subfolder.getName());
        assertEquals(1, folder.getFolders().size());
        assertSame(subfolder, folder.getFolders().get(0));

        File file = new File("file.txt");
        folder.addFile(file);
        assertEquals(1, folder.getFiles().size());
        assertSame(file, folder.getFiles().get(0));
    }

    @Test
    public void testFileMethods() {
        File file = new File("file.txt");
        assertEquals("file.txt", file.getName());
    }*/
}
