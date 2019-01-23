package github.clyoudu.caseformat.transformer;

import github.clyoudu.caseformat.util.WordSegUtil;
import org.apache.commons.lang.StringUtils;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/22 18:02
 * @description LowerHyphenTransformer
 */
public class LowerHyphenTransformer implements CaseTransformer {

    @Override
    public String transform(String text) {
        if(StringUtils.isBlank(text)){
            return text == null ? "" : text;
        }

        String[] words = WordSegUtil.words(text);
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        return StringUtils.join(words, "-");
    }
}
