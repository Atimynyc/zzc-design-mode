package com.zzc.design.structure.adapter;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 */
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
