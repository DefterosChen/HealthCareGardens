package com.kky.healthcaregardens.common.fragment.home;


import android.view.View;
import android.widget.ImageView;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

import butterknife.BindView;

/**
 *  CXA
 *
 *  2019/12/03
 */
@Page(name = "我的家人", anim = CoreAnim.none)
public class MyFamilyFragment extends MyBaseFragment {

    @BindView(R.id.iv_back)
    ImageView iv_back;

    public MyFamilyFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_family;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initListeners() {
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popToBack();
            }
        });
    }


}
