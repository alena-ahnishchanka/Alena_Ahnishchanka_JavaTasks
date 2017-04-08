package com.company;

// Задание 1.2
// Sort list or array by string length (Отсортировать список по длине строк)

public class SortArray {

    public void sortArray() {

//объявление массива
        String[] array = new String[7];

//заполнение ячеек массива строками
        array[0] = "Good morning! Look!";
        array[1] = "This";
        array[2] = "is";
        array[3] = "a";
        array[4] = "really";
        array[5] = "beautifil";
        array[6] = "view, isn't it?";

//вывод созданных строк массива
        System.out.println("Initial rows:");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

// сортировка строк по длине
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String tempRow = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempRow;
                }
            }
        }

// вывод отсортированных строк
        System.out.println();
        System.out.println("Sorted rows:");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

