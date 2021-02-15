package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            String typeList = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song();
            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            list.add(song);
        }


        String type = scanner.nextLine();
        if (type.equals("Type List")) {
            for (Song song : list) {
                System.out.println(song.getTypeList());
            }
        } else if (type.equals("all")) {
            for (Song song : list) {
                System.out.println(song.getName());
            }
        }
        List<Song> filterSong = list.stream()
                .filter(e -> e.getTypeList().equals(type))
                .collect(Collectors.toList());

        for (Song song : filterSong) {
            System.out.println(song.getName());
        }
    }
}