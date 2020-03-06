package com.epam.collection;
import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        a.add("six");
        a.add("seven");
        a.add("eight");
        a.add("nine");
        a.add("ten");
        System.out.println(a);
        Iterator<String>i=a.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
    }
}
