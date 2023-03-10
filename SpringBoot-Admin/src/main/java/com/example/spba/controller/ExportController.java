package com.example.spba.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.spba.service.ExportLogService;
import com.example.spba.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ExportController
{
    @Autowired
    private ExportLogService exportLogService;

    /**
     * 获取省份列表
     * @param start
     * @param end
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/export/logs")
    public R getErrorLogList(String start, String end,
                             @RequestParam(name = "page", defaultValue = "1") Integer page,
                             @RequestParam(name = "size", defaultValue = "15") Integer size)
    {
        HashMap where = new HashMap();
        where.put("start", start);
        where.put("end", end);

        Page<HashMap> pages = new Page<>(page, size);
        Page<HashMap> list = exportLogService.getList(pages, where);

        return R.success(list);
    }
}
