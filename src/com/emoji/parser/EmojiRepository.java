package com.emoji.parser;

import java.util.HashMap;
import java.util.Map;

public class EmojiRepository {

    private static final Map<String, String> emojiMap;

    static {
        emojiMap = new HashMap<>();
        emojiMap.put(":)", "D:/TEMP/alegre.jpeg");
    }

    public String getEmoji(String symbol) {
        return emojiMap.get(symbol);
    }

    public boolean hasEmoji(String symbol) {
        return emojiMap.containsKey(symbol);
    }
}
