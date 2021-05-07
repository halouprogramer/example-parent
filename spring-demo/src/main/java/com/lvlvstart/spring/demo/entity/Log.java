package com.lvlvstart.spring.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * log日志表
 * </p>
 *
 * @author lvzishu@hengdubank.com
 * @since 2021-05-07
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("log")
public class Log extends Model<Log> {

    private static final long serialVersionUID = 1L;

      /**
     * 主键ID
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 请求地址
     */
      private String requestUrl;

      /**
     * 请求参数
     */
      private String requestData;

      /**
     * 响应数据
     */
      private String responseData;

      /**
     * 接口方法名
     */
      private String clazzMethod;

      /**
     * 状态：10-失效，20-有效
     */
      private String status;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 最后更新时间
     */
      private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
          return this.id;
      }

}
