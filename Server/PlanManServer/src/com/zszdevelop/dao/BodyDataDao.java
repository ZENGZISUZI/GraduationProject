package com.zszdevelop.dao;

import com.zszdevelop.bean.ComsumeCCInfo;
import com.zszdevelop.bean.BodyData;

public interface BodyDataDao {
	public boolean modifyBodyData(int userId,BodyData baseData,boolean existGoalRecordUserid);
	public BodyData getBodyData(int userId);
	public boolean isExistGoalRecordUserid(int userId);
	
}
