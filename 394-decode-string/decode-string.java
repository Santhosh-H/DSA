class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the number (could be more than one digit)
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current string and number onto their respective stacks
                strStack.push(currentStr);
                numStack.push(currentNum);
                // Reset current string and number
                currentStr = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                // Pop from stacks and build the new string
                StringBuilder prevStr = strStack.pop();
                int repeatTimes = numStack.pop();
                StringBuilder decodedStr = new StringBuilder();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedStr.append(currentStr);
                }
                currentStr = prevStr.append(decodedStr);
            } else {
                // Append character to the current string
                currentStr.append(c);
            }
        }
        
        return currentStr.toString();
    }
}