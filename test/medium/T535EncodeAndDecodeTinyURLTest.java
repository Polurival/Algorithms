package medium;

import medium.T535EncodeAndDecodeTinyURL.Codec;
import org.junit.Test;

import static org.junit.Assert.*;

public class T535EncodeAndDecodeTinyURLTest {
    @Test
    public void encodeDecodeUrl() {
        Codec testClass = new T535EncodeAndDecodeTinyURL().new Codec();

        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String expectedShortUrl = "http://tinyurl.com/-1163677885";

        String shortUrl = testClass.encode(longUrl);
        assertEquals(expectedShortUrl, shortUrl);
        assertEquals(longUrl, testClass.decode(shortUrl));
    }
}