package com.reactnativecamerax

import android.util.Log
import androidx.annotation.Nullable
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewProps
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.views.image.ImageResizeMode
import com.facebook.react.views.image.ReactImageView
class CameraxView(reactContext: ReactApplicationContext) : SimpleViewManager<ReactImageView>() {
	var mCallerContext: ReactApplicationContext? = reactContext
	override fun getName(): String {
		return "RCTCameraXView"
	}

	override fun createViewInstance(reactContext: ThemedReactContext): ReactImageView {
		return ReactImageView(reactContext, Fresco.newDraweeControllerBuilder(), null, mCallerContext)
	}

	@ReactProp(name = "src")
	fun setSrc(view: ReactImageView, @Nullable sources: ReadableArray?) {
		Log.d("Kilvish", sources.toString());
		view.setSource(sources)
	}

	@ReactProp(name = "borderRadius", defaultFloat = 0f)
	override fun setBorderRadius(view: ReactImageView, borderRadius: Float) {
		view.setBorderRadius(borderRadius)
	}

	@ReactProp(name = ViewProps.RESIZE_MODE)
	fun setResizeMode(view: ReactImageView, resizeMode: String?) {
		view.setScaleType(ImageResizeMode.toScaleType(resizeMode))
	}
}