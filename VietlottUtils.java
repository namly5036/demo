// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class VietlottUtils {
    public static void main(String[] args) {
        System.out.println("645 = " + mega645() + "\n");
        System.out.println("655 = " + mega655());
    }

    private static List<String> mega645() {
        return gen(45);
    }

    private static List<String> mega655() {
        return gen(55);
    }

    private static List<String> gen(int bound) {
        Set<String> set = new HashSet<>();;
        Random r = new Random();
        while (set.size() < 6) {
            int number = r.nextInt(bound + 1);
            String numberStr;
            numberStr = String.valueOf(number);
            if (number == 0) {
                continue;
            }
            if (number < 10) {
                numberStr = "0" + numberStr;
            }
            set.add(numberStr);
        }
        return set.stream().sorted().collect(Collectors.toList());
    }
}

