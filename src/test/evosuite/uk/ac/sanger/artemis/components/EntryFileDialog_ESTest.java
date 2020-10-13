/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:02:00 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.File;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.EntryFileDialog;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.FileDocument;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;
import uk.ac.sanger.artemis.util.URLDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EntryFileDialog_ESTest extends EntryFileDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertNull(uRL0.getRef());
      assertEquals("http", uRL0.getProtocol());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNotNull(uRL0);
      
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertNull(uRL0.getRef());
      assertEquals("http", uRL0.getProtocol());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals((-1), uRL0.getDefaultPort());
      assertEquals("fooExample", uRLDocument0.getName());
      assertTrue(uRLDocument0.readable());
      assertFalse(uRLDocument0.writable());
      assertNotNull(uRLDocument0);
      
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, uRLDocument0, blastEntryInformation0, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, (Document) null, blastEntryInformation0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryFileDialog", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      assertFalse(simpleEntryInformation0.useEMBLFormat());
      assertNotNull(simpleEntryInformation0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, (Document) null, simpleEntryInformation0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryFileDialog", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals((-1), uRL0.getDefaultPort());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("http", uRL0.getProtocol());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertNotNull(uRL0);
      
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals((-1), uRL0.getDefaultPort());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("http", uRL0.getProtocol());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertTrue(uRLDocument0.readable());
      assertEquals("fooExample", uRLDocument0.getName());
      assertFalse(uRLDocument0.writable());
      assertNotNull(uRLDocument0);
      
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, uRLDocument0, blastEntryInformation0, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      File file0 = MockFile.createTempFile("@&[M&%!P#RMY", "6kqa");
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals("@&[M&%!P#RMY06kqa", file0.getName());
      assertTrue(file0.isAbsolute());
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals(0L, file0.length());
      assertTrue(file0.canExecute());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/@&[M&%!P#RMY06kqa", file0.toString());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T", file0.getParent());
      assertTrue(file0.isFile());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertNotNull(file0);
      
      boolean boolean0 = file0.delete();
      assertTrue(boolean0);
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.lastModified());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals("@&[M&%!P#RMY06kqa", file0.getName());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getTotalSpace());
      assertFalse(file0.canRead());
      assertEquals(0L, file0.length());
      assertFalse(file0.canWrite());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/@&[M&%!P#RMY06kqa", file0.toString());
      assertFalse(file0.exists());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T", file0.getParent());
      assertTrue(file0.isFile());
      assertFalse(file0.canExecute());
      
      FileDocument fileDocument0 = new FileDocument(file0);
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.lastModified());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals("@&[M&%!P#RMY06kqa", file0.getName());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getTotalSpace());
      assertFalse(file0.canRead());
      assertEquals(0L, file0.length());
      assertFalse(file0.canWrite());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/@&[M&%!P#RMY06kqa", file0.toString());
      assertFalse(file0.exists());
      assertEquals("/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T", file0.getParent());
      assertTrue(file0.isFile());
      assertFalse(file0.canExecute());
      assertEquals("@&[M&%!P#RMY06kqa", fileDocument0.getName());
      assertFalse(fileDocument0.writable());
      assertNotNull(fileDocument0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, fileDocument0, blastEntryInformation0, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(blastEntryInformation0);
      
      JPasswordField jPasswordField0 = new JPasswordField();
      assertFalse(jPasswordField0.isFocusCycleRoot());
      assertTrue(jPasswordField0.getFocusTraversalKeysEnabled());
      assertFalse(jPasswordField0.getIgnoreRepaint());
      assertFalse(jPasswordField0.isFocusTraversalPolicySet());
      assertFalse(jPasswordField0.isFocusTraversalPolicyProvider());
      assertNotNull(jPasswordField0);
      
      DatabaseDocument databaseDocument0 = new DatabaseDocument("@&[M&%!P#RMY", jPasswordField0);
      assertFalse(DatabaseDocument.CHADO_INFER_CDS);
      assertFalse(jPasswordField0.isFocusCycleRoot());
      assertTrue(jPasswordField0.getFocusTraversalKeysEnabled());
      assertFalse(jPasswordField0.getIgnoreRepaint());
      assertFalse(jPasswordField0.isFocusTraversalPolicySet());
      assertFalse(jPasswordField0.isFocusTraversalPolicyProvider());
      assertEquals("1", databaseDocument0.getSrcFeatureId());
      assertTrue(databaseDocument0.isSingleSchema());
      assertTrue(databaseDocument0.readable());
      assertTrue(databaseDocument0.writable());
      assertTrue(databaseDocument0.isLazyFeatureLoad());
      assertNotNull(databaseDocument0);
      
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, databaseDocument0, blastEntryInformation0, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      File file0 = MockFile.createTempFile("@&[M&%!P#RMY", "6kqa");
      FileDocument fileDocument0 = new FileDocument(file0);
      uk.ac.sanger.artemis.io.Entry entry0 = EntryFileDialog.getEntryFromFile((JFrame) null, fileDocument0, blastEntryInformation0, false);
      assertFalse(entry0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      JPasswordField jPasswordField0 = new JPasswordField();
      DatabaseDocument databaseDocument0 = new DatabaseDocument("@&[M&%!P##MY", jPasswordField0);
      // Undeclared exception!
      try { 
        EntryFileDialog.getEntryFromFile((JFrame) null, databaseDocument0, blastEntryInformation0, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}