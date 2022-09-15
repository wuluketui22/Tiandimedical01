package com.whackon.witmed.dao.referral.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.referral.pojo.entity.ReferralHospital;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）医院 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface ReferralHospitalDao extends BaseMapper<ReferralHospital> {
}
