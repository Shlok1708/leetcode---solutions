import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> currLine = new ArrayList<>();
        int currLen = 0;
        
        for (String word : words) {
            if (currLen + word.length() + currLine.size() > maxWidth) {
                int totalSpaces = maxWidth - currLen;
                for (int i = 0; i < totalSpaces; i++) {
                    if (currLine.size() == 1) {
                        currLine.set(0, currLine.get(0) + " ");
                    } else {
                        int idx = i % (currLine.size() - 1);
                        currLine.set(idx, currLine.get(idx) + " ");
                    }
                }
                res.add(String.join("", currLine));
                currLine.clear();
                currLen = 0;
            }
            currLine.add(word);
            currLen += word.length();
        }
        StringBuilder lastLine = new StringBuilder(String.join(" ", currLine));
        while (lastLine.length() < maxWidth) {
            lastLine.append(" ");
        }
        res.add(lastLine.toString());
        
        return res;
    }
}