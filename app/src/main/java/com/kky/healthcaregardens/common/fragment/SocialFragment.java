package com.kky.healthcaregardens.common.fragment;


import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.horizon.task.UITask;
import com.kky.healthcaregardens.R;
import com.kky.healthcaregardens.common.base.net.NetWorkUtils;
import com.kky.healthcaregardens.common.base.utils.CollectionUtil;
import com.kky.healthcaregardens.common.base.utils.LogUtil;
import com.kky.healthcaregardens.common.base.utils.ToastUtil;
import com.kky.healthcaregardens.common.fragment.social.VideoFragment;
import com.kky.healthcaregardens.common.fragment.social.WorkOrderFragment;
import com.kky.healthcaregardens.common.view.layout.MyBaseFragment;
import com.kky.healthcaregardens.common.widget.waterfall.base.ui.BaseAdapter;
import com.kky.healthcaregardens.common.widget.waterfall.collector.common.channel.Channel;
import com.kky.healthcaregardens.common.widget.waterfall.collector.huaban.source.HuabanCaptcher;
import com.kky.healthcaregardens.common.widget.waterfall.collector.huaban.source.Pin;
import com.kky.healthcaregardens.common.widget.waterfall.collector.huaban.ui.PinAdapter;
import com.kky.healthcaregardens.helper.xui.common.utils.Utils;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.enums.CoreAnim;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import butterknife.BindView;

/**
 * 社交
 * 2019/11/12
 * cxa
 */
@Page(name = "社交", anim = CoreAnim.none)
public class SocialFragment extends MyBaseFragment {

    protected String TAG = this.getClass().getSimpleName();

    @BindView(R.id.stv_sociallife0)
    SuperTextView superTextView_s0;
    @BindView(R.id.stv_sociallife1)
    SuperTextView superTextView_s1;
    @BindView(R.id.stv_sociallife2)
    SuperTextView superTextView_s2;
    @BindView(R.id.stv_sociallife3)
    SuperTextView superTextView_s3;
    @BindView(R.id.stv_sociallife4)
    SuperTextView superTextView_s4;
    @BindView(R.id.stv_sociallife5)
    SuperTextView superTextView_s5;

    @BindView(R.id.videoView)
    VideoView videoView;
    @BindView(R.id.btn_start)
    Button btn_start;
    @BindView(R.id.btn_end)
    Button btn_end;

    MediaController mediaController;


    //瀑布流照片墙 网络加载
    private PinAdapter mAdapter;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    protected static final int MODE_REFRESH = 0;
    protected static final int MODE_LOAD_MORE = 1;

    protected static final String ARG_CHANNEL = "channel";



    protected int mLastPage = 1;
    protected int mNextPage = 2;
    protected int mLoadingMode = MODE_REFRESH;

    protected Channel mChannel;
    private long mFragmentID;
    protected Set<String> mIdSet;

//    ArrayList<Integer> imageIds = new ArrayList<>();
//    private int[] ids = {R.drawable.drop_pic_1
//            , R.drawable.drop_pic_2
//            , R.drawable.drop_pic_3
//            , R.drawable.drop_pic_4
//            , R.drawable.drop_pic_5
//            , R.drawable.drop_pic_6
//            , R.drawable.drop_pic_7
//            , R.drawable.drop_pic_8
//            , R.drawable.drop_pic_9
//            , R.drawable.drop_pic_10
//            , R.drawable.drop_pic_11
//            , R.drawable.drop_pic_13
//            , R.drawable.drop_pic_14
//            , R.drawable.drop_pic_15
//            , R.drawable.drop_pic_16
//            , R.drawable.drop_pic_17
//            , R.drawable.drop_pic_18
//            , R.drawable.drop_pic_19
//            , R.drawable.drop_pic_20
//            ,};
//
//    private RecyclerView rv_waterfall;
//    private DemoAdapter adapter;
//    private SmartRefreshLayout refreshlayout;


    public SocialFragment() {
        // Required empty public constructor
    }


    public static SocialFragment newInstance() {
        SocialFragment fragment = new SocialFragment();
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_social;
    }


    @Override
    protected void initViews() {

//        showWaterFallList();

        showWaterFallListOnWeb();
    }


