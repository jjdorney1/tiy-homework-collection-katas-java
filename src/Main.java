import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffreydorney on 8/12/16.
 */
public class Main {
    public static void main(String[] args) {

        // desired output form for arraylists for easier copying:
/*
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(1);
        boolean result = Kata.sameFirstLast(ints)

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, result);
*/
        // desired output form for hashmaps for easier copying:
/*
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "dirt");
        data.put("a", "candy");
        boolean result = Kata.mapBully(data)

        System.out.printf("Kata.mapBully(%s) -> %s\n", data, result);
*/


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
        System.out.println("");

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

        // declared new hashmap data
        HashMap<String, String> data = new HashMap<>();

        // entered hashmap data into the data variable
        data.put("b", "dirt");
        data.put("a", "candy");

        // created a resulting hashmap for the output
        HashMap<String, String> resultHashMap = Kata.mapBully(data);

        // printed out the result of mapBully
        System.out.printf("Kata.mapBully(%s) -> %s\n", data, resultHashMap);

        // example two for mapBully
        data = new HashMap<>();
        data.put("a", "candy");
        resultHashMap = Kata.mapBully(data);
        System.out.printf("Kata.mapBully(%s) -> %s\n", data, resultHashMap);

        // example three for mapBully
        data = new HashMap<>();
        data.put("c", "meh");
        data.put("b", "carrot");
        data.put("a", "candy");
        resultHashMap = Kata.mapBully(data);
        System.out.printf("Kata.mapBully(%s) -> %s\n", data, resultHashMap);
        System.out.println("");

        // mapshare method example one
        data = new HashMap<>();
        data.put("c", "ccc");
        data.put("b", "bbb");
        data.put("a", "aaa");
        resultHashMap = Kata.mapShare(data);
        System.out.printf("Kata.mapShare(%s) -> %s\n", data, resultHashMap);

        // mapshare method example two
        data = new HashMap<>();
        data.put("c", "ccc");
        data.put("b", "xyz");
        resultHashMap = Kata.mapShare(data);
        System.out.printf("Kata.mapShare(%s) -> %s\n", data, resultHashMap);

        // mapshare method example three
        data = new HashMap<>();
        data.put("d", "hi");
        data.put("c", "meh");
        data.put("a", "aaa");
        resultHashMap = Kata.mapShare(data);
        System.out.printf("Kata.mapShare(%s) -> %s\n", data, resultHashMap);
        System.out.println("");

        // mapAB example one
        data = new HashMap<>();
        data.put("b", "There");
        data.put("a", "Hi");
        resultHashMap = Kata.mapAB(data);
        System.out.printf("Kata.mapAB(%s) -> %s\n", data, resultHashMap);

        // mapAB example two
        data = new HashMap<>();
        data.put("a", "Hi");
        resultHashMap = Kata.mapAB(data);
        System.out.printf("Kata.mapAB(%s) -> %s\n", data, resultHashMap);

        // mapAB example three
        data = new HashMap<>();
        data.put("b", "There");
        resultHashMap = Kata.mapAB(data);
        System.out.printf("Kata.mapAB(%s) -> %s\n", data, resultHashMap);
        System.out.println("");

        // wordLen example one
        ArrayList<String> inputData = new ArrayList<>();
        HashMap<String, Integer> answerHashMap = new HashMap<>();
        inputData.add("a");
        inputData.add("bb");
        inputData.add("a");
        inputData.add("bb");
        answerHashMap = Kata.wordLen(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerHashMap);

        // wordLen example two
        inputData = new ArrayList<>();
        inputData.add("this");
        inputData.add("and");
        inputData.add("that");
        inputData.add("and");
        answerHashMap = Kata.wordLen(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerHashMap);

        // wordLen example three
        inputData = new ArrayList<>();
        inputData.add("code");
        inputData.add("code");
        inputData.add("code");
        inputData.add("bug");
        answerHashMap = Kata.wordLen(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerHashMap);
        System.out.println("");

        // indexWords example one
        inputData = new ArrayList<>();
        HashMap<String, String> answerIndex = new HashMap<>();
        inputData.add("aardvark");
        inputData.add("apple");
        inputData.add("zamboni");
        inputData.add("phone");
        answerIndex = Kata.indexWords(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerIndex);

        // indexWords example two
        inputData = new ArrayList<>();
        inputData.add("elephant");
        answerIndex = Kata.indexWords(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerIndex);

        // indexWords example three
        inputData = new ArrayList<>();
        answerIndex = Kata.indexWords(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerIndex);

        // indexWords example four
        inputData = new ArrayList<>();
        inputData.add("");
        answerIndex = Kata.indexWords(inputData);
        System.out.printf("Kata.wordLen(%s) -> %s\n", inputData, answerIndex);


        /*
        System.out.println(Kata.firstLast6([1, 2, 3]));
        System.out.println(String.valueOf(numbers));
        */
    }


}
