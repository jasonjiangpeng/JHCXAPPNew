package com.jh.rental.user.view.actitity.internationnal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.jh.rental.user.R;
import com.jh.rental.user.constants.Constant;
import com.jh.rental.user.utils.jason.ActivityUtils;
import com.jh.rental.user.utils.jason.BaseContext;
import com.jh.rental.user.view.actitity.TitelBarAcitvity;

/**
 * Created by 骏辉出行 on 2017/5/26.
 */

public class TravelBooking_Activity extends TitelBarAcitvity implements View.OnClickListener {
    public static String INDENT= "CharteredBu";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travelbooking_activity);
        setMyTitel(BaseContext.getResValue(R.string.dingtrip));

        initView();
    }

    private void initView() {
        Button button = (Button) findViewById(R.id.trave_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.trave_button:
                Constant.COUPON = 0;
                ActivityUtils.nextActivity(OrderDetails_Activity.class,"indent",INDENT);
                break;
        }
    }
}
