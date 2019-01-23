package github.clyoudu.caseformat;

import github.clyoudu.caseformat.transformer.*;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/23 15:42
 * @description TransformerTest
 */
public class TransformerTest {
    
    private final static String UPPER_HYPHEN = "HELLO-CASE-FORMAT";
    private final static String LOWER_HYPHEN = "hello-case-format";
    private final static String UPPER_CAMEL = "HelloCaseFormat";
    private final static String LOWER_CAMEL = "helloCaseFormat";
    private final static String UPPER_UNDERSCORE = "HELLO_CASE_FORMAT";
    private final static String LOWER_UNDERSCORE = "hello_case_format";
    private final static String OTHERS = "dBO2$方法MCTest5PluginA";

    private final static UpperHyphenTransformer UPPER_HYPHEN_TRANSFORMER = new UpperHyphenTransformer();
    private final static LowerHyphenTransformer LOWER_HYPHEN_TRANSFORMER = new LowerHyphenTransformer();
    private final static UpperCamelTransformer UPPER_CAMEL_TRANSFORMER = new UpperCamelTransformer();
    private final static LowerCamelTransformer LOWER_CAMEL_TRANSFORMER = new LowerCamelTransformer();
    private final static UpperUnderscoreTransformer UPPER_UNDERSCORE_TRANSFORMER = new UpperUnderscoreTransformer();
    private final static LowerUnderscoreTransformer LOWER_UNDERSCORE_TRANSFORMER = new LowerUnderscoreTransformer();

    public static void main(String[] args) {
        System.out.println("UPPER_HYPHEN------------------------------------------------------------");
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(UPPER_HYPHEN_TRANSFORMER.transform(OTHERS));

        System.out.println("LOWER_HYPHEN------------------------------------------------------------");
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(LOWER_HYPHEN_TRANSFORMER.transform(OTHERS));

        System.out.println("UPPER_CAMEL------------------------------------------------------------");
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(UPPER_CAMEL_TRANSFORMER.transform(OTHERS));

        System.out.println("LOWER_CAMEL------------------------------------------------------------");
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(LOWER_CAMEL_TRANSFORMER.transform(OTHERS));

        System.out.println("UPPER_UNDERSCORE------------------------------------------------------------");
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(UPPER_UNDERSCORE_TRANSFORMER.transform(OTHERS));

        System.out.println("LOWER_UNDERSCORE------------------------------------------------------------");
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(UPPER_HYPHEN));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(LOWER_HYPHEN));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(UPPER_CAMEL));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(LOWER_CAMEL));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(UPPER_UNDERSCORE));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(LOWER_UNDERSCORE));
        System.out.println(LOWER_UNDERSCORE_TRANSFORMER.transform(OTHERS));
    }
    
}
