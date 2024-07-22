class Solution {
    public int firstUniqChar(String s) {
//          Map<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//         char c = s.charAt(i);
//         map.put(c, map.getOrDefault(c, 0) + 1);
//     }
    
//     // Find the index of the first unique character
//     for (int i = 0; i < s.length(); i++) {
//         if (map.get(s.charAt(i)) == 1) {
//             return i;
//         }
//     }
    
//     // Return -1 if no unique character is found
//     return -1;
// }
    int[] charCount = new int[26]; // Since the problem states that the string only contains lowercase letters

    // Populate the array with character frequencies
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        charCount[c - 'a']++;
    }

    // Find the index of the first unique character
    for (int i = 0; i < s.length(); i++) {
        if (charCount[s.charAt(i) - 'a'] == 1) {
            return i;
        }
    }

    // Return -1 if no unique character is found
    return -1;
    }
}