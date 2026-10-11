import java.util.Arrays;

public class MergeSort {

    public static void merge_sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        int[] left_part = Arrays.copyOfRange(array, 0, middle);
        int[] right_part = Arrays.copyOfRange(array, middle, array.length);

        merge_sort(left_part);
        merge_sort(right_part);
        merge(array, left_part, right_part);
    }

    private static void merge(int[] array, int[] left_part, int[] right_part) {
        int left_index = 0;
        int right_index = 0;
        int result_index = 0;

        while (left_index < left_part.length && right_index < right_part.length) {
            if (left_part[left_index] <= right_part[right_index]) {
                array[result_index++] = left_part[left_index++];
            } else {
                array[result_index++] = right_part[right_index++];
            }
        }
        while (left_index < left_part.length) {
            array[result_index++] = left_part[left_index++];
        }
        while (right_index < right_part.length) {
            array[result_index++] = right_part[right_index++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        merge_sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}