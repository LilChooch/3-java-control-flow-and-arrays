package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        if(arr == null || arr.length == 0 )
        {

        }
        else {
            int min = arr[0];
            int minInd = 0;

            for (int i = 1; i < arr.length; i++) {

                if (min >= arr[i]) {
                    min = arr[i];
                    minInd = i;
                }

            }
            int first = arr[0];
            arr[0] = arr[minInd];
            arr[minInd] = first;
        }
    }

}