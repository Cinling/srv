package cn.cinling.srv.schedule;

import cn.cinling.srv.entity.SystemMonitorEntity;
import cn.cinling.srv.service.system_monitor.SystemMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

@Component
public class SystemMonitorSchedule {
    @Autowired
    SystemMonitorService systemMonitorService;

    /**
     * 监控系统资源使用的情况
     */
    @Scheduled(cron="0 * * * * ?")
    public void Main() {
        // 获取系统内存总大小和使用情况
        OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        long memMaxMB = osmb.getTotalPhysicalMemorySize() / 1024 / 1024;
        long memUseMB = osmb.getFreePhysicalMemorySize() / 1024 / 1024;

        // 获取系统硬盘总大小和使用情况
        File[] roots = File.listRoots();//获取磁盘分区列表
        float diskMaxGB = 0;
        float diskFreeGB = 0;
        for (File file : roots) {
            diskMaxGB += file.getTotalSpace() / 1024.0 / 1024 / 1024;
            diskFreeGB += file.getFreeSpace() / 1024.0 / 1024 / 1024;
        }
        float diskUseGB = diskMaxGB - diskFreeGB;

        SystemMonitorEntity systemMonitorEntity = new SystemMonitorEntity();
        systemMonitorEntity.setMemoryTotal((int) memMaxMB);
        systemMonitorEntity.setMemoryUse((int) memUseMB);
        systemMonitorEntity.setDiskTotal(diskMaxGB);
        systemMonitorEntity.setDiskUse(diskUseGB);

        systemMonitorService.Add(systemMonitorEntity);
    }
}
