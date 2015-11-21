package jp.co.anywhere.consumer.shared.util;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/**
 * Created by asari on 2015/11/21.
 */
public class StringHelper {

  public static boolean isEmpty(CharSequence cs) {
    return StringUtils.isEmpty(cs);
  }

  public static boolean isNotEmpty(CharSequence cs) {
    return StringUtils.isNotEmpty(cs);
  }

  public static boolean isAnyEmpty(CharSequence... css) {
    return StringUtils.isAnyEmpty(css);
  }

  public static boolean isNoneEmpty(CharSequence... css) {
    return StringUtils.isNoneEmpty(css);
  }

  public static boolean isBlank(CharSequence cs) {
    return StringUtils.isBlank(cs);
  }

  public static boolean isNotBlank(CharSequence cs) {
    return StringUtils.isNotBlank(cs);
  }

  public static boolean isAnyBlank(CharSequence... css) {
    return StringUtils.isAnyBlank(css);
  }

  public static boolean isNoneBlank(CharSequence... css) {
    return StringUtils.isNoneBlank(css);
  }

  public static String trim(String str) {
    return StringUtils.trim(str);
  }

  public static String trimToNull(String str) {
    return StringUtils.trimToNull(str);
  }

  public static String trimToEmpty(String str) {
    return StringUtils.trimToEmpty(str);
  }

  public static String strip(String str) {
    return StringUtils.strip(str);
  }

  public static String stripToNull(String str) {
    return StringUtils.stripToNull(str);
  }

  public static String stripToEmpty(String str) {
    return StringUtils.stripToEmpty(str);
  }

  public static String strip(String str, String stripChars) {
    return StringUtils.strip(str, stripChars);
  }

  public static String stripStart(String str, String stripChars) {
    return StringUtils.stripStart(str, stripChars);
  }

  public static String stripEnd(String str, String stripChars) {
    return StringUtils.stripEnd(str, stripChars);
  }

  public static String[] stripAll(String... strs) {
    return StringUtils.stripAll(strs);
  }

  public static String[] stripAll(String[] strs, String stripChars) {
    return StringUtils.stripAll(strs, stripChars);
  }

  public static String stripAccents(String input) {
    return StringUtils.stripAccents(input);
  }

  public static boolean equals(CharSequence cs1, CharSequence cs2) {
    return StringUtils.equals(cs1, cs2);
  }

  public static boolean equalsIgnoreCase(CharSequence str1, CharSequence str2) {
    return StringUtils.equalsIgnoreCase(str1, str2);
  }

  public static int indexOf(CharSequence seq, int searchChar) {
    return StringUtils.indexOf(seq, searchChar);
  }

  public static int indexOf(CharSequence seq, int searchChar, int startPos) {
    return StringUtils.indexOf(seq, searchChar, startPos);
  }

  public static int indexOf(CharSequence seq, CharSequence searchSeq) {
    return StringUtils.indexOf(seq, searchSeq);
  }

  public static int indexOf(CharSequence seq, CharSequence searchSeq, int startPos) {
    return StringUtils.indexOf(seq, searchSeq, startPos);
  }

  public static int ordinalIndexOf(CharSequence str, CharSequence searchStr, int ordinal) {
    return StringUtils.ordinalIndexOf(str, searchStr, ordinal);
  }

  public static int indexOfIgnoreCase(CharSequence str, CharSequence searchStr) {
    return StringUtils.indexOfIgnoreCase(str, searchStr);
  }

  public static int indexOfIgnoreCase(CharSequence str, CharSequence searchStr, int startPos) {
    return StringUtils.indexOfIgnoreCase(str, searchStr, startPos);
  }

  public static int lastIndexOf(CharSequence seq, int searchChar) {
    return StringUtils.lastIndexOf(seq, searchChar);
  }

  public static int lastIndexOf(CharSequence seq, int searchChar, int startPos) {
    return StringUtils.lastIndexOf(seq, searchChar, startPos);
  }

  public static int lastIndexOf(CharSequence seq, CharSequence searchSeq) {
    return StringUtils.lastIndexOf(seq, searchSeq);
  }

