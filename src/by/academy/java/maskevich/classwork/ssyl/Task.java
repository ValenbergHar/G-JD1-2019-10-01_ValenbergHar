package by.academy.java.maskevich.classwork.ssyl;

import java.util.Arrays;
import java.util.Collection;

public class Task {
	private enum Status {
		OPEN, CLOSED
	};

	private final Status status;
	private final Integer points;

	public Status getStatus() {
		return status;
	}

	public Integer getPoints() {
		return points;
	}

	public Task(Status status, Integer points) {
		super();
		this.status = status;
		this.points = points;
	}

	public static void main(String[] args) {
		final Collection<Task> tasks = Arrays.asList(
				new Task(Status.OPEN, 5), 
				new Task(Status.OPEN, 13),
				new Task(Status.CLOSED, 8));
		final long totalpointsOfOpenTask = tasks
				.stream()
				.parallel()//  
				.filter(task -> task.getStatus() == Status.OPEN)
				.mapToInt(Task::getPoints)
				.sum();
		System.out.printf("Total points: %s", totalpointsOfOpenTask);
	}

}