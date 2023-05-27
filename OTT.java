import java.util.Random;
public class OTT {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(4);
        while (result == 0) {
            result = random.nextInt(4);
        }
        String r = "";
        if (result == 1) {
            r = "Bua";
        } else if (result == 2) {
            r = "Keo";
        } else if (result == 3) {
            r = "Bao";
        }
        System.out.println(r);
    }
}
