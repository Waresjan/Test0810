package lanou.test0810.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dllo on 16/10/21.
 *
 * Activity的基类
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         //1.绑定布局
        setContentView(getLayout());

        //2.初始化组件
        initView();

        //3.初始化数据
        initData();
    }

    protected abstract int getLayout();

    //初始化组件,各种findviewbyid
    protected abstract void initView();

    //初始化数据,基本上就是拉去网络数据

    protected abstract void initData();

    //简化findviewbyid省去强传过程
    protected  <T extends View> T bindView(int id){
        return (T) findViewById(id);

        //<>表示泛型
    }
    protected   void setClick(View.OnClickListener clickListener,
                           View ... views){
        //...表示可以写任意数量的view
        for(View view : views){
            view.setOnClickListener(clickListener);
        }
    }
}
