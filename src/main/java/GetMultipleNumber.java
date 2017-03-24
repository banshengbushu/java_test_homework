import java.util.Arrays;

@SuppressWarnings("Since15")
public class GetMultipleNumber {
    public int[] eight_multiple_number(int array_a[]) {
        int[] array_b = Arrays.copyOfRange(array_a, 0, array_a.length);
        int[] newArray = new int[array_b.length];
        for (int i = 0; i < array_b.length; i++) {
            newArray[i] = (array_b[i] + 0x7) & ~0x7;
        }
        return newArray;
    }
}
