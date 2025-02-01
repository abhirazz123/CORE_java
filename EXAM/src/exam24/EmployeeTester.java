package exam24;
abstract class Employee {
	protected String employeeName;
	protected String employeeDepartment;
	protected static int totalNoOfEmployees = 0;

	public Employee() {
		incrementTotalNoOfEmployees();
	}

	public Employee(String employeeName, String employeeDepartment) {
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		incrementTotalNoOfEmployees();
	}

	protected synchronized static void incrementTotalNoOfEmployees() {
		totalNoOfEmployees++;
	}

	public static int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}

	public abstract int getPerformanceScore();
}

class TechEmployee extends Employee {
	private int codingSkill;
	private int problemSolving;
	private int teamwork;
	private int score;
	private boolean scoreCalculated = false;

	public TechEmployee(String employeeName, String employeeDepartment, int codingSkill, int problemSolving, int teamwork) {
		super(employeeName, employeeDepartment);
		this.codingSkill = codingSkill;
		this.problemSolving = problemSolving;
		this.teamwork = teamwork;
	}

	@Override
	public synchronized int getPerformanceScore() {
		if (!scoreCalculated) {
			score = (codingSkill + problemSolving + teamwork) / 3;
			scoreCalculated = true;
			notify();
		}
		return score;
	}

	public synchronized boolean isPromoted() {
		while (!scoreCalculated) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return score >= 80;
	}
}

class HRExecutive extends Employee {
	private int communicationSkill;
	private int conflictResolution;
	private int score;
	private boolean scoreCalculated = false;

	public HRExecutive(String employeeName, String employeeDepartment, int communicationSkill, int conflictResolution) {
		super(employeeName, employeeDepartment);
		this.communicationSkill = communicationSkill;
		this.conflictResolution = conflictResolution;
	}

	@Override
	public synchronized int getPerformanceScore() {
		if (!scoreCalculated) {
			score = (communicationSkill + conflictResolution) / 2;
			scoreCalculated = true;
			notify();
		}
		return score;
	}

	public synchronized boolean isPromoted() {
		while (!scoreCalculated) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return score >= 75;
	}
}

public class EmployeeTester {
	public static void main(String[] args) {
		TechEmployee techEmployee = new TechEmployee("HARDIK", "IT", 85, 75, 90);
		HRExecutive hrExecutive = new HRExecutive("ROHIT", "HR", 80, 70);

		Thread techScoreThread = new Thread(() -> {
			System.out.println("Tech Employee: " + techEmployee.employeeName);
			System.out.println("Performance Score: " + techEmployee.getPerformanceScore());
			System.out.println("Promoted: " + (techEmployee.isPromoted() ? "Yes" : "No"));
		});

		Thread hrScoreThread = new Thread(() -> {
			System.out.println("HR Executive: " + hrExecutive.employeeName);
			System.out.println("Performance Score: " + hrExecutive.getPerformanceScore());
			System.out.println("Promoted: " + (hrExecutive.isPromoted() ? "Yes" : "No"));
		});

		techScoreThread.start();
		hrScoreThread.start();

		try {
			techScoreThread.join();
			hrScoreThread.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Total Number of Employees: " + Employee.getTotalNoOfEmployees());
	}
}
