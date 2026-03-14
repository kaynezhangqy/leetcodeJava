package common;

public class Utils {

    public static void isNull() {
        int[] empty = {};           // 返回0，正常处理
        int[] nullArr = null;       // 返回0，避免异常
        System.out.println(empty == null);
        System.out.println(nullArr == null);
    }

}
