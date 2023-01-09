package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@name='username']") private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@class='_acan _aiit _acap _aijb _acas _aj1-']")private WebElement btn_login;

	public WebElement getTxt_email() {
		return txt_email;
	}

	
	public WebElement getTxt_password() {
		return txt_password;
	}

	
	public WebElement getBtn_login() {
		return btn_login;
	}

	
	
	

}
