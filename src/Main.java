import java.util.ArrayList;

/**
 * Created by jeffreydorney on 8/12/16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\nCollection Katas (Java)");
        System.out.println("\nArrayList Kata Problems\n************************");

        //
        // ARRAYLIST EXAMPLES
        //

        boolean result; // initial declaration of result
        ArrayList<Integer> numbers = new ArrayList<>(); // initial numbers array
        ArrayList<Integer> numbersOutput = new ArrayList<>(); // initial numbersOutput array

        // first time values are added
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);

        // runs the firstLast6 kata
        result = Kata.firstLast6(numbers);

        // prints the method and result
        System.out.printf("Kata.firstLast6(%s) -> %s\n", numbers, result);

        // sets numbers back to an empty array
        numbers = new ArrayList<>();

        // adds values back into numbers
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // runs the firstLast6 kata
        result = Kata.firstLast6(numbers);

        // prints the method and result
        System.out.printf("Kata.firstLast6(%s) -> %s\n", numbers, result);

        // sets numbers back to an empty array etc
        numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        result = Kata.firstLast6(numbers);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", numbers, result);
        System.out.println(""); // new line

        // first sameFirstLast example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        result = Kata.sameFirstLast(numbers);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", numbers, result);

        // second example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        result = Kata.sameFirstLast(numbers);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", numbers, result);

        // third example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        result = Kata.sameFirstLast(numbers);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", numbers, result);
        System.out.println(""); // new line

        // first rotate3 example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbersOutput = Kata.rotateLeft3(numbers);
        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", numbers, numbersOutput);

        // second rotate3 example
        numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(11);
        numbers.add(9);
        numbersOutput = Kata.rotateLeft3(numbers);
        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", numbers, numbersOutput);

        // third rotate3 example
        numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(0);
        numbers.add(0);
        numbersOutput = Kata.rotateLeft3(numbers);
        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", numbers, numbersOutput);
        System.out.println(""); // new line

        // first reverse3 example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbersOutput = Kata.reverse3(numbers);
        System.out.printf("Kata.reverse3(%s) -> %s\n", numbers, numbersOutput);

        // second reverse3 example
        numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(11);
        numbers.add(9);
        numbersOutput = Kata.reverse3(numbers);
        System.out.printf("Kata.reverse3(%s) -> %s\n", numbers, numbersOutput);

        // third reverse3 example
        numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(0);
        numbers.add(0);
        numbersOutput = Kata.reverse3(numbers);
        System.out.printf("Kata.reverse3(%s) -> %s\n", numbers, numbersOutput);
        System.out.println(""); // new line

        // first sumFirstPenultimate example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int resultInt = Kata.sumFirstPenultimate(numbers);
        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", numbers, resultInt);

        // second sumFirstPenultimate example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        resultInt = Kata.sumFirstPenultimate(numbers);
        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", numbers, resultInt);

        // third sumFirstPenultimate example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        resultInt = Kata.sumFirstPenultimate(numbers);
        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", numbers, resultInt);

        // forth sumFirstPenultimate example
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        resultInt = Kata.sumFirstPenultimate(numbers);
        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", numbers, resultInt);
        System.out.println(""); // new line

        //
        // HASHMAP EXAMPLES
        //

        System.out.println("\nHashMap Kata Problems\n************************");



/*
        System.out.println(Kata.firstLast6([1, 2, 3]));
        System.out.println(String.valueOf(numbers));
*/
    }


}
