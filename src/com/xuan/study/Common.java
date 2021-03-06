package com.xuan.study;

/**
 * Author : xuan.
 * Date : 2019-01-30.
 * Description :the description of this file
 */
public class Common {
    public static final String ICON_START = "\\ue";
    public static final String HTML_PATH = "src/com/xuan/study/html/iconfont.html";
    public static final String RESULT_PAHT = "src/com/xuan/study/html/result.html";
    public static final String FONT_PATH = "src/com/xuan/study/iconfont.ttf";
    public static final String NONE_DEFINE = "未定义";
    public static final String ICON_ITEM = "<li>\n" +
            "                <i class=\"icon iconfont\">%s</i>\n" +
            "                    <div class=\"name\">%s</div>\n" +
            "                    <div class=\"code\">%s</div>\n" +
            "                </li>";

    public static final String STYLE_DF = "@font-face {font-family: \"iconfont\";\n" +
            "          src: url('iconfont.eot'); /* IE9*/\n" +
            "          src: url('iconfont.eot#iefix') format('embedded-opentype'), /* IE6-IE8 " +
            "*/\n" +
            "          url('iconfont.woff') format('woff'), /* chrome, firefox */\n" +
            "          url('%s') format('truetype'), /* chrome, firefox, opera, " +
            "Safari, Android, iOS 4.2+*/\n" +
            "          url('iconfont.svg#iconfont') format('svg'); /* iOS 4.1- */\n" +
            "        }";
}
