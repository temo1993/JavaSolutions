package com.javarush.test.level03.lesson04.task03;

/**
 * Created by temo on 11/3/15.
 */
/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg a = new Zerg ();
        a.name = "First";
        System.out.println("zerg "+a.name);
        Zerg b= new Zerg ();
        b.name = "Second";
        System.out.println("zerg "+b.name);
        Zerg c = new Zerg ();
        c.name = "Third";
        System.out.println("zerg "+c.name);
        Zerg d= new Zerg ();
        d.name = "Fourth";
        System.out.println("zerg "+d.name);
        Zerg e = new Zerg ();
        e.name = "Fifth";
        System.out.println("zerg "+e.name);
        Zerg f= new Zerg ();
        f.name = "Sixth";
        System.out.println("zerg "+f.name);
        Zerg g = new Zerg ();
        g.name = "Seventh";
        System.out.println("zerg "+g.name);
        Zerg h = new Zerg ();
        h.name = "Eighth";
        System.out.println("zerg "+h.name);
        Zerg i = new Zerg ();
        i.name = "Ninth";
        System.out.println("zerg "+i.name);
        Zerg j = new Zerg ();
        j.name = "Tenth";
        System.out.println("zerg "+j.name);
        System.out.println("\n");
        Protos k = new Protos ();
        k.name = "One";
        System.out.println("protos "+k.name);
        Protos l = new Protos ();
        l.name = "Two";
        System.out.println("protos "+l.name);
        Protos m = new Protos ();
        m.name = "Three";
        System.out.println("protos "+m.name);
        Protos n = new Protos ();
        n.name = "Four";
        System.out.println("protos "+n.name);
        Protos o = new Protos ();
        o.name = "Five";
        System.out.println("protos "+o.name);
        System.out.println("\n");
        Terran p = new Terran ();
        p.name = "Perviy";
        System.out.println("terran "+p.name);
        Terran q = new Terran ();
        q.name = "Vtoroy";
        System.out.println("terran "+q.name);
        Terran r = new Terran ();
        r.name = "Tretiy";
        System.out.println("terran "+r.name);
        Terran s = new Terran ();
        s.name = "Chetvertiy";
        System.out.println("terran "+s.name);
        Terran t = new Terran ();
        t.name = "Pyatiy";
        System.out.println("terran "+t.name);
        Terran u = new Terran ();
        u.name = "Shestoy";
        System.out.println("terran "+u.name);
        Terran v = new Terran ();
        v.name = "Sedmoy";
        System.out.println("terran "+v.name);
        Terran w = new Terran ();
        w.name = "Vosmoy";
        System.out.println("terran "+w.name);
        Terran x = new Terran ();
        x.name = "Devyatiy";
        System.out.println("terran "+x.name);
        Terran y = new Terran ();
        y.name = "Desyatiy";
        System.out.println("terran "+y.name);
        Terran z = new Terran ();
        z.name = "Odinnadtsatiy";
        System.out.println("terran "+z.name);
        Terran lol = new Terran ();
        lol.name = "Dvenadtsatiy";
        System.out.println("terran "+lol.name);

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}