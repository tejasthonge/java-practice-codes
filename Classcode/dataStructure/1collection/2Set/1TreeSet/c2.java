//pasing user define element to the treeSet


import java.util.*;

class Movies implements Comparable{

        String mName = null;
        long totCall = 0;

        Movies(String mName , long totCall){

                this.mName  = mName;
                this.totCall = totCall;

        }

        public int compareTo(Object obj){

                return -(mName.compareTo(((Movies)obj).mName));

        }

        public String toString(){

                return mName;
        }

}


class TreeSetDemo{


        public static void main(String[] boss){

                TreeSet ts =  new TreeSet();
                ts.add(new Movies("KGF",2500000));
                ts.add(new Movies("Puspa",2200000));
                ts.add(new Movies("Godase",5000000));
                ts.add(new Movies("MulasiPTR",1000000));
                System.out.println(ts);
        }





}

