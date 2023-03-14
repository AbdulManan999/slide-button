package com.ami.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//import android.util.Log;
//
//import com.chinalwb.slidetoconfirmlib.ISlideListener;
//import com.chinalwb.slidetoconfirmlib.SlideToConfirm;

import id.ss564.lib.slidingbutton.SlidingButton;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SlidingButton mSlidingButton = findViewById(R.id.slidingButton3);
        mSlidingButton.setActivated(false);
        mSlidingButton.setOnStateChangeListener(new SlidingButton.OnStateChangeListener(){

            @Override
            public void onChange(boolean active){

                if(active){
                    Log.e("TAG", "onChange: CHanged me"+active+"" );
                                    mSlidingButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
mSlidingButton.changeState(false,true);
mSlidingButton.setText("Activated");
                    }
                },500);
                }
                //do what you wanna to do
//
////                Log.e("TAG", "onChange: CHanged me"+mSlidingButton.isActivated()+"" );
//                mSlidingButton.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//mSlidingButton.changeState(false,false);
//                    }
//                },500);
//
//
////               mSlidingButton.set(false,false);
            }
        });
//        defaultSample();
//        sampleForTwoSteps();
    }

//    private void defaultSample() {
//        final SlideToConfirm slideToConfirm = findViewById(R.id.slide_to_confirm_1);
//        slideToConfirm.setSlideListener(new ISlideListener() {
//            @Override
//            public void onSlideStart() {
//                Log.w("XX", "on start !! ");
//            }
//
//            @Override
//            public void onSlideMove(float percent) {
//                Log.w("XX", "on move !! == " + percent);
//            }
//
//            @Override
//            public void onSlideCancel() {
//                Log.w("XX", "on cancel !! ");
//            }
//
//            @Override
//            public void onSlideDone() {
//                Log.w("XX", "on Done!!");
//
//                slideToConfirm.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        slideToConfirm.reset();
//                    }
//                }, 500);
//            }
//        });
//    }
//
//    private void sampleForTwoSteps() {
//        final SlideToConfirm slideToConfirm = findViewById(R.id.slide_to_confirm_2);
//        slideToConfirm.setEngageText(engageTextNow);
//        slideToConfirm.setSlideListener(new ISlideListener() {
//            @Override
//            public void onSlideStart() {
//                Log.w("XX", "on start !! ");
//            }
//
//            @Override
//            public void onSlideMove(float percent) {
//                Log.w("XX", "on move !! == " + percent);
//            }
//
//            @Override
//            public void onSlideCancel() {
//                Log.w("XX", "on cancel !! ");
//            }
//
//            @Override
//            public void onSlideDone() {
//                Log.w("XX", "on Done!!");
//                if (engageTextNow.equals(START_WORKING)) {
//                    slideToConfirm.setCompletedText("Processing...");
//                } else {
//                    slideToConfirm.setCompletedText("Finishing...");
//                }
//
//                slideToConfirm.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (engageTextNow.equals(START_WORKING)) {
//                            engageTextNow = STOP_WORKING;
//                        } else {
//                            engageTextNow = START_WORKING;
//                        }
//                        slideToConfirm.setEngageText(engageTextNow);
//                        slideToConfirm.reset();
//                    }
//                }, 500);
//            }
//        });
//    }

}