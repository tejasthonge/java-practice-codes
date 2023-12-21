
import java.util.*;

class Project implements Comparable{

	String pName = null;
	int tCount =0;
	int dureation=0;

	Project(String pName , int tCount , int dureation){

	this.pName= pName;
	this.tCount=tCount;
	this.dureation = dureation;

	}

	public String toString(){
	
		return "{"+pName+":"+tCount+":"+dureation+"}";
	}

	public int compareTo(Object obj){
	
		return (pName.compareTo(((Project)obj).pName));
	
	}
}


class PQDemo{

	public static void main(String[] boss){
	
		PriorityQueue pq = new PriorityQueue();
		pq.offer(new Project("unitCon",3,8));
		pq.offer(new Project("helthApp",4,12));
		pq.offer(new Project("portfoio",2,7));

		System.out.println(pq);

	
	}

}

