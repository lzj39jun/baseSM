package com.wutu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 实体父类
 */
@Data
public class BaseEntity<T extends Model> extends Model<T> {

    /**
     * id
     */
    @TableId(value="id", type= IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;
    /**
     * 是否删除
     */
    @TableLogic
    private Integer deleted;

    public Long getUpdateTime(){
        if(this.updateTime!=null){
            return this.updateTime;
        }
        return System.currentTimeMillis();
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
