/**
 * Created by wqlin on 17-12-10 00:19.
 */
public class No344 {
    /**
     * scala solution will cause a TLE
     ```scala
     def reverseString(s: String): String = s.reverse
     ```
     */
    public String reverseString(String s) {
        char[] temp = new char[s.length()];
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--)
            temp[i] = s.charAt(j);
        return new String(temp);
    }
}
