package chapter1;

import org.junit.Test;

/**
 * 算法概述
 */
public class Overview_1 {
	/**
	 * 给小灰一个10cm的面包，小灰每3min吃掉1cm，那么吃掉整个面包要多久？
	 */
	@Test
	public void eat1() {
		int bread = 10;
		int time = 0;
		for(int i = 1; i <= bread; i++) {
			System.out.println("======== 面包的第"+ i +"厘米 ===========");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("吃掉一厘米的面包");
			time += 3;
		}
		System.out.println("\n吃完花了" + time + "分钟");
	}
	
	/**
	 * 给小灰一个16cm的面包，小灰每5min吃掉面包剩余的一半，
	 * 即，第1min吃掉8cm，第2min吃到4cm，第3min吃到2cm……
	 * 那么把面包吃到只剩1cm要多久？
	 */
	@Test
	public void eat2() {
		int bread = 16;
		int time = 0;
		for(int i = bread; i > 1; i/=2) {
			System.out.println("======== 面包的第"+ i +"厘米 ===========");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("吃掉一半的面包");
			time += 5;
		}
		System.out.println("\n吃完花了" + time + "分钟");
	}
	
	/**
	 * 给小灰一个10cm的面包，小灰吃掉第一个1cm需要1min，吃掉第二个1cm需要2min，吃掉第三个1cm需要3min……
	 * 每吃1cm所花的时间就比吃上一个1cm多1min
	 * 那么小灰吃掉整个面包需要多少时间？
	 */
	@Test
	public void eat3() {
		int bread = 10;
		int time = 0;
		for(int i = 1; i <= bread; i++) {
			System.out.println("======== 面包的第"+ i +"厘米 ===========");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("吃掉一半的面包");
			time += 5;
		}
		System.out.println("\n吃完花了" + time + "分钟");
	}
}
