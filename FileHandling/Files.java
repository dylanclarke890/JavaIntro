package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
  public Files() {
    BasicExamples();
  }

  private void BasicExamples() {
    new CreateFile();
    new WriteToFile();
    new ReadFile();
    new DeleteFile();
  }

  class CreateFile {
    public CreateFile() {
      BasicExample();
    }

    private void BasicExample() {
      try {
        File file = new File("filename.txt");
        if (file.createNewFile()) {
          System.out.println("File created: " + file.getName());
        } else {
          System.out.println("File already exists.");
        }
      }
      catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }

  class WriteToFile {
    public WriteToFile() {
      BasicExample();
    }

    private void BasicExample() {
      try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } 
      catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }

  class ReadFile {
    public ReadFile() {
      BasicExample();
      GetFileInfo();
    }

    private void BasicExample() {
      try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } 
      catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

    private void GetFileInfo() {
      File file = new File("filename.txt");
      if (file.exists()) {
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writeable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
        System.out.println("File size in bytes: " + file.length());
      } else {
        System.out.println("The file does not exist.");
      }
    }
  }

  class DeleteFile {
    public DeleteFile() {
      BasicExample();
    }
    
    private void BasicExample() {
      File file = new File("filename.txt"); 
      if (file.delete()) { 
        System.out.println("Deleted the file: " + file.getName());
      } else {
        System.out.println("Failed to delete the file.");
      } 
    }
  }
}
