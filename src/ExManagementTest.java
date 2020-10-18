import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExManagementTest {
	private ExManagement management;
		
	@BeforeEach
	public void initialize() {
		management = new ExManagement();
	}
	
	@Test
	public void ExerciseListEmptyAtBeginning() {
		assertEquals(0, management.exerciseList().size());
	}
	
	@Test
	public void addingExerciseGrowsListByOne() {
		management.add("Adding a test");
		assertEquals(1, management.exerciseList().size());
	}
	
	@Test
	public void addedExerciseIsInList() {
		management.add("Adding a test");
		assertTrue(management.exerciseList().contains("Adding a test"));
	}
	
	@Test
	public void exerciseCanBeMarkedAsCompleted() {
		System.out.println("After");
		management.add("Adding a test");
		management.markAsCompleted("Adding a test");
		assertTrue(management.isCompleted("Adding a test"));
	}
	
	@Test
	public void ifNotMarkedCompletedIsNotCompleted() {
		this.management.add("New exercise");
		this.management.markAsCompleted("New exercise");
		assertFalse(this.management.isCompleted("Some exercises"));
	}
}
