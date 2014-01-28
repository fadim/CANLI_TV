package com.canlitv;

import java.util.ArrayList;
import java.util.HashMap;

import com.canlitv.CanliTVActivity;
import com.canlitv.TvChannels;
import com.canlitv.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class CanliTVActivity extends Activity {
    /** Called when the activity is first created. */
	
	private ProgressDialog dialog;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        		                   WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        setContentView(R.layout.main);
        
        HashMap<String, Object> map = new HashMap<String, Object>();
        final GridView canli_tv = (GridView)findViewById(R.id.canli_tv);
        final ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.atv);
        map.put("itemtxt","Atv");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.cnnturk);
        map.put("itemtxt","CnnTürk");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.haberturk);
        map.put("itemtxt","HaberTürk");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.kanal7);
        map.put("itemtxt","Kanal7");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.kanald);
        map.put("itemtxt","KanalD");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.ntv);
        map.put("itemtxt","Ntv");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.samanyolu);
        map.put("itemtxt","Samanyolu");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.showtv);
        map.put("itemtxt","ShowTv");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.startv);
        map.put("itemtxt","Star");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.trt1);
        map.put("itemtxt","Trt1");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.trtcocuk);
        map.put("itemtxt","TrtÇocuk");
        lstImageItem.add(map);
        
        map = new HashMap<String,Object>();
        map.put("itemimg", R.drawable.yumurcak);
        map.put("itemtxt","Yumurcak");
        lstImageItem.add(map);
        
        SimpleAdapter adapter = new SimpleAdapter(this,
          		 lstImageItem,
          		 R.layout.gridview_item,
          		 new String[] {"itemimg","itemtxt"},
          		 new int[] {R.id.item_image,R.id.item_text});
          
        canli_tv.setAdapter(adapter);
        
        canli_tv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
				
				HashMap<String, Object> item = new HashMap<String, Object>();
	        	item = lstImageItem.get(position);
	        	
	        	CheckInternetConnection();
	        		
	        	int tvNo;
	        	if ((item.get("itemtxt")).equals("Atv"))
	        	{
	        		tvNo = 1;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("KanalD"))
	        	{
	        		tvNo = 2;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("ShowTv"))
	        	{
	        		tvNo = 3;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Star"))
	        	{
	        		tvNo = 4;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Trt1"))
	        	{
	        		tvNo = 5;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("CnnTürk"))
	        	{
	        		tvNo = 6;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Ntv"))
	        	{
	        		tvNo = 7;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("HaberTürk"))
	        	{
	        		tvNo = 8;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Kanal7"))
	        	{
	        		tvNo = 9;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Samanyolu"))
	        	{
	        		tvNo = 10;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("TrtÇocuk"))
	        	{
	        		tvNo = 11;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
	        	else if ((item.get("itemtxt")).equals("Yumurcak"))
	        	{
	        		tvNo = 12;
	        		Intent intent = new Intent(CanliTVActivity.this, TvChannels.class);
	        		Bundle bundle = new Bundle();
	        		bundle.putInt("id", tvNo);
	        		intent.putExtras(bundle);
		    		startActivity(intent);
	        	}
	        	
			}
			
        });
        
    }  
    
    public void CheckInternetConnection() {
	    
    	ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo info = cm.getActiveNetworkInfo();
	    if (info != null) {
	       if(!info.isConnected()){
	    	   
	    	   Toast.makeText(this, "Please check your wireless connection and try again.", Toast.LENGTH_SHORT).show();
	       }else{
	    	   
	    	   dialog = ProgressDialog.show(CanliTVActivity.this, "", 
                       "Loading. Please wait...", true);
              new Thread() {
              	
                  public void run() {
                  	
                  	try {
                  		Thread.currentThread();
  						Thread.sleep(10000);
                  	}catch(Exception e){
                  		Log.e("tag",e.getMessage());
                  	}
                  	
                  	dialog.dismiss();
                  }
              }.start();
	       }
	       
	    }else{
	    
	      Toast.makeText(this, "Please check your wireless connection and try again.", Toast.LENGTH_SHORT).show();
	    }
    }
}