package com.kky.healthcaregardens.common.view.adapter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.kky.healthcaregardens.R;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;
import com.xuexiang.xui.widget.banner.recycler.BannerLayout;

import java.util.Arrays;
import java.util.List;

/**
 *
 *  单张照片
 * cxa
 * 2019/11/15
 *
 */


public class SinglePicAdapter extends BaseRecyclerAdapter<String> {


    /**
     * 默认加载图片
     */
    private ColorDrawable mColorDrawable;

    /**
     * 是否允许进行缓存
     */
    private boolean mEnableCache = true;

    private BannerLayout.OnBannerItemClickListener mOnBannerItemClickListener;


    public SinglePicAdapter() {
        super();
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public SinglePicAdapter(List<String> list) {
        super(list);
//        mColorDrawable = new ColorDrawable(R.drawable.icon_blue_more);
        mColorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    public SinglePicAdapter(String[] list) {
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
        return R.layout.item_singlepic;
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

        imageView.setImageResource(R.drawable.ico_go_blue);

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
    public SinglePicAdapter enableCache(boolean enableCache) {
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

    public SinglePicAdapter setColorDrawable(ColorDrawable colorDrawable) {
        mColorDrawable = colorDrawable;
        return this;
    }

    public SinglePicAdapter setOnBannerItemClickListener(BannerLayout.OnBannerItemClickListener onBannerItemClickListener) {
        mOnBannerItemClickListener = onBannerItemClickListener;
        return this;
    }
}
