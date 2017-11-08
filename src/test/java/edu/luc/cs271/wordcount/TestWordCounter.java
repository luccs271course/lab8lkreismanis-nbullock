package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  private WordCounter fixture; 
  
  @Before
  public void setUp() {
    // DONE create the SUT instance
    Map<String, Integer> newMap = new HashMap<String, Integer>();
    fixture = new WordCounter(newMap);
  }

  @After
  public void tearDown() {
    // DONE set the SUT instance to null
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertEquals(fixture.getCounts(), Collections.emptyMap());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    final ArrayList<String> list = new ArrayList<String>(Arrays.asList("hello", "world", "hello", "cat", "dog"));
    fixture.countWords(list.iterator());
    assertEquals(fixture.getCount("hello"), 2);
    assertEquals(fixture.getCount("hi"), 0); 
    assertEquals(fixture.getCount("world"), 1);
    // fail();
  }
}