  public static int lastOrdinalIndexOf(CharSequence str, CharSequence searchStr, int ordinal) {
    return StringUtils.lastOrdinalIndexOf(str, searchStr, ordinal);
  }

  public static int lastIndexOf(CharSequence seq, CharSequence searchSeq, int startPos) {
    return StringUtils.lastIndexOf(seq, searchSeq, startPos);
  }

  public static int lastIndexOfIgnoreCase(CharSequence str, CharSequence searchStr) {
    return StringUtils.lastIndexOfIgnoreCase(str, searchStr);
  }

  public static int lastIndexOfIgnoreCase(CharSequence str, CharSequence searchStr, int startPos) {
    return StringUtils.lastIndexOfIgnoreCase(str, searchStr, startPos);
  }

  public static boolean contains(CharSequence seq, int searchChar) {
    return StringUtils.contains(seq, searchChar);
  }

  public static boolean contains(CharSequence seq, CharSequence searchSeq) {
    return StringUtils.contains(seq, searchSeq);
  }

  public static boolean containsIgnoreCase(CharSequence str, CharSequence searchStr) {
    return StringUtils.containsIgnoreCase(str, searchStr);
  }

  public static boolean containsWhitespace(CharSequence seq) {
    return StringUtils.containsWhitespace(seq);
  }

  public static int indexOfAny(CharSequence cs, char... searchChars) {
    return StringUtils.indexOfAny(cs, searchChars);
  }

  public static int indexOfAny(CharSequence cs, String searchChars) {
    return StringUtils.indexOfAny(cs, searchChars);
  }

  public static boolean containsAny(CharSequence cs, char... searchChars) {
    return StringUtils.containsAny(cs, searchChars);
  }

  public static boolean containsAny(CharSequence cs, CharSequence searchChars) {
    return StringUtils.containsAny(cs, searchChars);
  }

  public static int indexOfAnyBut(CharSequence cs, char... searchChars) {
    return StringUtils.indexOfAnyBut(cs, searchChars);
  }

  public static int indexOfAnyBut(CharSequence seq, CharSequence searchChars) {
    return StringUtils.indexOfAnyBut(seq, searchChars);
  }

  public static boolean containsOnly(CharSequence cs, char... valid) {
    return StringUtils.containsOnly(cs, valid);
  }

  public static boolean containsOnly(CharSequence cs, String validChars) {
    return StringUtils.containsOnly(cs, validChars);
  }

  public static boolean containsNone(CharSequence cs, char... searchChars) {
    return StringUtils.containsNone(cs, searchChars);
  }

  public static boolean containsNone(CharSequence cs, String invalidChars) {
    return StringUtils.containsNone(cs, invalidChars);
  }

  public static int indexOfAny(CharSequence str, CharSequence... searchStrs) {
    return StringUtils.indexOfAny(str, searchStrs);
  }

  public static int lastIndexOfAny(CharSequence str, CharSequence... searchStrs) {
    return StringUtils.lastIndexOfAny(str, searchStrs);
  }

  public static String substring(String str, int start) {
    return StringUtils.substring(str, start);
  }

  public static String substring(String str, int start, int end) {
    return StringUtils.substring(str, start, end);
  }

  public static String left(String str, int len) {
    return StringUtils.left(str, len);
  }

  public static String right(String str, int len) {
    return StringUtils.right(str, len);
  }

  public static String mid(String str, int pos, int len) {
    return StringUtils.mid(str, pos, len);
  }

  public static String substringBefore(String str, String separator) {
    return StringUtils.substringBefore(str, separator);
  }

  public static String substringAfter(String str, String separator) {
    return StringUtils.substringAfter(str, separator);
  }

  public static String substringBeforeLast(String str, String separator) {
    return StringUtils.substringBeforeLast(str, separator);
  }

  public static String substringAfterLast(String str, String separator) {
    return StringUtils.substringAfterLast(str, separator);
  }

  public static String substringBetween(String str, String tag) {
    return StringUtils.substringBetween(str, tag);
  }

  public static String substringBetween(String str, String open, String close) {
    return StringUtils.substringBetween(str, open, close);
  }

