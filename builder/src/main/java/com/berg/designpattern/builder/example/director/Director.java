package com.berg.designpattern.builder.example.director;

import com.berg.designpattern.builder.example.builder.Builder;

/**
 * 指导者的接口
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
public interface Director {
    /**
     * 设置Builder
     *
     * @param builder 设置的builder
     */
    void setBuilder(Builder builder);

    /**
     * 构建
     */
    void construct();
}
