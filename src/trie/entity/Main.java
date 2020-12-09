package trie.entity;

import java.util.List;

public class Main {

	public static void main(String[] args) {

	}
	
	public DisjointSet findSet(int element, List<DisjointSet> disjointSets) {
		for (DisjointSet disjointSet : disjointSets) {
			if(disjointSet.getElements().contains(element)) {
				 return disjointSet;
			}
			else {
			return findSet(element, disjointSets);
			}
		}
		return findSet(element, disjointSets);
	}
}
