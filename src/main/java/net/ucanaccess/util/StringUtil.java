package net.ucanaccess.util;

public class StringUtil {

    /**
     * Converts a string to title case, that is first letter of each word capitalized.
     * @param str - The string to convert
     * @return - The capitalized string
     */
    public static String toTitleCase(String str) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : str.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

}
