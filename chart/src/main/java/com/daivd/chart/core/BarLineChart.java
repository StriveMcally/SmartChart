package com.daivd.chart.core;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.daivd.chart.core.base.BaseBarLineChart;
import com.daivd.chart.data.BarLineData;
import com.daivd.chart.provider.barLine.BarLineProvider;

/**
 * Created by huang on 2017/9/26.
 * 柱状图
 */

public class BarLineChart extends BaseBarLineChart<BarLineProvider,BarLineData> {

    public BarLineChart(Context context) {
        super(context);
    }

    public BarLineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BarLineChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BarLineChart(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    @Override
    protected BarLineProvider initProvider() {
        return new BarLineProvider();
    }


}
