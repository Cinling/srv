package cn.cinling.srv.mapper;

import cn.cinling.srv.entity.SystemMonitorEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMonitorMapper {
    List<SystemMonitorEntity> SelectByLimit(@Param("skip") int skip, @Param("limit") int limit);
}
