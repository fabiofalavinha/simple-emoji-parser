package com.emoji.parser;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner reader = new Scanner(System.in);
        final EmojiRepository emojiRepository = new EmojiRepository();
        do {
            final String text = reader.nextLine();
            final Phrase phrase = new Phrase(text);
            final List<Token> tokens = phrase.getTokens();
            for (Token token : tokens) {
                if (token.isEmoji(emojiRepository)) {
                    System.out.println(String.format("We have an emoji here ==> %s - %s", token.getSymbol(), token.getEmojiImage(emojiRepository)));
                } else {
                    System.out.println(String.format("This token isn't an emoji ==> %s", token.getSymbol()));
                }
            }
        } while (true);
    }
}
