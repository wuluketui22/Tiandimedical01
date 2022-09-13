package com.whackon.witmed.dao.hospital;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.system.hospital.pojo.entity.HospitalInfo;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface HospitalInfoDao extends BaseMapper<HospitalInfo> {
}
