class Solution {
    public boolean checkIfPangram(String sentence) {
        char [] c=sentence.toCharArray();
        Set<Character> alphabetSet = new HashSet<>(Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        ));

        for (char a : c) {
            alphabetSet.remove(a);
        }
        return alphabetSet.isEmpty();

    }
}