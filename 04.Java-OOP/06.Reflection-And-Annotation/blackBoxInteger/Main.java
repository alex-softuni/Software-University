package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        BlackBoxInt blackBoxInt = null;

        try {
            Constructor<BlackBoxInt> ctor =
                    clazz.getDeclaredConstructor(int.class);
            ctor.setAccessible(true);
            blackBoxInt = ctor.newInstance(0);
        } catch (InstantiationException
                | IllegalAccessException
                | InvocationTargetException
                | NoSuchMethodException e) {
            e.printStackTrace();
        }

        String line = scanner.nextLine();
        while (!line.equals("END")) {

            String[] tokens = line.split("_");
            String methodName = tokens[0];
            int param = Integer.parseInt(tokens[1]);

            try {
                Method method = clazz.getDeclaredMethod(methodName, int.class);
                method.setAccessible(true);
                method.invoke(blackBoxInt, param);

                Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);
                System.out.println(field.get(blackBoxInt));
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            line = scanner.nextLine();
        }
    }
}