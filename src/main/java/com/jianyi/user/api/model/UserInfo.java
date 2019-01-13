package com.jianyi.user.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserInfo implements Serializable {

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 状态：1-启用；2-警用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
