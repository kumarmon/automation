package com.automate.FreeCRM.utilities;

import java.util.ArrayList;
import com.automate.FreeCRM.base.TestBase;	
import com.automate.FreeCRM.utilities.ExcelReader;

public class DataOperations extends TestBase {

	
	public DataOperations() {
		super();
	}
	
	ExcelReader excelObj = new ExcelReader(prop.getProperty("DataSheetLocation"));


	public ArrayList<Object[]> getLoginData() {
		ArrayList<Object[]> loginObj = new ArrayList<Object[]>();
		
		
		int loginDatarowCount = excelObj.getRowCount(prop.getProperty("LoginDataSheet"));

		for (int rowcount = 2; rowcount <= loginDatarowCount; rowcount++) {
			String loginUsername = excelObj.getCellData(prop.getProperty("LoginDataSheet"), "LoginUserName", rowcount);
			String loginPassword = excelObj.getCellData(prop.getProperty("LoginDataSheet"), "LoginPassword", rowcount);
			 Object ob[]= {loginUsername,loginPassword};
			 loginObj.add(ob);
		}
		return loginObj;
		

	}

}
