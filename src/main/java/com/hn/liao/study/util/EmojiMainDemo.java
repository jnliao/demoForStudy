package com.hn.liao.study.util;

import com.vdurmont.emoji.EmojiParser;

import java.util.List;

/**
 * @author liaojinneng
 * @date 2020/1/4
 */
public class EmojiMainDemo {

    public static void main(String[] args){
        removeAllEmojis();
        extractEmojis();
    }

    private static void removeAllEmojis(){
        String str = "An 😀awesome 😃string with a few 😉emojis 小孩\uD83D\uDE1C \uD83C\uDF3C \uD83D\uDC37\uD83D\uDC37 🐑 🐴";
        String strNew = EmojiParser.removeAllEmojis(str);
        System.out.println(strNew);
    }

    private static void extractEmojis(){
        String str = "An 😀awesome 😃string with a few 😉emojis 小孩\uD83D\uDE1C \uD83C\uDF3C \uD83D\uDC37\uD83D\uDC37 🐑 🐴";
        List<String> stringList = EmojiParser.extractEmojis(str);
        System.out.println(stringList);
    }
}
