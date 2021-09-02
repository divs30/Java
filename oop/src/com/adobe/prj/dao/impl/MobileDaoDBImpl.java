package com.adobe.prj.dao.impl;

import com.adobe.prj.dao.MobileDao;
import com.adobe.prj.entity.Mobile;

public class MobileDaoDBImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored in rdbms!!!");
	}

}
