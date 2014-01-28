package com.canlitv;

import com.canlitv.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebView;
import android.widget.ZoomControls;

public class TvChannels extends Activity {

	WebView webCanliTV;
	ZoomControls zc;
	 
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_canlitv);
        
        Bundle extras = getIntent().getExtras();
        int tvNo = extras.getInt("id");
        zc = (ZoomControls) findViewById(R.id.zoomctrl);
        webCanliTV = (WebView) findViewById(R.id.web_canlitv);
        webCanliTV.getSettings().setJavaScriptEnabled(true);
        webCanliTV.getSettings().setBuiltInZoomControls(true);
        
        
        
       switch(tvNo)
       {
       
	       case 1:
	    	   webCanliTV.loadUrl("http://webtv.atv.com.tr/webtv/videoizle/atv/canli_yayin");
	           break;
	       
	       case 2:
	    	   webCanliTV.loadUrl("http://www.kanald.com.tr/CanliYayin/");
               break;
           
	       case 3:
	    	   webCanliTV.loadUrl("http://www.showtvnet.com/player/index.asp?ptype=1&product=showtv");
	           break;
	           
	       case 4:
	    	   webCanliTV.loadUrl("http://www.startv.com.tr/canli-yayin");
		       break;
		       
	       case 5:
	    	   webCanliTV.loadUrl("http://www.trt.net.tr/Canli/canli.aspx?kanal=TV1");
		       break;
		       
	       case 6:
	    	   webCanliTV.loadUrl("http://video.cnnturk.com/canli-yayin");
		       break;
		       
	       case 7:
	    	   webCanliTV.loadUrl("http://cm.ntvmsnbc.com/ServerSite/wui/NTVCanliYayin/default.aspx");
		       break;
		       
	       case 8:
	    	   webCanliTV.loadUrl("http://www.haberturk.com/canliyayin");
		       break;
		       
	       case 9:
	    	   webCanliTV.loadUrl("http://www.kanal7.com/kanal7-canli-izle.html");
		       break;
		       
	       case 10:
	    	   webCanliTV.loadUrl("http://www.kure.tv/samanyolu-tv/Canli-yayin-izle/1/");
		       break;
		       
	       case 11:
	    	   webCanliTV.loadUrl("http://www.ttcocuk.com/izle/trtcocuk-canli-yayin");
		       break;
		       
	       case 12:
	    	   webCanliTV.loadUrl("http://www.kure.tv/yumurcak-tv/Canli-yayin-izle/4/");
		       break;
		       
       }
    }
	 
}
