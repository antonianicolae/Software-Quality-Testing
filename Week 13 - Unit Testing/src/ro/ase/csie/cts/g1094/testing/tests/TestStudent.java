package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.models.Student;

public class TestStudent {
	
	// test fixture
	static Student student = null;
	static ArrayList<Integer> grades = null;
	static int initialAge = 19;
	static String initialName = "John Doe";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		grades = new ArrayList<>();
		grades.add(5);
		grades.add(9);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName,initialAge,grades);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameRightValue() throws WrongNameException {
		
		String newName = "Alice";
		
		student.setName(newName);
		
		assertEquals("Testing with the right name", newName,student.getName());
		
	}
	
	@Test
	public void testSetAgeRightValue() {
		
		int newAge = initialAge + 1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with a right age", newAge,student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for a right value");
		}
		
	}
	
	@Test
	public void testSetAgeErrorCondition() {
		int newAge = initialAge * -1;
		try {
			student.setAge(newAge);
			fail("We didn't get an exception for negative age");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = WrongAgeException.class)
	public void testSetAgeErrorConditionGraterThanMax() throws WrongAgeException {
		int newAge = Student.MAX_AGE + 1000;
		student.setAge(newAge);
	}

}