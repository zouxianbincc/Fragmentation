
package com.zouxianbin.fragmentation.swipeback;

import android.os.Bundle;

import com.zouxianbin.fragmentation.SupportActivity;
import com.zouxianbin.fragmentation.swipeback.core.ISwipeBackActivity;
import com.zouxianbin.fragmentation.swipeback.core.SwipeBackActivityDelegate;
import com.zouxianbin.fragmentation.swipeback.view.SwipeBackLayout;


/**
 * You can also refer to {@link SwipeBackActivity} to implement YourSwipeBackActivity
 * (extends Activity and impl {@link com.zouxianbin.fragmentation.core.ISupportActivity})
 *
 *
 */
public class SwipeBackActivity extends SupportActivity implements ISwipeBackActivity {
    final SwipeBackActivityDelegate mDelegate = new SwipeBackActivityDelegate(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate.onCreate(savedInstanceState);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDelegate.onPostCreate(savedInstanceState);
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mDelegate.getSwipeBackLayout();
    }

    /**
     * 是否可滑动
     * @param enable
     */
    @Override
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
     * 限制SwipeBack的条件,默认栈内Fragment数 <= 1时 , 优先滑动退出Activity , 而不是Fragment
     *
     * @return true: Activity优先滑动退出;  false: Fragment优先滑动退出
     */
    @Override
    public boolean swipeBackPriority() {
        return mDelegate.swipeBackPriority();
    }
}
