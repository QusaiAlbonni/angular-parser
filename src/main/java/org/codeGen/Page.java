package org.codeGen;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {
    private String pageName;
    private FileWriter writer;
    private File file;

    public Page(String pageName) {
        this.pageName = pageName;
        try {
            File folder = new File("output");
            if (!folder.exists()) folder.mkdirs();

            file = new File(folder, pageName);
            if (file.exists()) file.delete();
            file.createNewFile();

            writer = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Error creating page file: " + e.getMessage());
        }
    }

    public void write(String code) {
        try {
            writer.write(code);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFilePath() {
        return file.getAbsolutePath();
    }
}
