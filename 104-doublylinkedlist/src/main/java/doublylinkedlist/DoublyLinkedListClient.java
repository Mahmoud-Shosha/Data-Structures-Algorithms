package doublylinkedlist;

public class DoublyLinkedListClient {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- push method -------------");
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(25);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(-4);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(-4);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(25);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(0);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(33333);
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- pop method -------------");
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.pop());
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(-4);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(3);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.pop());
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.pop());
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- shift method -------------");
		doublyLinkedList.push(-4);
		doublyLinkedList.push(3);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.shift());
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.shift());
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.shift());
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- unshift method -------------");
		doublyLinkedList.push(1);
		System.out.println(doublyLinkedList);
		doublyLinkedList.unshift(2);
		doublyLinkedList.unshift(3);
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(4);
		System.out.println(doublyLinkedList);
		doublyLinkedList.unshift(5);
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- get method -------------");
		doublyLinkedList.push(1);
		doublyLinkedList.push(2);
		doublyLinkedList.push(3);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.get(-999));
		System.out.println(doublyLinkedList.get(-1));
		System.out.println(doublyLinkedList.get(0));
		System.out.println(doublyLinkedList.get(1));
		System.out.println(doublyLinkedList.get(2));
		System.out.println(doublyLinkedList.get(3));
		System.out.println(doublyLinkedList.get(259));
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- set method -------------");
		doublyLinkedList.push(1);
		doublyLinkedList.push(2);
		doublyLinkedList.push(3);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.set(-999, 55555));
		System.out.println(doublyLinkedList.set(-1, 55555));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.set(0, 0));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.set(1, 1));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.set(2, 2));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.set(3, 55555));
		System.out.println(doublyLinkedList.set(259, 55555));
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- insert method -------------");
		doublyLinkedList.insert(-1, 1);
		doublyLinkedList.insert(1, 1);
		System.out.println(doublyLinkedList);
		doublyLinkedList.insert(0, 1);
		doublyLinkedList.insert(0, 77);
		doublyLinkedList.insert(2, 2);
		System.out.println(doublyLinkedList);
		doublyLinkedList.insert(4, 777);
		doublyLinkedList.insert(1, 1111);
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- remove method -------------");
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.remove(0));
		System.out.println(doublyLinkedList.remove(5));
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(1);
		doublyLinkedList.push(2);
		doublyLinkedList.push(3);
		doublyLinkedList.push(4);
		doublyLinkedList.push(5);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.remove(-1));
		System.out.println(doublyLinkedList.remove(5));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.remove(4));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.remove(0));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.remove(1));
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- reverse method -------------");
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(1);
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(2);
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList);
		doublyLinkedList.push(3);
		doublyLinkedList.push(4);
		doublyLinkedList.push(5);
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList);
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList);

		doublyLinkedList = new DoublyLinkedList<Integer>();
		System.out.println("------------- search method -------------");
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.search(1));
		System.out.println(doublyLinkedList.search(2));
		doublyLinkedList.push(1);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.search(1));
		System.out.println(doublyLinkedList.search(2));
		doublyLinkedList.push(2);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.search(1));
		System.out.println(doublyLinkedList.search(2));
		doublyLinkedList.push(3);
		doublyLinkedList.push(4);
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.search(1));
		System.out.println(doublyLinkedList.search(4));

	}

}
