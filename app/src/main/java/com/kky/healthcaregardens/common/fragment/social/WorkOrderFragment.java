package com.kky.healthcaregardens.common.fragment.social;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.fragment.SocialFragment;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;

import butterknife.BindView;

/**
 * 工作单
 * 2020/05/12
 * DefterosCxa
 */
@Page(name = "工作单", anim = CoreAnim.none)
public class WorkOrderFragment extends MyBaseFragment {


    @BindView(R.id.stv_sentOrder)
    SuperTextView superTextView_sentOrder;
    @BindView(R.id.stv_acceptOrder)
    SuperTextView superTextView_acceptOrder;

    public WorkOrderFragment() {
        // Required empty public constructor
    }


    public static WorkOrderFragment newInstance() {
        WorkOrderFragment fragment = new WorkOrderFragment();
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_work_order;
    }


    @Override
    protected void initViews() {
        superTextView_sentOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(getActivity())
                        .setMessage("派单接听")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
        });

        superTextView_acceptOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(getActivity())
                        .setMessage("接单接听")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();

            }
        });

    }


    @Override
    protected void initListeners() {

    }


}
