import java.util.ArrayList;
import java.util.Scanner;

public class ReverseLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        // Read all lines
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        // Print lines in reverse order
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        scanner.close();
    }
}
