import java.util.Arrays;

class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 5, 9, 6};

        // sorting
        Arrays.sort(arr); // {2, 3, 5, 6, 8, 9}

        // searching
        int pos = Arrays.binarySearch(arr, 6);
        System.out.println("Index: " + pos);

        // filling array with single value
        String[] attendence = new String[20];
        Arrays.fill(attendence, "Absent");
        attendence[3] = "John";

        // copying array
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        // equating two arrays
        System.out.println(Arrays.equals(arr, arr2)); // true

        // converting into string from array
        System.out.println(Arrays.toString(attendence));
    }
}