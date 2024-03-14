import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook grade1;
	GradeBook grade2;

	@BeforeEach
	void setUp() throws Exception 
	{
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(80);
		grade1.addScore(75);
		
		grade2.addScore(90);
		grade2.addScore(68);
		grade2.addScore(53);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testAddScore() 
	{
		//fail("Not yet implemented");
		String actualString1 = grade1.toString();
        assertTrue(actualString1.contains("75.0"));
        assertTrue(actualString1.contains("80.0"));
        
        assertEquals(2L, grade1.getScoreSize());
        
        
        String actualString2 = grade2.toString();
        assertTrue(actualString2.contains("68.0"));
        assertTrue(actualString2.contains("90.0"));
        assertTrue(actualString2.contains("53.0"));
        
        assertEquals(3L, grade2.getScoreSize());
		
	}

	@Test
	void testSum() 
	{
		//fail("Not yet implemented");
		double expectedSum1 = 80 + 75;
		double actualSum1 = grade1.sum();
		
		assertEquals(expectedSum1, actualSum1);
		
		double expectedSum2 = 90 + 68 + 53;
		double actualSum2 = grade2.sum();
		
		assertEquals(expectedSum2, actualSum2);
		
	}

	@Test
	void testMinimum() 
	{
		//fail("Not yet implemented");
		double expectedMin1 = 75;
		double actualMin1 = grade1.minimum();
		
		assertEquals(expectedMin1, actualMin1);
		
		double expectedMin2 = 53;
		double actualMin2 = grade2.minimum();
		
		assertEquals(expectedMin2, actualMin2);
		
	}

	@Test
	void testFinalScore() 
	{
		//fail("Not yet implemented");
		double expectedFinalScore1 = 80;
		double actualFinalScore1 = grade1.finalScore();
		
		double expectedFinalScore2 = 90 + 68;
		double actualFinalScore2 = grade2.finalScore();
	}

}
