package com.emoji.parser;

public class Token {

    private final String symbol;

    public Token(String symbol) {
        this.symbol = symbol;
    }

    public boolean isEmoji(EmojiRepository emojiRepository) {
        return emojiRepository.hasEmoji(symbol);
    }

    public String getEmojiImage(EmojiRepository emojiRepository) {
        return emojiRepository.getEmoji(symbol);
    }

    public String getSymbol() {
        return symbol;
    }
}
