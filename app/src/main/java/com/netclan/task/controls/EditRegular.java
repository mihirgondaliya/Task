package com.netclan.task.controls;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;

import com.netclan.task.R;

public class EditRegular extends AppCompatEditText {
    public EditRegular(Context context) {
        super(context);
        init();
    }

    public EditRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = ResourcesCompat.getFont(getContext(),
                R.font.gotham_regular);
        setTypeface(tf);
    }
}
