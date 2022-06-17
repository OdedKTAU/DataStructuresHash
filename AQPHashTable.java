
public class AQPHashTable extends OAHashTable {
	ModHash hashParams;
	int direction;

	public AQPHashTable(int m, long p) {
		super(m);
		this.direction = -1;
		this.hashParams = ModHash.GetFunc(m, p);
	}
	
	@Override
	public int Hash(long x, int i) {
		direction = direction* -1;
		return Math.floorMod(this.hashParams.Hash(x) + (direction*(i*i)), this.size);
	}
	
}
