package com.zouxianbin.fragmentation.core;

import android.os.Bundle;

import com.zouxianbin.fragmentation.core.anim.FragmentAnimator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;
import androidx.annotation.Nullable;


/**
 *
 */

public interface ISupportFragment {
    // LaunchMode
    int STANDARD = 0;
    int SINGLETOP = 1;
    int SINGLETASK = 2;

    // ResultCode
    int RESULT_CANCELED = 0;
    int RESULT_OK = -1;

    @IntDef({STANDARD, SINGLETOP, SINGLETASK})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
    }

    SupportFragmentDelegate getSupportDelegate();

    ExtraTransaction extraTransaction();

    void enqueueAction(Runnable runnable);

    void post(Runnable runnable);

    void onEnterAnimationEnd(@Nullable Bundle savedInstanceState);

    void onLazyInitView(@Nullable Bundle savedInstanceState);

    void onSupportVisible();

    void onSupportInvisible();

    boolean isSupportVisible();

    FragmentAnimator onCreateFragmentAnimator();

    FragmentAnimator getFragmentAnimator();

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);

    void setFragmentResult(int resultCode, Bundle bundle);

    void onFragmentResult(int requestCode, int resultCode, Bundle data);

    void onNewBundle(Bundle args);

    void putNewBundle(Bundle newBundle);

    boolean onBackPressedSupport();
}
