package domain;

import java.util.ArrayList;

public class BinaryTree<E> {
	private E data;
	private BinaryTree<E> leftTree, rightTree;
	
	public BinaryTree(E data){
		this(data,null,null);
	}
	
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data= data;
		this.leftTree= leftTree;
		this.rightTree= rightTree;
	}
	
	public void printPreorder(){
			System.out.print(this.data + " ");
		if (this.leftTree != null) this.leftTree.printPreorder();
		if (this.rightTree != null) this.rightTree.printPreorder();
	}
	public void printInorder(){
		if (this.leftTree != null) this.leftTree.printInorder();
		System.out.print(this.data + " ");
		if (this.rightTree != null) this.rightTree.printInorder();
	}
	public void printPostorder(){
		if (this.leftTree != null) this.leftTree.printPostorder();
		if (this.rightTree != null) this.rightTree.printPostorder();
		System.out.print(this.data + " ");
	}

	public int countNodes(){
		if(leftTree == null && rightTree == null){
			return 1;
		}
		if(leftTree == null){
			return(1+ rightTree.countNodes());
		}
		if(rightTree == null){
			return(1+ leftTree.countNodes());
		}

		return(1 + leftTree.countNodes()+ rightTree.countNodes());
	}

	public int getDepth(){
		if(leftTree == null && rightTree == null){
			return 1;
		}
		if(leftTree == null){
			return(1+ rightTree.getDepth());
		}
		if(rightTree == null){
			return (1 + leftTree.getDepth());
		}

		int i = leftTree.getDepth();
		int j = rightTree.getDepth();
		if(i > j){
			return i+1;
		}
		return j+1;
	}

	public boolean isLeaf(){
		if(leftTree == null && rightTree == null){
			return true;
		}
		return false;
	}

	public int countleaves(){
		if(isLeaf()){
			return 1;
		}
		if(leftTree == null){
			return rightTree.countleaves();
		}
		if(rightTree == null){
			return leftTree.countleaves();
		}
		return(leftTree.countleaves() + rightTree.countleaves());
	}

	public ArrayList<E> getDataLeaves(){
		ArrayList<E> list = new ArrayList<E>();
		if(isLeaf()){
			list.add(this.data);
			return list;
		}
		if(leftTree == null){
			return rightTree.getDataLeaves();
		}
		if(rightTree == null){
			return leftTree.getDataLeaves();
		}
		list = rightTree.getDataLeaves();
		for(E i: leftTree.getDataLeaves()){
			list.add(i);
		}
		return(list);
	}
}
