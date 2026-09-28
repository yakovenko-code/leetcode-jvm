package code.yakovenko.leetcode.kotlin.easy

class P0001TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, num ->
            seen[num]?.let { return intArrayOf(it, index) }
            seen[target - num] = index
        }

        return intArrayOf()
    }
}