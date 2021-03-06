package club.lemos.qrbuilder.util;

public class StringUtils {

    public static boolean isEmpty(final CharSequence cs) {
        return !StringUtils.hasText(cs);
    }

    public static boolean isNotBlank(final CharSequence cs) {
        return StringUtils.hasText(cs);
    }

    public static boolean hasText(CharSequence str) {
        return (str != null && str.length() > 0 && containsText(str));
    }

    private static boolean containsText(CharSequence str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
