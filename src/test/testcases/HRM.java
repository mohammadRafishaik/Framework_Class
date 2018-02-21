package test.testcases;

public class HRM extends UserLibrary{
	public static void Hrm_Login() {
		
		plog="able tpo Launch URL";
		flog="Unable to enter Launch Url";
		OpenUrl(getData("URL"));
		
		plog="able to enter UserName";
		flog="Unable to enter UserName";
		SetText(".//*[@id='txtUsername']", getData("UserName"));
		
		plog="Able to enter Password";
		flog="Unable top enter Password";
		SetText(".//*[@id='txtPassword']", getData("Password"));
		
		plog="able to click on Login Button";
		flog="Unable to login Button";
		ClickElement(".//*[@id='btnLogin']");
		
		plog="Able to handle mouseoveraction";
		flog="unable to handle mouse over action";
		Mouseover_Action(".//*[@id='menu_leave_viewLeaveModule']/b");
		
		ClickElement(".//*[@id='menu_leave_applyLeave']");
		
		SelectOPtionByValue(".//*[@id='applyleave_txtLeaveType']", getData("LeaveType"));
		
		
	}

}
