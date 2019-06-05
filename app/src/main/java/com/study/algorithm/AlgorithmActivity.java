package com.study.algorithm;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.study.R;
import com.study.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 算法
 */
public class AlgorithmActivity extends BaseActivity implements AlgorithmAdapter.OnItemClickListener{
   private List<String> webLabelUrls=new ArrayList<>();
   private String[]   webUrls={
           //单例模式常用写法
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/SingleTon.java",
           //冒泡，插入，选择，快排
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/SortSimple.java",
           //归并排序
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/MergeApp.java",
           //二维数组查找
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/TwoArrayCheck.java",
           //替换空格
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/ReplaceSpace.java",
           //从尾到头打印链表
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/PrintListNode.java",
           //重建二叉树
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/RebuildBinaryTree.java",
           //获取重复数字
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/DuplicateNum.java",
           //树的遍历
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/TreeTraversal.java",
           //动态规划
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/CutRope.java",
           //斐波拉切数列
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/Fibonacci.java"
   };
    @Override
    protected int getLayoutId() {
        return R.layout.activity_arithmetic;
    }

    @Override
    protected void findId() {
        //url添加标签
        webLabelUrls.add("单例模式常用写法");
        webLabelUrls.add("冒泡，插入，选择，快排");
        webLabelUrls.add("归并排序");
        webLabelUrls.add("二维数组查找");
        webLabelUrls.add("替换空格");
        webLabelUrls.add("从尾到头打印链表");
        webLabelUrls.add("重建二叉树");
        webLabelUrls.add("获取重复数字");
        webLabelUrls.add("树的遍历");
        webLabelUrls.add("动态规划");
        webLabelUrls.add("斐波拉切数列");
        RecyclerView rvAlgorithm=findViewById(R.id.rv_algorithm);
        AlgorithmAdapter algorithmAdapter = new AlgorithmAdapter(this, webLabelUrls);
        //设置layoutManger为LinearLayoutManger
        algorithmAdapter.setOnItemClickListener(this);
        rvAlgorithm.setLayoutManager(new LinearLayoutManager(this));
        rvAlgorithm.setAdapter(algorithmAdapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent=new Intent();
        switch (view.getId()){
            case R.id.tv_web_url:
                intent.setClass(this,AlgorithmWebActivity.class);
                intent.putExtra("url",webUrls[position]);
                startActivity(intent);
                break;
        }
    }
}
