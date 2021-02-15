import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\\\");

        String data = array[array.length - 1];

        String[] fileInfo = data.split("\\.");

        String fileName = fileInfo[0];
        String fileExtension = fileInfo[1];

        System.out.printf("File name: %s%n" +
                "File extension: %s", fileName, fileExtension);

    }
}
