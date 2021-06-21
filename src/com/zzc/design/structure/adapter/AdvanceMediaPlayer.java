package com.zzc.design.structure.adapter;

/**
 * 旧的媒体播放器
 */
public interface AdvanceMediaPlayer {
    /**
     * 播放Vlc
     * @param fileName
     */
    void playVlc(String fileName);

    /**
     * 播放MP4
     * @param fileName
     */
    void playMp4(String fileName);
}
