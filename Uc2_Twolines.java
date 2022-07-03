package comarision;

public class Twolines_Uc2 {

	public static void main(String[] args) {
		int x1 = 4;
		int y1 = 5;
		int x2 = 8;
		int y2 = 7;
		int x3 = 2;
		int y3 = 6;
		int x4 = 3;
		int y4 = 9;
		System.out.println("line 1 start co-ordinates= " + x1+","+ y1);
		System.out.println("line 1 end co-ordinates= " + x2+","+ y2);
		double length_of_line1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("Length_of_line 1 = "+length_of_line1);
		
		System.out.println("line 2 start co-ordinates= " + x3+","+ y3);
		System.out.println("line 2 end co-ordinates= " + x4+","+ y4);
		double length_of_line2 = Math.sqrt((x4-x3)^2+(y4-y3)^2);
		System.out.println("Length_of_line 2 = "+length_of_line2);
		
		if(length_of_line1 == length_of_line2 )
			System.out.println(" line1 & line2 lengths are equal");
		else
			System.out.println(" line1 & line2 lengths are unequal");
	

	}

}
