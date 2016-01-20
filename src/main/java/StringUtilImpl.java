/**
 * Created by mehdi on 1/19/16.
 */
public class StringUtilImpl implements StringUtil {
    public boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            return true;
        }
        if (str.replaceAll(" ", "").length() == 0) {
            return true;
        }
        return false;
    }

}
