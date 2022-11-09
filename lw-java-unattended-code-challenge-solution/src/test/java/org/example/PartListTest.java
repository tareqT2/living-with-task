package org.example;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.example.model.Part;
import org.example.utils.PartsUtils;
import org.junit.Before;
import org.junit.Test;

public class PartListTest {
	
	private static final Part[] TEST_PARTS_1 = {

	};

	private static final Part[] TEST_PARTS_2 = {
		Part.BLUE_BLOCK_SMALL
	};
	
	private static final Part[] TEST_PARTS_3 = {
		Part.RED_BLOCK_LARGE
	};
	
	private static final Part[] TEST_PARTS_4 = {
			Part.BLUE_BLOCK_SMALL,
			Part.BLUE_BLOCK_SMALL,
			Part.BLUE_BLOCK_MEDIUM,
			Part.BLUE_BLOCK_LARGE
	};

	private static final Part[] TEST_PARTS_5 = {
		Part.BLUE_BLOCK_SMALL,
		Part.RED_BLOCK_SMALL,
		Part.RED_BLOCK_MEDIUM,
		Part.RED_BLOCK_MEDIUM
	};
	
	private static final Part[] TEST_PARTS_6 = {
		Part.BLUE_BLOCK_MEDIUM,
		Part.BLUE_BLOCK_LARGE,
		Part.BLUE_BLOCK_LARGE,
		Part.RED_BLOCK_MEDIUM,
		Part.RED_BLOCK_LARGE
	};

	private static final List<Part> TEST_PARTS_7 = Arrays.asList(Part.values());

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testGetTotal_ForPartsList() {
		assertEquals(0.0, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_1)), 0);

		assertEquals(10.0, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_2)), 0);

		assertEquals(40.00, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_3)), 0);

		assertEquals(80.0, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_4)), 0);
		
		assertEquals(60.0, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_5)), 0);
		
		assertEquals(160.0, PartsUtils.getTotalWeight(Arrays.asList(TEST_PARTS_6)), 0);

		assertEquals(140.0, PartsUtils.getTotalWeight(TEST_PARTS_7), 0);
	}

	@Test
	public void testToList() {
		String expectedList =
				"TOTAL WEIGHT : 0.00g\n";

		List<Part> parts = Arrays.asList(TEST_PARTS_1);
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		parts = Arrays.asList(TEST_PARTS_2);
		expectedList =
				"1 BLUE_BLOCK_SMALL (10.00g each) : 10.00g\n" +
				"TOTAL WEIGHT : 10.00g\n";
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		
		expectedList = "1 RED_BLOCK_LARGE (40.00g each) : 40.00g\n" +
						"TOTAL WEIGHT : 40.00g\n";
		parts = Arrays.asList(TEST_PARTS_3);
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		parts = Arrays.asList(TEST_PARTS_4);
		expectedList = 
				"2 BLUE_BLOCK_SMALL (10.00g each) : 20.00g\n" +
				"1 BLUE_BLOCK_MEDIUM (20.00g each) : 20.00g\n" +
				"1 BLUE_BLOCK_LARGE (40.00g each) : 40.00g\n" +
				"TOTAL WEIGHT : 80.00g\n";
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		parts = Arrays.asList(TEST_PARTS_5);
		expectedList = 
				"1 BLUE_BLOCK_SMALL (10.00g each) : 10.00g\n" +
				"1 RED_BLOCK_SMALL (10.00g each) : 10.00g\n" +
				"2 RED_BLOCK_MEDIUM (20.00g each) : 40.00g\n" +
				"TOTAL WEIGHT : 60.00g\n";
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		
		parts = Arrays.asList(TEST_PARTS_6);
		expectedList = 
				"1 BLUE_BLOCK_MEDIUM (20.00g each) : 20.00g\n" +
				"2 BLUE_BLOCK_LARGE (40.00g each) : 80.00g\n" +
				"1 RED_BLOCK_MEDIUM (20.00g each) : 20.00g\n" +
				"1 RED_BLOCK_LARGE (40.00g each) : 40.00g\n" +
				"TOTAL WEIGHT : 160.00g\n";
		assertEquals(expectedList, PartsUtils.toList(parts));
		
		expectedList = 
				"1 RED_BLOCK_SMALL (10.00g each) : 10.00g\n" +
				"1 RED_BLOCK_MEDIUM (20.00g each) : 20.00g\n" +
				"1 RED_BLOCK_LARGE (40.00g each) : 40.00g\n" +
				"1 BLUE_BLOCK_SMALL (10.00g each) : 10.00g\n" +
				"1 BLUE_BLOCK_MEDIUM (20.00g each) : 20.00g\n" +
				"1 BLUE_BLOCK_LARGE (40.00g each) : 40.00g\n" +
				"TOTAL WEIGHT : 140.00g\n";
		assertEquals(expectedList, PartsUtils.toList(TEST_PARTS_7));
		
	}

}
