import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            int amount = scanner.nextInt();
            String[] data = scanner.next().split(" ");
            String material = data[0].toLowerCase();
            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                if (keyMaterials.containsKey(material)) {
                    int currentValue = keyMaterials.get(material);
                    keyMaterials.put(material, currentValue + amount);
                } else {
                    keyMaterials.put(material, amount);
                }
            } else {
                if (junk.containsKey(material)) {
                    int currentValue = junk.get(material);
                    junk.put(material, currentValue + amount);
                } else {
                    junk.put(material, amount);
                }
            }
            if (keyMaterials.get("shards") >= 250) {
                System.out.println("Shadowmourne obtained!");
                int total = keyMaterials.get("shards");
                keyMaterials.put("shards", total - 250);
                isObtained = true;
                break;
            } else if (keyMaterials.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                int total = keyMaterials.get("fragments");
                keyMaterials.put("fragments", total - 250);
                isObtained = true;
                break;
            } else if (keyMaterials.get("motes") >= 250) {
                System.out.println("Dragonwrath obtained!");
                int total = keyMaterials.get("motes");
                keyMaterials.put("motes", total - 250);
                isObtained = true;
                break;
            }
        }
        keyMaterials.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int res = e2.getValue().compareTo(e1.getValue());
                    if (res == 0) {
                        res = e1.getKey().compareTo(e2.getKey());
                    }
                    return res;
                }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junk.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
