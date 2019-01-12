class Solution {
    public boolean isPalindrome(int x) {
        int givenNum = x;
        int ReverseNum = 0;
        if ( givenNum < 0){
            return false;
        }
        while (givenNum >= 1){
            ReverseNum = (ReverseNum*10) + (givenNum%10);
            givenNum = givenNum/10;
        }
        if (x == ReverseNum){
            return true;
        }
        return false;
    }
}