import junit.framework.*;
import org.junit.Test;

public class Testhamming extends TestCase {
	
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);

	}
	@Test
	public void testDifferentString() throws Exception{

		assertEquals(0,Hamming.distance("0","0"));
	}
	@Test
	public void testDiff1() throws Exception{

		assertEquals(1,Hamming.distance("1","0"));
	}
	@Test
	public void testDiff2() throws Exception{

		assertEquals(3,Hamming.distance("1100","0111"));
	}
	@Test 
	public void testDiff3() throws Exception{

		assertEquals(4,Hamming.distance("00000","1110"));
	}
	@Test 
	public void testDiff4() throws Exception{
		assertEquals(3,Hamming.distance("aaa","bbb"));
	}
}
