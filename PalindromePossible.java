public int isPalinNumPossible(int input1){
    int[] freq = new int[10];
    // count frequency of digits
    while(input1 > 0){
        int digit = input1 % 10;
        freq[digit]++;
        input1 /= 10;
    }
    int odd = 0;
    // count odd frequency digits
    for(int i = 0; i < 10; i++)
    {
        if(freq[i] % 2 != 0)
        {
            odd++;
        }
    }
    // palindrome possible condition
    if(odd <= 1)
        return 2;
    else
        return 1;
}



OR

"""aabb → palindrome possible
freq: a=2, b=2 → odd=0
aab → palindrome possible
freq: a=2, b=1 → odd=1
abc → palindrome NOT possible
freq: a=1, b=1, c=1 → odd=3
"""

  
class Solution {
    public boolean canPermutePalindrome(String s) {
        int odd = 0;
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
            if (freq[c] % 2 == 1)
                odd++;
            else
                odd--;
        }
        return odd <= 1;
    }
}
