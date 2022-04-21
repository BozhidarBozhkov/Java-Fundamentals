import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int firstCard = firstDeck.get(firstDeck.size() - 1);
            int secondCard = secondDeck.get(secondDeck.size() - 1);

            if (firstCard > secondCard) {
                firstDeck.add(0, firstCard);
                firstDeck.add(0, secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(0, secondCard);
                secondDeck.add(0, firstCard);
            }
            firstDeck.remove(firstDeck.size() - 1);
            secondDeck.remove(secondDeck.size() - 1);
        }

//        for (int i = 0; i < firstDeck.size(); i++) {
//            for (int j = 0; j < secondDeck.size(); j++) {
//                if (secondDeck.size() < 1 || firstDeck.size() < 1){
//                    break;
//                }
//                i = 0;
//                j = 0;
//                if (firstDeck.get(i) > secondDeck.get(j)){
//                    firstDeck.add(firstDeck.get(i));
//                    firstDeck.remove(firstDeck.get(i));
//                    firstDeck.add(secondDeck.get(j));
//                    secondDeck.remove(secondDeck.get(j));
//                    break;
//                } else if (firstDeck.get(i) < secondDeck.get(j)) {
//                    //j = 0;
//                    secondDeck.add(secondDeck.get(j));
//                    secondDeck.remove(secondDeck.get(j));
//                    secondDeck.add(firstDeck.get(i));
//                    firstDeck.remove(firstDeck.get(i));
//                    break;
//
//                } else if (firstDeck.get(i).equals(secondDeck.get(i))){
//                    firstDeck.remove(firstDeck.get(i));
//                    secondDeck.remove(secondDeck.get(i));
//                }
//            }
//        }
        int sum = 0;
        if (firstDeck.size() > secondDeck.size()) {
            for (Integer number : firstDeck) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer number : secondDeck) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
