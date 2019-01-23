package github.clyoudu.caseformat.util;

import com.google.common.base.CaseFormat;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 9:24
 * @description WordSegUtil
 */
public class WordSegUtil {

    private final static String NORMAL_SEPARATOR = "\\s+|-|_";

    public static String[] words(String text){
        String[] stage1 = text.split(NORMAL_SEPARATOR);
        if(stage1.length > 1){
            return stage1;
        }

        List<String> result = new ArrayList<>();
        int start = 0;
        for(int i = 1; i < text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                result.add(text.substring(start, i));
                start = i;
            }
        }
        if(start < text.length()){
            result.add(text.substring(start, text.length()));
        }
        return result.toArray(new String[result.size()]);
    }

    public static String firstCharUpperCase(String text){
        if(StringUtils.isBlank(text)){
            return "";
        }
        if(text.length() == 1){
            return text.toUpperCase();
        }

        return text.substring(0,1).toUpperCase() + text.substring(1, text.length()).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(words("dBO2$方法MCTest5PluginA")));
    }

}
