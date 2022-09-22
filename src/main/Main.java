package main;

public class Main {
	public static void main(String[] args) {
		
		
		DeciduousTree oak = new DeciduousTree("Oak", 4.0, 25, 40.0, 0.8, true);
		
		oak.printSummaryOfTree();
		System.out.println("----------------------------------");
		oak.grow(0.5);
		oak.addBranches(7);
		oak.removeLeaves();
		System.out.println("----------------------------------");
		oak.printSummaryOfTree();
		System.out.println("----------------------------------");
		
		Tree pine = new ConiferTree("Pine", 7.5, 46, 48, 0.5);
		pine.printSummaryOfTree();
		System.out.println("----------------------------------");
		pine.grow(0.3);
		pine.addBranches(11);
		System.out.println("----------------------------------");
		pine.printSummaryOfTree();
	}

}
