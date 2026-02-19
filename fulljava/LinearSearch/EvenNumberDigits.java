package LinearSearch;

public class EvenNumberDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    // Function to count numbers having even number of digits
    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;   // return after loop finishes
    }

    // Function to check if a number has even digits
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    // Function to count digits of a number
    static int digits(int num) {

        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num = num * -1;  // handle negative numbers
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
 