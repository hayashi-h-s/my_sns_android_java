package com.haya.my_sns_android_java.ui.customview;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.haya.my_sns_android_java.R;

// TopTabActivityのタブに要素を追加するためのファイル
public class CustomTabLayout extends RelativeLayout { //RelativeLayout を継承

    // アイコンとテキスト
    private TextView mTitleTextView;
    private ImageView mIconImageView;

    // バッジ
    private View mBadgeIcon;
    // バッジに数字などがある時
    private TextView mBadgeText;
    private TextView mStandbyView;
    private TextView mSaleText;

    // コンストラクタ 3つ
    public CustomTabLayout(Context context, String title, int iconId) {
        this(context, null);
        setLayout(title, iconId);
    }
    public CustomTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }
    public CustomTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(getContext()).inflate(R.layout.view_top_tab_layout, this);

        mBadgeIcon = findViewById(R.id.view_top_tab_layout_unread_image);
        mBadgeText = findViewById(R.id.view_top_tab_layout_unread_text);


        mTitleTextView = findViewById(R.id.view_top_tab_layout_text);
        mIconImageView = findViewById(R.id.view_top_tab_layout_image);
        mStandbyView = findViewById(R.id.view_top_tab_layout_standby_text);
        mSaleText = findViewById(R.id.view_top_tab_layout_sale_text);
    }

    // レイアウトをセットする(タイトルとアイコン)
    public void setLayout(String title, int iconId) {
        mTitleTextView.setText(title);
        mIconImageView.setImageResource(iconId);
    }

}
