package com.android.live.test;

import android.app.Activity;
import android.os.Bundle;

import com.android.live.R;
import com.laifeng.sopcastsdk.ui.CameraLivingView;

public class PartActivity extends Activity {
    private CameraLivingView mLFLiveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        mLFLiveView = (CameraLivingView) findViewById(R.id.liveView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLFLiveView.release();
    }
}
