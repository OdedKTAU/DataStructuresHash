//Name: Oded Kesler
//ID: 200973212
//Username: odedkesler1

public class DoubleHashTable extends OAHashTable {
	ModHash hashParams;
	ModHash hashParams_2;
	
	public DoubleHashTable(int m, long p) {
		super(m);
		this.hashParams = ModHash.GetFunc(m, p);
		this.hashParams_2 = ModHash.GetFunc(m-1, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		return Math.floorMod(this.hashParams.Hash(x) + (i*(this.hashParams_2.Hash(x)+1)), this.size);
	}
	
}
