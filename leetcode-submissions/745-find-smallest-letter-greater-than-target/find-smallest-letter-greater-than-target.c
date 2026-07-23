char nextGreatestLetter(char* letters, int lettersSize, char target) {
    int left = 0;
    int right = lettersSize - 1;
    int mid = 0;
    while(left<=right){
        mid = left + (right - left)/2;
        if(letters[mid]<=target){
            left = mid+1;
        }
        else{
            right = mid -1;
        }
        
        
    }
    return letters[left%lettersSize];
    
}