package github.clyoudu.caseformat.transformer;

import github.clyoudu.caseformat.util.WordSegUtil;
import org.apache.commons.lang.StringUtils;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:21
 * @description UpperCamelTransformer
 */
public class UpperCamelTransformer implements CaseTransformer {
    @Override
    public String transform(String text) {
        if (StringUtils.isBlank(text)) {
            return text == null ? "" : text;
        }

        String[] words = WordSegUtil.words(text);
        for (int i = 0; i < words.length; i++) {
            words[i] = WordSegUtil.firstCharUpperCase(words[i]);
        }

        return StringUtils.join(words, "");
    }
}
