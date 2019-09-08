package com.example.hj.siderbar;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

import java.util.ArrayList;
import java.util.Map;

public class PinyinUtils {
    /*
    该方法将字符串的首个汉字字符转化为拼音
     */
    public static String toHanyuPinyin(String str){
        String pinyin="";
        HanyuPinyinOutputFormat hanyuPinyinOutputFormat=new HanyuPinyinOutputFormat();
        hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        hanyuPinyinOutputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
        char c=str.trim().charAt(0);
            if(c >= 0x4E00 &&  c <= 0x9FA5){
                try{
                    pinyin=pinyin+PinyinHelper.toHanyuPinyinStringArray(c,hanyuPinyinOutputFormat)[0];
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                pinyin=pinyin+c;
            }
        return pinyin;
    }
    /*
    将传过来的字符串列表按A-Z的顺序排序后返回
     */
    public static ArrayList<ArrayList<String>> getSortedListByAlpha(ArrayList<String> list){
        ArrayList<ArrayList<String>> total_list=new ArrayList<ArrayList<String>>();
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("A");
        ArrayList<String> bList=new ArrayList<String>();
        bList.add("B");
        ArrayList<String> cList=new ArrayList<String>();
        cList.add("C");
        ArrayList<String> dList=new ArrayList<String>();
        dList.add("D");
        ArrayList<String> eList=new ArrayList<String>();
        eList.add("E");
        ArrayList<String> fList=new ArrayList<String>();
        fList.add("F");
        ArrayList<String> gList=new ArrayList<String>();
        gList.add("G");
        ArrayList<String> hList=new ArrayList<String>();
        hList.add("H");
        ArrayList<String> iList=new ArrayList<String>();
        iList.add("I");
        ArrayList<String> jList=new ArrayList<String>();
        jList.add("J");
        ArrayList<String> kList=new ArrayList<String>();
        kList.add("K");
        ArrayList<String> lList=new ArrayList<String>();
        lList.add("L");
        ArrayList<String> mList=new ArrayList<String>();
        mList.add("M");
        ArrayList<String> nList=new ArrayList<String>();
        nList.add("N");
        ArrayList<String> oList=new ArrayList<String>();
        oList.add("O");
        ArrayList<String> pList=new ArrayList<String>();
        pList.add("P");
        ArrayList<String> qList=new ArrayList<String>();
        qList.add("Q");
        ArrayList<String> rList=new ArrayList<String>();
        rList.add("R");
        ArrayList<String> sList=new ArrayList<String>();
        sList.add("S");
        ArrayList<String> tList=new ArrayList<String>();
        tList.add("T");
        ArrayList<String> uList=new ArrayList<String>();
        uList.add("U");
        ArrayList<String> vList=new ArrayList<String>();
        vList.add("V");
        ArrayList<String> wList=new ArrayList<String>();
        wList.add("W");
        ArrayList<String> xList=new ArrayList<String>();
        xList.add("X");
        ArrayList<String> yList=new ArrayList<String>();
        yList.add("Y");
        ArrayList<String> zList=new ArrayList<String>();
        zList.add("Z");
        ArrayList<String> defaultList=new ArrayList<String>();
        defaultList.add("#");
        for(String str:list){
            char c=PinyinUtils.toHanyuPinyin(str).charAt(0);
            switch (c){
                case 'a':
                    aList.add(str);
                    break;
                case 'b':
                    bList.add(str);
                    break;
                case 'c':
                    cList.add(str);
                    break;
                case 'd':
                    dList.add(str);
                    break;
                case 'e':
                    eList.add(str);
                    break;
                case 'f':
                    fList.add(str);
                    break;
                case 'g':
                    gList.add(str);
                    break;
                case 'h':
                    hList.add(str);
                    break;
                case 'i':
                    iList.add(str);
                    break;
                case 'j':
                    jList.add(str);
                    break;
                case 'k':
                    kList.add(str);
                    break;
                case 'l':
                    lList.add(str);
                    break;
                case 'm':
                    mList.add(str);
                    break;
                case 'n':
                    nList.add(str);
                    break;
                case 'o':
                    oList.add(str);
                    break;
                case 'p':
                    pList.add(str);
                    break;
                case 'q':
                    qList.add(str);
                    break;
                case 'r':
                    rList.add(str);
                    break;
                case 's':
                    sList.add(str);
                    break;
                case 't':
                    tList.add(str);
                    break;
                case 'u':
                    uList.add(str);
                    break;
                case 'v':
                    vList.add(str);
                    break;
                case 'w':
                    wList.add(str);
                    break;
                case 'x':
                    xList.add(str);
                    break;
                case 'y':
                    yList.add(str);
                    break;
                case 'z':
                    zList.add(str);
                    break;
                 default:
                     defaultList.add(str);
                     break;


            }
        }
        if(aList.size()>0){
            total_list.add(aList);
        }
        if(bList.size()>0){
            total_list.add(bList);
        }
        if(cList.size()>0){
            total_list.add(cList);
        }
        if(dList.size()>0){
            total_list.add(dList);
        }
        if(eList.size()>0){
            total_list.add(eList);
        }
        if(fList.size()>0){
            total_list.add(fList);
        }
        if(gList.size()>0){
            total_list.add(gList);
        }
        if(hList.size()>0){
            total_list.add(hList);
        }
        if(iList.size()>0){
            total_list.add(iList);
        }
        if(jList.size()>0){
            total_list.add(jList);
        }
        if(kList.size()>0){
            total_list.add(kList);
        }
        if(lList.size()>0){
            total_list.add(lList);
        }
        if(mList.size()>0){
            total_list.add(mList);
        }
        if(nList.size()>0){
            total_list.add(nList);
        }
        if(oList.size()>0){
            total_list.add(oList);
        }
        if(pList.size()>0){
            total_list.add(pList);
        }
        if(qList.size()>0){
            total_list.add(qList);
        }
        if(rList.size()>0){
            total_list.add(rList);
        }
        if(sList.size()>0){
            total_list.add(sList);
        }
        if(tList.size()>0){
            total_list.add(tList);
        }
        if(uList.size()>0){
            total_list.add(uList);
        }
        if(vList.size()>0){
            total_list.add(vList);
        }
        if(wList.size()>0){
            total_list.add(wList);
        }
        if(xList.size()>0){
            total_list.add(xList);
        }
        if(yList.size()>0){
            total_list.add(yList);
        }
        if(zList.size()>0){
            total_list.add(zList);
        }
        return total_list;
    }

}
