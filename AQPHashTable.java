
public class AQPHashTable extends OAHashTable {
	ModHash hashParams;

	public AQPHashTable(int m, long p) {
		super(m);
		this.hashParams = ModHash.GetFunc(m, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		int direction = (int) Math.pow(-1,i);
		return Math.floorMod(this.hashParams.Hash(x) + (direction*(i*i)), this.size);
	}
	
}
