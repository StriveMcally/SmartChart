package com.daivd.chart.core;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.daivd.chart.core.base.BaseBarLineChart;
import com.daivd.chart.data.BarLineData;
import com.daivd.chart.data.LineData;
import com.daivd.chart.provider.barLine.Bar3DProvider;

/**
 * Created by huang on 2017/9/26.
 */

public class Bar3DChart extends BaseBarLineChart<Bar3DProvider,LineData> {

    public Bar3DChart(Context context) {
        super(context);
    }

    public Bar3DChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Bar3DChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Bar3DChart(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    @Override
    protected Bar3DProvider initProvider() {
        return  new Bar3DProvider();
    }



}
