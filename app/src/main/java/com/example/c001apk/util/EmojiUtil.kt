package com.example.c001apk.util

import com.example.c001apk.R

object EmojiUtil {

    fun getEmoji(emoji: String): Int {
        if (PrefManager.showEmoji) {
            if (PrefManager.allHuaji) {
                return when (emoji) {
                    "[置顶]" -> R.drawable.ic_feed_top
                    "[楼主]" -> R.drawable.ic_author
                    "[层主]" -> R.drawable.ic_subauthor
                    "[doge]" -> R.drawable.coolapk_emotion_62_huaji
                    "[doge原谅ta]" -> R.drawable.coolapk_emotion_62_huaji
                    "[doge呵斥]" -> R.drawable.coolapk_emotion_62_huaji
                    "[doge笑哭]" -> R.drawable.coolapk_emotion_62_huaji
                    "[ok]" -> R.drawable.coolapk_emotion_62_huaji
                    "[py交易]" -> R.drawable.coolapk_emotion_62_huaji
                    "[qqdoge]" -> R.drawable.coolapk_emotion_62_huaji
                    "[t耐克嘴]" -> R.drawable.coolapk_emotion_62_huaji
                    "[yyds]" -> R.drawable.coolapk_emotion_62_huaji
                    "[下次一定]" -> R.drawable.coolapk_emotion_62_huaji
                    "[不开心]" -> R.drawable.coolapk_emotion_62_huaji
                    "[二哈]" -> R.drawable.coolapk_emotion_62_huaji
                    "[二哈盯]" -> R.drawable.coolapk_emotion_62_huaji
                    "[亲亲]" -> R.drawable.coolapk_emotion_62_huaji
                    "[假笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[偷看]" -> R.drawable.coolapk_emotion_62_huaji
                    "[傲慢]" -> R.drawable.coolapk_emotion_62_huaji
                    "[再见]" -> R.drawable.coolapk_emotion_62_huaji
                    "[凋谢]" -> R.drawable.coolapk_emotion_62_huaji
                    "[列文虎克]" -> R.drawable.coolapk_emotion_62_huaji
                    "[发呆]" -> R.drawable.coolapk_emotion_62_huaji
                    "[发怒]" -> R.drawable.coolapk_emotion_62_huaji
                    "[受虐滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[可怜]" -> R.drawable.coolapk_emotion_62_huaji
                    "[可爱]" -> R.drawable.coolapk_emotion_62_huaji
                    "[吃瓜]" -> R.drawable.coolapk_emotion_62_huaji
                    "[吐舌]" -> R.drawable.coolapk_emotion_62_huaji
                    "[呲牙]" -> R.drawable.coolapk_emotion_62_huaji
                    "[呵呵]" -> R.drawable.coolapk_emotion_62_huaji
                    "[哈哈哈]" -> R.drawable.coolapk_emotion_62_huaji
                    "[哦吼吼]" -> R.drawable.coolapk_emotion_62_huaji
                    "[哼唧]" -> R.drawable.coolapk_emotion_62_huaji
                    "[喝茶]" -> R.drawable.coolapk_emotion_62_huaji
                    "[喝酒]" -> R.drawable.coolapk_emotion_62_huaji
                    "[喵喵]" -> R.drawable.coolapk_emotion_62_huaji
                    "[喷]" -> R.drawable.coolapk_emotion_62_huaji
                    "[喷血]" -> R.drawable.coolapk_emotion_62_huaji
                    "[嘿哈]" -> R.drawable.coolapk_emotion_62_huaji
                    "[噗]" -> R.drawable.coolapk_emotion_62_huaji
                    "[坏笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[墨镜滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[夏阁艾迪之剑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[头条通知书]" -> R.drawable.coolapk_emotion_62_huaji
                    "[委屈]" -> R.drawable.coolapk_emotion_62_huaji
                    "[害怕]" -> R.drawable.coolapk_emotion_62_huaji
                    "[害羞]" -> R.drawable.coolapk_emotion_62_huaji
                    "[小嘴滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[弱]" -> R.drawable.coolapk_emotion_62_huaji
                    "[强]" -> R.drawable.coolapk_emotion_62_huaji
                    "[微微一笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[微笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[心碎]" -> R.drawable.coolapk_emotion_62_huaji
                    "[惊讶]" -> R.drawable.coolapk_emotion_62_huaji
                    "[感知不强]" -> R.drawable.coolapk_emotion_62_huaji
                    "[懒得理]" -> R.drawable.coolapk_emotion_62_huaji
                    "[我最美]" -> R.drawable.coolapk_emotion_62_huaji
                    "[托腮]" -> R.drawable.coolapk_emotion_62_huaji
                    "[抠鼻]" -> R.drawable.coolapk_emotion_62_huaji
                    "[抱拳]" -> R.drawable.coolapk_emotion_62_huaji
                    "[挑眉坏笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[挨打]" -> R.drawable.coolapk_emotion_62_huaji
                    "[捂嘴笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[捂脸]" -> R.drawable.coolapk_emotion_62_huaji
                    "[掩面笑]" -> R.drawable.coolapk_emotion_62_huaji
                    "[撇嘴]" -> R.drawable.coolapk_emotion_62_huaji
                    "[斗鸡眼滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新币1分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币1$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币100块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币10块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币1€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币1分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币1块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币1毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币2$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币20块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币2€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币2分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币2块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币2毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币5$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币50块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币5€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币5分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币5块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币5毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[新酷币]" -> R.drawable.coolapk_emotion_62_huaji
                    "[无奈]" -> R.drawable.coolapk_emotion_62_huaji
                    "[无语]" -> R.drawable.coolapk_emotion_62_huaji
                    "[机智]" -> R.drawable.coolapk_emotion_62_huaji
                    "[欢呼]" -> R.drawable.coolapk_emotion_62_huaji
                    "[汗]" -> R.drawable.coolapk_emotion_62_huaji
                    "[流汗滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[流泪]" -> R.drawable.coolapk_emotion_62_huaji
                    "[滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[火把]" -> R.drawable.coolapk_emotion_62_huaji
                    "[灰色酷币]" -> R.drawable.coolapk_emotion_62_huaji
                    "[爆怒]" -> R.drawable.coolapk_emotion_62_huaji
                    "[爱心]" -> R.drawable.coolapk_emotion_62_huaji
                    "[牛啤]" -> R.drawable.coolapk_emotion_62_huaji
                    "[玫瑰]" -> R.drawable.coolapk_emotion_62_huaji
                    "[疑问]" -> R.drawable.coolapk_emotion_62_huaji
                    "[白眼]" -> R.drawable.coolapk_emotion_62_huaji
                    "[白纹酷币]" -> R.drawable.coolapk_emotion_62_huaji
                    "[皱眉]" -> R.drawable.coolapk_emotion_62_huaji
                    "[真正的音乐]" -> R.drawable.coolapk_emotion_62_huaji
                    "[睡]" -> R.drawable.coolapk_emotion_62_huaji
                    "[笑哭]" -> R.drawable.coolapk_emotion_62_huaji
                    "[笑眼]" -> R.drawable.coolapk_emotion_62_huaji
                    "[红药丸]" -> R.drawable.coolapk_emotion_62_huaji
                    "[给我整一个]" -> R.drawable.coolapk_emotion_62_huaji
                    "[绿帽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[绿色酷币]" -> R.drawable.coolapk_emotion_62_huaji
                    "[绿药丸]" -> R.drawable.coolapk_emotion_62_huaji
                    "[耐克嘴]" -> R.drawable.coolapk_emotion_62_huaji
                    "[耶]" -> R.drawable.coolapk_emotion_62_huaji
                    "[舒服]" -> R.drawable.coolapk_emotion_62_huaji
                    "[色]" -> R.drawable.coolapk_emotion_62_huaji
                    "[菜刀]" -> R.drawable.coolapk_emotion_62_huaji
                    "[表面哭泣]" -> R.drawable.coolapk_emotion_62_huaji
                    "[表面开心]" -> R.drawable.coolapk_emotion_62_huaji
                    "[鄙视]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷安]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷安土豆]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷安绿帽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷安钓鱼]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币1$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币100块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币10块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币1€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币1分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币1块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币1毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币2$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币20块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币2€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币2分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币2块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币2毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币5$]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币50块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币5€]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币5分]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币5块]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币5毛]" -> R.drawable.coolapk_emotion_62_huaji
                    "[酷币]" -> R.drawable.coolapk_emotion_62_huaji
                    "[针不戳]" -> R.drawable.coolapk_emotion_62_huaji
                    "[阴险]" -> R.drawable.coolapk_emotion_62_huaji
                    "[难过]" -> R.drawable.coolapk_emotion_62_huaji
                    "[黑线]" -> R.drawable.coolapk_emotion_62_huaji
                    "[cos滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[图片]" -> R.drawable.ic_photo
                    else -> -1
                }
            } else {
                return when (emoji) {
                    "[置顶]" -> R.drawable.ic_feed_top
                    "[楼主]" -> R.drawable.ic_author
                    "[层主]" -> R.drawable.ic_subauthor
                    "[doge]" -> R.drawable.coolapk_emotion_37_doge
                    "[doge原谅ta]" -> R.drawable.coolapk_emotion_58_dogeyuanliangta
                    "[doge呵斥]" -> R.drawable.coolapk_emotion_57_dogehechi
                    "[doge笑哭]" -> R.drawable.coolapk_emotion_56_dogexiaoku
                    "[ok]" -> R.drawable.coolapk_emotion_30_ok
                    "[py交易]" -> R.drawable.coolapk_emotion_101_pyjiaoyi
                    "[qqdoge]" -> R.drawable.coolapk_emotion_100_qqdoge
                    "[t耐克嘴]" -> R.drawable.coolapk_emotion_105
                    "[yyds]" -> R.drawable.coolapk_emotion_1027
                    "[下次一定]" -> R.drawable.coolapk_emotion_1029
                    "[不开心]" -> R.drawable.coolapk_emotion_108
                    "[二哈]" -> R.drawable.coolapk_emotion_59_erha
                    "[二哈盯]" -> R.drawable.coolapk_emotion_95_erhading
                    "[亲亲]" -> R.drawable.coolapk_emotion_20_qinqin
                    "[假笑]" -> R.drawable.coolapk_emotion_1014
                    "[偷看]" -> R.drawable.coolapk_emotion_1015
                    "[傲慢]" -> R.drawable.coolapk_emotion_10_aoman
                    "[再见]" -> R.drawable.coolapk_emotion_25_zaijian
                    "[凋谢]" -> R.drawable.coolapk_emotion_42_diaoxie
                    "[列文虎克]" -> R.drawable.coolapk_emotion_1023_liewenhuke
                    "[发呆]" -> R.drawable.coolapk_emotion_102_fadai
                    "[发怒]" -> R.drawable.coolapk_emotion_15_fanu
                    "[受虐滑稽]" -> R.drawable.coolapk_emotion_64_shounuehuaji
                    "[可怜]" -> R.drawable.coolapk_emotion_26_kelian
                    "[可爱]" -> R.drawable.coolapk_emotion_5_keai
                    "[吃瓜]" -> R.drawable.coolapk_emotion_51_chigua
                    "[吐舌]" -> R.drawable.coolapk_emotion_17_tushe
                    "[呲牙]" -> R.drawable.coolapk_emotion_3_ciya
                    "[呵呵]" -> R.drawable.coolapk_emotion_7_hehe
                    "[哈哈哈]" -> R.drawable.coolapk_emotion_1_hahaha
                    "[哦吼吼]" -> R.drawable.coolapk_emotion_1017
                    "[哼唧]" -> R.drawable.coolapk_emotion_1011
                    "[喝茶]" -> R.drawable.coolapk_emotion_1016
                    "[喝酒]" -> R.drawable.coolapk_emotion_52_hejiu
                    "[喵喵]" -> R.drawable.coolapk_emotion_82_miaomiao
                    "[喷]" -> R.drawable.coolapk_emotion_44_pen
                    "[喷血]" -> R.drawable.coolapk_emotion_21_penxue
                    "[嘿哈]" -> R.drawable.coolapk_emotion_32_heiha
                    "[噗]" -> R.drawable.coolapk_emotion_53_pu
                    "[坏笑]" -> R.drawable.coolapk_emotion_13_huaixiao
                    "[墨镜滑稽]" -> R.drawable.coolapk_emotion_67_mojinghuaji
                    "[夏阁艾迪之剑]" -> R.drawable.coolapk_emotion_1028
                    "[头条通知书]" -> R.drawable.coolapk_emotion_1031
                    "[委屈]" -> R.drawable.coolapk_emotion_47_weiqu
                    "[害怕]" -> R.drawable.coolapk_emotion_1010
                    "[害羞]" -> R.drawable.coolapk_emotion_97_haixiu
                    "[小嘴滑稽]" -> R.drawable.coolapk_emotion_1013
                    "[弱]" -> R.drawable.coolapk_emotion_28_ruo
                    "[强]" -> R.drawable.coolapk_emotion_27_qiang
                    "[微微一笑]" -> R.drawable.coolapk_emotion_48_weiweiyixiao
                    "[微笑]" -> R.drawable.coolapk_emotion_6_weixiao
                    "[心碎]" -> R.drawable.coolapk_emotion_50_xinsui
                    "[惊讶]" -> R.drawable.coolapk_emotion_2_jingya
                    "[感知不强]" -> R.drawable.coolapk_emotion_1025
                    "[懒得理]" -> R.drawable.coolapk_emotion_107
                    "[我最美]" -> R.drawable.coolapk_emotion_38_wozuimei
                    "[托腮]" -> R.drawable.coolapk_emotion_16_tuosai
                    "[抠鼻]" -> R.drawable.coolapk_emotion_19_koubi
                    "[抱拳]" -> R.drawable.coolapk_emotion_29_baoquan
                    "[挑眉坏笑]" -> R.drawable.coolapk_emotion_109
                    "[挨打]" -> R.drawable.coolapk_emotion_1012
                    "[捂嘴笑]" -> R.drawable.coolapk_emotion_24_wuzuixiao
                    "[捂脸]" -> R.drawable.coolapk_emotion_33_wulian
                    "[掩面笑]" -> R.drawable.coolapk_emotion_1018
                    "[撇嘴]" -> R.drawable.coolapk_emotion_8_piezui
                    "[斗鸡眼滑稽]" -> R.drawable.coolapk_emotion_66_doujiyanhuaji
                    "[新币1分]" -> R.drawable.coolapk_emotion_72
                    "[新酷币1$]" -> R.drawable.coolapk_emotion_75
                    "[新酷币100块]" -> R.drawable.coolapk_emotion_74
                    "[新酷币10块]" -> R.drawable.coolapk_emotion_93
                    "[新酷币1€]" -> R.drawable.coolapk_emotion_78
                    "[新酷币1分]" -> R.drawable.coolapk_emotion_72
                    "[新酷币1块]" -> R.drawable.coolapk_emotion_90
                    "[新酷币1毛]" -> R.drawable.coolapk_emotion_87
                    "[新酷币2$]" -> R.drawable.coolapk_emotion_76
                    "[新酷币20块]" -> R.drawable.coolapk_emotion_94
                    "[新酷币2€]" -> R.drawable.coolapk_emotion_79
                    "[新酷币2分]" -> R.drawable.coolapk_emotion_85
                    "[新酷币2块]" -> R.drawable.coolapk_emotion_91
                    "[新酷币2毛]" -> R.drawable.coolapk_emotion_88
                    "[新酷币5$]" -> R.drawable.coolapk_emotion_77
                    "[新酷币50块]" -> R.drawable.coolapk_emotion_73
                    "[新酷币5€]" -> R.drawable.coolapk_emotion_80
                    "[新酷币5分]" -> R.drawable.coolapk_emotion_86
                    "[新酷币5块]" -> R.drawable.coolapk_emotion_92
                    "[新酷币5毛]" -> R.drawable.coolapk_emotion_89
                    "[新酷币]" -> R.drawable.coolapk_emotion_71
                    "[无奈]" -> R.drawable.coolapk_emotion_98_wunai
                    "[无语]" -> R.drawable.coolapk_emotion_12_wuyu
                    "[机智]" -> R.drawable.coolapk_emotion_34_jizhi
                    "[欢呼]" -> R.drawable.coolapk_emotion_49_huanhu
                    "[汗]" -> R.drawable.coolapk_emotion_18_han
                    "[流汗滑稽]" -> R.drawable.coolapk_emotion_63_liuhanhuaji
                    "[流泪]" -> R.drawable.coolapk_emotion_4_liulei
                    "[滑稽]" -> R.drawable.coolapk_emotion_62_huaji
                    "[火把]" -> R.drawable.coolapk_emotion_83_huoba
                    "[灰色酷币]" -> R.drawable.coolapk_emotion_68
                    "[爆怒]" -> R.drawable.coolapk_emotion_104
                    "[爱心]" -> R.drawable.coolapk_emotion_40_aixin
                    "[牛啤]" -> R.drawable.coolapk_emotion_103_nb
                    "[玫瑰]" -> R.drawable.coolapk_emotion_41_meigui
                    "[疑问]" -> R.drawable.coolapk_emotion_11_yiwen
                    "[白眼]" -> R.drawable.coolapk_emotion_84_baiyan
                    "[白纹酷币]" -> R.drawable.coolapk_emotion_70
                    "[皱眉]" -> R.drawable.coolapk_emotion_99_zhoumei
                    "[真正的音乐]" -> R.drawable.coolapk_emotion_1024
                    "[睡]" -> R.drawable.coolapk_emotion_23_shui
                    "[笑哭]" -> R.drawable.coolapk_emotion_31_xiaoku
                    "[笑眼]" -> R.drawable.coolapk_emotion_22_xiaoyan
                    "[红药丸]" -> R.drawable.coolapk_emotion_54_hongyaowan
                    "[给我整一个]" -> R.drawable.coolapk_emotion_1026
                    "[绿帽]" -> R.drawable.coolapk_emotion_96_kuanlvmao
                    "[绿色酷币]" -> R.drawable.coolapk_emotion_69
                    "[绿药丸]" -> R.drawable.coolapk_emotion_55_lvyaowan
                    "[耐克嘴]" -> R.drawable.coolapk_emotion_81_naikezui
                    "[耶]" -> R.drawable.coolapk_emotion_35_ye
                    "[舒服]" -> R.drawable.coolapk_emotion_106
                    "[色]" -> R.drawable.coolapk_emotion_9_se
                    "[菜刀]" -> R.drawable.coolapk_emotion_39_caidao
                    "[表面哭泣]" -> R.drawable.coolapk_emotion_1019
                    "[表面开心]" -> R.drawable.coolapk_emotion_1020
                    "[鄙视]" -> R.drawable.coolapk_emotion_14_bishi
                    "[酷]" -> R.drawable.coolapk_emotion_36_ku
                    "[酷安]" -> R.drawable.coolapk_emotion_60_kuan
                    "[酷安土豆]" -> R.drawable.coolapk_emotion_1030
                    "[酷安绿帽]" -> R.drawable.coolapk_emotion_96_kuanlvmao
                    "[酷安钓鱼]" -> R.drawable.coolapk_emotion_1021
                    "[酷币1$]" -> R.drawable.c_oned
                    "[酷币100块]" -> R.drawable.c_oy
                    "[酷币10块]" -> R.drawable.c_teny
                    "[酷币1€]" -> R.drawable.c_oneo
                    "[酷币1分]" -> R.drawable.c_onef
                    "[酷币1块]" -> R.drawable.c_oney
                    "[酷币1毛]" -> R.drawable.c_onem
                    "[酷币2$]" -> R.drawable.c_twod
                    "[酷币20块]" -> R.drawable.c_ty
                    "[酷币2€]" -> R.drawable.c_twoo
                    "[酷币2分]" -> R.drawable.c_twof
                    "[酷币2块]" -> R.drawable.c_twoy
                    "[酷币2毛]" -> R.drawable.c_twom
                    "[酷币5$]" -> R.drawable.c_fived
                    "[酷币50块]" -> R.drawable.c_fy
                    "[酷币5€]" -> R.drawable.c_fiveo
                    "[酷币5分]" -> R.drawable.c_fivef
                    "[酷币5块]" -> R.drawable.c_fivey
                    "[酷币5毛]" -> R.drawable.c_fivem
                    "[酷币]" -> R.drawable.c_coolb
                    "[针不戳]" -> R.drawable.coolapk_emotion_1022_zhenbuchuo
                    "[阴险]" -> R.drawable.coolapk_emotion_45_yinxian
                    "[难过]" -> R.drawable.coolapk_emotion_46_nanguo
                    "[黑线]" -> R.drawable.coolapk_emotion_43_heixian
                    "[cos滑稽]" -> R.drawable.coolapk_emotion_65_coshuaji
                    "[图片]" -> R.drawable.ic_photo
                    else -> -1
                }
            }
        } else {
            return -1
        }

    }

}