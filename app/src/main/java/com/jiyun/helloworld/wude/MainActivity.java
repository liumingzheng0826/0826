package com.jiyun.helloworld.wude;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jiyun.helloworld.wude.adapter.RlvAdapter;
import com.jiyun.helloworld.wude.bean.Data;

import java.util.ArrayList;
import java.util.List;

//刘明政+H1810A
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRlv;
    private List<Data> mList;
    private RlvAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mList.add(new Data(1,"1111"));
        }
    }

    private void initView() {
        mRlv = (RecyclerView) findViewById(R.id.rlv);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new RlvAdapter(this, mList);
        mRlv.setAdapter(mAdapter);
    }
}
