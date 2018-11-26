package com.hyl.learner.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @Auther: jack
 * @Date: 2018/11/1 02:46
 */
@Data
@Builder
public class DoorWord {
    private String value;
    private String code;
    private String msg;
}
