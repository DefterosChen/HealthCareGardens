package com.kky.healthcaregardens.common.fragment.mine.setting;


import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
@Page(name = "账户安全", anim = CoreAnim.none)
public class AccountSafeFragment extends MyBaseFragment {

    @BindView(R.id.iv_back)
    ImageView iv_back;

    public AccountSafeFragment() {
        // Required empty public constructor
    }



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_account_safe;
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
