package com.kky.healthcaregardens.helper.xui.common.adapter;

import androidx.annotation.NonNull;

import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.model.vo.KkyItem;
import com.kky.healthcaregardens.helper.xui.DemoDataProvider;
import com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter;
import com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder;

import java.util.List;

/**
 * @author XUE
 * @date 2017/9/10 15:28
 */
public class WidgetItemAdapter extends BaseRecyclerAdapter<KkyItem> {

    public WidgetItemAdapter(List<KkyItem> list) {
        super(list);
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.layout_widget_item;
    }

    @Override
    public void bindData(@NonNull RecyclerViewHolder holder, int position, KkyItem item) {

        holder.text(R.id.item_name, DemoDataProvider.getDeviceNewInfos().get(position).getTitle());
        holder.image(R.id.item_icon, DemoDataProvider.getDeviceNewInfos().get(position).getUrls_res());

    }

}
