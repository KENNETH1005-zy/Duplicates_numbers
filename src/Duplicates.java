import java.util.*;

class Duplicates {
    public static ArrayList <Integer> findDuplicates(int arr[]) {
        int ArraySize = arr.length;
        ArrayList <Integer> duplicates = new ArrayList <Integer> ();
        for (int i = 0; i < ArraySize; i ++) {
            for (int j = i + 1; j < ArraySize;j++) {
                if (i != j && arr[i] == arr[j])
                    duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
    public static void main(String args[]) {
        int arr[] = {
                7,
                5,
                4,
                3,
                5,
                11,
                7,
                11,
                3,
                11
        };
        ArrayList < Integer > dupes = findDuplicates(arr);
        System.out.println("Duplicates in " + Arrays.toString(arr) + " are " + dupes);

        int arr1[] = {
                6,
                5,
                17,
                17
        };
        dupes = findDuplicates(arr1);
        System.out.println("Duplicates in " + Arrays.toString(arr1) + " are " + dupes);
    }

}
