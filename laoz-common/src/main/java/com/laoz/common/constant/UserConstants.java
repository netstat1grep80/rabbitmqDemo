package com.laoz.common.constant;

import java.util.HashMap;

/**
 * 用户常量信息
 */
public class UserConstants {
    /**
     * 平台内系统用户的唯一标志
     */
    public static final String SYS_USER = "SYS_USER";

    /**
     * 正常状态
     */
    public static final String NORMAL = "0";

    /**
     * 异常状态
     */
    public static final String EXCEPTION = "1";

    /**
     * 用户封禁状态
     */
    public static final String USER_DISABLE = "1";

    /**
     * 角色封禁状态
     */
    public static final String ROLE_DISABLE = "1";

    /**
     * 部门正常状态
     */
    public static final String DEPT_NORMAL = "0";

    /**
     * 部门停用状态
     */
    public static final String DEPT_DISABLE = "1";

    /**
     * 字典正常状态
     */
    public static final String DICT_NORMAL = "0";

    /**
     * 是否为系统默认（是）
     */
    public static final String YES = "Y";

    /**
     * 是否菜单外链（是）
     */
    public static final String YES_FRAME = "0";

    /**
     * 是否菜单外链（否）
     */
    public static final String NO_FRAME = "1";

    /**
     * 菜单类型（目录）
     */
    public static final String TYPE_DIR = "M";

    /**
     * 菜单类型（菜单）
     */
    public static final String TYPE_MENU = "C";

    /**
     * 菜单类型（按钮）
     */
    public static final String TYPE_BUTTON = "F";

    /**
     * Layout组件标识
     */
    public final static String LAYOUT = "Layout";

    /**
     * ParentView组件标识
     */
    public final static String PARENT_VIEW = "ParentView";

    /**
     * InnerLink组件标识
     */
    public final static String INNER_LINK = "InnerLink";

    /**
     * 校验返回结果码
     */
    public final static String UNIQUE = "0";

    public final static String NOT_UNIQUE = "1";

    /**
     * 用户名长度限制
     */
    public static final int USERNAME_MIN_LENGTH = 2;

    public static final int USERNAME_MAX_LENGTH = 20;

    /**
     * 密码长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 5;

    public static final int PASSWORD_MAX_LENGTH = 20;

    public static final Integer STATUS_DISABLE = 2;
    public static final Integer STATUS_ENABLE = 1;
    public static HashMap<Integer,String> STATUS =  new HashMap<Integer,String>(){{
        put(STATUS_DISABLE,"禁用");
        put(STATUS_ENABLE,"启用");
    }};

    //账号类型
    public static final Integer MAIN_ACCOUNT = 1;
    public static final Integer SUB_ACCOUNT = 2;
    public static HashMap<Integer,String> TYPE = new HashMap<Integer,String>(){{
        put(MAIN_ACCOUNT,"主账户");
        put(SUB_ACCOUNT,"子账户");
    }};
    //是否已认证
    public static final Integer AUTH_YES = 1;
    public static final Integer AUTH_NO = 0;
    public static HashMap<Integer,String> AUTH = new HashMap<Integer,String>(){{
        put(AUTH_YES,"已认证");
        put(AUTH_NO,"未认证");//认证状态
    }};

    /**
     * 认证角色类型
     */


    public static final int AUTH_COMPANY = 1;

    public static final int AUTH_EXPERT = 2;

    public static final int AUTH_DRAWINGLINE = 3;

    public static final int AUTH_LAB = 4;

    public static final int AUTH_MAPPING = 5;

    public static HashMap<Integer,String> AUTH_TYPE = new HashMap<Integer,String>(){{
        put(AUTH_COMPANY,"公司");
        put(AUTH_EXPERT,"专家");
        put(AUTH_DRAWINGLINE,"划线师");
        put(AUTH_LAB,"实验室");
        put(AUTH_MAPPING,"测绘公司");
    }};
}
