package components.luyuan.com.androidcomponents.mock;

import java.util.ArrayList;

import components.luyuan.com.androidcomponents.bean.MutiItem;

/**
 * @author: lujialei
 * @date: 2018/9/28
 * @describe:
 */


public class Mock {

    public static ArrayList list = new ArrayList();
    static {
        list.add(new MutiItem(1));
        list.add(new MutiItem(1));
        list.add(new MutiItem(2));
        list.add(new MutiItem(4));
        list.add(new MutiItem(1));
        list.add(new MutiItem(1));
    }
    public static ArrayList getRecommendList(){
        return list;
    }
}
