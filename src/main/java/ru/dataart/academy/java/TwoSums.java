package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */

    /*
     * Так как по условию задачи список отсортирован по возрастанию,
     * Особые случаи:
     * (1) - Длинна массива чисел меньше 2, сумму не найти; сложность: O(1)
     * (2) - любая сумма меньше target, нет смысла искать числа; сложность: O(1)
     * (3) - любая сумма больше target, нет смысла искать числа; сложность: O(1)
     * ==============
     * Закономерности:
     * (n - длинна массива)
     * [1] - Суммы nums[i] и nums[j], начиная с некоторого i, больше target
     * [2] - Суммы nums[i] и nums[j], начиная с некоторого j, больше target
     * ==============
     * Худший случай:
     * Количество итераций: n-1 + Сумма(от 1 до n-1) = n-1+(n-1)*n/2
     * Сложность алгоритма: O(n-1+(n-1)*n/2) => Меньше, чем O(n^2)
     */
    public int[] getTwoSum(int[] nums, int target) {
        int size = nums.length;
        if (size < 2 || nums[size - 1] + nums[size - 2] < target) { // (1) и (2) особые случаи
            return new int[0];
        }
        outerLoop:
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] > target) {
                    if (j-i == 1) break outerLoop; // (3) особый случай и [1] закономерность
                    else continue outerLoop; // [2] закономерность
                }
                if (nums[i] + nums[j] == target) return new int[]{nums[i], nums[j]};
            }
        }
        return new int[0];
    }
}
