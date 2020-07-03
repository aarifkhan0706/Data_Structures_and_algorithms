package linkedlist;
import java.util.List;
import java.util.ArrayList;
public class arrlist {
	public static void main(String[] args) {
		// showing the integer arraylist
		//List<Integer> list1 = new ArrayList<>();
		//System.out.println(list1.size());
		//list1.add(15);
		//list1.add(20);
		//list1.add(25);
		//System.out.println(list1.size());
		//System.out.println(list1.get(2));
		
		// the generic form of arraylist where you can add any data type
		//List list2= new ArrayList<>();
		//list2.add(22);
		//list2.add("My Age");
		//list2.size();
		//System.out.println(list2);
		
		// made a pair class which accept any two pairs of data type
		//pair<String, Integer> p1= new pair("My AGE",22);
		//p1.get_description();
		
		//Usage of different methods of Arraylist
		//1.add(element)
		// creating the first collection
		List <String> Fruits = new ArrayList<>();
		// creating the second collection
		List <String> Vegetables = new ArrayList<>();
		// adding elements in both the collection
		Fruits.add("Apple");
		Fruits.add("Banana");
		Vegetables.add("Bringal");
		Vegetables.add("Onion");
		System.out.println("Fruits: "+Fruits);
		System.out.println("Vegetables: "+Vegetables);
		
		//2.addall(collection)
		//here we will add one collection to another
		Fruits.addAll(Vegetables);
		System.out.println("Fruits & Vegetables:" + Fruits);
		
		//3.get(index)
		System.out.println(Fruits.get(2));
		
		//4.set(index,value)
		Fruits.set(3, "Tomato");//overrides
		System.out.println(Fruits);
		Fruits.add(3,"Onion");//doesn't overrides
		System.out.println(Fruits);
		
		//5.Remove(index)
		Fruits.remove(4);
		System.out.println(Fruits);
		
		//6.Clear()
		//It will basically remove all the things in that collection
		
		//7. RemoveAll()
		//It will basically remove only those data which you don't want
		List<String> toRemove = new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Hi");
		Fruits.removeAll(toRemove);
		System.out.println(Fruits);
		
		//8. Size()
		System.out.println(Fruits.size());
		
		//9. Contains() it checks the data if present and return boolean 
		System.out.println(Fruits.contains("Apple"));
		
		//10. IsEmpty() it checks if the any data is present and returns boolean
		System.out.println(Fruits.isEmpty());
		
		//<<IMPORTANT>>
		//11. toArray() it returns an array
		//There is two ways in which we can use toArray in one where it returns 
		//object and in other we use normal array which we know
		String temp[] = new String[Fruits.size()];
		Fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
	}

}
