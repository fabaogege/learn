package dataStructrue;

public class Stack {

	public static void main(String[] args) {
		StackFunction<Integer> stack = new StackFunction(10);
		for(int i =0;i<5;i++) {
			stack.push(i);
			System.out.println(stack.peek());
		}
		
	}

}
class StackFunction<E>{
	private E[] data;
	private int size;
	public StackFunction(int capacity) {
		data =(E[]) new Object[capacity];
	}
	public StackFunction() {
		
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(E e) {
		addLast(e);
	}
	public E pop() {
		return removeLast();
	}
	public E peek() {
		return getLast();
	}
	
	private E getLast() {
		return data[size-1];
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
	//删除指定位置的元素 并返回删除的元素
		public E removeLast() {
			int index = size-1;
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

