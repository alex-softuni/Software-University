import java.io.*;

public class GetFolderSize {
    private static final String DIR_PATH = "C:\\Users\\REBEL\\IdeaProjects\\03.Java-Advanced\\STREAMS-FILES-AND-DIRECTORIES-EXERCISES\\Exercises Resources";
    private static final String OUTPUT_PATH = "output.txt";

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(OUTPUT_PATH);

        File folder = new File(DIR_PATH);

        int bytesSum = 0;
        long test = folder.length();
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                bytesSum += file.length();
            }
        }
        writer.println("Folder size: " + bytesSum);
        writer.flush();

    }
}
