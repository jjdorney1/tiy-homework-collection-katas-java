import java.util.ArrayList;

/**
 * Created by jeffreydorney on 8/12/16.
 */
public class Kata {

    public static boolean firstLast6(ArrayList<Integer> numbers) {
        if( (numbers.get(0) == 6) || (numbers.get(numbers.size()-1) == 6) ) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean sameFirstLast(ArrayList<Integer> numbers) {
        if( (numbers.size() > 1) && (numbers.get(0) == numbers.get(numbers.size()-1)) ) {
            return true;

        } else {
            return false;
        }
    }

    public static ArrayList rotateLeft3(ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(numbers.get(1));
        newNumbers.add(numbers.get(2));
        newNumbers.add(numbers.get(0));
        return newNumbers;

    }

}
