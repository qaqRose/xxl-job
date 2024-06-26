package com.xxl.job.admin.core.trigger;

import com.xxl.job.admin.core.util.I18nUtil;

/**
 * trigger type enum
 * 任务调度类型
 * @author xuxueli 2018-09-16 04:56:41
 */
public enum TriggerTypeEnum {

    /**
     * 手动,管理业务上的执行一次
     */
    MANUAL(I18nUtil.getString("jobconf_trigger_type_manual")),
    CRON(I18nUtil.getString("jobconf_trigger_type_cron")),
    /**
     * 调度失败重试
     */
    RETRY(I18nUtil.getString("jobconf_trigger_type_retry")),

    PARENT(I18nUtil.getString("jobconf_trigger_type_parent")),
    API(I18nUtil.getString("jobconf_trigger_type_api")),

    /**
     * 调度过期，再次调度
     */
    MISFIRE(I18nUtil.getString("jobconf_trigger_type_misfire"));

    private TriggerTypeEnum(String title){
        this.title = title;
    }
    private String title;
    public String getTitle() {
        return title;
    }

}
