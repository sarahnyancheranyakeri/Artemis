/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:35:54 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ChangeEvent;
import uk.ac.sanger.artemis.ChangeEventVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ChangeEventVector_ESTest extends ChangeEventVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChangeEventVector changeEventVector0 = new ChangeEventVector();
      changeEventVector0.add((ChangeEvent) null);
      int int0 = changeEventVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChangeEventVector changeEventVector0 = new ChangeEventVector();
      changeEventVector0.add((ChangeEvent) null);
      changeEventVector0.add((ChangeEvent) null);
      changeEventVector0.add((ChangeEvent) null);
      ChangeEvent changeEvent0 = changeEventVector0.elementAt(2);
      assertNull(changeEvent0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChangeEventVector changeEventVector0 = new ChangeEventVector();
      // Undeclared exception!
      try { 
        changeEventVector0.elementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChangeEventVector changeEventVector0 = new ChangeEventVector();
      int int0 = changeEventVector0.size();
      assertEquals(0, int0);
  }
}