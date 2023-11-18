import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "marius are mere";
        System.out.println("Original string: " + str);
        System.out.println("Capitalized string: " + Arrays.toString(capitalize(str)));

        System.out.println("_____________________________________________________________");

        int[] arr = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        System.out.println("The most frequent number in the array is " + mostFrequentItemOfArray(arr));
    }

    public static String[] capitalize(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(Character.toUpperCase(s.charAt(i)));
                odd.append(s.charAt(i));
            } else {
                even.append(s.charAt(i));
                odd.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return new String[]{even.toString(), odd.toString()};

    }
    public static int mostFrequentItemOfArray(int[] collection) {
        int count = 0;
        int max = 0;
        int mostFrequent = 0;
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection.length; j++) {
                if (collection[i] == collection[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mostFrequent = collection[i];
            }
            count = 0;
        }
        return mostFrequent;
    }
}