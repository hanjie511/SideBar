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
    public static ArrayList<String> getSortedListByAlpha(ArrayList<String> list){
        ArrayList<String> total_list=new ArrayList<String>();
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
        if(aList.size()>1){
            for(String str:aList){
                total_list.add(str);
            }
            aList.clear();
        }
        if(bList.size()>1){
            for(String str:bList){
                total_list.add(str);
            }
            bList.clear();
        }
        if(cList.size()>1){
            for(String str:cList){
                total_list.add(str);
            }
            cList.clear();
        }
        if(dList.size()>1){
            for(String str:dList){
                total_list.add(str);
            }
            dList.clear();
        }
        if(eList.size()>1){
            for(String str:eList){
                total_list.add(str);
            }
            eList.clear();
        }
        if(fList.size()>1){
            for(String str:fList){
                total_list.add(str);
            }
            fList.clear();
        }
        if(gList.size()>1){
            for(String str:gList){
                total_list.add(str);
            }
            gList.clear();
        }
        if(hList.size()>1){
            for(String str:hList){
                total_list.add(str);
            }
            hList.clear();
        }
        if(iList.size()>1){
            for(String str:iList){
                total_list.add(str);
            }
            iList.clear();
        }
        if(jList.size()>1){
            for(String str:jList){
                total_list.add(str);
            }
            jList.clear();
        }
        if(kList.size()>1){
            for(String str:kList){
                total_list.add(str);
            }
            kList.clear();
        }
        if(lList.size()>1){
            for(String str:lList){
                total_list.add(str);
            }
            lList.clear();
        }
        if(mList.size()>1){
            for(String str:mList){
                total_list.add(str);
            }
            mList.clear();
        }
        if(nList.size()>1){
            for(String str:nList){
                total_list.add(str);
            }
            nList.clear();
        }
        if(oList.size()>1){
            for(String str:oList){
                total_list.add(str);
            }
            oList.clear();
        }
        if(pList.size()>1){
            for(String str:pList){
                total_list.add(str);
            }
            pList.clear();
        }
        if(qList.size()>1){
            for(String str:qList){
                total_list.add(str);
            }
            qList.clear();
        }
        if(rList.size()>1){
            for(String str:rList){
                total_list.add(str);
            }
            rList.clear();
        }
        if(sList.size()>1){
            for(String str:dList){
                total_list.add(str);
            }
            sList.clear();
        }
        if(tList.size()>1){
            for(String str:tList){
                total_list.add(str);
            }
            tList.clear();
        }
        if(uList.size()>1){
            for(String str:uList){
                total_list.add(str);
            }
            uList.clear();
        }
        if(vList.size()>1){
            for(String str:vList){
                total_list.add(str);
            }
            vList.clear();
        }
        if(wList.size()>1){
            for(String str:wList){
                total_list.add(str);
            }
            wList.clear();
        }
        if(xList.size()>1){
            for(String str:xList){
                total_list.add(str);
            }
            xList.clear();
        }
        if(yList.size()>1){
            for(String str:yList){
                total_list.add(str);
            }
            yList.clear();
        }
        if(zList.size()>1){
            for(String str:zList){
                total_list.add(str);
            }
            zList.clear();
        }
        return total_list;
    }

}
