import static org.junit.Assert.*;

import org.junit.Test;

public class SlowLifeTest {
	//Testing the MainPanel.converToint() method.
	//The function of this method is input an integer then out put this integer.
	//This method is used in converting the number to neighborhood into integer.
	
	@Test
	public void testconvertToInt() {
		int input=(int)(Math.random()*7+1);
		int result_original=MainPanel.convertToInt(input);
		int result=MainPanel.convertToInt(input);
		assertEquals(result_original, result);
	}
	
	//The edge case for this method is the minimum number of neighbors an the maximum number of neighbors.
	//The minimum number of neighbors is 0;
	@Test
	public void testconvertToIntEdgeMin() {
		int input=0;
		int result_original=MainPanel.convertToInt(input);
		int result=MainPanel.convertToInt(input);
		assertEquals(result_original, result);
	}
	
	//The maximum number of neighbors is 8;
	@Test
	public void testconvertToIntEdgeMax() {
		int input=8;
		int result_original=MainPanel.convertToInt(input);
		int result=MainPanel.convertToInt(input);
		assertEquals(result_original, result);
	}
	
	//The function of method Cell.toString() is if the cell is true, return "X", else return "."
	//A cell has two conditions, true or false.
	@Test
	public void testtoString(){
		Cell cell=new Cell();
		String result_original=cell.toStringORIGINAL();
		String result=cell.toString();
		assertEquals(result_original, result);
	}
	
	@Test
	public void testtoStringT(){
		Cell cell=new Cell(true);
		String result_original=cell.toStringORIGINAL();
		String result=cell.toString();
		assertEquals(result_original, result);
	}
	
	@Test
	public void testtoStringF(){
		Cell cell=new Cell(false);
		String result_original=cell.toStringORIGINAL();
		String result=cell.toString();
		assertEquals(result_original, result);
		
	}
	
	
}
