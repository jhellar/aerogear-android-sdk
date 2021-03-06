package org.aerogear.mobile.example.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.aerogear.mobile.core.MobileCore;
import org.aerogear.mobile.core.metrics.MetricsService;
import org.aerogear.mobile.example.ExampleApplication;

/**
 * Base class for all activities that want to work with AeroGearServices SDK
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected MobileCore mobileCore;
    protected MetricsService metricsService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExampleApplication application = (ExampleApplication) getApplication();
        mobileCore = application.getMobileCore();
        metricsService = application.getMetricsService();
    }
}
