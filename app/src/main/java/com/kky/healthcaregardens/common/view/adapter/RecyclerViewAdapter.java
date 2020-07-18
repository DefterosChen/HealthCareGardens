package com.kky.healthcaregardens.common.view.adapter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.helper.xui.DemoDataProvider;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.widget.banner.recycler.BannerLayout;

import java.util.Arrays;
import java.util.List;

/**
 * 图片/标题/信息
 * cxa
 * 2019/11/15
 */

public class RecyclerViewAdapter extends BaseRecyclerAdapter<String> {


    /**
     * 默认加载图片
     */
    private ColorDrawable mColorDrawable;

    /**
     * 是否允许进行缓存
     */
    private boolean mEnableCache = true;

    private BannerLayout.OnBannerItemClickListener mOnBannerItemClickListener;


    public RecyclerViewAdapter() {
        super();
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public RecyclerViewAdapter(List<String> list) {
        super(list);
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public RecyclerViewAdapter(String[] list) {
        super(Arrays.asList(list));
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    /**
     * 适配的布局
     *
     * @param viewType
     * @return
     */
    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_kyy_pic_text_detail;
    }

    /**
     * 绑定数据
     *
     * @param holder
     * @param position
     * @param imgUrl
     */
    @Override
    public void bindData(@NonNull RecyclerViewHolder holder, final int position, String imgUrl) {

        ImageView imageView = holder.findViewById(R.id.iv_item_pic);
        TextView textView_title = holder.findViewById(R.id.tv_item_title);
        TextView textView_details = holder.findViewById(R.id.tv_item_details);

//        imageView.setImageResource(R.drawable.icon_blue_more);
        imageView.setImageResource(DemoDataProvider.getServiceItemList().get(position).getUrls_res());
        textView_title.setText(DemoDataProvider.getServiceItemList().get(position).getTitle());
        textView_details.setText(DemoDataProvider.getServiceItemList().get(position).getDetails());

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mOnBannerItemClickListener != null) {
//                    mOnBannerItemClickListener.onItemClick(position);
//                }
//            }
//        });



    }



    /**
     * 设置是否允许缓存
     *
     * @param enableCache
     * @return
     */
    public RecyclerViewAdapter enableCache(boolean enableCache) {
        mEnableCache = enableCache;
        return this;
    }

    /**
     * 获取是否允许缓存
     *
     * @return
     */
    public boolean getEnableCache() {
        return mEnableCache;
    }

    public ColorDrawable getColorDrawable() {
        return mColorDrawable;
    }

    public RecyclerViewAdapter setColorDrawable(ColorDrawable colorDrawable) {
        mColorDrawable = colorDrawable;
        return this;
    }

    public RecyclerViewAdapter setOnBannerItemClickListener(BannerLayout.OnBannerItemClickListener onBannerItemClickListener) {
        mOnBannerItemClickListener = onBannerItemClickListener;
        return this;
    }
}
