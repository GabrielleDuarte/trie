package trie.entity;

import java.util.ArrayList;
import java.util.List;

/*4. Conjuntos Disjuntos (2 Pontos)
Implemente uma estrutura de dados para representar conjunto de elementos disjuntos. A implementação
deve considerar as operações de união de conjuntos: check e busca do conjunto ao qual o elemento pertence. A
implementação deve ser eficiente de modo que a complexidade deve ser os mais próximo da quantidade de
operações realizadas.

Em matemática, dois conjuntos são ditos disjuntos se não tiverem nenhum elemento em comum. Em outras palavras, 
dois conjuntos são disjuntos se sua interseção for o conjunto vazio.
*
*/

public class DisjointSet {

	private List<int[]> elements = new ArrayList<int[]>();
	
	public DisjointSet(List<int[]> elements) {
		super();
		this.elements = elements;
	}

	public List<int[]> getElements() {
		return elements;
	}

	public void setElements(List<int[]> elements) {
		this.elements = elements;
	}

	public DisjointSet unionDisjointSets(DisjointSet disjointSetToUnite) {
		DisjointSet unitedSet = new DisjointSet(this.elements);
		unitedSet.getElements().addAll(disjointSetToUnite.getElements());
		return unitedSet;
	}
	
	
}
