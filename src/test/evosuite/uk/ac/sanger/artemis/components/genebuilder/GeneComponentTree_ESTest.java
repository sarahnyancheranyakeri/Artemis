/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 18:52:58 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.genebuilder.GeneBuilderFrame;
import uk.ac.sanger.artemis.components.genebuilder.GeneComponentTree;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.Feature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GeneComponentTree_ESTest extends GeneComponentTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = mock(ChadoCanonicalGene.class, new ViolatedAssumptionAnswer());
      doReturn((Feature) null).when(chadoCanonicalGene0).getGene();
      GeneBuilderFrame geneBuilderFrame0 = mock(GeneBuilderFrame.class, new ViolatedAssumptionAnswer());
      Selection selection0 = mock(Selection.class, new ViolatedAssumptionAnswer());
      GeneComponentTree geneComponentTree0 = null;
      try {
        geneComponentTree0 = new GeneComponentTree(chadoCanonicalGene0, geneBuilderFrame0, selection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneComponentTree", e);
      }
  }
}
