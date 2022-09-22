package main;

public abstract class Tree {

	String name;
	double trunkHeight;
	int numberOfBranches;
	double maxHeight;
	double annualGrowth;	

	public Tree(String name, double trunkHeight, int numberOfBranches, double maxHeight, double annualGrowth) {
		this.name = name;
		this.trunkHeight = trunkHeight;
		this.numberOfBranches = numberOfBranches;
		this.maxHeight = maxHeight;
		this.annualGrowth = annualGrowth;
	}

	void info() {
		System.out.println("Tree name: " + name);
		System.out.println("It grows up to " + annualGrowth + "m a year and reaches " + maxHeight + " meters");
		System.out.println("Currently height of tree is " + trunkHeight + "m, number of branches: " + numberOfBranches);
	}
	
	void grow(double growth) {
		trunkHeight += growth;
		System.out.println("Tree name: " + name + ", grows up " + growth + "m.");
	}
	
	void addBranches(int newBranches) {
		numberOfBranches += newBranches;
		System.out.println("Tree name: " + name + ", has " + newBranches + " new branches");
	}
	
	public abstract void printSummaryOfTree();
}
