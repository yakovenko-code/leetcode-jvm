package code.yakovenko.leetcode.kotlin.easy

class P3512MinimumOperationsToMakeArraySumDivisibleByK {

    fun minOperations(nums: IntArray, k: Int) = nums.sum() % k
}