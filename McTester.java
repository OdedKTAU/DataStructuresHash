import java.util.Random;

public class McTester {
	
	public static void main(String[] args) throws IHashTable.TableIsFullException, IHashTable.KeyAlreadyExistsException, IHashTable.KeyDoesntExistException {
		int m = 10000019;
		long p = 1000000007;
		int n = 9500018;
		
		Random random = new Random();
		int i = 0;
		HashTableElement[] elements = new HashTableElement[n]; 
		
		for (; i<n; i++) {
	
			long b = random.nextLong(100);
			long number = 100*i + b;
			elements[i] = new HashTableElement(number, number);
		}
//		
//		AQPHashTable aqp = new AQPHashTable(m,p);
//		int j = 0;
//		for (;j<m; j++) {
//			try {
//				aqp.Insert(elements[j]);
//			}
//			catch (IHashTable.TableIsFullException e) {
//				System.out.println("Table is full at " + j + " insertion");
//				break;
//			}
//		}
		
//		DoubleHashTable dh = new DoubleHashTable(m,p);
//		Random random = new Random();
//		int x = 1;
//		
//		for (; x < 7; x++) {
//			System.out.println("Iteration no' " + x);
//			HashTableElement[] elements = new HashTableElement[n];
//			int i = 0;
//				
//			// Create a random series of numbers
//			for (; i<n; i++) {
//				
//				long b = random.nextLong(100);
//				long number = 100*i + b;
//				elements[i] = new HashTableElement(number, number);
//			}
//			
//			long startTime = System.nanoTime();
//			//Insert the series
//			for (int j = 0; j < n; j++) {
//				dh.Insert(elements[j]);
//			}
//			long stopTime = System.nanoTime();
//			long insertingTime = (stopTime - startTime)/1000000000;
//			System.out.println("Insertion took " + insertingTime);
//			
//			startTime = System.nanoTime();
//			//Delete the series
//			for (int j = 0; j < n; j++) {
//				dh.Delete(elements[j].GetKey());
//			}
//			stopTime = System.nanoTime();
//			long DeletingTime = (stopTime - startTime)/1000000000;
//			System.out.println("Deleting took " + DeletingTime);
//			
//			long totalExecution = insertingTime + DeletingTime;
//			System.out.println("execution time in seconds: " + totalExecution);
//			System.out.println();
//			System.out.println("**********************");
//			System.out.println("**********************");
//			System.out.println();
//		}
//		System.out.println("Done");		
		
//		LPHashTable lp = new LPHashTable(m, p); 
//		QPHashTable qp = new QPHashTable(m, p);
//		AQPHashTable aqp = new AQPHashTable(m, p);
//		DoubleHashTable dh = new DoubleHashTable(m, p); 
//		
//		long startTime = System.nanoTime();
//		for (int j = 0; j < n; j++) {
//			lp.Insert(elements[j]);
//		}
//		long stopTime = System.nanoTime();
//		long executionTime = (stopTime - startTime)/1000000;
//		System.out.println("LP execution time in s*1000: " + executionTime);
		
		
//		startTime = System.nanoTime();
//		for (int j = 0; j < n; j++) {
//			qp.Insert(elements[j]);
//		}
//		stopTime = System.nanoTime();
//		executionTime = (stopTime - startTime)/1000000;
//		System.out.println("QP execution time in s*1000: " + executionTime);
		
		
//		startTime = System.nanoTime();
//		for (int j = 0; j < n; j++) {
//			aqp.Insert(elements[j]);
//		}
//		stopTime = System.nanoTime();
//		executionTime = (stopTime - startTime)/1000000;
//		System.out.println("AQP execution time in s*1000: " + executionTime);
//		
//		
//		startTime = System.nanoTime();
//		for (int j = 0; j < n; j++) {
//			dh.Insert(elements[j]);
//		}
//		stopTime = System.nanoTime();
//		executionTime = (stopTime - startTime)/1000000;
//		System.out.println("DH execution time in s*1000: " + executionTime);
	}
}
