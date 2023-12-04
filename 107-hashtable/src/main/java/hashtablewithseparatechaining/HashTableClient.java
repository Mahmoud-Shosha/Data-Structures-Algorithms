package hashtablewithseparatechaining;

public class HashTableClient {

	public static void main(String[] args) {
		
		// Primary test
		HashTable<String, Integer> table = new HashTable<>();
		System.out.println("First --------------------------");
		System.out.println(table.size());
        System.out.println(table.isEmpty());
        System.out.println("Second --------------------------");
        table.put("sami", 77777);
        table.put("mahmoud", 33333);
        System.out.println(table.get("sami"));
        System.out.println(table.get("mahmoud"));
        System.out.println(table.size());
        System.out.println(table.isEmpty());
        System.out.println("Third --------------------------");
        table.put("sami", 11111);
        table.put("kareem", 99999);
        System.out.println(table.get("sami"));
        System.out.println(table.get("mahmoud"));
        System.out.println(table.get("kareem"));
        System.out.println(table.size());
        System.out.println(table.isEmpty());
        System.out.println("Fourth --------------------------");
        table.remove("sami");
        System.out.println(table.get("sami"));
        System.out.println(table.get("mahmoud"));
        System.out.println(table.get("kareem"));
        System.out.println(table.size());
        System.out.println(table.isEmpty());
        
        // Load factor test
     	table = new HashTable<>(10, .2);
     	System.out.println("\n\nFirst --------------------------");
     	table.put("sami", 77777);
     	table.put("mahmoud", 33333);
     	table.remove("mahmoud");
     	table.put("mahmoud", 11111);
     	table.put("mahmoud", 22222);
     	System.out.println(table.size());
     	System.out.println(table.isEmpty());
     	System.out.println("Second --------------------------");
     	table.put("Fadi", 77777);
     	System.out.println(table.size());
     	System.out.println(table.isEmpty());
     	
     	// Large load factor test
     	table = new HashTable<>(10, 1);
     	System.out.println("\n\nFirst --------------------------");
     	table.put("sami", 77777);
     	table.put("mahmoud", 33333);
     	table.put("Ali", 11111);
     	table.put("Fadi", 22222);
     	table.put("Hani", 77777);
     	table.put("Bassem", 77777);
     	table.put("Ossama", 77777);
     	table.put("Sameh", 77777);
     	table.put("Kareem", 77777);
     	table.put("Ghareeb", 77777);
     	System.out.println(table.size());
     	System.out.println(table.isEmpty());
	}

}