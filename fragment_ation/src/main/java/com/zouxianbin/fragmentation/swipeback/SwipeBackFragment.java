package com.zouxianbin.fragmentation.swipeback;

import android.os.Bundle;
import android.view.View;

import com.zouxianbin.fragmentation.SupportFragment;
import com.zouxianbin.fragmentation.swipeback.core.ISwipeBackFragment;
import com.zouxianbin.fragmentation.swipeback.core.SwipeBackFragmentDelegate;
import com.zouxianbin.fragmentation.swipeback.view.SwipeBackLayout;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;


/**
 * You can also refer to {@link SwipeBackFragment} to implement YourSwipeBackFragment
 * (extends Fragment and impl {@link com.zouxianbin.fragmentation.core.ISupportFragment})
 */
public class SwipeBackFragment extends SupportFragment implements ISwipeBackFragment {
    final SwipeBackFragmentDelegate mDelegate = new SwipeBackFragmentDelegate(this);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDelegate.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View attachToSwipeBack(View view) {
        return mDelegate.attachToSwipeBack(view);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        mDelegate.onHiddenChanged(hidden);
    }

    public SwipeBackLayout getSwipeBackLayout() {
        return mDelegate.getSwipeBackLayout();
    }

    /**
     * 是否可滑动
     *
     * @param enable
     */
    public void setSwipeBackEnable(boolean enable) {
        mDelegate.setSwipeBackEnable(enable);
    }

    @Override
    public void setEdgeLevel(SwipeBackLayout.EdgeLevel edgeLevel) {
        mDelegate.setEdgeLevel(edgeLevel);
    }

    @Override
    public void setEdgeLevel(int widthPixel) {
        mDelegate.setEdgeLevel(widthPixel);
    }

    /**
     * Set the offset of the parallax slip.
     */
    public void setParallaxOffset(@FloatRange(from = 0.0f, to = 1.0f) float offset) {
        mDelegate.setParallaxOffset(offset);
    }

    @Override
    public void onDestroyView() {
        mDelegate.onDestroyView();
        super.onDestroyView();
    }
}