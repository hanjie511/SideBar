package com.example.hj.siderbar;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PinyinUtils {
    private static  String [] alpha_array={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
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
    public  static ArrayList<String> getSortedListByAlpha(LinkedList<String> list) {
        ArrayList<String> total_list = new ArrayList< String>();
        String first_alpha="";
        boolean flag=true;
        String str="";
        for (int i=0;i<alpha_array.length;i++) {//将字母按A-Z的顺序依次遍历排序
            flag=true;
            for (int j=0;j<list.size();j++) {
                str=list.get(j);
                first_alpha  = PinyinUtils.toHanyuPinyin(str);
                if(alpha_array[i].equals(first_alpha)){
                    if(flag){
                        total_list.add(alpha_array[i]);
                        flag=false;
                    }
                    total_list.add(str);
                    list.remove(j);
                }
            }
        }
        if(list.size()>0){//将首字母不是A-Z的数组放在最后
            total_list.add("#");
            for(String s:list){
                total_list.add(s);
            }
        }
        return total_list;
    }

}
