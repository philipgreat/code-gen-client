package skynet;

import java.math.BigDecimal;

public class NumberTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testNumbers();
		testLoopNumbers();
	}

	public static double addWithBigDecimal(double a, double b) {

		BigDecimal b1 = new BigDecimal(a + "");// 注意构造BigDecimal类时候必须用String类型才能得到精确的值
		BigDecimal b2 = new BigDecimal(b + "");
	
		return b1.add(b2).doubleValue();
	}

	public static double addSimple(double a, double b) {

		return a + b;
	}
	protected static double round3(double value) {
		return Math.round(value * 1000.0) / 1000.0;
	}
	public static double addWithRound(double a, double b) {

		return round3(a + b);
	}
	

	protected static void testLoopNumbers() {

		for (double i = 0.001; i < 1; i =round3( i+ 0.001)) {
			for (double j = 0.001; j < 1; j = round3( j+ 0.001)) {
				double sum = addWithBigDecimal(j, i);
				double sum2 = addWithRound(j, i);

				if ((sum2 - sum) != 0.0) {
					System.out.println("Found issue when i=" +i+"; and j="+ j);
				}

			}
		}
		System.out.println("done!");
	}

	protected static double round(double value) {
		return Math.round(value * 100.0) / 100.0;
		
	}

	protected static double floor(double value) {
		return Math.floor(value * 100.0) / 100.0;
	}

	protected static double ceil(double value) {
		return Math.ceil(value * 100.0) / 100.0;
	}

	protected static double[] split(double value, double many) {
		double[] ret = new double[2];
		ret[0] = floor(value / many);
		ret[1] = round(value - many * ret[0]);
		return ret;
	}

	protected static void testNumbers() {

		System.out.println(0.05 + 0.01);
		System.out.println(round(0.05 + 0.01));

		double d = 0.06;
		System.out.println(d);
		BigDecimal b1 = new BigDecimal(0.05 + "");// 注意构造BigDecimal类时候必须用String类型才能得到精确的值
		BigDecimal b2 = new BigDecimal(0.01 + "");
		b1.add(b2);
		BigDecimal b3 = b1.add(b2);

		System.out.println("single double: " + b3);
		System.out.println("single double: " + b3.doubleValue());

		System.out.println(b3);
		System.out.println(1000 / 3);

		System.out.println(0.05 + 0.01);
		System.out.println(0.06 + 0.01);
		System.out.println(round(0.06 + 0.01));
		System.out.println((0.06 + 0.01));
		System.out.println(0.1);

		System.out.println(addWithBigDecimal(0.01, 0.05) == 0.06);

		System.out.println(addSimple(0.01, 0.05) == 0.06);
		System.out.println("add2(0.01,0.05)==add(0.01,0.05)"
				+ (addSimple(0.01, 0.05) == addWithBigDecimal(0.01, 0.05)));
		System.out.println(((0.01 + 0.05) * 100 - (0.01 * 100 + 0.05 * 100)));
		System.out.println((0.01 + 0.05) * 100);
		System.out.println(((0.0001 * 100 + 0.0005 * 100)));
		System.out.println(((0.01 * 100 + 0.05 * 100)) == 6.00);
		System.out.println(round(1 / 3.0));
		double[] ret = split(1, 3);
		for (double item : ret) {
			System.out.println(" -> " + item);
		}
		ret = split(2, 3);
		for (double item : ret) {
			System.out.println(" -> " + item);
		}

		ret = split(4, 3);
		for (double item : ret) {
			System.out.println(" -> " + item);
		}
		ret = split(6, 3);
		for (double item : ret) {
			System.out.println(" -> " + item);
		}
		ret = split(0.02, 3);
		for (double item : ret) {
			System.out.println(" -> " + item);
		}

	}
}
