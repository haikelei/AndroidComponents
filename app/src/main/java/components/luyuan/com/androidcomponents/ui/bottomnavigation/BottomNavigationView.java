package components.luyuan.com.androidcomponents.ui.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import components.luyuan.com.androidcomponents.R;

/**
 * @author: lujialei
 * @date: 2018/9/27
 * @describe:
 */


public class BottomNavigationView extends RelativeLayout {
    @BindView(R.id.iv0)
    ImageView iv0;
    @BindView(R.id.iv1)
    ImageView iv1;
    @BindView(R.id.iv2)
    ImageView iv2;
    @BindView(R.id.iv3)
    ImageView iv3;
    @BindView(R.id.iv4)
    ImageView iv4;

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View root = LayoutInflater.from(context).inflate(R.layout.layout_bottom_navigation_view, this, true);
        ButterKnife.bind(this);
        iv0.setSelected(true);
        iv1.setSelected(false);
        iv2.setSelected(false);
        iv3.setSelected(false);
        iv4.setSelected(false);
    }

    public interface Listener{
        void onClick(int index);
    }
    private Listener listener;
    public void setListener(Listener listener){
        this.listener = listener;
    }


    @OnClick({R.id.iv0, R.id.iv1, R.id.iv2, R.id.iv3, R.id.iv4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv0:
                iv0.setSelected(true);
                iv1.setSelected(false);
                iv2.setSelected(false);
                iv3.setSelected(false);
                iv4.setSelected(false);
                listener.onClick(0);
                break;
            case R.id.iv1:
                iv0.setSelected(false);
                iv1.setSelected(true);
                iv2.setSelected(false);
                iv3.setSelected(false);
                iv4.setSelected(false);
                listener.onClick(1);
                break;
            case R.id.iv2:
                iv0.setSelected(false);
                iv1.setSelected(false);
                iv2.setSelected(true);
                iv3.setSelected(false);
                iv4.setSelected(false);
                listener.onClick(2);
                break;
            case R.id.iv3:
                iv0.setSelected(false);
                iv1.setSelected(false);
                iv2.setSelected(false);
                iv3.setSelected(true);
                iv4.setSelected(false);
                listener.onClick(3);
                break;
            case R.id.iv4:
                iv0.setSelected(false);
                iv1.setSelected(false);
                iv2.setSelected(false);
                iv3.setSelected(false);
                iv4.setSelected(true);
                listener.onClick(4);
                break;
        }
    }
}
