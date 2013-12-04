/**
 * 
 */
package net.projecteuler.yannart.problem1;

/**
 * Problem1: If we list all the natural numbers below 10 that are multiples of 3
 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author Yann Nicolas.
 */
public class MultiplesOf3And5Main {

	/**
	 * Optimal solution.
	 * 
	 * Do the sum of the numbers multiples of 3 or 5 below the limit number.
	 * 
	 * @param limitNum
	 *            limit number.
	 * @return sum
	 */
	public static int findSumMultiples3And5(int limitNum) {

		return sumMultiples(3, limitNum - 1) + sumMultiples(5, limitNum - 1)
				- sumMultiples(3 * 5, limitNum - 1);
	}

	/**
	 * Calculates the sum of the multiples of <code>coef</code> from 0 to limit
	 * excluded.
	 * 
	 * @param coef
	 *            coefficient to find its multiples.
	 * @param limit
	 *            maximum excluded number for the sum.
	 * @return sum of the multiples of <code>coef</code> from 0 to limit
	 *         included
	 */
	public static int sumMultiples(int coef, int limit) {

		/*
		 * The sum of multiples of 5 with a limit of 22 for eg: 5 + 10 + 15 + 20
		 * => 5 * (1 + 2 + 3 + 4) => 5 * ((1 + 4) / 2) * 4
		 * 
		 * If M is the multiple coef and L the limit number: M ((1 + L/M) / 2) *
		 * L/M
		 */

		int n = limit / coef;

		return coef * (int) ((1 + n) / 2d * n);
	}

	/**
	 * Obvious not optimized solution.
	 * 
	 * Do the sum of the numbers multiples of 3 or 5 below the limit number.
	 * 
	 * @param limitNum
	 *            limit number.
	 * @return sum
	 */
	public static int findSumMultiples3And5Obvious(int limitNum) {

		int sum = 0;

		for (int i = 0; i < limitNum; i++) {

			// Use modulo to find multiples
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return sum;
	}
}
