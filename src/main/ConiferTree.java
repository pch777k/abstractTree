package main;

public class ConiferTree extends Tree {

	public ConiferTree(String name, double trunkHeight, int numberOfBranches, double maxHeight, double annualGrowth) {
		super(name, trunkHeight, numberOfBranches, maxHeight, annualGrowth);
	}	
	
	@Override
	public void printSummaryOfTree() {
		info();
		System.out.println("The tree is green and has needles on its branches all year round");	
	}
	
}
