
import java.util.*;

class Collar implements Comparable{

        String cName =null;
        Collar(String cName){

                this.cName= cName;

                System.out.println("collar is :"+cName);
        }


        //we have override toString method 
        //--this is present in Object class
        //--why we shoud override this toString method ?
        //-->the resion is we print the LinkeHashSet that time it implisitly call to toString method
        //-->theis is only for predeffine data
        //-->but here we pass user define object so it class to toString but addres of that object id printed

        //--toString metod is public and her returen type is String

        public String toString(){

                return cName;
        }

        //but we want out put in sortend manar then we have to make our class comparable type 
        //that is we have impiments Comparable interface and make Callor child of Comparable
        //--this have only one method 
        //--it is interface so method is public abstract
        //--the method is compareTo();
        //--having return type is int
        //--return value is 0 then the given string or object is same
        //--the return values is -ve or +ve then this are nate same or equals   

        public int compareTo(Object obj){

                return -(cName.compareTo(((Collar)obj).cName));


        }



}

class LinkedHashSetDemo{

        public static void main(String[] boss){

                HashSet hs = new HashSet();

                hs.add(new Collar("Red"));
                hs.add(new Collar("Blue"));
                hs.add(new Collar("Green"));


                System.out.println(hs);

                Iterator itr =  hs.iterator();
                while(itr.hasNext()){

                        System.out.println(itr.next());
                }
        }


}

