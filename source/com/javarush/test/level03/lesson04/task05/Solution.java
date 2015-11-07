package com.javarush.test.level03.lesson04.task05;

/**
 * Created by temo on 11/3/15.
 */
/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("0 დან 10 მდე რიცხვების ნამრავლია: n = n + (n + 1)");
        for(int j = 1; j < 11; j++){
            i = i + j;
            System.out.print(i + " ");
        }
    }
}