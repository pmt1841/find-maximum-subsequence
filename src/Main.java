import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> output = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {              // Vòng lặp ngoài = n
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(input.charAt(i));

            for (int j = i + 1; j < input.length(); j++) {      // Vòng lặp trong = n-1
                if (input.charAt(j) > temp.getLast()) {
                    temp.add(input.charAt(j));
                }
            }

            if (temp.size() > output.size()) {
                output.clear();
                output.addAll(temp);
            }
            temp.clear();
        }

        for (Character character : output) {                    // Vòng lặp = n
            System.out.print(character);
        }

        System.out.println();
    }
}

/*
        ĐỘ PHỨC TẠP CỦA BÀI TOÁN
    T(n) = n(n - 1) + n
    T(n) = n^2 - n + n
    T(n) = O(n^2)
 */
