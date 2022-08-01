package com.laoz.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: laoz
 * @Time: 2022/7/25  14:25
 * @description:
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private Date birthDay;
    private Boolean dead;
}
