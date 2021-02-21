package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleInfo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Point2D bottomLeft = new Point2D(rectangleInfo[0], rectangleInfo[1]);
        Point2D topRight = new Point2D(rectangleInfo[2], rectangleInfo[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            Point2D compareCoordinates = new Point2D(coordinates[0], coordinates[1]);
            System.out.println(rectangle.contains(compareCoordinates));

        }
    }
}
