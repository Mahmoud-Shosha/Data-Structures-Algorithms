package singlylinkedlist;

public class SinglyLinkedListClient {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- push method -------------");
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(25);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(-4);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(-4);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(25);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(0);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(33333);
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- pop method -------------");
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.pop());
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(-4);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(3);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.pop());
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.pop());
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- shift method -------------");
		singlyLinkedList.push(-4);
		singlyLinkedList.push(3);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.shift());
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.shift());
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.shift());
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- unshift method -------------");
		singlyLinkedList.push(1);
		System.out.println(singlyLinkedList);
		singlyLinkedList.unshift(2);
		singlyLinkedList.unshift(3);
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(4);
		System.out.println(singlyLinkedList);
		singlyLinkedList.unshift(5);
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- get method -------------");
		singlyLinkedList.push(1);
		singlyLinkedList.push(2);
		singlyLinkedList.push(3);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.get(-999));
		System.out.println(singlyLinkedList.get(-1));
		System.out.println(singlyLinkedList.get(0));
		System.out.println(singlyLinkedList.get(1));
		System.out.println(singlyLinkedList.get(2));
		System.out.println(singlyLinkedList.get(3));
		System.out.println(singlyLinkedList.get(259));
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- set method -------------");
		singlyLinkedList.push(1);
		singlyLinkedList.push(2);
		singlyLinkedList.push(3);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.set(-999, 55555));
		System.out.println(singlyLinkedList.set(-1, 55555));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.set(0, 0));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.set(1, 1));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.set(2, 2));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.set(3, 55555));
		System.out.println(singlyLinkedList.set(259, 55555));
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- insert method -------------");
		singlyLinkedList.insert(-1, 1);
		singlyLinkedList.insert(1, 1);
		System.out.println(singlyLinkedList);
		singlyLinkedList.insert(0, 1);
		singlyLinkedList.insert(0, 77);
		singlyLinkedList.insert(2, 2);
		System.out.println(singlyLinkedList);
		singlyLinkedList.insert(4, 777);
		singlyLinkedList.insert(1, 1111);
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- remove method -------------");
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.remove(0));
		System.out.println(singlyLinkedList.remove(5));
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(1);
		singlyLinkedList.push(2);
		singlyLinkedList.push(3);
		singlyLinkedList.push(4);
		singlyLinkedList.push(5);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.remove(-1));
		System.out.println(singlyLinkedList.remove(5));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.remove(4));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.remove(0));
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.remove(1));
		System.out.println(singlyLinkedList);

		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- reverse method -------------");
		singlyLinkedList.reverse();
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(1);
		singlyLinkedList.reverse();
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(2);
		singlyLinkedList.reverse();
		System.out.println(singlyLinkedList);
		singlyLinkedList.push(3);
		singlyLinkedList.push(4);
		singlyLinkedList.push(5);
		singlyLinkedList.reverse();
		System.out.println(singlyLinkedList);
		singlyLinkedList.reverse();
		System.out.println(singlyLinkedList);
		
		singlyLinkedList = new SinglyLinkedList<Integer>();
		System.out.println("------------- search method -------------");
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.search(1));	
		System.out.println(singlyLinkedList.search(2));
		singlyLinkedList.push(1);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.search(1));
		System.out.println(singlyLinkedList.search(2));
		singlyLinkedList.push(2);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.search(1));
		System.out.println(singlyLinkedList.search(2));
		singlyLinkedList.push(3);
		singlyLinkedList.push(4);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.search(1));
		System.out.println(singlyLinkedList.search(4));
	}

}
