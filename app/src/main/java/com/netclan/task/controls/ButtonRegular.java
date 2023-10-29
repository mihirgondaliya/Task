package com.netclan.task.controls;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

import com.netclan.task.R;

public class ButtonRegular extends AppCompatButton {
    public ButtonRegular(Context context) {
        super(context);
        init();
    }

    public ButtonRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = ResourcesCompat.getFont(getContext(),
                R.font.gotham_regular);
        setTypeface(tf);
    }
}