package com.kky.healthcaregardens.common.view.adapter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.kky.healthcaregardens.R;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.widget.banner.recycler.BannerLayout;

import java.util.Arrays;
import java.util.List;

public class MultiInfoAdapter  extends BaseRecyclerAdapter<String> {


    /**
     * 默认加载图片
     */
    private ColorDrawable mColorDrawable;

    /**
     * 是否允许进行缓存
     */
    private boolean mEnableCache = true;

    private BannerLayout.OnBannerItemClickListener mOnBannerItemClickListener;


    public MultiInfoAdapter() {
        super();
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public MultiInfoAdapter(List<String> list) {
        super(list);
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public MultiInfoAdapter(String[] list) {
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
        return R.layout.item_kky_pic_infos;
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
        TextView textView_price = holder.findViewById(R.id.tv_item_price);
        TextView textView_status = holder.findViewById(R.id.tv_item_status);

        imageView.setImageResource(R.drawable.icon_kky_more);
        textView_title.setText("标题名");
        textView_details.setText("详情信息显示");

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
    public MultiInfoAdapter enableCache(boolean enableCache) {
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

    public MultiInfoAdapter setColorDrawable(ColorDrawable colorDrawable) {
        mColorDrawable = colorDrawable;
        return this;
    }

    public MultiInfoAdapter setOnBannerItemClickListener(BannerLayout.OnBannerItemClickListener onBannerItemClickListener) {
        mOnBannerItemClickListener = onBannerItemClickListener;
        return this;
    }
}
