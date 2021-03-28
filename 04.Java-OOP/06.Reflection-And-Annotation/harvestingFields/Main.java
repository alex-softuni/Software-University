package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2 - Private
        // 1 - Public
        // 4 - Protected

        String line = scanner.nextLine();
        while (!line.equals("HARVEST")) {
            Field[] declaredFields = RichSoilLand.class.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                String modifierName = Modifier.toString(declaredField.getModifiers());
                if (line.equals(modifierName)) {
                    System.out.printf("%s %s %s%n",
                            modifierName,
                            declaredField.getType().getSimpleName(),
                            declaredField.getName());
                }
            }
            if (line.equals("all")) {
                for (Field declaredField : declaredFields) {
                    String modifierName = Modifier.toString(declaredField.getModifiers());
                    System.out.printf("%s %s %s%n",
                            modifierName,
                            declaredField.getType().getSimpleName(),
                            declaredField.getName());
                }
            }
            line = scanner.nextLine();
        }
    }
}
