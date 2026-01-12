package Core;

public class MultiDimensionalArray {
	public static void main(String a[]) {
		int nums[][]=new int[3][4];
		//i=rows j=cols
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		//printing random values
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j]=(int)(Math.random()*100); //since random() will generate less than 1 values, so multiply by 100 gives int
				System.out.println(nums[i][j]);
			}
		}
	}
}
