package com.zzc.design.structure.adapter;

/**
 * 创建具体实现AdvanceMediaPlayer接口的实体类
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
