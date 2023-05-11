import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String arr[] = {"ab", "ac", "ab", "bc", "dc", "dc", "am", "ab", "dc"};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[i].equals(arr[j])) {
                    arr[j] = null;
                }
            }
            if (arr[i] != null) {
                String string = arr[i];
                System.out.print(string);
            }
        }
    }
}
