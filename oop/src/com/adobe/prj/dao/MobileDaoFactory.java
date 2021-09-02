package com.adobe.prj.dao;

import java.util.ResourceBundle;

public class MobileDaoFactory {
	private static String str  = "";
	
	static {
		ResourceBundle res = ResourceBundle.getBundle("config");
		str = res.getString("MOBILE_DAO").trim();
	}
	
	// factory method
	public static MobileDao getMobileDao() {
//		return new MobileDaoMongoImpl();
		try {
			return (MobileDao) Class.forName(str).newInstance();
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

