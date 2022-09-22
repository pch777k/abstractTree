package main;

public class DeciduousTree extends Tree{

	private boolean hasLeaves;
	
	public DeciduousTree(String name, 
			double trunkHeight, 
			int numberOfBranches, 
			double maxHeight, 
			double annualGrowth,
			boolean hasLeaves) {
		super(name, trunkHeight, numberOfBranches, maxHeight, annualGrowth);
		this.hasLeaves = hasLeaves;
	}
	
	public boolean isHasLeaves() {
		return hasLeaves;
	}

	public void setHasLeaves(boolean hasLeaves) {
		this.hasLeaves = hasLeaves;
	}

	@Override
	public void printSummaryOfTree() {
		info();

		if(hasLeaves) {
			System.out.println("Thera are leaves on the branches");
		} else {
			System.out.println("There aren't leaves on the branches");
		}
	}
	
	public void addLeaves() {
		hasLeaves = true;
		System.out.println("The leaves have grown on the tree");
	}
	
	public void removeLeaves() {
		hasLeaves = false;
		System.out.println("The leaves have fallen from the tree");
	}

}