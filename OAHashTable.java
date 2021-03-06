//Name: Oded Kesler
//ID: 200973212
//Username: odedkesler1

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
		for (; i < this.size; i++) {// Perform probe sequence
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
		int first_deleted_index = -1;
		int i = 0;
		
		for (; i < this.size; i++) { // Perform probe sequence
			int searched_index = Hash(hte.GetKey(), i);
			
			if ((this.table[searched_index] == null)) { // Found a vacant cell
				
				if (first_deleted_index >= 0) { // Insert at first deleted index if exists
					this.table[first_deleted_index] = hte;
					return;
				}
				else { // Insert into current index
					this.table[searched_index] = hte;
					return;
				}
				
			}
			if ((this.table[searched_index].GetKey() == -1) && (first_deleted_index < 0)) {
				first_deleted_index = searched_index; // Save index of first deleted cell 
				continue;
			}
			if (this.table[searched_index].GetKey() == hte.GetKey()) {
				throw new KeyAlreadyExistsException(hte); 
			} 
		}
		if (first_deleted_index >= 0) { // Insert at first deleted index if exists
			this.table[first_deleted_index] = hte;
			return;
		}
		throw new TableIsFullException(hte);
	}
	
	@Override
	public void Delete(long key) throws KeyDoesntExistException {
		int i = 0;
		for (; i < this.size; i++) { // Perform probe sequence
			int searched_index = Hash(key, i);
			
			if (this.table[searched_index] == null) {
				throw new KeyDoesntExistException(key);
			}
			if (this.table[searched_index].GetKey() == key) { // Mark the relevant cell as deleted
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
