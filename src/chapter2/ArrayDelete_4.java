package chapter2;

/**
 * 删除元素
 * 
 * @author hilih
 *
 */
public class ArrayDelete_4 {

	private int[] array;
	//当前数组内拥有的元素数量
	private int size;

	public ArrayDelete_4(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}

	/**
	 * 数组插入元素
	 * 
	 * @param element 插入的元素
	 * @param index   插入的位置
	 */
	public void insert(int element, int index) {
		// 访问下标是否越界
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围！");
		}
		// 如果实际元素达到数组容量上限，则对数组进行扩容
		if (size == array.length) {
			resize();
		}
		
		//开始移动元素的下标位置
		int start = 0;
		if (size > 0) {
			start = size - 1;
		}
		
		//要移动元素的次数
		// 从右向左循环，将元素逐个向右挪一位
		for (int round = size - index; index >= 0 && round >= 0 && start >= 0; round--) {
			array[start + 1] = array[start];
			start--;

		}
		// 腾出的位置放入新元素
		array[index] = element;
		size++;
	}
	
	/**
	 * 数组删除元素
	 * @param index 删除的位置
	 * @return
	 */
	public int delete(int index) {
		//判断访问下标是否超出范围
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围！");
		}
		
		int deletedEle = array[index];
		
		//从左向右循环，将元素逐个向左挪一位
		
		for(int start = index; start <= size ; start++) {
			array[start] = array[start + 1];
		}
		size--;
		
		return deletedEle;
	}

	/**
	 * 数组扩容
	 */
	public void resize() {
		int[] arrayNew = new int[array.length * 2];
		// 元素从旧数组复制到新数组
		System.arraycopy(array, 0, arrayNew, 0, array.length);
		array = arrayNew;
	}

	/**
	 * 输出数组
	 */
	public void output() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		ArrayDelete_4 myArray = new ArrayDelete_4(4);
		myArray.insert(3, 0);
		myArray.insert(7, 1);
		myArray.insert(9, 1);
		myArray.insert(5, 2);
		myArray.insert(6, 2);
		int deletedEle = myArray.delete(3);
		myArray.output();
	}

}
