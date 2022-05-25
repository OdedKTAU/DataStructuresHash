import java.util.Random;

public class McTester {
	
	public static void main(String[] args) throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException {
		
		int counter = 0;
		while (counter < 100) {
			System.out.println(counter);
			Q1();
		}
		
				
	}
	
	public static void Q1() throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException {
		int m = 6571;
		long p = 1000000007; 
		Random rn = new Random();
		int i = 0;
		
		int b;
		int a;
		QPHashTable check = new QPHashTable(m,p);
		
		while (i < m) {
			b = rn.nextInt()%100; 
			a = 100*i + b;
			HashTableElement hte = new HashTableElement(1,2);
			check.Insert(hte);
			i++;
		}
		return;
	}
}
