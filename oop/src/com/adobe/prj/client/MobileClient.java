package com.adobe.prj.client;

import com.adobe.prj.dao.MobileDao;
import com.adobe.prj.dao.MobileDaoFactory;
import com.adobe.prj.entity.Mobile;

// FrontEnd code
public class MobileClient {
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
//		MobileDao mobileDao = new MobileDaoMongoImpl(); // loose coupling ==> Strategy Pattern
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		mobileDao.addMobile(m);
	}

}
