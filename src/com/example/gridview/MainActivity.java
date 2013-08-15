package com.example.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String tag = this.getClass().getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(tag, "onCreate");
		GridView gv = (GridView) findViewById(R.id.gridView1);
		String[] data_str = {"A","B","C","D","E","F","G"};
		
		gv.setAdapter(new GridViewAdapter(this, data_str));
		
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText( getApplicationContext(), "Hello somethings", Toast.LENGTH_SHORT).show();
				
			}
			
		});
	}


}
