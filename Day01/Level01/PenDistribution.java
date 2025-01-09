public class PenDistribution{
	public static void main(String[]args){
		
		int totalPen = 14;
		int totalChildren = 3;
		
		int penPerChild = totalPen / totalChildren;
		int remainingPen = totalPen % totalChildren;
		
		System.out.println("The Pen Per Student is " + penPerChild + " and the remaining pen not distributed is " + remainingPen);
	}
}

