package day27_arrays_part4_TwoDimentions;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		//toString()
		
		
		int [] nums= {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums));
		
		//equals
		
		
				int [] nums1= {43,12,4,1,3,5};
				int [] nums2= {43,12,4,1,3,5};
				System.out.println(Arrays.equals(nums1,nums2));
		
				//sort()0:sorts array in ascending order
				
								
				Arrays.sort(nums);
				System.out.println(Arrays.toString(nums));		
				
				String[] languages= {"Zulu","Spanish","@talian","1English","Polish","arabic"};
				Arrays.sort(languages);
				System.out.println(Arrays.toString(languages));	
				
				
				
				//binarySearch()
				
				
						int [] numsx= {4,6,7,10,55};
				
						System.out.println(Arrays.binarySearch(numsx,4));
						System.out.println(Arrays.binarySearch(numsx,6));
						System.out.println(Arrays.binarySearch(numsx,5));//-(insertionPoint)-1) where should be ?

						
						
						//copyOf()
						
						
								double [] d1= {2.3,4.5,12.4};
								double [] d2= d1;// this is not copy--This is referance 

						
								System.out.println(Arrays.toString(d1));
								System.out.println(Arrays.toString(d2));
								
								d1[0]=100.3;
								d2[1]=400.5;

								System.out.println(Arrays.toString(d1));
								System.out.println(Arrays.toString(d2));
								
								
								
								
								double[] d3=Arrays.copyOf(d2, d2.length-1);
								System.out.println(Arrays.toString(d3));
								
								
								double[] d4=Arrays.copyOf(d2, 5);

								d2[0]=5.2;
								System.out.println(Arrays.toString(d2));
								System.out.println(Arrays.toString(d4));

								

								


	}

}
