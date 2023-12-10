package Unit7_Reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

		Map<String, List<Field>> fieldsMap = getMap();

        Consumer<Field> fieldPrinter = field -> System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(), field.getName());

        while (!input.equals("HARVEST")) {
            switch (input) {
                case "private":
					fieldsMap.get("private").forEach(field -> fieldPrinter.accept(field));
                    break;
                case "protected":
					fieldsMap.get("protected").forEach(field -> fieldPrinter.accept(field));
                    break;
                case "public":
					fieldsMap.get("public").forEach(field -> fieldPrinter.accept(field));
                    break;
                case "all":
					fieldsMap.get("all").forEach(field -> fieldPrinter.accept(field));
                    break;
            }
            input = scanner.nextLine();
        }
    }
    private static Map<String, List<Field>> getMap() {
        Map<String, List<Field>> map = new HashMap<>();
        map.put("public", new ArrayList<>());
        map.put("private", new ArrayList<>());
        map.put("protected", new ArrayList<>());
        map.put("all", new ArrayList<>());
        List<Field> listOfFields = Arrays.asList(RichSoilLand.class.getDeclaredFields());

        listOfFields.forEach(field -> {
            String currentModifier = Modifier.toString(field.getModifiers());
            map.get(currentModifier).add(field);
            map.get("all").add(field);
        });
        return map;
    }
}
