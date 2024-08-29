class Solution {
    public int[] findEvenNumbers(int[] digits) {
          Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];

                        if (number > 99 && number % 2 == 0) {
                            set.add(number);
                        }
                    }
                }
            }
        }

        int[] result = new int[set.size()];
        int count = 0;
        for (int number : set) {
            result[count++] = number;
        }

        return result;


    }
}