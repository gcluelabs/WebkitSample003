package com.example.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebkitSample extends Activity {
	WebView webView;
	Button button01;

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_webkit_sample);

		// WebViewの取得と表示
		webView = (WebView) findViewById(R.id.webview);
		webView.loadUrl("http://www.android.com");

		button01 = (Button) findViewById(R.id.Button01);
		button01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				webView.goBack();
			}
		});
		webView.setWebViewClient(new WebViewClient());

	}
}
