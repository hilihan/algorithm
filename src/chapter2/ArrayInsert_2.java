package chapter2;
/**
 * 数组中间插入
 * @author hilih
 *
 */
public class ArrayInsert_2 {

	private int[] array;
	/**下标记录*/
	private int size;
	
	public ArrayInsert_2(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}
	
	/**
	 * 数组插入元素
	 * @param element 插入的元素
	 * @param index 插入的位置
	 */
	public void insert(int element,int index) {
		//判断访问下标是否超出范围
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
	
		//从右向左循环，将元素逐个向右挪一位
		for(int i = size; i >= index; i--) {
			array[i+1] = array[i];
		}
		//腾出的位置放入新元素
		array[index] = element;
		size++;
	}
	
	public void output() {
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayInsert_2 myArray = new ArrayInsert_2(10);
		myArray.insert(3, 0);
		myArray.insert(7, 1);
		myArray.insert(9, 2);
		myArray.insert(5, 3);
		myArray.insert(6, 1);
		myArray.insert(4, 0);
		myArray.output();
	}

}
