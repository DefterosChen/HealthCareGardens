package com.kky.healthcaregardens.common.fragment.market;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.kky.healthcaregardens.helper.xui.base.webview.XPageWebViewFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

/**
 *  CXA
 *
 *  2019/12/03
 */
@Page(name = "商城", anim = CoreAnim.none)
public class ShopFragment  extends MyBaseFragment {


    public ShopFragment() {
        // Required empty public constructor
    }

    public static ShopFragment newInstance() {
        return new ShopFragment();


    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_shop;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListeners() {
        XPageWebViewFragment.openUrl(this, "https://shop18910112.youzan.com");
    }




}