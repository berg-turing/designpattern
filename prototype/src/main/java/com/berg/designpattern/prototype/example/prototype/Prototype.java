package com.berg.designpattern.prototype.example.prototype;

/**
 * @author bo.he02@hand-china.com
 * @apiNote 2018/11/29
 */
public interface Prototype extends Cloneable {
    /**
     * 克隆自身
     *
     * @return 克隆的结果
     */
    Prototype clone();
}
