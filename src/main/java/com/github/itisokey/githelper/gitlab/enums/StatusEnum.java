package com.github.itisokey.githelper.gitlab.enums;

import lombok.Getter;

/**
 * @author Lv LiFeng
 * @date 2022/1/19 01:05
 */
@Getter
public enum StatusEnum {

    SUCCESSES("GitLab Operation Successful:"),
    FAILED("GitLab Operation Failed:"),
    ;


    private String desc;

    StatusEnum(String desc) {
        this.desc = desc;
    }
}