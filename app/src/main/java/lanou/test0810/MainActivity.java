package lanou.test0810;


import android.view.View;
import android.widget.TextView;

import lanou.test0810.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {
   private TextView mainTV;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mainTV = bindView(R.id.main_tv);
       // mainTV = (TextView) findViewById(R.id.main_tv);
        setClick(this,mainTV);
    }



    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {

    }



//private TextView mainTV;


//    protected int getLayout() {
//     return R.layout.activity_main;
//    }
//
//    @Override
//    protected void initView() {
//       // mainTV = (TextView) findViewById(R.id.main_tv);
//        mainTV =bindView(R.id.main_tv);
//        setClick(this,mainTV);
//    }
//
//
//
//
//    @Override
//    protected void initData() {
//
//    }
//
}

