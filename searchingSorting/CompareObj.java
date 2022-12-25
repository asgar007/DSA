package searchingSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Obj implements Comparable<Obj>{
	String name;
	int math;
	int phy;
	public Obj(String name, int math, int phy) {
		super();
		this.name = name;
		this.math = math;
		this.phy = phy;
	}
	@Override
	public int compareTo(Obj o) {
		if(this.phy < o.phy)
			return 1;
		else
			return -1;
	}
	
}

public class CompareObj {
	public static void main(String[] args) {
		Obj obj1 = new Obj("asgar", 12,85);
		Obj obj2 = new Obj("rehan", 45,9);
		comapare(obj1, obj2);
	}

	private static void comapare(Obj obj1, Obj obj2) {
		List<Obj> list = new ArrayList<Obj>();
		list.add(obj1);
		list.add(obj2);
		Collections.sort(list);
		for(Obj o : list) {
			System.out.println(o.name);
		}
	}
}
