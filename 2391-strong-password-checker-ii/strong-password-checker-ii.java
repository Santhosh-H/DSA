class Solution {
    public boolean strongPasswordCheckerII(String password) {
         if (password.length() < 8) {
            return false;
        }
        
        boolean hasLower = false; // contains lowercase
        boolean hasUpper = false; // contains uppercase
        boolean hasDigit = false;  // contains digit
        boolean hasSpecial = false; // contains special character
        
        Set<Character> specialCharacters = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        
        char[] charArray = password.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (specialCharacters.contains(c)) {
                hasSpecial = true;
            }
            if (i < charArray.length - 1 && c == charArray[i + 1]) {
                return false;
            }
        }
        
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}