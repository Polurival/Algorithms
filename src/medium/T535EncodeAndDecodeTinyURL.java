package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Related Topics: Hash Table, Math
 *
 * Your Codec object will be instantiated and called as such:
 * Codec codec = new Codec();
 * codec.decode(codec.encode(url));
 *
 * Time complexity O(1)
 * Space complexity O(1)
 */
public class T535EncodeAndDecodeTinyURL {

    public class Codec {

        private static final String FIRST_PART = "http://tinyurl.com/";

        private Map<Integer, String> urls = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            int longUrlHashCode = longUrl.hashCode();
            urls.put(longUrlHashCode, longUrl);
            return FIRST_PART + longUrlHashCode;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            Integer longUrlHashCode = Integer.valueOf(shortUrl.substring(FIRST_PART.length()));
            return urls.get(longUrlHashCode);
        }
    }
}
