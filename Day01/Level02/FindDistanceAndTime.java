import java.util.Scanner;

public class FindDistanceAndTime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String fromCity = sc.next();
		String viaCity = sc.next();
		String toCity = sc.next();
		
		double distanceFromToVia = sc.nextDouble();
		double distanceViaToFinalCity = sc.nextDouble();
		
		int timeFromToVia = sc.nextInt();
		int timeViaToFinalCity = sc.nextInt();
		
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;

		int totalTime = timeFromToVia + timeViaToFinalCity;

		System.out.println("The Total Distance travelled by " + name + " from " + 
							fromCity + " to " + toCity + " via " + viaCity +
							" is " + totalDistance + " km and " +
							"the Total Time taken is " + totalTime + " minutes");
   }

}


