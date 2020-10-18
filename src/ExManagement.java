import java.util.ArrayList;

public class ExManagement {
	private ArrayList<Exercise> exercises;
	
	public ExManagement() {
		this.exercises = new ArrayList<Exercise>();
	}
	
	public ArrayList<String> exerciseList() {
		ArrayList<String> list = new ArrayList<String>();
		for (Exercise exercise : this.exercises) {
			list.add(exercise.getName());
		}
		return list;
	}
	
	public void add(String exercise) {
		this.exercises.add(new Exercise(exercise));
	}
	
	public void markAsCompleted(String exercise) {
		for (Exercise ex : this.exercises) {
			if (ex.getName().equals(exercise)) {
				ex.setCompleted(true);
			}
		}
	}
	
	public boolean isCompleted(String exercise) {
		for (Exercise ex : this.exercises) {
			if (ex.getName().equals(exercise)) {
				return ex.isCompleted();
			}
		}
		return false;
	}
}
