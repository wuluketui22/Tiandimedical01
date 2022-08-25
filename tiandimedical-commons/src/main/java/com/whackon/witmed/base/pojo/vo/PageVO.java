package com.whackon.witmed.base.pojo.vo;

import com.whackon.witmed.base.util.BaseConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图信息</b>
 *
 * @author yan
 * @date 2022/8/24
 */
@Data
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -3458922961994208370L;
	private Integer pageNum;                // 当前页码
	private Integer pageSize;               // 每页显示数量
	private List<E> list;                   // 分页列表
	private Long totalCount;                // 总条数
	private Long totalPage;                 // 总页数

	public PageVO() {
	}
	public PageVO(Integer pageNum,Integer pageSize){
		// 判断所给定的当前页码是否有效
		if (pageNum!=null&&pageNum>0){
			// 所给定的当前页码有效
			this.pageNum=pageNum;
		}else {
			this.pageNum= BaseConstants.PAGE_NUM;
		}

		// 判断所给定的显示条数是否有效
		if (pageSize!=null&&pageSize>0){
			this.pageSize=pageSize;
		}else{
			this.pageSize=BaseConstants.PAGE_SIZE;
		}
	}
}
