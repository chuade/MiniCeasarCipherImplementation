
import org.junit.Assert;
import org.junit.Test;

public class TestCeasarCipher {

	@Test
	 public void testEncipher() throws Exception {
	 CeasarCipher c = new CeasarCipher(4);
	 Assert.assertEquals("LIPPS", c.encipher("HELLO"));
	 
	 c = new CeasarCipher(0);
	 Assert.assertEquals("HELLO", c.encipher("HELLO"));
	 
	 c = new CeasarCipher(-1);
	 Assert.assertEquals("Ana fhudr 0//$ sn @khbd.", c.encipher("Bob gives 100$ to Alice.") );
	 }

}
