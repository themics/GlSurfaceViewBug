package com.example.glsurfaceviewbug

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val glSurfaceView = GLSurfaceView(this)

        glSurfaceView.setRenderer(object : GLSurfaceView.Renderer {
            override fun onDrawFrame(gl: GL10?) {
                gl?.glClearColor(0f, 0f, 1f, 1f)
                gl?.glClear(GL10.GL_COLOR_BUFFER_BIT)
            }

            override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
            }

            override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
            }
        })

        setContentView(glSurfaceView)
    }
}
