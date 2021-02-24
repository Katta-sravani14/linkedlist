package com.bridgelabz.MyNode5;



import com.bridgelabz.MyNode5.INode;

public interface INode<K> {
	K getKey();
	void setKey(K key);

	INode<K> getNext();
	void setNext(INode<K> next);
}
