package Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = getList(scanner);
        List<String> sites = getList(scanner);
        Smartphone smartphone = new Smartphone(numbers, sites);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }

    private static List<String> getList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
    }
}
