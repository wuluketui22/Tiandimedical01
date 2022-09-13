package com.whackon.witmed.dao.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.system.admin.pojo.entity.SystemMedrec;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员对应患者实体 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface SystemMedrecDao extends BaseMapper<SystemMedrec> {
}
