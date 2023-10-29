package com.netclan.task.controls;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.netclan.task.R;

public class TextMedium extends AppCompatTextView {


    public TextMedium(Context context) {
        super(context);
        init();
    }

    public TextMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = ResourcesCompat.getFont(getContext(),
                R.font.gotham_medium);
        setTypeface(tf);
    }

}