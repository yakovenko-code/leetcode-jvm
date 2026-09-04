package code.yakovenko.leetcode.java.easy;

public final class FlippingAnImage {

	public int[][] flipAndInvertImage(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			int left = 0, right = image[i].length - 1;

			while (left <= right) {
				if (image[i][left] == image[i][right]) {
					image[i][left] = image[i][right] ^= 1;
				}

				left++;
				right--;
			}
		}

		return image;
	}
}
