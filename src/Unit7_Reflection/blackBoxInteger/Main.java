package Unit7_Reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // това в <> скоби се нарича generic и го използваме, за да покажем от какъв тип ни е класа и конструктора
        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        //достъпване на конструктора
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();

        //за да направим конструктора достъпен и си гарантираме, че е достъпен
        constructor.setAccessible(true);

        //създаване на нов обект (инстанция)
        BlackBoxInt blackBoxInt = constructor.newInstance();

        // достъпване на полето innerValue, тъй като след това ще ни трябва при принтиранията
        Field innerValue = clazz.getDeclaredField("innerValue");

        while (!input.equals("END")) {
            String commandName = input.split("_")[0];
            int number = Integer.parseInt(input.split("_")[1]);

            switch (commandName) {
                case "add":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "add");
                    break;
                case "subtract":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "subtract");
                    break;
                case "divide":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "divide");
                    break;
                case "multiply":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "multiply");
                    break;
                case "rightShift":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "rightShift");
                    break;
                case "leftShift":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "leftShift");
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void executeCommand(Class<BlackBoxInt> clazz, BlackBoxInt blackBoxInt, Field innerValue, int number, String command) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // съхраняване на всички методи от класа в List
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        //създаване на нов празен метод
        Method currentMethod = null;
        //от този лист си вадим метода, който ни трябва в момента
        for (Method method : methods) {
            if (method.getName().equals(command)) {
                currentMethod = method;
                break;
            }
        }
        // правим метда достъпен - задължетелно. В противен случай ще хвърли ексепшън
        currentMethod.setAccessible(true);
        // извикваме метода и подаваме обекта, върху който искаме да го изпълним,заедно с аргумента
        currentMethod.invoke(blackBoxInt, number);
        // правим полето достъпно - задължетелно. В противен случай ще хвърли ексепшън
        innerValue.setAccessible(true);
        //вземи ми стойността на полето innerValue от обекта blackBoxInt
        System.out.println(innerValue.get(blackBoxInt));
    }
}
