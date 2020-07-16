package com.thilak.practice;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		int[] arr1 = { 127, 12, 175, 50, 155, 152, 107, 104, 181, 174, 29, 190, 178, 128, 32, 177, 90, 134, 33, 18, 176,
				41, 156, 23, 146, 192, 154, 174, 81, 85, 180, 72, 109, 45, 93, 77, 35, 69, 165, 19, 114, 42, 151, 103,
				2, 78, 164, 10, 91, 89, 120, 126, 139, 164, 11, 115, 71, 181, 178, 115, 113, 76, 92, 21, 44, 174, 54,
				101, 46, 45, 179, 80, 21, 76, 158, 119, 1, 146, 40, 142, 70, 160, 24, 135, 156, 171, 19, 5, 98, 85, 77,
				55, 105, 1, 198, 12, 23, 44, 159, 141, 120, 132, 19, 135, 17, 188, 131, 22, 114, 47, 98, 165, 170, 76,
				93, 121, 50, 172, 200, 54, 151, 92, 17, 196, 16, 19, 3, 126, 117, 74, 66, 105, 36, 156, 131, 111, 142,
				197, 65, 9, 110, 98, 170, 3, 125, 59, 117, 7, 75, 70, 61, 10, 143, 119, 119, 118, 71, 24, 77, 89, 107,
				106, 73, 117, 101, 167, 73, 41, 194, 87, 58, 33, 176, 90, 127, 153, 5, 96, 33, 110, 26, 40, 156, 63, 30,
				95, 67, 140, 182, 131, 118, 141, 55, 99, 45, 87, 87, 144, 98, 146, 18, 119, 150, 183, 166, 197, 179,
				175, 24, 55, 79, 139, 197, 50, 97, 149, 130, 99, 183, 133, 17, 15, 83, 151, 135, 76, 193, 136, 8, 141,
				191, 165, 46, 183, 20, 125, 91, 142, 20, 39, 181, 59, 195, 45, 181, 42, 12, 105, 85, 137, 136, 178, 119,
				101, 152, 186, 102, 116, 100, 70, 154, 93, 151, 136, 80, 11, 121, 184, 68, 12, 24, 116, 168, 108, 79,
				120, 131, 158, 54, 74, 71, 179, 111, 78, 73, 3, 156, 130, 21, 3, 3, 103, 167, 69, 127, 21, 136, 32, 73,
				82, 108, 120, 96, 16, 117, 144, 87, 144, 67, 16, 164, 159, 60, 42, 23, 123, 129, 14, 47, 147, 39, 122,
				118, 32, 182, 169, 1, 191, 125, 82, 103, 127, 164, 123, 164, 88, 200, 177, 189, 186, 29, 38, 77, 132,
				139, 118, 186, 94, 66, 44, 18, 1, 16, 200, 19, 58, 200, 78, 26, 154, 196, 159, 138, 42, 22, 183, 131,
				155, 79, 54, 171, 49, 89, 24, 182, 182, 66, 165, 23, 131, 116, 9, 79, 26, 193, 106, 67, 62, 123, 70,
				106, 135, 120, 34, 144, 60, 50, 182, 69, 112, 8, 76, 91, 173, 200, 183, 33, 126, 84, 134, 38, 41, 127,
				74, 76, 138, 122, 94, 91, 129, 34, 56, 135, 106, 129, 110, 115, 51, 186, 186, 65, 166, 180, 74, 177,
				179, 109, 5, 108, 61, 188, 53, 30, 57, 190, 137, 165, 106, 41, 100, 109, 119, 132, 90, 177, 64, 7, 126,
				118, 116, 184, 161, 124, 127, 133, 126, 185, 72, 109, 192, 19, 69, 31, 161, 157, 55, 98, 172, 131, 68,
				95, 87, 115, 92, 108, 115, 106, 164, 21, 116, 183, 19, 112, 135, 108, 152, 192, 128, 200, 87, 48, 33,
				170, 172, 94, 93, 51, 8, 75, 15, 166, 99, 17, 39, 100, 182, 181, 171, 85, 99, 113, 21, 38, 74, 88, 15,
				139, 139, 175, 14, 93, 189, 187, 29, 69, 138, 92, 107, 189, 105, 136, 7, 84, 29, 49, 10, 136, 121, 177,
				42, 105, 125, 140, 142, 110, 80, 82, 48, 45, 167, 144, 30, 17, 19, 100, 174, 85, 135, 41, 175, 104, 104,
				114, 82, 197, 109, 120, 15, 100, 11, 61, 159, 167, 146, 156, 50, 156, 110, 154, 137, 53, 187, 200, 49,
				167, 96, 39, 76, 59, 36, 168, 108, 53, 149, 121, 104, 39, 127, 68, 179, 55, 150, 119, 156, 117, 43, 152,
				145, 159, 143, 151, 6, 143, 169, 138, 147, 182, 64, 131, 140, 164, 172, 77, 145, 130, 28, 75, 58, 132,
				182, 118, 133, 77, 103, 189, 64, 130, 51, 46, 64, 69, 156, 52, 13, 38, 90, 144, 19, 196, 192, 45, 190,
				13, 140, 159, 185, 37, 87, 62, 92, 14, 91, 6, 56, 135, 28, 143, 168, 49, 192, 117, 135, 193, 53, 156,
				13, 58, 179, 148, 52, 142, 120, 89, 147, 20, 59, 54, 65, 95, 189, 159, 199, 108, 67, 155, 171, 16, 48,
				17, 110, 163, 155, 97, 91, 32, 56, 135, 76, 10, 9, 22, 45, 108, 58, 171, 159, 10, 68, 166, 101, 112,
				125, 103, 164, 45, 29, 99, 96, 108, 74, 193, 35, 44, 21, 103, 24, 180, 142, 119, 49, 141, 38, 30, 180,
				137, 39, 8, 172, 75, 88, 27, 63, 99, 74, 6, 150, 36, 171, 159, 32, 24, 82, 32, 197, 35, 51, 30, 193, 58,
				124, 46, 169, 131, 3, 131, 40, 82, 11, 175, 161, 90, 23, 103, 16, 35, 120, 128, 135, 93, 184, 167, 14,
				81, 33, 154, 12, 179, 108, 187, 86, 105, 191, 54, 130, 143, 161, 125, 84, 109, 192, 18, 6, 65, 18, 65,
				195, 84, 6, 97, 7, 102, 115, 43, 2, 32, 48, 170, 156, 8, 142, 182, 122, 24, 95, 125, 195, 117, 183, 59,
				163, 49, 64, 8, 18, 161, 160, 97, 145, 57, 148, 172, 95, 147, 92, 21, 32, 40, 33, 63, 118, 176, 117, 65,
				15, 68, 183, 177, 161, 122, 93, 71, 93, 6, 22, 148, 114, 145, 36, 58, 99, 133, 97, 168, 168, 77, 88,
				119, 6, 109, 149, 18, 2, 143, 193, 110, 177, 183, 87, 12, 174, 147, 67, 93, 76, 3, 78, 28, 49, 104, 136,
				99, 13, 24, 50, 21, 66, 135, 139, 71, 141, 161, 142, 107, 180, 109, 155, 57, 178, 198, 59, 107, 193,
				151, 68, 1, 168, 93, 200, 133, 88, 198, 109, 119, 49, 187, 11, 9, 193 };
		int[] arr2 = { 22, 9, 97, 64, 164, 108, 18, 194, 200, 93, 197, 57, 65, 156, 59, 103, 163, 142, 18, 1, 104, 121,
				199, 135, 79, 67, 86, 109, 92, 198, 21, 58, 27, 112, 131, 155, 111, 124, 36, 102, 104, 130, 111, 73,
				152, 76, 77, 81, 22, 161, 157, 155, 51, 181, 20, 107, 140, 142, 194, 17, 139, 112, 74, 60, 193, 75, 95,
				148, 50, 118, 78, 89, 152, 6, 59, 121, 183, 47, 129, 10, 181, 15, 131, 176, 183, 26, 102, 165, 34, 88,
				74, 149, 24, 42, 85, 129, 143, 160, 26, 169, 158, 193, 169, 111, 55, 103, 14, 184, 29, 161, 134, 139,
				150, 51, 93, 47, 91, 160, 175, 187, 26, 137, 64, 123, 152, 28, 87, 17, 150, 127, 47, 38, 75, 3, 177,
				200, 86, 129, 153, 43, 145, 160, 8, 7, 197, 170, 43, 110, 54, 142, 141, 99, 7, 103, 116, 125, 105, 73,
				100, 34, 59, 151, 196, 11, 77, 174, 195, 17, 119, 47, 193, 38, 69, 71, 153, 196, 87, 169, 78, 34, 53,
				32, 89, 46, 155, 142, 159, 95, 157, 2, 47, 42, 60, 196, 102, 178, 106, 176, 169, 51, 111, 51, 180, 69,
				154, 96, 8, 153, 91, 128, 88, 39, 15, 95, 146, 24, 37, 148, 114, 163, 40, 175, 129, 90, 111, 25, 107,
				105, 52, 52, 184, 73, 34, 3, 126, 61, 164, 144, 38, 51, 21, 60, 110, 164, 120, 143, 185, 153, 179, 16,
				154, 126, 161, 49, 36, 102, 7, 69, 40, 132, 75, 188, 191, 34, 65, 106, 95, 69, 115, 20, 178, 104, 135,
				197, 125, 187, 155, 141, 183, 6, 66, 142, 22, 184, 67, 184, 22, 23, 105, 149, 50, 120, 189, 136, 192,
				24, 15, 37, 143, 36, 164, 59, 129, 132, 83, 138, 114, 198, 116, 49, 23, 187, 8, 180, 185, 125, 158, 113,
				22, 1, 95, 38, 71, 41, 85, 91, 70, 64, 19, 128, 107, 1, 148, 14, 101, 174, 100, 35, 150, 16, 62, 125,
				156, 152, 47, 45, 55, 154, 59, 44, 20, 32, 21, 80, 155, 31, 16, 11, 68, 168, 67, 193, 39, 157, 179, 192,
				9, 152, 57, 41, 155, 63, 18, 72, 104, 92, 116, 172, 47, 179, 29, 26, 69, 45, 155, 59, 44, 79, 118, 193,
				126, 37, 188, 12, 94, 160, 83, 37, 112, 187, 158, 200, 96, 84, 129, 36, 18, 59, 51, 16, 94, 144, 32,
				160, 161, 42, 118, 114, 193, 175, 194, 94, 57, 13, 87, 55, 73, 85, 90, 171, 111, 163, 84, 189, 39, 114,
				61, 56, 83, 138, 48, 10, 8, 8, 50, 59, 143, 90, 53, 108, 52, 108, 139, 10, 183, 83, 30, 67, 2, 37, 177,
				76, 94, 138, 194, 111, 45, 104, 58, 163, 176, 78, 173, 167, 92, 184, 51, 160, 88, 159, 44, 46, 182, 105,
				20, 193, 11, 129, 174, 96, 180, 6, 55, 33, 124, 13, 169, 137, 122, 187, 43, 124, 169, 168, 124, 139, 7,
				18, 2, 83, 114, 8, 194, 140, 40, 135, 4, 28, 171, 29, 158, 173, 55, 177, 13, 107, 90, 43, 109, 1, 29,
				199, 171, 49, 92, 165, 37, 119, 79, 123, 137, 45, 53, 129, 139, 127, 195, 48, 135, 59, 191, 9, 133, 41,
				173, 87, 10, 181, 196, 4 };

		intersection(arr1, arr2);

	}

	public static void intersection(int[] arr1, int[] arr2) {
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
       	Arrays.sort(arr1);
		Arrays.sort(arr2);
		int  i = 0, j = 0;

		if (arr1.length > arr2.length) {			
			int [] tempArray = arr1;
			arr1 = arr2;
			arr2 = tempArray;
		}
        // will be executing O(n) times
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				if (arr1[i] == arr2[j])
					System.out.println(arr1[i]);
				i++;
			} else {
				j++;
			}
		}  
	}
}