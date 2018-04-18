package floatwindow.xishuang.float_lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
/*
    cat cloud fox grass handsome sausage
    cat_jump.gif cat_kiss.gif cat_run.gif cat_shake.gif
    cloud_cry.gif cloud_fun.gif cloud_getup.gif cloud_latiao.gif cloud_no.gif cloud_shower.gif cloud_sleep.gif
    monkey_crawl.gif monkey_gift.gif monkey_kite.gif monkey_ride.gif
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
            petInit[i].setPetMotion(list1);
            petInit[i].setPetPath(map1);
            pets.put(petInit[i].getPetName(),petInit[i]);
        }
    }

    private void setPetMotion() {
        list1=new ArrayList<String>(asList("跳绳"," 亲亲"," 奔跑"," 摇晃"));
        list2=new ArrayList<String>(asList("哭","搞笑","起床","辣条","拒绝","洗澡","晚安"));
        list3=new ArrayList<String>(asList("爬","礼物","放风筝","骑单车"));
        list4=new ArrayList<String>(asList("加油","再见","打招呼" ,"亲亲","吃土","发钱","等待"));
        list5=new ArrayList<String>(asList("乞求","壁咚" ,"照镜子","亲亲","睡觉","撒娇"));
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
                put("","");
            }
        };
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

