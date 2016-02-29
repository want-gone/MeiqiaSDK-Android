package com.meiqia.meiqiasdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.meiqia.core.MQManager;
import com.meiqia.core.callback.OnInitCallback;
import com.meiqia.meiqiasdk.activity.MQConversationActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 替换成自己的key
        String meiqiaKey = "a71c257c80dfe883d92a64dca323ec20";

        MQManager.init(this, meiqiaKey, new OnInitCallback() {
        	
            @Override
            public void onSuccess(String clientId) {
                Toast.makeText(MainActivity.this, "init success", Toast.LENGTH_SHORT).show();
            }

			@Override
			public void onFailure(int arg0, String arg1) {
				// TODO Auto-generated method stub
				
			}
        });

    }

    /**
     * 咨询客服
     *
     * @param v
     */
    public void conversation(View v) {
        startActivity(new Intent(MainActivity.this, MQConversationActivity.class));
    }

    /**
     * 开发者功能
     *
     * @param v
     */
    public void developer(View v) {
        startActivity(new Intent(MainActivity.this, ApiSampleActivity.class));
    }
    
    /**
     * 自定义 Activity
     * @param view
     */
    public void customizedConversation(View view) {
        startActivity(new Intent(MainActivity.this, CustomizedMQConversationActivity.class));
    }

}