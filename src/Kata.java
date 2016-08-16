import java.util.ArrayList;

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

    //public static
}
