
// cursor:
//
// --it is meber or travalar like man on any elenment/object present in
// collection
// --we have abitlity to accese the element present in the collection
// --by using cursor we have to chance of to proforms wherius opretions on
// collectio eche element
// --their are four type of cursor

// ----1).Iterator (this is an universal)
/*
 * javap java.util.Iterator
 * Compiled from "Iterator.java"
 * public interface java.util.Iterator<E> {
 * public abstract boolean hasNext();
 * public abstract E next();
 * public default void remove();
 * public default void forEachRemaining(java.util.function.Consumer<? super E>);
 * }
 */

import java.util.ArrayList;
import java.util.Iterator;

class c1{

    public static void main(String[] boss){


        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(60);
        System.out.println(ar);

        Iterator itr = ar.iterator();

        
        while(itr.hasNext()) {

            System.out.println(itr.next());

        }

        //as cursor itr is last last index and then we 
        //further ask hasNext then it return false so bellow while loop is not working
        while(itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(ar.isEmpty());

        Iterator itr2 = ar.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }

        System.out.println(ar.isEmpty());

        System.out.println(ar);
        



    }

 }
