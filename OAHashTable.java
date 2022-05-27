
public abstract class OAHashTable implements IHashTable {
	
	private HashTableElement [] table;
	protected int size;
	
	public OAHashTable(int m) {
		this.table = new HashTableElement[m];
		this.size = m;
		
	}
	
	
	@Override
	public HashTableElement Find(long key) {
		
		int i = 0;
		for (; i < this.table.length; i++) {
			int searched_index = Hash(key, i);
			
			if (this.table[searched_index] == null) {
				return null;
			}
			if (this.table[searched_index].GetKey() == key) {
				return this.table[searched_index]; 
			} 
		}
		return null;
	}
	
	@Override
	public void Insert(HashTableElement hte) throws TableIsFullException,KeyAlreadyExistsException {
		int i = 0;
		for (; i < this.table.length; i++) {
			int searched_index = Hash(hte.GetKey(), i);
			
			if ((this.table[searched_index] == null) || (this.table[searched_index].GetKey() == -1)) {
				this.table[searched_index] = hte;
				return;
			}
			if (this.table[searched_index].GetKey() == hte.GetKey()) {
				throw new KeyAlreadyExistsException(hte); 
			} 
		}
		throw new TableIsFullException(hte);
	}
	
	@Override
	public void Delete(long key) throws KeyDoesntExistException {
		int i = 0;
		for (; i < this.table.length; i++) {
			int searched_index = Hash(key, i);
			
			if (this.table[searched_index] == null) {
				throw new KeyDoesntExistException(key);
			}
			if (this.table[searched_index].GetKey() == key) {
				this.table[searched_index] = new HashTableElement(-1, -1);
				return;
			} 
		}
		throw new KeyDoesntExistException(key);
	}
	
	/**
	 * 
	 * @param x - the key to hash
	 * @param i - the index in the probing sequence
	 * @return the index into the hash table to place the key x
	 */
	public abstract int Hash(long x, int i);

}
