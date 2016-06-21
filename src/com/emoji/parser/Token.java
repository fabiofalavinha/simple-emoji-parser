package com.emoji.parser;

import javax.swing.*;

public class Token {

    private final String symbol;

    public Token(String symbol) {
        this.symbol = symbol;
    }

    public boolean isEmoji(EmojiRepository emojiRepository) {
        return emojiRepository.hasEmoji(symbol);
    }

    public ImageIcon getEmojiImage(EmojiRepository emojiRepository) {
        return emojiRepository.getEmoji(symbol);
    }

    public String getSymbol() {
        return symbol;
    }
}
