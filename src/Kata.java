import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jeffreydorney on 8/12/16.
 */
public class Kata {

    //
    // ARRAYLIST KATAS
    //

    public static boolean firstLast6(ArrayList<Integer> numbers) {

        // checks to see that either the first or last number are equal to zero
        if( (numbers.get(0) == 6) || (numbers.get(numbers.size()-1) == 6) ) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean sameFirstLast(ArrayList<Integer> numbers) {

        // checks to see if the array size is bigger than 1 and the first and last are equal
        if( (numbers.size() > 1) && (numbers.get(0) == numbers.get(numbers.size()-1)) ) {
            return true;

        } else {
            return false;
        }
    }

    public static ArrayList rotateLeft3(ArrayList<Integer> numbers) {

        // created a new array which gets assigned shifted one over from the original array
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(numbers.get(1));
        newNumbers.add(numbers.get(2));
        newNumbers.add(numbers.get(0));
        return newNumbers;

    }

    public static ArrayList reverse3(ArrayList<Integer> numbers) {

        // created a new array which reverses the order of the original
        ArrayList<Integer> reverse3Nums = new ArrayList<>();
        reverse3Nums.add(numbers.get(2));
        reverse3Nums.add(numbers.get(1));
        reverse3Nums.add(numbers.get(0));
        return reverse3Nums;

    }

    public static int sumFirstPenultimate(ArrayList<Integer> numbers) {

        // checks to see if the array size is zero
        if(numbers.size() == 0) {
            return 0;

            // checks to see if the array size is less than two numbers
        } else if(numbers.size() < 2) {
            return numbers.get(0) + numbers.get(1);

        } else {
            // returns the first number and the second from last number added together
            return numbers.get(0) + numbers.get(numbers.size() - 2);
        }
    }

    //
    // HASHMAP KATAS
    //

    public static HashMap<String, String> mapBully(HashMap<String, String> data) {

        // created new hashmap in mapBully method to assign values
        HashMap<String, String> newData = new HashMap<>();

        // assigns all the data from 'data' into 'newData' (thx ggl)
        newData.putAll(data);

        // hashmap b takes value from hashmap a
        newData.put("b", newData.get("a"));

        // enters null value for a after it is "taken"
        newData.put("a", "");

        // returns the new hashmap
        return newData;
    }

    public static HashMap<String, String> mapShare(HashMap<String, String> data) {

        // created new hashmap newData to hold the newData (smHASHing idea!)
        HashMap<String, String> newData = new HashMap<>();
        newData.putAll(data);

        // checks for value C and removes if present
        if(newData.containsKey("c")) {
            newData.remove("c");
        }

        // checks for value A and assigns to B if present
        if(newData.containsKey("a")) {
            newData.put("b", newData.get("a"));
            return newData;

        } else {
            return newData;
        }
    }

    public static HashMap<String, String> mapAB(HashMap<String, String> data) {

        // created new hashmap and sets to input data
        HashMap<String, String> newData = new HashMap<>();
        newData.putAll(data);

        // checks to see if both are present and returns that new map
        if (newData.containsKey("a") && newData.containsKey("b")) {
            newData.put("ab", (newData.get("a") + newData.get("b")));
            return newData;
        } else {
            return newData;
        }
    }

    public static HashMap<String, Integer> wordLen(ArrayList<String> data) {
        HashMap<String, Integer> newData = new HashMap<>();
        String wordToCount;
        int wordSize;

        for(String wordy : data) {
            wordToCount = wordy;
            wordSize = wordToCount.length();
            newData.put(wordToCount, wordSize);
        }
        return newData;
    }

    public static HashMap<String, String> indexWords(ArrayList<String> data) {
        HashMap<String, String> newData = new HashMap<>();
        String wordToOrder;
        String firstChar;

        if(data.size() == 0) {
            return newData;
        } else {

            for (int x = 0; x < data.size(); x++) {
                wordToOrder = data.get(x);
                firstChar = wordToOrder.substring(0, 1);
                newData.put(firstChar, wordToOrder);
            }
            return newData;
        }
    }
}
