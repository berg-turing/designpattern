package com.berg.designpattern.abstractfactory.example.widget.blue;

import com.berg.designpattern.abstractfactory.example.widget.Form;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 蓝色窗体
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/28
 */
@Component
public class BlueForm implements Form {
    /**
     * 日志打印对象
     */
    private static Logger logger = LoggerFactory.getLogger(BlueForm.class);

    @Override
    public void show() {
        logger.debug("展示蓝色的窗体");
    }
}
