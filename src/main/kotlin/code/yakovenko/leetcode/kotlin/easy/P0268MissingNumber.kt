package code.yakovenko.leetcode.kotlin.easy

class P0268MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        var xor = nums.size

        nums.forEachIndexed { index, num ->
            xor = xor xor index xor num
        }

        return xor
    }
}