#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    // Iterate from right to left (least significant digit first)
    for (int i = digitsSize - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            *returnSize = digitsSize;
            
            // Allocate memory for the output array and copy results
            int* result = (int*)malloc(digitsSize * sizeof(int));
            for (int j = 0; j < digitsSize; j++) {
                result[j] = digits[j];
            }
            return result;
        }
        // If the digit is 9, it becomes 0 and carries 1 over to the next loop
        digits[i] = 0;
    }
    
    // If all digits were 9 (e.g., 999 -> 1000), we need 1 extra element
    *returnSize = digitsSize + 1;
    int* result = (int*)malloc((digitsSize + 1) * sizeof(int));
    result[0] = 1;
    for (int j = 1; j <= digitsSize; j++) {
        result[j] = 0;
    }
    
    return result;
}