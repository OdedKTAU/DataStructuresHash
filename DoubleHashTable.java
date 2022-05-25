
public class DoubleHashTable extends OAHashTable {
	ModHash hashParams;
	ModHash hashParams_2;
	
	public DoubleHashTable(int m, long p) {
		super(m);
		this.hashParams = ModHash.GetFunc(m, p);
		this.hashParams_2 = ModHash.GetFunc(m-2, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		return Math.floorMod(this.hashParams.Hash(x) + (i*(this.hashParams_2.Hash(x)+1)), this.size);
	}
	
}
