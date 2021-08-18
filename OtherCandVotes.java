package findNoOfVotes;
import java.util.Scanner;
public class OtherCandVotes {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int firstVotesPerc=55;
	 int invalidvotesPerc=20;
     int totalVotes=sc.nextInt();
     
	 int validVotesPerc=100-invalidvotesPerc;
	 int secondVotesPerc=100-firstVotesPerc;
	 int totalValidVotes=totalVotes*validVotesPerc/100;
	 int secondValidVotes=totalValidVotes*secondVotesPerc/100;
	 System.out.print(secondValidVotes);
 }
}
