package com.netclan.task.controls;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.netclan.task.R;

public class TextBold extends AppCompatTextView {


    public TextBold(Context context) {
        super(context);
        init();
    }

    public TextBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = ResourcesCompat.getFont(getContext(),
                R.font.gotham_bold);
        setTypeface(tf);
    }

}