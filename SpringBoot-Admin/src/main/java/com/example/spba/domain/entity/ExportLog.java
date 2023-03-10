package com.example.spba.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExportLog  implements Serializable{
        @TableId(type = IdType.AUTO)
    private Long id;
    private String province;
    private int num;
    private double area;
    private  String extent;
@TableField(fill = FieldFill.INSERT)
private Date create_time;

}
