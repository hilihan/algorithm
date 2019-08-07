package chapter2;

import org.junit.Test;

/**
 * 数组
 * @author hilih
 *
 */
public class Array_1 {
	/**
	 * 数组读取
	 */
	@Test
	public void readArray() {
		int[] array = new int[] {3,1,2,6,5,9,4,5};
		//输出数组中下标为3的元素
		System.out.println(array[3]);
	}
	
	/**
	 * 更新数组元素
	 */
	@Test
	public void updateEle() {
		int[] array = new int[] {3,1,2,6,5,9,4,5};
		//更新数组中下标为5的元素
		array[5] = 10;
		System.out.println(array[5]);
	}
	
}
