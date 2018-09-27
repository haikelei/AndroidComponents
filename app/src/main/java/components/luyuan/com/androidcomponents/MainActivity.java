package components.luyuan.com.androidcomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhouyou.http.EasyHttp;
import com.zhouyou.http.callback.SimpleCallBack;
import com.zhouyou.http.exception.ApiException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyHttp.post("api/")
                .baseUrl("http://xxxx.xx.xx/dlydbg/")
                .upJson("{\"\":\"\",\"\":\"\",\"\":\"\",\"swry_dm\":\"127053096\",\"version\":\"1.0.0\"}")
                //这里不想解析，简单只是为了做演示 直接返回String
                .execute(new SimpleCallBack<String>() {
                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(String s) {

                    }
                });
    }
}
