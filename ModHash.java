//Name: Oded Kesler
//ID: 200973212
//Username: odedkesler1

import java.util.Random;

public class ModHash {
	long a;
	long b;
	int m;
	long p;
	
	public ModHash(long a, long b, int m, long p) {
		this.a = a;
		this.b = b;
		this.m = m;
		this.p = p;
	}
	
	public static ModHash GetFunc(int m, long p){
		Random random = new Random();
		
		long a = random.nextLong(p-1)+1;
		long b = random.nextLong(p);
		
		return new ModHash(a,b,m,p);
	}
	
	public int Hash(long key) {
		long result = Math.floorMod(Math.floorMod(this.a*key - this.b, p), m);
		return (int) result;
	}
}
