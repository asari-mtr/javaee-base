package jp.co.anywhere.consumer.shared.util;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

/**
 * Created by asari on 2015/11/21.
 */
public class DigestHelper {

  public static char[] encodeHex(byte[] data) {
    return Hex.encodeHex(data);
  }

  public static char[] encodeHex(byte[] data, boolean toLowerCase) {
    return Hex.encodeHex(data, toLowerCase);
  }

  public static String encodeHexString(byte[] data) {
    return Hex.encodeHexString(data);
  }

  public static MessageDigest getDigest(String algorithm) {
    return DigestUtils.getDigest(algorithm);
  }

  public static String md5Hex(String data) {
    return DigestUtils.md5Hex(data);
  }

  public static byte[] sha512(byte[] data) {
    return DigestUtils.sha512(data);
  }

  public static byte[] sha256(String data) {
    return DigestUtils.sha256(data);
  }

  public static String md2Hex(byte[] data) {
    return DigestUtils.md2Hex(data);
  }

  public static byte[] sha384(byte[] data) {
    return DigestUtils.sha384(data);
  }

  public static MessageDigest getSha512Digest() {
    return DigestUtils.getSha512Digest();
  }

  public static String md2Hex(String data) {
    return DigestUtils.md2Hex(data);
  }

  public static String md5Hex(byte[] data) {
    return DigestUtils.md5Hex(data);
  }

  public static String sha512Hex(byte[] data) {
    return DigestUtils.sha512Hex(data);
  }

  public static MessageDigest getSha1Digest() {
    return DigestUtils.getSha1Digest();
  }

  public static MessageDigest getSha384Digest() {
    return DigestUtils.getSha384Digest();
  }

  public static byte[] md2(byte[] data) {
    return DigestUtils.md2(data);
  }

  public static byte[] sha1(String data) {
    return DigestUtils.sha1(data);
  }

  public static String sha512Hex(String data) {
    return DigestUtils.sha512Hex(data);
  }

  public static String sha1Hex(byte[] data) {
    return DigestUtils.sha1Hex(data);
  }

  public static MessageDigest updateDigest(MessageDigest messageDigest, byte[] valueToDigest) {
    return DigestUtils.updateDigest(messageDigest, valueToDigest);
  }

  public static byte[] sha512(String data) {
    return DigestUtils.sha512(data);
  }

  public static byte[] sha384(String data) {
    return DigestUtils.sha384(data);
  }

  public static byte[] md5(byte[] data) {
    return DigestUtils.md5(data);
  }

  public static MessageDigest getSha256Digest() {
    return DigestUtils.getSha256Digest();
  }

  public static String sha384Hex(byte[] data) {
    return DigestUtils.sha384Hex(data);
  }

  public static String sha256Hex(String data) {
    return DigestUtils.sha256Hex(data);
  }

  public static byte[] sha1(byte[] data) {
    return DigestUtils.sha1(data);
  }

  public static String sha384Hex(String data) {
    return DigestUtils.sha384Hex(data);
  }

  public static byte[] sha256(byte[] data) {
    return DigestUtils.sha256(data);
  }

  public static MessageDigest getMd5Digest() {
    return DigestUtils.getMd5Digest();
  }

  public static MessageDigest getMd2Digest() {
    return DigestUtils.getMd2Digest();
  }

  public static String sha256Hex(byte[] data) {
    return DigestUtils.sha256Hex(data);
  }

  public static byte[] md2(String data) {
    return DigestUtils.md2(data);
  }

  public static byte[] md5(String data) {
    return DigestUtils.md5(data);
  }

  public static MessageDigest updateDigest(MessageDigest messageDigest, String valueToDigest) {
    return DigestUtils.updateDigest(messageDigest, valueToDigest);
  }

  public static String sha1Hex(String data) {
    return DigestUtils.sha1Hex(data);
  }
}
