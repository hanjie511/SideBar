package com.example.hj.siderbar;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class PinyinUtils {
    private static String[] alpha_array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    /*
    该方法将字符串的首个汉字字符转化为拼音
     */
    public static String toHanyuPinyin(String str) {
        String pinyin = "";
        HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
        hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        hanyuPinyinOutputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
        char c = str.trim().charAt(0);
        if (c >= 0x4E00 && c <= 0x9FA5) {
            try {
                pinyin = pinyin + PinyinHelper.toHanyuPinyinStringArray(c, hanyuPinyinOutputFormat)[0];
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            pinyin = pinyin + c;
        }
        return pinyin;
    }

    /*
    将传过来的字符串列表按A-Z的顺序排序后返回
     */
    public static ArrayList<String> getSortedListByAlpha(LinkedList<String> list) {
        long time1 = System.currentTimeMillis();
        ArrayList<String> total_list = new ArrayList<String>();
        String first_alpha = "";
        boolean flag = true;
        String str = "";
        for (int i = 0; i < alpha_array.length; i++) {//将字母按A-Z的顺序依次遍历排序
            flag = true;
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                str = iterator.next();
                first_alpha = "" + PinyinUtils.toHanyuPinyin(str).charAt(0);
                if (alpha_array[i].equals(first_alpha)) {
                    if (flag) {
                        total_list.add(alpha_array[i].toUpperCase());
                        flag = false;
                    }
                    total_list.add(str);
                    iterator.remove();
                }
            }
        }
        if (list.size() > 0) {//将首字母不是A-Z的数组放在最后
            total_list.add("#");
            for (String s : list) {
                total_list.add(s);
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("time:" + (time2-time1));
        for (String s : total_list) {
            System.out.println("alpha:" + s);
        }
        return total_list;
    }

}
