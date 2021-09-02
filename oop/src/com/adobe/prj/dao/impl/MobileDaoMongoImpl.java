package com.adobe.prj.dao.impl;

import com.adobe.prj.dao.MobileDao;
import com.adobe.prj.entity.Mobile;

public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("mongodb Store!!!");
	}

}
