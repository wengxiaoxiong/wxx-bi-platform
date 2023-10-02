package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.model.dto.chart.ChartQueryRequest;
import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.Post;

/**
* @author wengxiaoxiong
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2023-10-02 23:01:33
*/
public interface ChartService extends IService<Chart> {

    public QueryWrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest);
}
