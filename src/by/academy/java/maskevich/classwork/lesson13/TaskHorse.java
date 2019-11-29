package by.academy.java.maskevich.classwork.lesson13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TaskHorse {
	private static final int DELAY_BEFORE_KILL_HORSE = 20000;
	private static final int STEP_DELAY_MS = 1000;
	private static final int DISTANCE = 50;
	private static boolean IS_HORSE_KILLED = false;
	private static final Random RND = new Random();

	public static void main(String[] args) throws InterruptedException {
		List<Horse> list = new ArrayList<>();

		for (int i = 0; i < RND.nextInt(6) + 3; i++) {
			Horse horse = new Horse(":)" + i);
			horse.start();
			list.add(horse);
		}

		runPrinterThread(list);
	}

	static class Horse extends Thread {
		private boolean killed;
		private int steps;
		private Long distanceTimeSeconds;

		private Horse(String name) {
			super(name);
		}

		@Override
		public void run() {
			long startTime = new Date().getTime();

			while (DISTANCE > steps) {
				if (killed) {
					return; // stop the thread
				}

				steps = Math.min(steps + RND.nextInt(3), DISTANCE);
				try {
					Thread.sleep(STEP_DELAY_MS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			distanceTimeSeconds = ((new Date().getTime() - startTime) / 1000);
		}

		public Long getDistanceTimeSeconds() {
			return distanceTimeSeconds;
		}

		public int getSteps() {
			return steps;
		}

		public void kill() {
			this.killed = true;
		}

		public boolean isKilled() {
			return killed;
		}
	}
	

	private static void runPrinterThread(List<Horse> list) {

		long startTime = new Date().getTime();

		while (true) {
			if (isTimeToKillOne(startTime)) {
				int randomIndex = RND.nextInt(list.size() - 1);

				list.get(randomIndex).kill();
				IS_HORSE_KILLED = true;

			}
			printHorsesStatus(list);

			if (!anyAlive(list)) {
				return;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static boolean isTimeToKillOne(long startTime) {
		return !IS_HORSE_KILLED && new Date().getTime() - startTime >= DELAY_BEFORE_KILL_HORSE;
	}

	private static boolean anyAlive(List<Horse> list) {
		for (Horse horse : list) {
			if (horse.isAlive()) {
				return true;
			}
		}
		return false;
	}

	private static void printHorsesStatus(List<Horse> list) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

		for (Horse horse : list) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < horse.getSteps(); i++) {
				sb.append("-");
			}

			sb.append(">" + horse.getName());

			for (int i = horse.getSteps(); i < DISTANCE; i++) {
				sb.append(" ");
			}

			sb.append("|");
			if (horse.isKilled()) {
				sb.append("KILLED");
			} else if (horse.getDistanceTimeSeconds() != null) {
				sb.append(horse.getDistanceTimeSeconds() + " seconds");
			}
			System.out.println(sb);
		}
	}
}