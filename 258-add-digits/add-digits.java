class Solution {
//Explanation of the Code:
// Base Case: If the number is zero, directly return zero.
// Digital Root Calculation: For any other number, use the formula 
// 1+(num−1)%9 to find the digital root.
// Why Does the Formula Work?
// 1+(num−1)%9 is derived from properties of numbers in modular arithmetic. 
// It effectively compresses any number down to its single-digit sum by
// utilizing the periodicity of digits in base-10. 
//The result of this formula is always a single-digit number that is the sum of the digits of the original number.
    public int addDigits(int num) {
        // if (num == 0) {
        //     return 0;
        // } else {
        //     return 1 + (num - 1) % 9;
        // }
        if(num==0)
        return 0;
        if(num%9==0)
        return 9;
        else
        return num%9;
    }
}