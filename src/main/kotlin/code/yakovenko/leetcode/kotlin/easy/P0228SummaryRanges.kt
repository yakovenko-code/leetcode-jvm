package code.yakovenko.leetcode.kotlin.easy

class P0228SummaryRanges {

    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()

        return buildList {
            var start = nums[0]

            for (i in 1..nums.lastIndex) {
                if (nums[i] != nums[i - 1] + 1) {
                    add(buildRange(start, nums[i - 1]))
                    start = nums[i]
                }
            }

            add(buildRange(start, nums.last()))
        }
    }

    private fun buildRange(start: Int, stop: Int) =
        if (start == stop) "$start" else "$start->$stop"
}