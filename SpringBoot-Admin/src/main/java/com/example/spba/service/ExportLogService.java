package com.example.spba.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.spba.domain.entity.ExportLog;

import java.util.HashMap;

public interface ExportLogService extends IService<ExportLog> {

    /**
     * 获取错误日志列表（分页）
     * @param page
     * @param params
     * @return
     */

    Page<HashMap> getList( Page page, HashMap params);
}
