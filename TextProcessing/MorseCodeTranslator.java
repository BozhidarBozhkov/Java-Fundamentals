import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Character> morse = new HashMap<>();
        morse.put(".-", 'A');
        morse.put("-...", 'B');
        morse.put("-.-.", 'C');
        morse.put("-..", 'D');
        morse.put(".", 'E');
        morse.put("..-.", 'F');
        morse.put("--.", 'G');
        morse.put("....", 'H');
        morse.put("..", 'I');
        morse.put(".---", 'J');
        morse.put("-.-", 'K');
        morse.put(".-..", 'L');
        morse.put("--", 'M');
        morse.put("-.", 'N');
        morse.put("---", 'O');
        morse.put(".--.", 'P');
        morse.put("--.-", 'Q');
        morse.put(".-.", 'R');
        morse.put("...", 'S');
        morse.put("-", 'T');
        morse.put("..-", 'U');
        morse.put("...-", 'V');
        morse.put(".--", 'W');
        morse.put("-..-", 'X');
        morse.put("-.--", 'Y');
        morse.put("--..", 'Z');

        String line = scanner.nextLine();

        StringBuilder output = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '|'){
                output.append(" ");
            } else if (line.charAt(i) == ' '){
                if (letter.length() == 0){
                    continue;
                }
                output.append(morse.get(String.valueOf(letter)));
                letter.setLength(0);
            } else {
                letter.append(line.charAt(i));
            }
        }
        if (letter.length() > 0){
            output.append(morse.get(String.valueOf(letter)));
        }
        System.out.println(output);

    }

}
