package Unit4_InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for(String url: this.urls) {
            boolean isInvalidUrl = false;
            for (Character symbol: url.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    isInvalidUrl = true;
                    break;
                }
            }
            if (isInvalidUrl) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for(String number: this.numbers) {
            boolean isInvalidNumber = false;
            for (Character symbol: number.toCharArray()) {
                if (!Character.isDigit(symbol)) {
                    isInvalidNumber = true;
                    break;
                }
            }
            if (isInvalidNumber) {
                sb.append("Invalid number!").append(System.lineSeparator());
            } else {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }
}
