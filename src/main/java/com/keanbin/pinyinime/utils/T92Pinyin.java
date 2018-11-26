package com.keanbin.pinyinime.utils;

import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by MrBian on 2017/11/27.
 */

public class T92Pinyin {
    private static final String TAG = "T92Pinyin";
    private static Object splStrs;

    public static char[] findCharsByKeycodes(String keys) {
        int length = keys.length();
        Log.e(TAG,"length=" + length);
        switch (length) {
            case 1:
                return getChars(t9PY_index1, keys);
            case 2:
                return getChars(t9PY_index2, keys);
            case 3:
                return getChars(t9PY_index3, keys);
            case 4:
                return getChars(t9PY_index4, keys);
            case 5:
                return getChars(t9PY_index5, keys);
            case 6:
                return getChars(t9PY_index6, keys);
            default:
                return null;
        }
    }

    /**
     * 获取所有匹配的拼音组合
     * @param inputKey
     * @return
     */
    public static ArrayList<char[]> getSplStrs(String inputKey) {
        ArrayList<char[]> arrayList = new ArrayList<>();
        int length = inputKey.length();
        switch (length) {
            case 1:
                return getAllCharArr(t9PY_index1, inputKey);
            case 2:
                return getAllCharArr(t9PY_index2, inputKey);
            case 3:
                return getAllCharArr(t9PY_index3, inputKey);
            case 4:
                return getAllCharArr(t9PY_index4, inputKey);
            case 5:
                return getAllCharArr(t9PY_index5, inputKey);
            case 6:
                return getAllCharArr(t9PY_index6, inputKey);
        }
        return arrayList;
    }

    /**
     * 查询对应数组获取拼音字符数组
     * @param index
     * @param keys
     * @return
     */
    public static ArrayList<char[]> getAllCharArr(String[][] index, String keys) {
        ArrayList<char[]> charsArr = new ArrayList<>();
        for (int i=0; i<index.length; i++) {
            if (TextUtils.equals(index[i][0], keys)) {
                String s = index[i][1];
                int slen = s.length();
                char[] chars = new char[slen];
                for (int j = 0; j < slen; j++) {
                    chars[j] = s.charAt(j);
                }
                charsArr.add(chars);
                continue;
            }
        }
        return charsArr;
    }
    /**
     * 获取第一个匹配的
     * @param index
     * @param keys
     * @return
     */
    private static char[] getChars(String[][] index, String keys) {
        for (int i = 0; i < index.length; i++) {
            if (TextUtils.equals(index[i][0], keys)) {
                String s = index[i][1];
                int slen = s.length();
                char[] chars = new char[slen];
                for (int j = 0; j < slen; j++) {
                    chars[j] = s.charAt(j);
                }
                return chars;
            }
        }
        return null;
    }

