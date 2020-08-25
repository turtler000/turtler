package com.turtler000.springbootdemo.tencentoss.util;

import java.io.File;

/**
 * create by hanhuanyu ON 2020/8/25
 */
public interface ICosFileService {

    /**
     * 上传图片
     *
     * @param key
     * @param localFilePath
     * @return
     */
    String uploadFile(String key, String localFilePath);

    /**
     * 上传图片
     *
     * @param key
     * @param localFile
     * @return
     */
    String uploadFile(String key, File localFile);
}
