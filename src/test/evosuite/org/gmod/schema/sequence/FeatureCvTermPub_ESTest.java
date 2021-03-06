/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:26:51 GMT 2018
 */

package org.gmod.schema.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.pub.Pub;
import org.gmod.schema.sequence.FeatureCvTerm;
import org.gmod.schema.sequence.FeatureCvTermPub;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FeatureCvTermPub_ESTest extends FeatureCvTermPub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      featureCvTermPub0.setFeatureCvTermPubId(634);
      int int0 = featureCvTermPub0.getFeatureCvTermPubId();
      assertEquals(634, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      featureCvTermPub0.setFeatureCvTermPubId((-2602));
      int int0 = featureCvTermPub0.getFeatureCvTermPubId();
      assertEquals((-2602), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      FeatureCvTerm featureCvTerm0 = featureCvTermPub0.getFeatureCvTerm();
      assertNull(featureCvTerm0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      FeatureCvTerm featureCvTerm0 = mock(FeatureCvTerm.class, new ViolatedAssumptionAnswer());
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub(pub0, featureCvTerm0);
      featureCvTermPub0.setFeatureCvTermPubId((-804));
      assertEquals((-804), featureCvTermPub0.getFeatureCvTermPubId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      Pub pub0 = featureCvTermPub0.getPub();
      assertNull(pub0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      FeatureCvTerm featureCvTerm0 = mock(FeatureCvTerm.class, new ViolatedAssumptionAnswer());
      featureCvTermPub0.setFeatureCvTerm(featureCvTerm0);
      assertEquals(0, featureCvTermPub0.getFeatureCvTermPubId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      Pub pub0 = mock(Pub.class, new ViolatedAssumptionAnswer());
      featureCvTermPub0.setPub(pub0);
      assertEquals(0, featureCvTermPub0.getFeatureCvTermPubId());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FeatureCvTermPub featureCvTermPub0 = new FeatureCvTermPub();
      int int0 = featureCvTermPub0.getFeatureCvTermPubId();
      assertEquals(0, int0);
  }
}
