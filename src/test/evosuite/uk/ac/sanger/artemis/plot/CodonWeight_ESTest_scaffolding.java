/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Sep 19 19:49:32 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CodonWeight_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.plot.CodonWeight"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CodonWeight_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.util.FileDocument"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CodonWeight_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.ActionVector",
      "org.biojava.bio.seq.db.SimpleIndex",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.Feature",
      "org.biojava.bio.seq.io.GenbankFormat",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "org.biojava.bio.seq.io.SmartSequenceBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SmartSequenceBuilder",
      "org.biojava.utils.ChangeType",
      "org.biojava.utils.Unchangeable",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.bio.symbol.SoftMaskedAlphabet$MaskingDetector$DefaultMaskingDetector",
      "org.biojava.bio.symbol.SoftMaskedAlphabet$MaskingDetector",
      "org.biojava.bio.symbol.SoftMaskedAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.utils.cache.WeakValueHashMap",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.utils.ListTools$5",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.utils.ClassTools",
      "org.biojava.utils.stax.SAX2StAXAdaptor",
      "org.biojava.utils.stax.StAXContentHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler",
      "org.biojava.utils.stax.SAX2StAXAdaptor$HandlerBinding",
      "org.biojava.utils.stax.SAX2StAXAdaptor$S2SDelegationManager",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.stax.StringElementHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler$1",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "org.biojava.utils.ChangeListener",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.utils.ChangeType$1",
      "org.biojava.utils.ChangeForwarder",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler$1",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler$MappingHandler",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.IntegerAlphabet$SubIntegerAlphabet",
      "org.biojava.utils.ListTools$Doublet",
      "org.biojava.bio.symbol.SparseCrossProductAlphabet",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.seq.db.EmblCDROMIndexStore",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.FilteredEntryGroup$1",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.biojava.bio.seq.io.GAMEFormat",
      "org.biojava.bio.seq.io.GenbankProcessor$Factory",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.FilteredEntryGroup$2",
      "uk.ac.sanger.artemis.FilteredEntryGroup$3",
      "org.biojava.bio.seq.db.TabIndexStore",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.SimpleGotoEventSource",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.j2ssh.SshFileManager",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "org.biojava.bio.seq.io.GenpeptFormat",
      "org.biojava.bio.seq.io.EmblLikeFormat",
      "org.biojava.bio.seq.io.ProteinRefSeqProcessor$Factory",
      "uk.ac.sanger.artemis.FeaturePatternPredicate",
      "org.biojava.bio.seq.io.IntegerTokenization",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.seq.io.SeqIOAdapter",
      "org.biojava.bio.symbol.SimpleSymbolList$SSLIOListener",
      "org.biojava.bio.seq.io.WordTokenization$WordStreamParser",
      "uk.ac.sanger.artemis.io.BioJavaSequence",
      "org.biojava.bio.seq.io.SymbolListCharSequence",
      "org.biojava.bio.seq.io.SimpleSequenceBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SimpleSequenceBuilder",
      "org.biojava.bio.seq.io.SwissprotProcessor$Factory",
      "org.biojava.bio.seq.io.DoubleTokenization",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.biojava.bio.program.phred.PhredFormat",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.FeaturePredicateVector",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.FilteredEntryGroup$FeatureEnumerator",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.FeatureKeyPredicate",
      "org.biojava.bio.seq.io.EmblProcessor$Factory",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry",
      "uk.ac.sanger.artemis.io.MSPcrunchEntryInformation",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.io.GenbankDocumentEntry",
      "org.biojava.bio.seq.NewSimpleAssembly",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.SimpleFeatureRealizer$TemplateImpl",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.seq.impl.NewAssembledSymbolList",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.seq.io.CharacterTokenization$TPStreamParser",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.DNATools",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.EntryGroupPanel$1",
      "uk.ac.sanger.artemis.j2ssh.SshPSUClient",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.io.FeatureComparator",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.FeatureFromVectorPredicate",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder",
      "org.biojava.bio.taxa.AbstractTaxon",
      "org.biojava.bio.taxa.SimpleTaxon",
      "org.biojava.bio.taxa.SimpleTaxonFactory",
      "org.biojava.bio.taxa.EbiFormat",
      "org.biojava.bio.seq.io.OrganismParser$Factory",
      "org.biojava.bio.seq.io.SubIntegerTokenization",
      "org.biojava.bio.seq.db.emblcd.EmblCDROMIndexReader",
      "org.biojava.bio.seq.db.emblcd.DivisionLkpReader",
      "org.biojava.bio.seq.db.emblcd.RecordParser",
      "org.biojava.bio.seq.io.GenbankXmlFormat",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFEntryInformation",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "uk.ac.sanger.artemis.io.IndexFastaStream",
      "org.biojava.bio.seq.io.FastaDescriptionLineParser$Factory",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "uk.ac.sanger.artemis.plot.FeatureAlgorithm",
      "uk.ac.sanger.artemis.plot.CoilFeatureAlgorithm",
      "org.biojava.bio.symbol.DoubleAlphabet$SubDoubleAlphabet",
      "uk.ac.sanger.artemis.GotoEvent",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "org.biojava.bio.seq.Feature",
      "org.biojava.bio.symbol.DNAAmbPack",
      "org.biojava.utils.SmallSet",
      "uk.ac.sanger.artemis.SimpleEntryGroup$FeatureEnumerator",
      "org.biojava.bio.symbol.IntegerAlphabet$IntegerArray",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.components.LogReadListener",
      "uk.ac.sanger.artemis.io.BlastDocumentEntry",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.biojava.bio.seq.io.FastaFormat"
    );
  }
}
