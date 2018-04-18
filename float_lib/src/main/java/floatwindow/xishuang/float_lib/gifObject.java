package floatwindow.xishuang.float_lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class gifObject {
    public static Map<String,Object> pets;
    public final static String[] petName={"猫","云朵","狐狸","草团子","薄","火腿"};
    public static ArrayList<String> list1,list2,list3,list4,list5,list6;
    public static ArrayList<ArrayList> lists;
    public static Map<String,String> map1,map2,map3,map4,map5,map6;
    public static ArrayList<Map> maps;
    private static  Pet[] petInit;

    gifObject(){
        pets=new HashMap<String,Object>();
        setPetMotion();
        setPetPath();
        for(int i=0;i<petName.length;i++){
            petInit[i].setPetName(petName[i]);
            petInit[i].setPetMotion(lists.get(i));
            petInit[i].setPetPath(maps.get(i));
            pets.put(petInit[i].getPetName(),petInit[i]);
        }
    }

    private void setPetMotion() {
        list1=new ArrayList<String>(asList("跳绳"," 亲亲"," 奔跑"," 摇晃"));
        list2=new ArrayList<String>(asList("哭","搞笑","起床","辣条","拒绝","洗澡","晚安"));
        list3=new ArrayList<String>(asList("爬","礼物","放风筝","骑单车"));
        list4=new ArrayList<String>(asList("加油","再见","打招呼" ,"亲亲","吃土","发钱","等待"));
        list5=new ArrayList<String>(asList("帅哥","乞求","壁咚" ,"照镜子","亲亲","睡觉","撒娇"));
        list6=new ArrayList<String>(asList("烤肠", "吃烤肠", "舔" ,"玩耍" ,"上厕所","走路"));
        lists=new ArrayList<ArrayList>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        lists.add(list5);
        lists.add(list6);
    }

    private void setPetPath() {
        map1= new HashMap<String,String>(){
            {
                put("跳绳","cat_jump.gif ");
                put("亲亲","cat_kiss.gif");
                put("奔跑","cat_run.gif");
                put("摇晃","cat_shake.gif");
            }
        };//cat_jump.gif cat_kiss.gif cat_run.gif cat_shake.gif
        // 跳绳 亲亲 奔跑 摇晃
        map2=new HashMap<String,String>(){{
            put("哭","cloud_cry.gif");
            put("搞笑","cloud_fun.gif");
            put("起床","cloud_getup.gif");
            put("辣条","cloud_latiao.gif");
            put("拒绝","cloud_no.gif");
            put("洗澡","cloud_shower.gif");
            put("晚安","cloud_sleep.gif");
            }
        };// cloud_cry.gif cloud_fun.gif cloud_getup.gif cloud_latiao.gif cloud_no.gif cloud_shower.gif cloud_sleep.gif
        // 哭 搞笑 起床 辣条 拒绝 洗澡 晚安
        map3=new HashMap<String,String>(){{
            put("爬","fox_crawl.gif");
            put("礼物","fox_gift.gif");
            put("放风筝","fox_kite.gif");
            put("骑单车","fox_ride.gif");
            }
        };
        //fox_crawl.gif fox_gift.gif fox_kite.gif fox_ride.gif
        // "爬","礼物","放风筝","骑单车"
        map4=new HashMap<String,String>(){{
            put("加油","grass_fighting.gif ");
            put("再见","grass_goodbye.gif");
            put("打招呼","grass_hello.gif");
            put("亲亲","grass_love.gif");
            put("吃土","grass_nomoney.gif");
            put("发钱","grass_redpacket.gif");
            put("等待","grass_wait.gif");
        }
        };
        //grass_fighting.gif grass_goodbye.gif grass_hello.gif grass_love.gif grass_nomoney.gif grass_redpacket.gif grass_wait.gif
        // 加油 再见 打招呼 亲亲 吃土 发钱 等待
        map5=new HashMap<String,String>(){{
            put("帅哥","handsome.gif");
            put("乞求","handsome_beg.gif ");
            put("壁咚","handsome_kiss.gif");
            put("照镜子 ","handsome_mirror.gif");
            put("亲亲","handsome_mua.gif");
            put("睡觉","handsome_sleep.gif ");
            put("撒娇","handsome_cry.gif");
        }
        };
        //乞求 壁咚 照镜子 亲亲 睡觉 撒娇
        //handsome.gif handsome_beg.gif handsome_kiss.gif handsome_mirror.gif handsome_mua.gif handsome_sleep.gif handsome_cry.gif
        map6=new HashMap<String,String>(){{
            put("烤肠","sausage_die.gif");
            put("吃烤肠","sausage_fun.gif");
            put("舔","sausage_lick.gif");
            put("玩耍","sausage_play.gif");
            put("上厕所","sausage_toilet.gif");
            put("走路","sausage_walk.gif");
            }
        };// 烤肠 吃烤肠 舔 玩耍 上厕所 走路
        //    sausage_die.gif sausage_fun.gif sausage_lick.gif sausage_play.gif sausage_toilet.gif sausage_walk.gif
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);
        maps.add(map6);
    }

    public  Pet getPet(String petName){
        Pet pet= (Pet) pets.get(petName);
        return pet;
    }
    public void setPet(String petName,ArrayList petMotion,Map<String,String> petPath){
        Pet newpet=new Pet(petName,petMotion,petPath);
        pets.put(newpet.getPetName(),newpet);
    }
}

/*
    cat cloud fox grass handsome sausage
    cat_jump.gif cat_kiss.gif cat_run.gif cat_shake.gif
    cloud_cry.gif cloud_fun.gif cloud_getup.gif cloud_latiao.gif cloud_no.gif cloud_shower.gif cloud_sleep.gif
    fox_crawl.gif fox_gift.gif fox_kite.gif fox_ride.gif
    grass_cry.gif grass_fun.gif grass_getup.gif grass_latiao.gif grass_no.gif grass_shower.gif grass_sleep.gif
    handsome.gif handsome_beg.gif handsome_kiss.gif handsome_mirror.gif handsome_mua.gif handsome_sleep.gif handsome_cry.gif
    die fun lick play toilet walk
   "_" +".gif"
*/

/*jump kiss run shake 跳绳 亲亲 奔跑 摇晃
cry fun getup latiao no shower sleep 哭 搞笑 起床 辣条 拒绝 洗澡 晚安
crawl gift kite ride 爬 礼物 放风筝 骑单车
fighting goodbye hello love nomoney redpacket wait 加油 再见 打招呼 亲亲 吃土 发钱 等待
handsome beg kiss mirror mua sleep cry 乞求 壁咚 照镜子 亲亲 睡觉 撒娇
die fun lick play toilet walk   烤肠 吃烤肠 舔 玩耍 上厕所 走路
*/

