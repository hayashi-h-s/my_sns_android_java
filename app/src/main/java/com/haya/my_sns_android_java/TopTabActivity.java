package com.haya.my_sns_android_java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import com.haya.my_sns_android_java.ui.customview.CustomTabLayout;

public class TopTabActivity extends AppCompatActivity {


  private CustomTabLayout mTabTop, mTabCommunity, mTabMail, mTabExchange, mTabOption;

  public final static String TAB_TOP = "TAB_TOP";
  public final static String TAB_COMMUNITY = "TAB_COMMUNITY";
  public final static String TAB_MAIL = "TAB_MAIL";
  public final static String TAB_EXCHANGE = "TAB_EXCHANGE";
  public final static String TAB_OPTION = "TAB_OPTION";

  // タブの文字列配列
  public final static String[] TAB_LIST = {TAB_TOP, TAB_COMMUNITY, TAB_MAIL, TAB_EXCHANGE, TAB_OPTION};


  // FragmentTabHost でタブを作成している
  private FragmentTabHost mTabHost;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tab);

    // タブを初期化してセットする
    initTabs();

  }

  /**
   * タブの初期化処理
   */
  protected void initTabs() {
      //FragmentTabHost のIDを宣言
      mTabHost = findViewById(android.R.id.tabhost);
      // FrameLayout の content
      mTabHost.setup(this, getSupportFragmentManager(), R.id.content);
      // 変数定義
      TabHost.TabSpec spec;

      // TOPタブ
      mTabTop = new CustomTabLayout(this, getString(R.string.activity_top_tab_home), R.drawable.bt_home);

      // タブを追加する処理
      // ここのaddTabは FragmentTabHost の addTabではなく、オリジナルメソッド
//      addTab(mTabTop, TAB_TOP, TopParentFragment.class);

      // コミュニティタブ
      mTabCommunity = new CustomTabLayout(this, getString(R.string.activity_top_tab_community), R.drawable.bt_group);
//      addTab(mTabCommunity, TAB_COMMUNITY, CommunityTopFragment.class);

      // メールタブ
      mTabMail = new CustomTabLayout(this, getString(R.string.activity_top_tab_mail), R.drawable.bt_mail);
//      addTab(mTabMail, TAB_MAIL, MailParentFragment.class);

      // ギフト交換タブ
      mTabExchange = new CustomTabLayout(this, getString(R.string.activity_top_tab_exchange), R.drawable.bt_exchange);
//      addTab(mTabExchange, TAB_EXCHANGE, ExchangeFragment.class);

      // その他タブ
      mTabOption = new CustomTabLayout(this, getString(R.string.activity_top_tab_setting), R.drawable.bt_option);
//      addTab(mTabOption, TAB_OPTION, OptionFragment.class);

      // Set Default Tab - zero based index
      mTabHost.setOnTabChangedListener(this);
      mTabHost.setCurrentTab(0);
      // 先頭の検索タブをハイライトに
      mTabTop.changeViewForSelectStatus(true);

      mCoverView = findViewById(R.id.activity_tab_cover);
  }

  /**
   * タブの追加
   *
   * @param tabLayout
   * @param tabName
   * @param className
   */

  // ↓これ何？
  @SuppressLint("ClickableViewAccessibility")

  private void addTab(CustomTabLayout tabLayout, String tabName, Class className) {
//    tabLayout.setOnTouchListener((view, motionEvent) -> {
//      if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
//        TabChildFragment fragment = getChildFragment(tabName);
//        if (fragment != null && fragment.isVisible()) {
//          // Fragmentが表示されてる場合は先頭にスクロールする
//          fragment.scrollToFirstFocus();
//        }
//      }
//      return view.onTouchEvent(motionEvent);
//    });
//    TabHost.TabSpec spec = mTabHost.newTabSpec(tabName).setIndicator(tabLayout);
//    Bundle bundle = new Bundle();
//    bundle.putString("name", tabName);
//    mTabHost.addTab(spec, className, bundle);
  }

}