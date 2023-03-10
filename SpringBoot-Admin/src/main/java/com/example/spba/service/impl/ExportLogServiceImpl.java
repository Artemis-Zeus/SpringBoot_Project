package com.example.spba.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.spba.dao.ExportLogMapper;
import com.example.spba.domain.entity.ExportLog;
import com.example.spba.service.ExportLogService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ExportLogServiceImpl extends ServiceImpl<ExportLogMapper, ExportLog> implements ExportLogService
{
    @Override
    public Page<HashMap> getList(Page page, HashMap params) {
        return this.baseMapper.getList(page, params);
    }
}
