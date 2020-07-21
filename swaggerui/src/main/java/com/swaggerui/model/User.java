package com.swaggerui.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaolong
 * @create 2020-07-20 12:07
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户实体类")
public class User {
    //用户名
    @ApiModelProperty("用户名")
    private String name;

    //密码
    @ApiModelProperty("密码")
    private String pwd;
}
