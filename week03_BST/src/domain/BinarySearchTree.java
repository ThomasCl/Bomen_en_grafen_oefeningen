package domain;

/*
Update the BinaryTree class in the domain folder with the BinaryTree of week 02
* */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	@Override
	public boolean lookup(E data) {
		if(data.compareTo(this.data) == 0){
			return true;
		}
		if(data.compareTo(this.data) > 0){
			if(rightTree == null){
				return false;
			}
			return rightTree.lookup(data);
		}
		if(data.compareTo(this.data) < 0) {
			if(leftTree == null){
				return false;
			}
			return leftTree.lookup(data);
		}
		return false;
	}

	@Override
	public boolean addNode(E data) {
		if(data.compareTo(this.data)>0){
			if(rightTree == null){
				BinaryTree tre = new BinaryTree(data);
				this.rightTree = tre;
				return true;
			}
			else{
				return rightTree.addNode(data);
			}
		}
		if(data.compareTo(this.data)<0){
			if(leftTree == null){
				BinaryTree tre = new BinaryTree(data);
				this.leftTree = tre;
				return true;
			}
			else{
				return leftTree.addNode(data);
			}
		}
		return false;
	}

	public boolean removeNode(E data){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public E searchSmallest(){
		if(leftTree == null){
			return data;
		}
		return leftTree.searchSmallest();
	}

	@Override
	public E searchGreatest(){
		if(rightTree == null){
			return data;
		}
		return rightTree.searchGreatest();
	}
}