  public static String[] substringsBetween(String str, String open, String close) {
    return StringUtils.substringsBetween(str, open, close);
  }

  public static String[] split(String str) {
    return StringUtils.split(str);
  }

  public static String[] split(String str, char separatorChar) {
    return StringUtils.split(str, separatorChar);
  }

  public static String[] split(String str, String separatorChars) {
    return StringUtils.split(str, separatorChars);
  }

  public static String[] split(String str, String separatorChars, int max) {
    return StringUtils.split(str, separatorChars, max);
  }

  public static String[] splitByWholeSeparator(String str, String separator) {
    return StringUtils.splitByWholeSeparator(str, separator);
  }

  public static String[] splitByWholeSeparator(String str, String separator, int max) {
    return StringUtils.splitByWholeSeparator(str, separator, max);
  }

  public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String separator) {
    return StringUtils.splitByWholeSeparatorPreserveAllTokens(str, separator);
  }

  public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String separator, int max) {
    return StringUtils.splitByWholeSeparatorPreserveAllTokens(str, separator, max);
  }

  public static String[] splitPreserveAllTokens(String str) {
    return StringUtils.splitPreserveAllTokens(str);
  }

  public static String[] splitPreserveAllTokens(String str, char separatorChar) {
    return StringUtils.splitPreserveAllTokens(str, separatorChar);
  }

  public static String[] splitPreserveAllTokens(String str, String separatorChars) {
    return StringUtils.splitPreserveAllTokens(str, separatorChars);
  }

  public static String[] splitPreserveAllTokens(String str, String separatorChars, int max) {
    return StringUtils.splitPreserveAllTokens(str, separatorChars, max);
  }

  public static String[] splitByCharacterType(String str) {
    return StringUtils.splitByCharacterType(str);
  }

  public static String[] splitByCharacterTypeCamelCase(String str) {
    return StringUtils.splitByCharacterTypeCamelCase(str);
  }

  public static <T> String join(T... elements) {
    return StringUtils.join(elements);
  }

  public static String join(Object[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(long[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(int[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(short[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(byte[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(char[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(float[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(double[] array, char separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(Object[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(long[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(int[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(byte[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(short[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(char[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(double[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(float[] array, char separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(Object[] array, String separator) {
    return StringUtils.join(array, separator);
  }

  public static String join(Object[] array, String separator, int startIndex, int endIndex) {
    return StringUtils.join(array, separator, startIndex, endIndex);
  }

  public static String join(Iterator<?> iterator, char separator) {
    return StringUtils.join(iterator, separator);
  }

  public static String join(Iterator<?> iterator, String separator) {
    return StringUtils.join(iterator, separator);
  }

  public static String join(Iterable<?> iterable, char separator) {
    return StringUtils.join(iterable, separator);
  }

  public static String join(Iterable<?> iterable, String separator) {
    return StringUtils.join(iterable, separator);
  }

  public static String deleteWhitespace(String str) {
    return StringUtils.deleteWhitespace(str);
  }

  public static String removeStart(String str, String remove) {
    return StringUtils.removeStart(str, remove);
  }

  public static String removeStartIgnoreCase(String str, String remove) {
    return StringUtils.removeStartIgnoreCase(str, remove);
  }

  public static String removeEnd(String str, String remove) {
    return StringUtils.removeEnd(str, remove);
  }

  public static String removeEndIgnoreCase(String str, String remove) {
    return StringUtils.removeEndIgnoreCase(str, remove);
  }

  public static String remove(String str, String remove) {
    return StringUtils.remove(str, remove);
  }

  public static String remove(String str, char remove) {
    return StringUtils.remove(str, remove);
  }

  public static String replaceOnce(String text, String searchString, String replacement) {
    return StringUtils.replaceOnce(text, searchString, replacement);
  }

  public static String replacePattern(String source, String regex, String replacement) {
    return StringUtils.replacePattern(source, regex, replacement);
  }

  public static String removePattern(String source, String regex) {
    return StringUtils.removePattern(source, regex);
  }

  public static String replace(String text, String searchString, String replacement) {
    return StringUtils.replace(text, searchString, replacement);
  }

  public static String replace(String text, String searchString, String replacement, int max) {
    return StringUtils.replace(text, searchString, replacement, max);
  }

  public static String replaceEach(String text, String[] searchList, String[] replacementList) {
    return StringUtils.replaceEach(text, searchList, replacementList);
  }

  public static String replaceEachRepeatedly(String text, String[] searchList, String[] replacementList) {
    return StringUtils.replaceEachRepeatedly(text, searchList, replacementList);
  }

  public static String replaceChars(String str, char searchChar, char replaceChar) {
    return StringUtils.replaceChars(str, searchChar, replaceChar);
  }

  public static String replaceChars(String str, String searchChars, String replaceChars) {
    return StringUtils.replaceChars(str, searchChars, replaceChars);
  }

  public static String overlay(String str, String overlay, int start, int end) {
    return StringUtils.overlay(str, overlay, start, end);
  }

  public static String chomp(String str) {
    return StringUtils.chomp(str);
  }

  public static String chop(String str) {
    return StringUtils.chop(str);
  }

  public static String repeat(String str, int repeat) {
    return StringUtils.repeat(str, repeat);
  }

  public static String repeat(String str, String separator, int repeat) {
    return StringUtils.repeat(str, separator, repeat);
  }

  public static String repeat(char ch, int repeat) {
    return StringUtils.repeat(ch, repeat);
  }

  public static String rightPad(String str, int size) {
    return StringUtils.rightPad(str, size);
  }

  public static String rightPad(String str, int size, char padChar) {
    return StringUtils.rightPad(str, size, padChar);
  }

  public static String rightPad(String str, int size, String padStr) {
    return StringUtils.rightPad(str, size, padStr);
  }

  public static String leftPad(String str, int size) {
    return StringUtils.leftPad(str, size);
  }

  public static String leftPad(String str, int size, char padChar) {
    return StringUtils.leftPad(str, size, padChar);
  }

  public static String leftPad(String str, int size, String padStr) {
    return StringUtils.leftPad(str, size, padStr);
  }

  public static int length(CharSequence cs) {
    return StringUtils.length(cs);
  }

  public static String center(String str, int size) {
    return StringUtils.center(str, size);
  }

  public static String center(String str, int size, char padChar) {
    return StringUtils.center(str, size, padChar);
  }

  public static String center(String str, int size, String padStr) {
    return StringUtils.center(str, size, padStr);
  }

  public static String upperCase(String str) {
    return StringUtils.upperCase(str);
  }

  public static String upperCase(String str, Locale locale) {
    return StringUtils.upperCase(str, locale);
  }

  public static String lowerCase(String str) {
    return StringUtils.lowerCase(str);
  }

  public static String lowerCase(String str, Locale locale) {
    return StringUtils.lowerCase(str, locale);
  }

  public static String capitalize(String str) {
    return StringUtils.capitalize(str);
  }

  public static String uncapitalize(String str) {
    return StringUtils.uncapitalize(str);
  }

  public static String swapCase(String str) {
    return StringUtils.swapCase(str);
  }

  public static int countMatches(CharSequence str, CharSequence sub) {
    return StringUtils.countMatches(str, sub);
  }

  public static boolean isAlpha(CharSequence cs) {
    return StringUtils.isAlpha(cs);
  }

  public static boolean isAlphaSpace(CharSequence cs) {
    return StringUtils.isAlphaSpace(cs);
  }

  public static boolean isAlphanumeric(CharSequence cs) {
    return StringUtils.isAlphanumeric(cs);
  }

  public static boolean isAlphanumericSpace(CharSequence cs) {
    return StringUtils.isAlphanumericSpace(cs);
  }

  public static boolean isAsciiPrintable(CharSequence cs) {
    return StringUtils.isAsciiPrintable(cs);
  }

  public static boolean isNumeric(CharSequence cs) {
    return StringUtils.isNumeric(cs);
  }

  public static boolean isNumericSpace(CharSequence cs) {
    return StringUtils.isNumericSpace(cs);
  }

  public static boolean isWhitespace(CharSequence cs) {
    return StringUtils.isWhitespace(cs);
  }

  public static boolean isAllLowerCase(CharSequence cs) {
    return StringUtils.isAllLowerCase(cs);
  }

  public static boolean isAllUpperCase(CharSequence cs) {
    return StringUtils.isAllUpperCase(cs);
  }

  public static String defaultString(String str) {
    return StringUtils.defaultString(str);
  }

  public static String defaultString(String str, String defaultStr) {
    return StringUtils.defaultString(str, defaultStr);
  }

  public static <T extends CharSequence> T defaultIfBlank(T str, T defaultStr) {
    return StringUtils.defaultIfBlank(str, defaultStr);
  }

  public static <T extends CharSequence> T defaultIfEmpty(T str, T defaultStr) {
    return StringUtils.defaultIfEmpty(str, defaultStr);
  }

  public static String reverse(String str) {
    return StringUtils.reverse(str);
  }

  public static String reverseDelimited(String str, char separatorChar) {
    return StringUtils.reverseDelimited(str, separatorChar);
  }

  public static String abbreviate(String str, int maxWidth) {
    return StringUtils.abbreviate(str, maxWidth);
  }

  public static String abbreviate(String str, int offset, int maxWidth) {
    return StringUtils.abbreviate(str, offset, maxWidth);
  }

  public static String abbreviateMiddle(String str, String middle, int length) {
    return StringUtils.abbreviateMiddle(str, middle, length);
  }

  public static String difference(String str1, String str2) {
    return StringUtils.difference(str1, str2);
  }

  public static int indexOfDifference(CharSequence cs1, CharSequence cs2) {
    return StringUtils.indexOfDifference(cs1, cs2);
  }

  public static int indexOfDifference(CharSequence... css) {
    return StringUtils.indexOfDifference(css);
  }

  public static String getCommonPrefix(String... strs) {
    return StringUtils.getCommonPrefix(strs);
  }

  public static int getLevenshteinDistance(CharSequence s, CharSequence t) {
    return StringUtils.getLevenshteinDistance(s, t);
  }

  public static int getLevenshteinDistance(CharSequence s, CharSequence t, int threshold) {
    return StringUtils.getLevenshteinDistance(s, t, threshold);
  }

  public static double getJaroWinklerDistance(CharSequence first, CharSequence second) {
    return StringUtils.getJaroWinklerDistance(first, second);
  }

  public static boolean startsWith(CharSequence str, CharSequence prefix) {
    return StringUtils.startsWith(str, prefix);
  }

  public static boolean startsWithIgnoreCase(CharSequence str, CharSequence prefix) {
    return StringUtils.startsWithIgnoreCase(str, prefix);
  }

  public static boolean startsWithAny(CharSequence string, CharSequence... searchStrings) {
    return StringUtils.startsWithAny(string, searchStrings);
  }

  public static boolean endsWith(CharSequence str, CharSequence suffix) {
    return StringUtils.endsWith(str, suffix);
  }

  public static boolean endsWithIgnoreCase(CharSequence str, CharSequence suffix) {
    return StringUtils.endsWithIgnoreCase(str, suffix);
  }

  public static String normalizeSpace(String str) {
    return StringUtils.normalizeSpace(str);
  }

  public static boolean endsWithAny(CharSequence string, CharSequence... searchStrings) {
    return StringUtils.endsWithAny(string, searchStrings);
  }

  public static String appendIfMissing(String str, CharSequence suffix, CharSequence... suffixes) {
    return StringUtils.appendIfMissing(str, suffix, suffixes);
  }

  public static String appendIfMissingIgnoreCase(String str, CharSequence suffix, CharSequence... suffixes) {
    return StringUtils.appendIfMissingIgnoreCase(str, suffix, suffixes);
  }

  public static String prependIfMissing(String str, CharSequence prefix, CharSequence... prefixes) {
    return StringUtils.prependIfMissing(str, prefix, prefixes);
  }

  public static String prependIfMissingIgnoreCase(String str, CharSequence prefix, CharSequence... prefixes) {
    return StringUtils.prependIfMissingIgnoreCase(str, prefix, prefixes);
  }

  public static String toEncodedString(byte[] bytes, Charset charset) {
    return StringUtils.toEncodedString(bytes, charset);
  }
}
