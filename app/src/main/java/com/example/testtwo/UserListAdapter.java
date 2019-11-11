package com.example.testtwo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class UserListAdapter extends BaseQuickAdapter<User, BaseViewHolder> {
    public UserListAdapter(@Nullable List<User>data){
        super(R.layout.item_user);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, User item) {
        helper.setText(R.id.tv_name,item.getSname());
    }
}
