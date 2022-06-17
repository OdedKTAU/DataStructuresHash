//Name: Oded Kesler
//ID: 200973212
//Username: odedkesler1

public class QPHashTable extends OAHashTable {
	ModHash hashParams;
	
	public QPHashTable(int m, long p) {
		super(m);
		this.hashParams = ModHash.GetFunc(m, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		return Math.floorMod(this.hashParams.Hash(x) + i*i, this.size);
	}

}
