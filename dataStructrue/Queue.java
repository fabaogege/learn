package dataStructrue;

public class Queue {

	public static void main(String[] args) {
		QueueFunction<Integer> queue = new QueueFunction<>(10);
		for(int i =0;i<10000;i++) {
			queue.enqueue(i);
			System.out.println(queue.getFront());
		}
		queue.dequeue();
		for(int i =0;i<queue.getSize();i++) {
			System.out.println(queue.getFront());
		}
	}
}
class QueueFunction<E>{
	private E[] data;
	private int size;
	public QueueFunction() {}
	public QueueFunction(int capacity) {
		data  =(E[]) new Object[capacity];
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpry() {
		return size==0;
	}
	public E getFront() {
		return getFirst();
	}
	public void enqueue(E e) {
		addLast(e);
	}
	public E dequeue() {
		return removeFirst();
	}
	
	
	
	private E getFirst() {
		return data[0];
	}
	public void addLast(E e) {
		if(size==data.length) {
			grow(data.length*2);
		}
		//index及后面的值向后移动
		for(int i=size-1;i>=size;i--) {
			data[i+1] = data[i];
		}
		data[size] = e;
		size++;
	}
		public E removeFirst() {
			int index =0;
			E res=data[index];
			for(int i=index+1;i<size;i++) {
				data[i-1] =data[i];
			}
			size--;
			if(size==(data.length/4) && data.length/2!=0){
				grow(data.length/2);
			}
			return res;
		}
	private void grow(int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		for(int i=0;i<size;i++) {
			newData[i]= data[i];
		}
		data = newData;
	}
}