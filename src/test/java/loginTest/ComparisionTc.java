package loginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisionTc {
  @Test
  public void checkingComparision() {
	  Assert.assertTrue(50>6);
	  System.out.println("testing done");
  }
}
