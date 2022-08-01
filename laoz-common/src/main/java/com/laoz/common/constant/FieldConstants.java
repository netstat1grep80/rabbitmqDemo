package com.laoz.common.constant;

/**
 * @author: laoz
 * @Time: 2022/4/22  14:29
 * @description: 常量
 */
public class FieldConstants {
    /**
     * 保存
     */
    public static final int STORE = 0;

    /**
     * 提交
     */
    public static final int REFER = 1;

    /**
     * 检测
     */
    public static final int CHECK = 2;

    /**
     * 场地验收
     */
    public static final int AUTH_SITE = 1;

    /**
     * 面层审定
     */
    public static final int AUTH_SURFACE = 2;

    /**
     * 器材审定
     */
    public static final int AUTH_EQUIPMENT = 3;

    /**
     * 芯片审定
     */
    public static final int AUTH_SOC = 4;

    /**
     * 证书
     */
    public static final int AUTH_CERT = 5;

    public static final int  AUTH_WORLD_SITE = 6;                        //世界田联场地

    public static final int  AUTH_WORLD_SURFACE = 7;                        //世界田联面层

    public static final int  AUTH_FOOTPATH = 8;                        //步道


    /**
     * 场地Ⅰ类
     */
    public static final int CATE_SITE_FIRST = 1;

    /**
     * 场地Ⅱ类
     */
    public static final int CATE_SITE_SECOND = 2;

    /**
     * 场地Ⅲ类
     */
    public static final int CATE_SITE_THREE = 3;

    /**
     * 预制型
     */
    public static final int CATE_SURFACE_PRE = 4;

    /**
     * 混合型
     */
    public static final int CATE_SURFACE_MIXED = 5;

    /**
     * 复合型
     */
    public static final int CATE_SURFACE_COMPOSITE = 6;

    /**
     * 全塑型
     */
    public static final int CATE_SURFACE_PLASTIC = 7;

    /**
     * 渗水型/透气型
     */
    public static final int CATE_SURFACE_PERMEABLE = 8;

    /**
     * 投掷器材
     */
    public static final int CATE_EQUIPMENT_THROW = 9;

    /**
     * 投掷护笼
     */
    public static final int CATE_EQUIPMENT_CAGE = 10;

    /**
     * 跳高架
     */
    public static final int CATE_EQUIPMENT_OVERHEAD = 11;

    /**
     * 海绵包
     */
    public static final int CATE_EQUIPMENT_SPONGE = 12;

    /**
     * 喷淋设备
     */
    public static final int CATE_EQUIPMENT_SPRAY = 13;

    /**
     * 器材检测工具
     */
    public static final int CATE_EQUIPMENT_TESTING = 14;

    /**
     * 移动设施
     */
    public static final int CATE_EQUIPMENT_REMOVING = 15;

    /**
     * 固定设施
     */
    public static final int CATE_EQUIPMENT_FIXED = 16;

    /**
     * 电子仪器系统
     */
    public static final int CATE_EQUIPMENT_ELECTRONIC = 17;

    /**
     * 竞赛系统
     */
    public static final int CATE_EQUIPMENT_PLAYER = 18;

    /**
     * 运动装备
     */
    public static final int CATE_EQUIPMENT_SPORTS = 19;

    /**
     * 芯片初次审定
     */
    public static final int CATE_SOC_FIRST = 20;

    /**
     * 芯片非初次审定
     */
    public static final int CATE_SOC_NOT_FIRST = 21;

    /**
     * 面层其他类型
     */
    public static final int CATE_SURFACE_OTHER = 22;


    public static final int CATE_SURFACE_LEVEL_UP = 23;           //面层升级
    public static final int CATE_WORLD_SITE_ONE = 24;           //世界田联场地Ⅰ
    public static final int CATE_WORLD_SITE_SECOND = 25;           //世界田联场地Ⅱ
    public static final int CATE_FOOTPATH_SYNTHESIS = 26;           //步道合成材料
    public static final int CATE_FOOTPATH_STONE = 27;           //步道碎石
    public static final int CATE_FOOTPATH_WOOD = 28;           //步道木材
    public static final int CATE_FOOTPATH_WATERPROOF = 29;           //步道防水
    public static final int CATE_FOOTPATH_ASPHALT = 30;           //步道沥青
    public static final int CATE_FOOTPATH_CEMENT = 31;           //步道水泥
    public static final int CATE_FOOTPATH_OTHER = 32;           //步道其他


    /**
     * 审定申请
     */
    public static final int STATUS_AUTH_NEW = 1;

    /**
     * 合同缴费
     */
    public static final int STATUS_AUTH_PREPAID = 2;

    /**
     * 上传资料
     */
    public static final int STATUS_AUTH_RES = 3;

    /**
     * 派选专家
     */
    public static final int STATUS_AUTH_EXPERT = 4;

    /**
     * 二次派选
     */
    public static final int STATUS_AUTH_SECOND_EXPERT = 5;

    /**
     * 颁发证书
     */
    public static final int STATUS_AUTH_SEND_CERT = 6;

    /**
     * 工厂检查
     */
    public static final int STATUS_AUTH_FACTORY = 7;

    /**
     * 选派检测和测绘机构
     */
    public static final int STATUS_AUTH_MAPPING= 8;

