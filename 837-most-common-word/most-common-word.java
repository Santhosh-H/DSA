class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert banned words array to a set for quick lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Normalize the paragraph: convert to lowercase and replace punctuation with space
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();

        // Split the paragraph into words
        String[] words = normalizedStr.split("\\s+");

        // Use a hashmap to count occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Find the most frequent non-banned word
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
    }
