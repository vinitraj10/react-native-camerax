package com.reactnativecamerax

import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.views.slider.ReactSlider


class CameraxManager(reactContext: ReactApplicationContext) : ViewGroupManager<ConstraintLayout>() {
	private val context = reactContext
	override fun getName(): String {
		return "RCTCameraXView"
	}

	override fun createViewInstance(reactContext: ThemedReactContext): ConstraintLayout {
		return LayoutInflater.from(reactContext).inflate(R.layout.activity_camerax, null) as ConstraintLayout
	}


}