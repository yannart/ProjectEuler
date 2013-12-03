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
	 * Test method for {@link net.projecteuler.yannart.problem1.MultiplesOf3And5Main#findSumMultiples3And5(int)}.
	 */
	@Test
	public void testFindSumMultiples3And5Example() {
		
		// Example from the problem description
		assertEquals(23, MultiplesOf3And5Main.findSumMultiples3And5(10));
	}
	
	/**
	 * Test method for {@link net.projecteuler.yannart.problem1.MultiplesOf3And5Main#findSumMultiples3And5(int)}.
	 */
	@Test
	public void testFindSumMultiples3And5() {
		
		// Problem to solve
		assertEquals(233168, MultiplesOf3And5Main.findSumMultiples3And5(1000));
	}

}
