import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    private char[] tempCharArray;

    public static void main(String[] args) {
        int[] numArray = {6, 3, 1, 8, 5};
        int[] numArray2 = {1, 9, 1, 3, 7};
        String[] strArray = {"h", "e", "l", "l", "o"};
        String[] array2 = {"a", "b", "c", "d", "e"};
        //   sortNums(numArray);
        // sortString(strArray);
        // sumValues(numArray);
        // averageValue(numArray);
        // valueExists(numArray, 1);
        // removeElement(numArray, 3);
        // copyArray(numArray);
        // insertAt(numArray, 2, 90000);
        // maxNumber(numArray);
        // minNumber(numArray);
        // reverseArray(numArray);
        // checkForDuplicates(numArray);
        // commSetsTwoArrays(strArray, array2);
        commSetsTwoArraysInt(numArray, numArray2);
        secondLargest(numArray);
        secondSmallest(numArray);
        arrayToArrayList(numArray);
    }

    public static void printArraySorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array sorted descending is " + array[i]);

        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array is " + array[i]);

        }
    }


    public static void sortNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }
        printArray(array);
    }

    public static void sortString(String[] array) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        String testString = Arrays.toString(array);
        char tempCharArray[] = testString.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (tempCharArray[i] > tempCharArray[j]) {
                    char temp = tempCharArray[i];
                    tempCharArray[i] = tempCharArray[j];
                    tempCharArray[j] = temp;
                }
            }

        }
        System.out.println("String sorted is:" + Arrays.toString(tempCharArray));
    }

    public static void sumValues(int[] array) {
        int sumof = 0;
        for (int i = 0; i < array.length; i++) {
            sumof += array[i];

        }
        System.out.println("Sum of All values in array: " + sumof);
    }

    public static void averageValue(int[] array) {
        double average = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];

        }
        average = Double.valueOf(temp) / array.length;
        System.out.println("Average of array" + average);
    }

    public static void valueExists(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                System.out.println("Value exists");
            }
        }

    }

    public static void removeElement(int[] array, int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = array[i];
            }

        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }

        System.out.println("After removing the second element: " + Arrays.toString(array));
    }

    public static void copyArray(int[] array) {
        int copyArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];

        }
        System.out.println("Duplicated array: " + Arrays.toString(copyArray));
    }

    public static void insertAt(int[] array, int index, int value) {
        for (int i = index; i < array.length; i++) {
            array[index] = value;
        }
        System.out.println("Inserted and replaced postion: " + index + Arrays.toString(array));

    }

    public static void maxNumber(int[] array) {
        int maxValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }


            }
        }
        maxValue = array[0];
        System.out.println("Maximum value of an array: " + maxValue);

    }

    public static void minNumber(int[] array) {
        int minValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        minValue = array[0];
        System.out.println("Min value of an array: " + minValue);

    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        System.out.println("Array reversed :" + Arrays.toString(array));
    }

    public static void checkForDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element is: " + array[i]);
                }

            }

        }

    }

    public static void checkForDuplicatesString(String[] array) {
        String[] testArray;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println("Duplicate element is : " + array[i]);

                }

            }

        }
    }

    public static void commSetsTwoArrays(String[] array, String[] otherArray) {
        String[] temp = new String[array.length]; // common set
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < otherArray.length; j++) {
                if (array[i].equals(otherArray[i])) {
                    temp[i] = array[i];

                }

            }

        }
        System.out.println("Common set is: " + Arrays.toString(temp));

    }


    public static void commSetsTwoArraysInt(int[] array, int[] otherArray) {
        int[] temp = new int[array.length]; // common set
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < otherArray.length; j++) {
                if (array[i] == otherArray[i]) {
                    temp[i] = array[i];
                    System.out.println(temp[i]);
                }

            }
            System.out.println("Common set : " + Arrays.toString(temp));

        }
    }

    public static void secondLargest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest : " + array[1]);

    }

    public static void secondSmallest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second smallest : " + array[1]);

    }

    public static void arrayToArrayList(int[] array) {
        ArrayList<Integer> arrayConverted = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            arrayConverted.add(array[i]);
        }
        System.out.println("ArrayList Printed:" + arrayConverted.toString());
    }
}







