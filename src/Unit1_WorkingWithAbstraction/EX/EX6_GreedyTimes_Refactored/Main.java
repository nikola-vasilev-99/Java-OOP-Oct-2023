package Unit1_WorkingWithAbstraction.EX.EX6_GreedyTimes_Refactored;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        Map <String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < items.length; i += 2) {
            String wealth = items[i];
            long amount = Long.parseLong(items[i + 1]);

            String wealthType = "";

            if (wealth.length() == 3) {
                wealthType = "Cash";
            } else if (wealth.toLowerCase().endsWith("gem")) {
                wealthType = "Gem";
            } else if (wealth.toLowerCase().equals("gold")) {
                wealthType = "Gold";
            }

            if (wealthType.equals("") || (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amount)) {
                continue;
            }

            switch (wealthType) {
                case "Gem":
                    if (!bag.containsKey(wealthType)) {
                        if (bag.containsKey("Gold")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(wealthType).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(wealthType)) {
                        if (bag.containsKey("Gem")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(wealthType).values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(wealthType)) {
                bag.put((wealthType), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(wealthType).containsKey(wealth)) {
                bag.get(wealthType).put(wealth, 0L);
            }

            bag.get(wealthType).put(wealth, bag.get(wealthType).get(wealth) + amount);
        }

        for (var currentWealthType : bag.entrySet()) {
            Long sumValues = currentWealthType.getValue().values().stream().mapToLong(l -> l).sum();
            System.out.println(String.format("<%s> $%s", currentWealthType.getKey(), sumValues));
            currentWealthType.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey()
                    .compareTo(e1.getKey())).forEach(i ->
                    System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}
