package com.kky.healthcaregardens.common.fragment.mine.setting;


import android.view.View;
import android.widget.ImageView;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

import butterknife.BindView;

/**
 * DeftrosChen 2019/12/06
 */
@Page(name = "用户反馈", anim = CoreAnim.none)
public class UseFeelbackFragment extends MyBaseFragment {

    @BindView(R.id.iv_back)
    ImageView iv_back;

    public UseFeelbackFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_use_feelback;
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
