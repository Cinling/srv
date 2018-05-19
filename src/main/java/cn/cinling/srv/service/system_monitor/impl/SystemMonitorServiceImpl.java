package cn.cinling.srv.service.system_monitor.impl;

import cn.cinling.srv.entity.SystemMonitorEntity;
import cn.cinling.srv.mapper.SystemMonitorMapper;
import cn.cinling.srv.service.system_monitor.SystemMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("systemMonitorService")
public class SystemMonitorServiceImpl implements SystemMonitorService {
    @Autowired
    SystemMonitorMapper systemMonitorMapper;

    @Override
    public List<SystemMonitorEntity> GetByPage(int page, int rows) {
        int skip = (page - 1) * rows;
        return systemMonitorMapper.SelectByLimit(skip, rows);
    }
}
