package com.zzw.textanimation;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        imageView=findViewById (R.id.app_text_iv);
       /* AnimationSet animationSet = new AnimationSet (true);
       *//* animation= AnimationUtils.loadAnimation (this,R.anim.translate);
        imageView.startAnimation (animation);*//*
//       平移动画    从（-300f,-300f）6s 平移到(500f,500f) 不断重复
       TranslateAnimation translateAnimation =new TranslateAnimation (-200f,200f,-200f,200f);
        translateAnimation.setDuration (6000);
        translateAnimation.setRepeatCount (Animation.INFINITE);
        translateAnimation.setRepeatMode (Animation.REVERSE);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator ());
        animationSet.addAnimation (translateAnimation);
        //imageView.setAnimation (translateAnimation);
  //缩放动画 3s水平方向和竖直方向，从1倍到3倍缩放 不断重复
        ScaleAnimation scaleAnimation=new ScaleAnimation (1.0f,3f,1f,3f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration (3000);
        scaleAnimation.setRepeatCount (Animation.INFINITE);
        scaleAnimation.setRepeatMode (Animation.REVERSE);
        animationSet.addAnimation (scaleAnimation);
       // imageView.setAnimation (scaleAnimation);
    //旋转动画 3s旋转270度，不断重复
        RotateAnimation rotateAnimation=new RotateAnimation (0f,270f,0.5f,0.5f);
        rotateAnimation.setRepeatMode (Animation.REVERSE);
        rotateAnimation.setRepeatCount (Animation.INFINITE);
        rotateAnimation.setDuration (3000);
        rotateAnimation.setInterpolator (new LinearInterpolator ());
        animationSet.addAnimation (rotateAnimation);
        //imageView.setAnimation (rotateAnimation);
        //透明度动画 3s从0到1变化 不断重复
        AlphaAnimation alphaAnimation=new AlphaAnimation (0f,1f);
        alphaAnimation.setRepeatMode (Animation.REVERSE);
        alphaAnimation.setRepeatCount (Animation.INFINITE);
        alphaAnimation.setDuration (3000);
        animationSet.addAnimation (alphaAnimation);
        //imageView.setAnimation (animationSet);
        //属性动画 ValueAnimator
       *//* ValueAnimator valueAnimator = ValueAnimator.ofInt (100, 50);
        valueAnimator.addUpdateListener (new ValueAnimator.AnimatorUpdateListener () {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value=(int )animation.getAnimatedValue ();//获取当前的值
                imageView.getLayoutParams ().width=value;
                imageView.getLayoutParams ().height=value;
                imageView.requestLayout ();
            }
        });
        valueAnimator.setRepeatMode (ValueAnimator.REVERSE);
        valueAnimator.setRepeatCount (ValueAnimator.INFINITE);
        valueAnimator.setDuration (3000);
       // valueAnimator.start ();*/
        //ValueAnimator.ofArgb 还需要再次测试
     /*   ValueAnimator valueAnimator=ValueAnimator.ofArgb (R.color.red,R.color.blue);
        valueAnimator.addUpdateListener (new ValueAnimator.AnimatorUpdateListener () {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value=(int)animation.getAnimatedValue ();
                imageView.setBackgroundColor (value);
                imageView.requestLayout ();

            }
        });
        valueAnimator.setDuration (3000);
        valueAnimator.start ();*/
       ObjectAnimator objectAnimator= ObjectAnimator.ofFloat (imageView,"ScaleX",1f,5f);
        objectAnimator.setDuration (3000);
        objectAnimator.start ();
        SharedPreferences preferences=getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit ();
        String name="xixi";
        String age="22";
        editor.putString("name", name);
        editor.putString("age", age);
        editor.commit();
    }
}
