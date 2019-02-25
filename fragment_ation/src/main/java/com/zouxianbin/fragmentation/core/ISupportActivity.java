package com.zouxianbin.fragmentation.core;

import android.view.MotionEvent;

import com.zouxianbin.fragmentation.core.anim.FragmentAnimator;


/**
 *
 */

public interface ISupportActivity {
    SupportActivityDelegate getSupportDelegate();

    ExtraTransaction extraTransaction();

    FragmentAnimator getFragmentAnimator();

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);

    FragmentAnimator onCreateFragmentAnimator();

    void post(Runnable runnable);

    void onBackPressed();

    void onBackPressedSupport();

    boolean dispatchTouchEvent(MotionEvent ev);
}