    /**
     * 检测和测绘结果
     */
    public static final int STATUS_AUTH_MAPPING_RESULT = 9;

    /**
     * WA审核
     */
    public static final int STATUS_WA = 10;

    /**
     * 面层实验室结果
     */
    public static final Integer STATUS_SURFACE_RESULT = 11;

    /**
     * 选派专家现场评定
     */
    public static final Integer STATUS_EXPERT_AUTH = 12;



    /**
     * 作废
     */
    public static final int STATUS_AUTH_CANCEL = -1;


    /**
     * 作废
     */
    public static final int STATUS_CURRENT_CANCEL = -1;

    /**
     * 等待提交
     */
    public static final int STATUS_CURRENT_WAIT_COMMIT = 0;

    /**
     * 等待审核
     */
    public static final int STATUS_CURRENT_WAIT_AUTH = 1;

    /**
     * 初审失败
     */
    public static final int STATUS_CURRENT_AUTH_NO = 2;

    /**
     * 待付款
     */
    public static final int STATUS_CURRENT_WAIT_PAY = 3;

    /**
     * 申请付款
     */
    public static final int STATUS_CURRENT_PAYING = 4;

    /**
     * 付款驳回
     */
    public static final int STATUS_CURRENT_PAYING_NO = 5;

    /**
     * 待上传资料
     */
    public static final int STATUS_CURRENT_WAIT_RES = 6;

    /**
     * 资料待审核
     */
    public static final int STATUS_CURRENT_RES = 7;

    /**
     * 上传驳回
     */
    public static final int STATUS_CURRENT_RES_NO = 8;

    /**
     * 待选派专家
     */
    public static final int STATUS_CURRENT_WAIT_EXPERT = 9;

    /**
     * 待上传验收报告
     */
    public static final int STATUS_CURRENT_WAIT_CHECK = 10;

    /**
     * 已上传报告
     */
    public static final int STATUS_CURRENT_ALREADY_CHECK = 11;

    /**
     * 已上传报告拒绝
     */
    public static final int STATUS_CURRENT_ALREADY_CHECK_NO = 12;

    /**
     * 待颁发证书
     */
    public static final int STATUS_CURRENT_WAIT_CERT = 13;

    /**
     * 完成
     */
    public static final int STATUS_CURRENT_SEND_CERT = 14;

    /**
     * 实验室待上传
     */
    public static final int STATUS_CURRENT_LAB_WAIT_REPORT = 15;

    /**
     * 实验室待审核
     */
    public static final int STATUS_CURRENT_LAB_REPORT = 16;

    /**
     * 实验室拒绝
     */
    public static final int STATUS_CURRENT_LAB_REPORT_NO = 17;


    /**
     * 初次审定
     */
    public static final int TYPE_AUTH_FIRST = 1;

    /**
     * 续证
     */
    public static final int TYPE_AUTH_RENEW = 2;


    /**
     * 面层升级
     */
    public static final int TYPE_AUTH_UP = 3;


    /**
     * 本单初审
     */
    public static final int BILL_CURRENT_AUTH_FIRST = 1;

    /**
     * 本单复审
     */
    public static final Integer BILL_CURRENT_AUTH_RECHECK = 2;

    /**
     * 专家现场检测拒绝最大次数
     */
    public static final int MAX_EXPERT_CHECK_REFUSE = 2;



    public static final int AUTH_RENEW_SURFACE = 7;
    public static final int AUTH_RENEW_EQUIPMENT = 8;
    public static final int AUTH_RENEW_SOC = 9;
    public static final int ARTICLE_ABOUT = 10;

    public static final int SITE_SECOND_GAP_LONG_JUMP = 1;
    public static final int SITE_SECOND_GAP_TRIPLE_JUMP = 2;
    public static final int SITE_SECOND_GAP_HIGH_JUMP = 3;
    public static final int SITE_SECOND_GAP_POLE_JUMP = 4;
    public static final int SITE_SECOND_GAP_SHOT = 5;
    public static final int SITE_SECOND_GAP_DISCUS = 6;
    public static final int SITE_SECOND_GAP_JAVELIN = 7;
    public static final int SITE_SECOND_GAP_WEIGHT_THROW = 8;
    public static final int SITE_SECOND_GAP_OBSTACLE = 9;

    public static final int TIMER_LOCATION_START = 1;
    public static final int TIMER_LOCATION_DESTINATION = 2;
    public static final int TIMER_LOCATION_TEN_KM = 3;
    public static final int TIMER_LOCATION_FIFTEEN_KM = 4;
    public static final int TIMER_LOCATION_TWENTY_KM = 5;
    public static final int TIMER_LOCATION_HALFWAY = 6;
    public static final int TIMER_LOCATION_TWENTY_FIVE_KM = 7;
    public static final int TIMER_LOCATION_HUNDRED_KM = 8;
    public static final int TIMER_LOCATION_TURNING_POINT = 9;
    public static final int TIMER_LOCATION_OTHER = 10;

    public static final int CERT = 1;
    public static final int CRYSTAL = 2;
    public static final int INVOICE_TYPE_COMMON = 1;
    public static final int INVOICE_TYPE_DEDICATED = 2;

}
