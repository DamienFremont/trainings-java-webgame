package com.webgame.presentation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.webgame.model.Resource;
import com.webgame.model.ResourceType;

public class ResourceBeanTest {
	
	@Test
	public void test_That_CanShop_gold_Should_not_work() {
		// arrange
		ResourceBean classToTest = new ResourceBean();
		Resource gold = classToTest.getResourceList().get(0);
		assertEquals(ResourceType.GOLD, gold.getType());
		// act
		Boolean result = classToTest.canShop(gold);
		// assert
		assertFalse(result);
	}
	
	@Test
	public void test_That_CanShop_character_Should_work_When_enough_gold() {
		// arrange
		ResourceBean classToTest = new ResourceBean();
		Resource character = classToTest.getResourceList().get(1);
		assertEquals(ResourceType.CHARACTER, character.getType());
		// act
		Boolean result = classToTest.canShop(character);
		// assert
		assertTrue(result);
	}
	@Test
	public void test_That_CanShop_character_Should_not_work_When_not_enough_gold() {
		// arrange
		ResourceBean classToTest = new ResourceBean();
		Resource character = classToTest.getResourceList().get(1);
		assertEquals(ResourceType.CHARACTER, character.getType());
		Resource gold = classToTest.getResourceList().get(0);
		gold.setCount(0L);
		// act
		Boolean result = classToTest.canShop(character);
		// assert
		assertFalse(result);
	}
	
	@Test
	public void test_That_CanShop_wood_Should_not_work_When_not_enough_gold() {
		// arrange
		ResourceBean classToTest = new ResourceBean();
		Resource wood = classToTest.getResourceList().get(2);
		assertEquals(ResourceType.WOOD, wood.getType());
		Resource gold = classToTest.getResourceList().get(0);
		gold.setCount(0L);
		// act
		Boolean result = classToTest.canShop(wood);
		// assert
		assertFalse(result);
	}

}