    public static final String[][] t9PY_index1 = {
            {"2", "a"},
            {"2", "b"},
            {"2", "c"},
            {"3", "d"},
            {"3", "e"},
            {"3", "f"},
            {"4", "g"},
            {"4", "h"},
            {"5", "j"},
            {"5", "k"},
            {"5", "l"},
            {"6", "m"},
            {"6", "n"},
            {"6", "o"},
            {"7", "p"},
            {"7", "q"},
            {"7", "r"},
            {"7", "s"},
            {"8", "t"},
            {"9", "w"},
            {"9", "x"},
            {"9", "y"},
            {"9", "z"}};
    public static final String[][] t9PY_index2 = {
            {"22", "ba"},
            {"22", "ca"},
            {"23", "ce"},
            {"23", "be"},
            {"24", "ai"},
            {"24", "bi"},
            {"24", "ch"},
            {"24", "ci"},
            {"26", "bo"},
            {"26", "an"},
            {"26", "ao"},
            {"28", "bu"},
            {"28", "cu"},
            {"32", "da"},
            {"32", "fa"},
            {"33", "de"},
            {"33", "fe"},
            {"34", "di"},
            {"34", "ei"},
            {"36", "en"},
            {"36", "fo"},
            {"37", "er"},
            {"36", "do"},
            {"38", "du"},
            {"38", "fu"},
            {"42", "ga"},
            {"42", "ha"},
            {"43", "ge"},
            {"43", "he"},
            {"46", "go"},
            {"46", "ho"},
            {"48", "gu"},
            {"48", "hu"},
            {"52", "ka"},
            {"52", "la"},
            {"53", "le"},
            {"53", "ke"},
            {"54", "ji"},
            {"54", "li"},
            {"56", "ko"},
            {"56", "lo"},
            {"58", "lu"},
            {"58", "lv"},
            {"58", "ju"},
            {"58", "ku"},
            {"62", "ma"},
            {"62", "na"},
            {"63", "me"},
            {"63", "ne"},
            {"64", "mi"},
            {"64", "ni"},
            {"66", "mo"},
            {"66", "no"},
            {"68", "mu"},
            {"68", "nu"},
            {"68", "nv"},
            {"68", "ou"},
            {"72", "pa"},
            {"72", "ra"},
            {"72", "sa"},
            {"73", "re"},
            {"73", "se"},
            {"74", "pi"},
            {"74", "qi"},
            {"74", "ri"},
            {"74", "sh"},
            {"74", "si"},
            {"76", "so"},
            {"76", "po"},
            {"76", "ro"},
            {"78", "pu"},
            {"78", "qu"},
            {"78", "ru"},
            {"78", "su"},
            {"82", "ta"},
            {"83", "te"},
            {"84", "ti"},
            {"86", "to"},
            {"88", "tu"},
            {"92", "wa"},
            {"92", "ya"},
            {"92", "za"},
            {"93", "ze"},
            {"93", "ye"},
            {"94", "yi"},
            {"94", "xi"},
            {"94", "zh"},
            {"94", "zi"},
            {"96", "wo"},
            {"96", "yo"},
            {"98", "wu"},
            {"98", "xu"},
            {"98", "yu"},
            {"98", "zu"}};
    public static final String[][] t9PY_index3 = {
            {"224", "bai"},
            {"224", "cai"},
            {"226", "can"},
            {"226", "cao"},
            {"226", "ban"},
            {"226", "bao"},
            {"234", "bei"},
            {"236", "ben"},
            {"236", "cen"},
            {"242", "bia"},
            {"242", "cha"},
            {"243", "che"},
            {"243", "bie"},
            {"244", "chi"},
            {"246", "bin"},
            {"246", "cho"},
            {"248", "chu"},
            {"264", "ang"},
            {"266", "con"},
            {"268", "cou"},
            {"282", "cua"},
            {"284", "cui"},
            {"286", "cun"},
            {"286", "cuo"},
            {"324", "dai"},
            {"326", "dan"},
            {"326", "dao"},
            {"326", "fan"},
            {"334", "fei"},
            {"336", "fen"},
            {"336", "den"},
            {"342", "dia"},
            {"343", "die"},
            {"346", "din"},
            {"348", "diu"},
            {"366", "don"},
            {"368", "dou"},
            {"368", "fou"},
            {"382", "dua"},
            {"384", "dui"},
            {"386", "dun"},
            {"386", "duo"},
            {"424", "gai"},
            {"424", "hai"},
            {"426", "han"},
            {"426", "gan"},
            {"426", "gao"},
            {"426", "hao"},
            {"434", "hei"},
            {"434", "gei"},
            {"436", "gen"},
            {"436", "hen"},
            {"466", "gon"},
            {"466", "hon"},
            {"468", "gou"},
            {"468", "hou"},
            {"482", "hua"},
            {"482", "gua"},
            {"484", "gui"},
            {"484", "hui"},
            {"486", "hun"},
            {"486", "huo"},
            {"486", "gun"},
            {"486", "guo"},
            {"524", "kai"},
            {"524", "lai"},
            {"526", "lan"},
            {"526", "kan"},
            {"526", "kao"},
            {"526", "lao"},
            {"534", "lei"},
            {"536", "len"},
            {"536", "ken"},
            {"542", "jia"},
            {"542", "lia"},
            {"543", "jie"},
            {"543", "lie"},
            {"546", "lin"},
            {"546", "jin"},
            {"546", "jio"},
            {"548", "jiu"},
            {"548", "liu"},
            {"566", "lon"},
            {"566", "kon"},
            {"568", "kou"},
            {"568", "lou"},
            {"582", "lua"},
            {"582", "kua"},
            {"582", "jua"},
            {"583", "jue"},
            {"583", "lue"},
            {"584", "kui"},
            {"586", "lun"},
            {"586", "luo"},
            {"586", "kun"},
            {"586", "kuo"},
            {"586", "jun"},
            {"624", "mai"},
            {"624", "nai"},
            {"626", "nan"},
            {"626", "man"},
            {"626", "mao"},
            {"626", "nao"},
            {"634", "nei"},
            {"634", "mei"},
            {"636", "nen"},
            {"636", "men"},
            {"642", "mia"},
            {"642", "nia"},
            {"643", "mie"},
            {"643", "nie"},
            {"646", "nin"},
            {"646", "min"},
            {"648", "miu"},
            {"648", "niu"},
            {"666", "non"},
            {"668", "mou"},
            {"668", "nou"},
            {"682", "nua"},
            {"683", "nve"},
            {"686", "nuo"},
            {"724", "pai"},
            {"734", "pei"},
            {"724", "sai"},
            {"726", "san"},
            {"726", "pan"},
            {"726", "pao"},
            {"726", "ran"},
            {"726", "rao"},
            {"726", "sao"},
            {"736", "pen"},
            {"736", "sen"},
            {"736", "ren"},
            {"742", "pia"},
            {"742", "qia"},
            {"742", "sha"},
            {"743", "pie"},
            {"743", "qie"},
            {"743", "she"},
            {"744", "shi"},
            {"748", "shu"},
            {"746", "qin"},
            {"746", "pin"},
            {"746", "qio"},
            {"746", "sho"},
            {"748", "qiu"},
            {"766", "ron"},
            {"768", "pou"},
            {"768", "rou"},
            {"766", "son"},
            {"768", "sou"},
            {"782", "sua"},
            {"782", "rua"},
            {"782", "qua"},
            {"783", "que"},
            {"784", "rui"},
            {"784", "sui"},
            {"786", "sun"},
            {"786", "suo"},
            {"786", "run"},
            {"786", "ruo"},
            {"786", "qun"},
            {"824", "tai"},
            {"826", "tan"},
            {"826", "tao"},
            {"836", "ten"},
            {"842", "tia"},
            {"843", "tie"},
            {"846", "tin"},
            {"866", "ton"},
            {"868", "tou"},
            {"882", "tua"},
            {"884", "tui"},
            {"886", "tun"},
            {"886", "tuo"},
            {"924", "wai"},
            {"924", "zai"},
            {"926", "zan"},
            {"926", "wan"},
            {"926", "yan"},
            {"926", "yao"},
            {"926", "zao"},
            {"934", "zei"},
            {"934", "wei"},
            {"936", "zen"},
            {"936", "wen"},
            {"942", "xia"},
            {"942", "zha"},
            {"943", "xie"},
            {"943", "zhe"},
            {"944", "zhi"},
            {"946", "zho"},
            {"946", "xin"},
            {"946", "xio"},
            {"946", "yin"},
            {"948", "xiu"},
            {"948", "zhu"},
            {"966", "yon"},
            {"966", "zon"},
            {"968", "you"},
            {"968", "zou"},
            {"982", "zua"},
            {"982", "yua"},
            {"982", "xua"},
            {"983", "xue"},
            {"983", "yue"},
            {"984", "zui"},
            {"986", "zun"},
            {"986", "zuo"},
            {"986", "yun"},
            {"986", "xun"}};
    public static final String[][] t9PY_index4 = {
            {"2264", "bang"},
            {"2364", "beng"},
            {"2426", "bian"},
            {"2426", "biao"},
            {"2464", "bing"},
            {"2264", "cang"},
            {"2364", "ceng"},
            {"2424", "chai"},
            {"2426", "chan"},
            {"2426", "chao"},
            {"2436", "chen"},
            {"2466", "chon"},
            {"2468", "chou"},
            {"2482", "chua"},
            {"2484", "chui"},
            {"2486", "chun"},
            {"2486", "chuo"},
            {"2664", "cong"},
            {"2826", "cuan"},
            {"3264", "dang"},
            {"3264", "fang"},
            {"3364", "feng"},
            {"3364", "deng"},
            {"3426", "dian"},
            {"3426", "diao"},
            {"3464", "ding"},
            {"3664", "dong"},
            {"3826", "duan"},
            {"4264", "gang"},
            {"4364", "geng"},
            {"4664", "gong"},
            {"4824", "guai"},
            {"4826", "guan"},
            {"4264", "hang"},
            {"4364", "heng"},
            {"4664", "hong"},
            {"4824", "huai"},
            {"4826", "huan"},
            {"5264", "kang"},
            {"5264", "lang"},
            {"5364", "leng"},
            {"5364", "keng"},
            {"5426", "lian"},
            {"5426", "liao"},
            {"5426", "jian"},
            {"5426", "jiao"},
            {"5464", "jing"},
            {"5464", "ling"},
            {"5466", "jion"},
            {"5664", "long"},
            {"5664", "kong"},
            {"5824", "kuai"},
            {"5826", "kuan"},
            {"5826", "luan"},
            {"5826", "juan"},
            {"6264", "mang"},
            {"6264", "nang"},
            {"6364", "meng"},
            {"6364", "neng"},
            {"6426", "mian"},
            {"6426", "miao"},
            {"6426", "nian"},
            {"6426", "niao"},
            {"6464", "ming"},
            {"6464", "ning"},
            {"6664", "nong"},
            {"6826", "nuan"},
            {"7264", "pang"},
            {"7364", "peng"},
            {"7264", "rang"},
            {"7264", "sang"},
            {"7364", "seng"},
            {"7364", "reng"},
            {"7424", "shai"},
            {"7426", "shan"},
            {"7426", "shao"},
            {"7426", "pian"},
            {"7426", "piao"},
            {"7426", "qian"},
            {"7426", "qiao"},
            {"7436", "shen"},
            {"7464", "ping"},
            {"7464", "qing"},
            {"7466", "qion"},
            {"7468", "shou"},
            {"7482", "shua"},
            {"7484", "shui"},
            {"7486", "shun"},
            {"7486", "shuo"},
            {"7664", "rong"},
            {"7664", "song"},
            {"7826", "suan"},
            {"7826", "quan"},
            {"7826", "ruan"},
            {"8264", "tang"},
            {"8364", "teng"},
            {"8426", "tian"},
            {"8426", "tiao"},
            {"8464", "ting"},
            {"8664", "tong"},
            {"8826", "tuan"},
            {"9264", "wang"},
            {"9264", "zang"},
            {"9264", "yang"},
            {"9364", "weng"},
            {"9364", "zeng"},
            {"9424", "zhai"},
            {"9426", "zhan"},
            {"9426", "zhao"},
            {"9426", "xian"},
            {"9426", "xiao"},
            {"9436", "zhen"},
            {"9464", "xing"},
            {"9464", "ying"},
            {"9466", "zhon"},
            {"9468", "zhou"},
            {"9482", "zhua"},
            {"9484", "zhui"},
            {"9486", "zhun"},
            {"9486", "zhuo"},
            {"9466", "xion"},
            {"9664", "yong"},
            {"9664", "zong"},
            {"9826", "yuan"},
            {"9826", "xuan"},
            {"9826", "zuan"}};
    public static final String[][] t9PY_index5 = {
            {"94264", "xiang"},
            {"94264", "zhang"},
            {"94364", "zheng"},
            {"94664", "xiong"},
            {"94664", "zhong"},
            {"94824", "zhuai"},
            {"94826", "zhuan"},
            {"24264", "chang"},
            {"24364", "cheng"},
            {"24664", "chong"},
            {"24824", "chuai"},
            {"24826", "chuan"},
            {"48264", "guang"},
            {"48264", "huang"},
            {"54264", "jiang"},
            {"54264", "liang"},
            {"54664", "jiong"},
            {"58264", "kuang"},
            {"64264", "niang"},
            {"74264", "qiang"},
            {"74264", "shang"},
            {"74364", "sheng"},
            {"74664", "qiong"},
            {"74824", "shuai"},
            {"74826", "shuan"}};
    public static final String[][] t9PY_index6 = {
            {"248264", "chuang"},
            {"748264", "shuang"},
            {"948264", "zhuang"},
    };


}
