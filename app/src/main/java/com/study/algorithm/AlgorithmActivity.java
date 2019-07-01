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
           //二分查找
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/BinaryCheck.java",
           //旋转数组查找最小数字
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/RoateArray.java",
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
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/Fibonacci.java",
           //矩阵中的路径
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/MatrixRoute.java",
           //机器人的运动范围
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/RobotRuningZone.java",
           //1到n位最大十进数的数值。
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/Print1ToN.java",
           //O(1)时间内删除链表节点
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/DeleteLinkNode.java",
           //删除倒数第k个节点
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/DeleteKLinkNode.java",
           //调整数组顺序，使奇数位于前面，偶数位于后面
            "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/AdjustmentArray.java",
           //树的子结构
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/ChildBinaryTreeNote.java",
           //镜像二叉树
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/MinorBinaryTree.java",
           //对称二叉树
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/SymmetryTree.java",
           //找到栈的最小元素的min函数
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/ContainMinStack.java",
           //栈的压入和弹出顺序
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/StakPushAndPopOrder.java",
           //从上到下打印二叉树
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/PrintTreeFromTopToBottom.java",
           //二叉搜索树的后序遍历序列
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/BinaryTreeLastSearch.java",
           //二叉树中和为某一值得路径
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/BinaryTreeResultRoot.java",
           //字符串的排列
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/CharsSort.java",
           //数组中出现次数超过一半的数字
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/NumberAppearHalfTimes.java",
           //最小的k个数
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/SmallestKNumbers.java",
           //数据流的中位数
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/DatasCenterNumber.java",
           //1到n出现1的次数
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/TimesOf1Show.java",
           //把数组排成最小的数
           "https://github.com/YinWuteng/JavaAlgorithm/blob/master/src/SortDatasSmallestNumber.java"
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
        webLabelUrls.add("二分查找");
        webLabelUrls.add("旋转数组查找最小值");
        webLabelUrls.add("二维数组查找");
        webLabelUrls.add("替换空格");
        webLabelUrls.add("从尾到头打印链表");
        webLabelUrls.add("重建二叉树");
        webLabelUrls.add("获取重复数字");
        webLabelUrls.add("树的遍历");
        webLabelUrls.add("动态规划");
        webLabelUrls.add("斐波拉切数列");
        webLabelUrls.add("矩阵中的路径");
        webLabelUrls.add("机器人的运动范围");
        webLabelUrls.add("1到n位最大十进数的数值");
        webLabelUrls.add("O(1)时间内删除链表节点");
        webLabelUrls.add("删除倒数第k个节点");
        webLabelUrls.add("调整数组顺序，使奇数位于前面，偶数位于后面");
        webLabelUrls.add("树的子结构");
        webLabelUrls.add("镜像二叉树");
        webLabelUrls.add("对称二叉树");
        webLabelUrls.add("找到栈的最小元素的min函数");
        webLabelUrls.add("栈的压入和弹出顺序");
        webLabelUrls.add("从上到下打印二叉树");
        webLabelUrls.add("二叉搜索树的后序遍历序列");
        webLabelUrls.add("二叉树中和为某一值得路径");
        webLabelUrls.add("字符串的排列");
        webLabelUrls.add("数组中出现次数超过一半的数字");
        webLabelUrls.add("最小的k个数");
        webLabelUrls.add("数据流的中位数");
        webLabelUrls.add("1到n出现1的次数");
        webLabelUrls.add("把数组排成最小的数");
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
