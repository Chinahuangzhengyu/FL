package com.baidu.test.mylibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;

/**
 * Created by 黄郑宇 on 2017/10/26.
 */

public class AlertDialogA {
    public static void getdialog(Context context, Drawable drawable){
       new AlertDialog.Builder(context)
                .setIcon(drawable)
                .setTitle("你好")
                .setMessage("你瞅啥，瞅你咋的！")
                .setNegativeButton("取消",null)
                .setPositiveButton("确定",null)
                .show();
    }
}
