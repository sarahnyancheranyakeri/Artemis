/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:36:22 GMT 2018
 */

package uk.ac.sanger.artemis.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.sequence.Marker;
import uk.ac.sanger.artemis.sequence.MarkerChangeEvent;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MarkerChangeEvent_ESTest extends MarkerChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Marker marker0 = mock(Marker.class, new ViolatedAssumptionAnswer());
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, (Strand) null, 0);
      Strand strand0 = markerChangeEvent0.getStrand();
      assertNull(strand0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MarkerChangeEvent markerChangeEvent0 = null;
      try {
        markerChangeEvent0 = new MarkerChangeEvent((Marker) null, (Strand) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Marker marker0 = mock(Marker.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(marker0).toString();
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, strand0, 2);
      Marker marker1 = markerChangeEvent0.getMarker();
      assertEquals(0, Marker.LISTENER_PRIORITY);
  }
}