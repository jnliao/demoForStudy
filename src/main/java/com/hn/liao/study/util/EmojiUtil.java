package com.hn.liao.study.util;

import com.hn.liao.study.bean.core.BizRuntimeException;
import com.vdurmont.emoji.EmojiParser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * @author jinneng.liao
 */
@Slf4j
public class EmojiUtil {

    /**
     * 去除字符串中的所有表情
     * @param rawStr
     * @return
     */
    public static String removeAllEmojis(String rawStr) {
        if(StringUtils.isBlank(rawStr)){
            return rawStr;
        }
        String newStr = "";
        try {
            newStr = EmojiParser.removeAllEmojis(rawStr);
        } catch (Exception e) {
            log.error("removeAllEmojis error.input:{},error:{}",rawStr,e);
            throw BizRuntimeException.create("去除字符串中的所有表情失败！");
        }
        return newStr;
    }
}
