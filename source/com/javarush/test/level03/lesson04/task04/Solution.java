package com.javarush.test.level03.lesson04.task04;

/**
 * Created by temo on 11/3/15.
 */
/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 1;
        for(int j = 1; j < 11; j++){
            i = i*j;
        }
        System.out.print("1 დან 10 მდე რიცხვების ნამრავლია: " + i);//напишите тут ваш код

    }
}
