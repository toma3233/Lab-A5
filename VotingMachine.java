/**
 * 
 * Tom Abraham
 * period #1
 *
 */
public class VotingMachine {
	private int dVotes;
	private int rVotes;
	private int iVotes;
	
	public VotingMachine() {
		dVotes = 0;
		rVotes = 0;
		iVotes = 0;
	}
	
	public VotingMachine(int demVotes, int repVotes, int indVotes){
		dVotes = demVotes;
		rVotes = repVotes;
		iVotes = indVotes;
		
	}
	
	public int getDemocratVotes() {
		return dVotes;
	}
	public int getRepublicanVotes() {
		return rVotes;
	}
	public int getIndependentVotes() {
		return iVotes;
	}
	
	public void setDemocratVotes(int demVotes) {
		dVotes = demVotes;
	}
	public void setRepublicanVotes(int repVotes) {
		rVotes = repVotes;
	}
	public void setIndependentVotes(int indVotes) {
		iVotes = indVotes;
	}
	
	public void voteDemocrat() {
		dVotes++;
		//return dVotes;
	}
	public void voteRepublican() {
		 rVotes++;
		//return dVotes;
	}
	public void voteIndependent() {
		iVotes++;
		//return iVotes;
	}
	
	public void voteDemocrat(int givenAMT1) {
		dVotes += givenAMT1;
		// dVotes;
	}
	public void voteRepublican(int givenAMT1) {
		rVotes += givenAMT1;
		//return rVotes;
	}
	public void voteIndependent(int givenAMT1) {
		iVotes += givenAMT1;
		//return iVotes;
	}
	
	public void clear() {
		dVotes = 0;
		rVotes = 0;
		iVotes = 0;
	}
	
	public int totalVotes() {
		int tVotes = this.dVotes + this.rVotes + this.iVotes;
		return tVotes;
	}
	
	public double percentDemocrat() {
		double pDemocrat = ((double)dVotes / totalVotes()) * 100;
		return pDemocrat;
	}
	public double percentRepublican() {
		double pRepublican = ((double)rVotes / totalVotes()) * 100;
		return pRepublican;
	}
	public double percentIndependent() {
		double pIndependent = ((double)iVotes / totalVotes()) * 100;
		return pIndependent;
	}
	
	public void printStats() {
		System.out.printf("Total votes: %d ", totalVotes());
		System.out.printf("\nPercent Democrat Votes: %.14f\n", percentDemocrat());
		System.out.printf("Percent Republican Votes: %f\n", percentRepublican());
		System.out.printf("Percent Independent Votes: %.15f\n", percentIndependent());
		

	}
	
}
