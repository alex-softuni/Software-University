package com.company;

import java.util.*;

public class ShootTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = "";
        int counter = 0;

        while (!(command = scanner.nextLine()).equals("End")) {

            int indexTarget = Integer.parseInt(command);

            if (indexTarget >= 0 && indexTarget < targets.length) {
                for (int i = 0; i < targets.length; i++) {
                    int temp = targets[indexTarget];

                    if (targets[i] != -1 && i != indexTarget) {
                        if (targets[i] > temp) {
                            targets[i] -= temp;
                        } else if (targets[i] <= temp) {
                            targets[i] += temp;

                        }
                    }
                }
                targets[indexTarget] = -1;
                counter++;
            }
        }

        System.out.print(String.format("Shot targets: %1$s -> ", counter));
        for (int target : targets) {
            System.out.print(target + " ");
        }

    }
}

