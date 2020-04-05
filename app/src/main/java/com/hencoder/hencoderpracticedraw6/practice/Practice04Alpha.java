package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice04Alpha extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int count;

    public Practice04Alpha(Context context) {
        super(context);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        count = 0;

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度
                switch (count) {
                    case 0:
                        imageView.animate().alpha(0.5f);
                        break;
                    case 1:
                        imageView.animate().alpha(0);
                        break;
                    case 2:
                        imageView.animate().alpha(0.5f);
                        break;
                    case 3:
                        imageView.animate().alpha(1);
                        break;
                }
                count++;
                if (count == 4) {
                    count = 0;
                }
            }
        });
    }
}