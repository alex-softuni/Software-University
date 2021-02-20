package ConditionalStatements.lab.excercises.Lab;


import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();

        if(figureType.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double squareArea = a * a;
            System.out.printf("%.3f",squareArea);
        }
        if(figureType.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double rectangleArea = a * b;
            System.out.printf("%.3f",rectangleArea);
        }
        if(figureType.equals("circle")){
            double a = Double.parseDouble(scanner.nextLine());
            double circleArea = (a * Math.PI) * a;
            System.out.printf("%.3f",circleArea);
        }
        if(figureType.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double triangleArea = (a * b)/2;
            System.out.printf("%.3f",triangleArea);
        }
    }
}
