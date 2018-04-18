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
    LinearLayout.LayoutParams param;
    Pet pet;
    private Context context;
    public controlText(Context context) {
        super(context);
        this.context=context;
    }
    public void addText(String text){
        LinearLayout view = new LinearLayout(this.context);
       // LinearLayout view = (LinearLayout)findViewById(R.id.controlMenu);
        LinearLayout.LayoutParams linearlp = ( LinearLayout.LayoutParams) view.getLayoutParams();
        ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        TextView txt=new TextView(this.context);
        txt.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:break;
                    default:break;
                }
                return true;
            }
        });
        txt.setText(text);
        txt.setLayoutParams(lp);
        view.addView(txt,linearlp);
    }

    public void setParam(LayoutParams param) {
        this.param = param;
    }
    public String getPetpath(String petName,String petMotion){
        pet = (Pet)gifObject.pets.get(petName);
        String path=pet.getPetMotionPath(petMotion);
        return path;
    }
}
