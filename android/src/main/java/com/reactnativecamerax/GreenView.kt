package com.reactnativecamerax

import android.graphics.Color
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.image.ReactImageView
import com.facebook.react.views.view.ReactViewGroup

class GreenView(reactContext: ReactApplicationContext): SimpleViewManager<ReactViewGroup>() {
	var mCallerContext: ReactApplicationContext? = reactContext
	override fun getName(): String {
		return "RCTGreenView"
	}

	override fun createViewInstance(reactContext: ThemedReactContext): ReactViewGroup {
		val RED = ReactViewGroup(reactContext);
		RED.backgroundColor = Color.parseColor("#0ead69");

//		val color = Color.parseColor("#0ead69");
//		setBackgroundColor(RED, color);
		return RED;
	}
}