package com.javarush.test.level03.lesson04.task01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by temo on 11/3/15.
 */
/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/
public class Solution
{
    public static void main(String[] args)
    {
        Calendar calendar = new GregorianCalendar(1993, 0, 1);
        Date date = calendar.getTime();
        System.out.printf("%tD", date);//напишите тут ваш код
    }
}