    private void showWaterFallListOnWeb() {


        mAdapter = new PinAdapter(getActivity(), new ArrayList<Pin>(), true);
        mAdapter.setLoadingFooter(R.layout.footer_loading);
        mAdapter.setHost(this);


        mAdapter.setOnLoadMoreListener(new BaseAdapter.OnLoadMoreListener() {
            @Override
            public void onLoadMore(boolean forceReload) {
                if (mLastPage == mNextPage && !forceReload) {
                    return;
                }
                mLastPage = mNextPage;
                mLoadingMode = MODE_LOAD_MORE;
                loadData();
            }
        });

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.page_sfl);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorAccent,
                R.color.colorPrimaryDark);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mLoadingMode = MODE_REFRESH;
                loadData();
            }
        });

        StaggeredGridLayoutManager layoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.page_rv);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

        loadData();

        mAdapter.notifyDataSetChanged();
        mSwipeRefreshLayout.setRefreshing(false);
    }


    protected void loadData() {
        if (NetWorkUtils.isNetworkConnected(getContext())) {

            new FetchPinsTask().host(this).execute();
        } else {
            ToastUtil.showTips(R.string.connect_tips);
        }
    }


    private class FetchPinsTask extends UITask<Void, Void, List<Pin>> {
        private String pinID = "";
        private boolean hasData = true;
        protected Set<String> mIdSet = new HashSet<>();
        ;

        //        "anime", "动漫"
        //        "beauty", "妹纸"
        //        "travel_places", "旅行"
        //        "pets", "宠物"
        //        "photography", "摄影"
        //        "apparel", "服装"
        Channel channel = new Channel("beauty", "channel");

        @Override
        protected void onPreExecute() {
            if (mLoadingMode == MODE_LOAD_MORE) {
                Pin lastPin = mAdapter.getLastItem();

                if (lastPin != null) {
                    pinID = lastPin.id;
                }
            }
        }

        @Override
        protected List<Pin> doInBackground(Void... params) {
            try {

                List<Pin> pinList = HuabanCaptcher.pickPins(channel.getId(), pinID);
                hasData = !CollectionUtil.isEmpty(pinList);
                // 过滤重复的图片
                Iterator<Pin> iterator = pinList.iterator();
                while (iterator.hasNext()) {
                    String id = iterator.next().id;

                    if (mIdSet.contains(id)) {
                        iterator.remove();
                    } else {
                        mIdSet.add(id);
                    }
                }

                return pinList;
            } catch (Exception e) {
                LogUtil.e(TAG, e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<Pin> pinList) {
            if (pinList == null) {
                ToastUtil.showTips("获取图片列表失败");
                mSwipeRefreshLayout.setRefreshing(false);
            }
            if (mLoadingMode == MODE_LOAD_MORE) {
                if (pinList == null) {
                    // 返回null说明获取列表时发生异常
                    mAdapter.setFailedFooter(R.layout.footer_failed);
                } else if (!hasData) {
                    mAdapter.setEndFooter(R.layout.footer_end);
                } else {
                    mNextPage++;
                    mAdapter.appendData(pinList);
                }
            } else {
                if (!CollectionUtil.isEmpty(pinList)) {
                    if (mAdapter.getDataSize() == 0) {
                        mAdapter.setData(pinList);
                    } else {
                        mAdapter.insertFront(pinList);
                    }
                }
                mSwipeRefreshLayout.setRefreshing(false);
            }
        }
    }


    @Override
    protected void initListeners() {


        /**
         * 社交生活 ---- 视频
         */
        superTextView_s0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage(VideoFragment.class);
            }
        });

        /**
         * 社交生活 ---- 直播
         */
        superTextView_s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage(VideoFragment.class);
            }
        });
        /**
         * 社交生活 ---- 组局
         */
        superTextView_s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.goWeb(getContext(), "https://www.ehuzhu.com/");
            }
        });
        /**
         * 社交生活 ---- 互助
         */
        superTextView_s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage(WorkOrderFragment.class);
            }
        });
        /**
         * 社交生活 ---- 聊天
         */
        superTextView_s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.goWeb(getContext(), "https://www.ehuzhu.com/");
            }
        });
        /**
         * 社交生活 ---- 论坛
         */
        superTextView_s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.goWeb(getContext(), "https://www.ehuzhu.com/");
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideo();
            }
        });
        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });

    }

    /**
     * 视频播放
     */
    private void playVideo() {
        mediaController = new MediaController(getActivity());
        String uri = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.ass;

        videoView.setVideoURI(Uri.parse(uri));

        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);

        videoView.requestFocus();
        videoView.start();
    }


//    /**
//     * 加载瀑布流列表信息
//     */
//    private void showWaterFallList() {
//
////        refreshlayout = findViewById(R.id.refreshlayout);
////
////        rv_waterfall = findViewById(R.id.rv_waterfall);
////
////        rv_waterfall.setHasFixedSize(true);
////        rv_waterfall.setItemAnimator(null);
////
////        //垂直方向的2列
////        final StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
////        //防止Item切换
////        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
////        rv_waterfall.setLayoutManager(layoutManager);
////        final int spanCount = 2;
////        rv_waterfall.addItemDecoration(new StaggeredDividerItemDecoration(getActivity(), 10, spanCount));
////
////
////        //解决底部滚动到顶部时，顶部item上方偶尔会出现一大片间隔的问题
////        rv_waterfall.addOnScrollListener(new RecyclerView.OnScrollListener() {
////            @Override
////            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
////                int[] first = new int[spanCount];
////                layoutManager.findFirstCompletelyVisibleItemPositions(first);
////                if (newState == RecyclerView.SCROLL_STATE_IDLE && (first[0] == 1 || first[1] == 1)) {
////                    layoutManager.invalidateSpanAssignments();
////                }
////            }
////        });
//
////        //设置Adapter
////        for (int i = 0; i < ids.length; i++) {
////            imageIds.add(ids[i]);
////        }
////        adapter = new DemoAdapter();
////        rv_waterfall.setAdapter(adapter);
////        adapter.replaceAll(imageIds);
////
////
////        //设置下拉刷新和上拉加载监听
////        refreshlayout.setOnRefreshListener(new OnRefreshListener() {
////            @Override
////            public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
////                adapter.replaceAll(getData());
////                refreshLayout.finishRefresh();
////            }
////        });
////
////        refreshlayout.setOnLoadMoreListener(new OnLoadMoreListener() {
////            @Override
////            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
////                adapter.addData(adapter.getItemCount(), getData());
////                refreshLayout.finishLoadMore();
////            }
////        });
//
//    }
//
//    private ArrayList<Integer> getData() {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 19; i++) {
//            list.add(ids[i]);
//        }
//        return list;
//    }

}

