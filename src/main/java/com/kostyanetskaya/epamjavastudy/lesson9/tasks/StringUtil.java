package com.kostyanetskaya.epamjavastudy.lesson9.tasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringUtil {

    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (words == null || sample == null) {return 0;}
        int counter = 0;
        sample = sample.trim();
        for (String word : words) {
            String buf = word.trim();
            if (buf.equalsIgnoreCase(sample)) {
                counter++;
            }
        }
        return counter;
    }

    public static String[] splitWords(String text) {

        if (text == null || text.isEmpty()) {
            return null;
        }
        String regex = "[\\p{P}\\s+]+";

        boolean onlyPunctuationMarks = Pattern.matches(regex, text);

        if (onlyPunctuationMarks) {
            return null;
        }
        String buf = text.replaceAll(regex, " ").trim();
        String[] result = buf.split(" ");

        return result;
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.isBlank() || wrongPath(path)) {
            return null;
        }

        if (toWin) {
            if (matchWin(path)) {
                return path;
            }
            String result = "";

            if (path.startsWith("~")) {
                result = path.replaceFirst("~", "C:\\\\User").replaceAll("/", "\\\\");
                return result;
            }

            if (path.startsWith("../")) {
                result = path.replaceFirst("../", "..\\\\").replaceAll("/", "\\\\");
                return result;
            }

            if (path.startsWith("/")) {
                result = path.replaceFirst("/", "C:\\\\").replaceAll("/", "\\\\");
                return result;
            }

            result = path.replaceAll("/", "\\\\");
            return result;

        }

        if (!toWin) {
            if(matchUnix(path)) {
                return path;
            }

            String result = "";

            if (path.contains("C:\\User")) {
                result = path.replaceFirst("C:\\\\User", "~").replaceAll("\\\\", "/");
                return result;}

            result = path.replaceFirst("C:\\\\", "/").replaceAll("\\\\", "/");
            return result;
        }
        return path;
    }

    private static boolean matchWin (String path) {
        boolean isWin = false;

        Pattern p = Pattern.compile("\\w+\\.\\w+");
        Pattern p2 = Pattern.compile("(\\\\.*)+(\\w+\\.\\w+)");

        Pattern[] allPatterns = {p, p2};

        for (Pattern pattern: allPatterns) {
            Matcher m = pattern.matcher(path);
            if (m.matches()) {
                isWin = true;
            }
        }
        return isWin;
    }

    private static boolean matchUnix (String path) {
        Pattern p = Pattern.compile("\\w+\\.{1}\\w+");
        Matcher m = p.matcher(path);
        return m.matches();
    }

    private static boolean wrongPath (String path) {
        boolean isWrong = false;

        Pattern p = Pattern.compile("((\\\\.*)(/.*))|((/.*)(\\\\.*))");
        Pattern p2 = Pattern.compile("~{2,}");
        Pattern p3 = Pattern.compile(".+~");
        Pattern p4 = Pattern.compile("(~.*)(\\\\.*)|(\\\\.*)(~.*)");
        Pattern p5 = Pattern.compile("(C:).*(C:)");
        Pattern p6 = Pattern.compile("((C:.*)(/.*))|((/.*)(C:.*))");

        Pattern[] allPatterns = {p, p2, p3, p4, p5, p6};

        for (Pattern pattern: allPatterns) {
            Matcher m = pattern.matcher(path);
            if (m.find()) {
                isWrong = true;
            }
        }
        return isWrong;
    }

    public static String joinWords(String[] words) {
        if (isEmpty(words)) {
            return null;
        }
        return "[" + Arrays.stream(words)
                .filter(s -> !s.isBlank())
                .collect(Collectors.joining(", ")) + "]";
    }

    public static boolean isEmpty (String[] words) {
        if (words == null) {
            return true;
        }
        for (String s: words) {
            if (!s.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}
