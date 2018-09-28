package components.luyuan.com.androidcomponents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import components.luyuan.com.androidcomponents.ui.activity.DetailVideoActivity;
import components.luyuan.com.androidcomponents.ui.bottomnavigation.BottomNavigationView;
import components.luyuan.com.androidcomponents.ui.fragment.AddFragment;
import components.luyuan.com.androidcomponents.ui.fragment.CircleFragment;
import components.luyuan.com.androidcomponents.ui.fragment.HomeFragment;
import components.luyuan.com.androidcomponents.ui.fragment.MessageFragment;
import components.luyuan.com.androidcomponents.ui.fragment.MineFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_view)
    BottomNavigationView bottomView;
    private ArrayList<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        EasyHttp.post("api/")
//                .baseUrl("http://xxxx.xx.xx/dlydbg/")
//                .upJson("{\"\":\"\",\"\":\"\",\"\":\"\",\"swry_dm\":\"127053096\",\"version\":\"1.0.0\"}")
//                //这里不想解析，简单只是为了做演示 直接返回String
//                .execute(new SimpleCallBack<String>() {
//                    @Override
//                    public void onError(ApiException e) {
//
//                    }
//
//                    @Override
//                    public void onSuccess(String s) {
//
//                    }
//                });
        initView();
        initListener();
//        startActivity(new Intent(this, DetailVideoActivity.class));
    }

    private void initListener() {
        bottomView.setListener(new BottomNavigationView.Listener() {
            @Override
            public void onClick(int index) {
                changeTab(index);
            }
        });
    }

    private void changeTab(int index) {
        if (index==0){
            getSupportFragmentManager().beginTransaction()
                    .show(fragmentList.get(0))
                    .hide(fragmentList.get(1))
                    .hide(fragmentList.get(2))
                    .hide(fragmentList.get(3))
                    .hide(fragmentList.get(4))
                    .commitAllowingStateLoss();
        } else if (index==1){
            getSupportFragmentManager().beginTransaction()
                    .hide(fragmentList.get(0))
                    .show(fragmentList.get(1))
                    .hide(fragmentList.get(2))
                    .hide(fragmentList.get(3))
                    .hide(fragmentList.get(4))
                    .commitAllowingStateLoss();
        } else if (index==2){
            getSupportFragmentManager().beginTransaction()
                    .hide(fragmentList.get(0))
                    .hide(fragmentList.get(1))
                    .show(fragmentList.get(2))
                    .hide(fragmentList.get(3))
                    .hide(fragmentList.get(4))
                    .commitAllowingStateLoss();
        } else if (index==3){
            getSupportFragmentManager().beginTransaction()
                    .hide(fragmentList.get(0))
                    .hide(fragmentList.get(1))
                    .hide(fragmentList.get(2))
                    .show(fragmentList.get(3))
                    .hide(fragmentList.get(4))
                    .commitAllowingStateLoss();
        } else if (index==4){
            getSupportFragmentManager().beginTransaction()
                    .hide(fragmentList.get(0))
                    .hide(fragmentList.get(1))
                    .hide(fragmentList.get(2))
                    .hide(fragmentList.get(3))
                    .show(fragmentList.get(4))
                    .commitAllowingStateLoss();
        }

    }

    private void initView() {
        HomeFragment homeFragment = new HomeFragment();
        CircleFragment circleFragment = new CircleFragment();
        AddFragment addFragment = new AddFragment();
        MessageFragment messageFragment = new MessageFragment();
        MineFragment mineFragment = new MineFragment();
        fragmentList = new ArrayList();
        fragmentList.add(homeFragment);
        fragmentList.add(circleFragment);
        fragmentList.add(addFragment);
        fragmentList.add(messageFragment);
        fragmentList.add(mineFragment);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,fragmentList.get(0),"home")
                .add(R.id.container,fragmentList.get(1),"circle")
                .add(R.id.container,fragmentList.get(2),"add")
                .add(R.id.container,fragmentList.get(3),"message")
                .add(R.id.container,fragmentList.get(4),"mine")
                .hide(fragmentList.get(1))
                .hide(fragmentList.get(2))
                .hide(fragmentList.get(3))
                .hide(fragmentList.get(4))
                .commitAllowingStateLoss();

    }
}
