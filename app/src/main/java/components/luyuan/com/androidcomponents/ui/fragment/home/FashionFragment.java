package components.luyuan.com.androidcomponents.ui.fragment.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import components.luyuan.com.androidcomponents.R;

/**
 * @author: lujialei
 * @date: 2018/9/27
 * @describe:
 */


public class FashionFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_fashion, container, false);
    }
}
