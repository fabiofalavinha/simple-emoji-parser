package com.emoji.parser;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmojiRepository {

    private static final Map<String, ImageIcon> emojiMap;

    static {
        emojiMap = new HashMap<>();
        try {
            emojiMap.put(":)", new ImageIcon(ImageIO.read(EmojiRepository.class.getResource("happy-face.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ImageIcon getEmoji(String symbol) {
        return emojiMap.get(symbol);
    }

    public boolean hasEmoji(String symbol) {
        return emojiMap.containsKey(symbol);
    }
}
