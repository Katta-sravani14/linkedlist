package com.bridgelabz.MyNode8;


import com.bridgelabz.MyNode8.INode;

public interface INode<K> {
	K getKey();
	void setKey(K key);

	INode<K> getNext();
	void setNext(INode<K> next);
}
