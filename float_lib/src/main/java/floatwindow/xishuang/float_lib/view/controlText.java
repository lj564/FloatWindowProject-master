package floatwindow.xishuang.float_lib.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import floatwindow.xishuang.float_lib.Pet;
import floatwindow.xishuang.float_lib.R;
import floatwindow.xishuang.float_lib.gifObject;

public class controlText extends LinearLayout {
    private static LinearLayout.LayoutParams param;
    private static Pet pet;
    private Context context;
    private static String path;
    public controlText(Context context) {
        super(context);
        this.context=context;
        String petName="";
        init(context);
    }
    private void init(Context context){
        
    }
    public void addText(final String text){//动态添加布局
        //LinearLayout view = new LinearLayout(this.context);
       LinearLayout view = (LinearLayout)findViewById(R.id.controlMenu);
        LinearLayout.LayoutParams linearlp = ( LinearLayout.LayoutParams) view.getLayoutParams();
        ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        final String text_2=text;//引入到触摸事件监听器
        TextView txt=new TextView(this.context);
        txt.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        path=pet.getPetMotionPath(text_2);
                        break;
                    default:break;
                }
                return true;
            }
        });
        txt.setText(text);
        txt.setLayoutParams(lp);
        view.addView(txt,lp);
    }
    public void getPet(String petName){
        pet=(Pet) gifObject.pets.get(petName);
    }
    public void setParam(LayoutParams param) {//设置布局参数
        this.param = param;
    }
    public String getPetpath(String petName,String petMotion) {//通过该类和动作直接获取到gif路径
        pet = (Pet) gifObject.pets.get(petName);
        path = pet.getPetMotionPath(petMotion);
        return path;
    }
    public String getPath(){//获取到gif路径
        return this.path;
    }
}
