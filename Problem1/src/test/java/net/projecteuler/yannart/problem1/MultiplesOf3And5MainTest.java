/**
 * 
 */
package net.projecteuler.yannart.problem1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author T0115541
 * 
 */
public class MultiplesOf3And5MainTest {

	/**
	 * Test method for
	 * {@link net.projecteuler.yannart.problem1.MultiplesOf3And5Main#findSumMultiples3And5(int)}
	 * .
	 */
	@Test
	public void testFindSumMultiples3And5Example() {

		// Example from the problem description, the numbers are below 10
		assertEquals(23, MultiplesOf3And5Main.findSumMultiples3And5(10));
	}

	/**
	 * Test method for
	 * {@link net.projecteuler.yannart.problem1.MultiplesOf3And5Main#findSumMultiples3And5(int)}
	 * .
	 */
	@Test
	public void testFindSumMultiples3And5() {

		// Problem to solve, the numbers are below 1000
		assertEquals(233168, MultiplesOf3And5Main.findSumMultiples3And5(1000));
	}

	/**
	 * Test method for
	 * {@link net.projecteuler.yannart.problem1.MultiplesOf3And5Main#sumMultiples(int, int)}
	 * .
	 */
	@Test
	public void testSumMultiples() {

		// Test to add the multiples of 1 from 1 to 10
		assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10,
				MultiplesOf3And5Main.sumMultiples(1, 10));

		// Test to add the multiples of 2 from 1 to 20
		assertEquals(2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20,
				MultiplesOf3And5Main.sumMultiples(2, 20));

		// Test to add the multiples of 2 from 1 to 21
		assertEquals(2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20,
				MultiplesOf3And5Main.sumMultiples(2, 21));

		// Test to add the multiples of 5 from 1 to 9
		assertEquals(5, MultiplesOf3And5Main.sumMultiples(5, 9));

		// Test to add the multiples of 3 from 1 to 9
		assertEquals(3 + 6 + 9, MultiplesOf3And5Main.sumMultiples(3, 9));

		// Test to add the multiples of 15 from 1 to 9
		assertEquals(0, MultiplesOf3And5Main.sumMultiples(15, 9));
	}
}
