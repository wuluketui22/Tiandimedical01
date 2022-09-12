package com.whackon.witmed.patient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.patient.patient.pojo.entity.Patient;
import org.springframework.stereotype.Repository;

/**
 * <b></b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Repository
public interface PatientDao extends BaseMapper<Patient> {
}
