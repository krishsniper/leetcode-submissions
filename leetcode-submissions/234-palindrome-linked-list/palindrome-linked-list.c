bool isPalindrome(struct ListNode* head) {
    if (!head) return true;

    // Step 1: Count elements to allocate array
    int count = 0;
    struct ListNode* curr = head;
    while (curr) {
        count++;
        curr = curr->next;
    }

    // Step 2: Copy values to the array
    int* arr = (int*)malloc(count * sizeof(int));
    curr = head;
    for (int i = 0; i < count; i++) {
        arr[i] = curr->val;
        curr = curr->next;
    }

    // Step 3: Two-pointer check on the array
    int left = 0;
    int right = count - 1;
    while (left < right) {
        if (arr[left] != arr[right]) {
            free(arr); // Prevent memory leak
            return false;
        }
        left++;
        right--;
    }

    free(arr);
    return true;
}
