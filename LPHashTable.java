
public class LPHashTable extends OAHashTable {
	ModHash hashParams;
	
	public LPHashTable(int m, long p) {
		super(m);
		this.hashParams = ModHash.GetFunc(m, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		return Math.floorMod(this.hashParams.Hash(x) + i, this.size);
	}
}
