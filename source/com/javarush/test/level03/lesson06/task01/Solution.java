package com.javarush.test.level03.lesson06.task01;

/**
 * Created by temo on 11/3/15.
 */
/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String[] mamaMilaRamu = {"Мама","Мыла","Раму"};
        String comb1 = mamaMilaRamu[0] + mamaMilaRamu[1] + mamaMilaRamu[2];
        String comb2 = mamaMilaRamu[0] + mamaMilaRamu[2] + mamaMilaRamu[1];
        String comb3 = mamaMilaRamu[1] + mamaMilaRamu[0] + mamaMilaRamu[2];
        String comb4 = mamaMilaRamu[1] + mamaMilaRamu[2] + mamaMilaRamu[0];
        String comb5 = mamaMilaRamu[2] + mamaMilaRamu[0] + mamaMilaRamu[1];
        String comb6 = mamaMilaRamu[2] + mamaMilaRamu[1] + mamaMilaRamu[0];
        System.out.println(comb1);
        System.out.println(comb2);
        System.out.println(comb3);
        System.out.println(comb4);
        System.out.println(comb5);
        System.out.println(comb6);//напишите тут ваш код

    }
}