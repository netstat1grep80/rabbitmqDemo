package com.laoz.jpa.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: laoz
 * @Time: 2022/7/29  09:52
 * @description:
 */
@Data
public class UserVO {

    private Long id;

    private String name;

    private Integer age;

    private String sex;

    private int size;

    private int current;

    public int getSize() {
        return 1;
    }
}
