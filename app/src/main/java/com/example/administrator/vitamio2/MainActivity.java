package com.example.administrator.vitamio2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

import io.vov.vitamio.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    private MediaController mediaController;
    // String mVideoPath="https://vf1.mtime.cn/Video/2017/02/24/mp4/170224095810371082_480.mp4";
//      String mVideoPath="http://v.cctv.com/flash//jingjibanxiaoshi/2008/09/jingjibanxiaoshi_300_20080919_1.flv";
//    String mVideoPath="https://vfx.mtime.cn/Video/2017/07/27/mp4/170727100951771139.mp4";
    String mVideoPath="https://vfx.mtime.cn/Video/2017/08/16/mp4/170816125337243063.mp4";
    String paht="http://3811.liveplay.myqcloud.com/live/flv/3811_channel1709.flv?AUTH=ftdrlVK8b6tSw9SyJVI783Fl3JA+/YOv+IWe3UaWamXD/z3kLyncXRnE2vyURjzmBYhnRYJx8tzkdVePgyAeSg==";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//
        setContentView(R.layout.activity_main);
        initView();
        initVideoSettings();
    }

    private void initView() {
        mVideoView = (VideoView) findViewById(R.id.surface_view);
    }
    private void initVideoSettings()
    {
        //设置控制器，该controller可以自定义
        mVideoView.setMediaController(new MediaController(MainActivity.this));
        //获取焦点
        mVideoView.requestFocus();
        //设置缓冲大小
        mVideoView.setBufferSize(1024 * 1024);
        //设置色彩格式
        mVideoView.setVideoChroma(MediaPlayer.VIDEOCHROMA_RGB565);
        //设置播放路径，这里使用的是url，也可以改成本地的视频
        mVideoView.setVideoPath(mVideoPath);
        //设置一个监听
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override

            public void onPrepared(MediaPlayer mediaPlayer) {

                // optional need Vitamio 4.0

                mediaPlayer.setPlaybackSpeed(1.0f);
                mVideoView.start();

            }

        });
    }

}
