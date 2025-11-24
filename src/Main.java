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

            if (temp.size() > output.size()) {                  // Câu lệnh rẽ nhánh = 1
                output.clear();
                output.addAll(temp);
            }
            temp.clear();                                       // Câu lệnh = 1
        }

        for (Character character : output) {                    // Vòng lặp = 1
            System.out.print(character);
        }

        System.out.println();                                   // Câu lệnh = 1
    }
}

/*
        ĐỘ PHỨC TẠP CỦA BÀI TOÁN
    T(n) = n(n - 1) + 1 + 1 + 1 +1
    T(n) = n^2 - n +4
    T(n) = O(n^2) - O(n)
    T(n) = O(n^2)
 */
