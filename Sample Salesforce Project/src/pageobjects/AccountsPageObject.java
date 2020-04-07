package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AccountsPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceTest"
     )             
public class AccountsPageObject {

	@LinkType()
	@FindBy(xpath = "//a/span[text()='Accounts']")
	public WebElement Accounts;
	
	@LinkType()
	@FindBy(xpath = "//a[@title='New']")
	public WebElement New;
	@FindBy(xpath = "//label[span[text()='Account Name']]/following-sibling::input")
	@TextType()
	public WebElement Name;
	@FindBy(xpath = "(//button/span[text()='Save'])[2]")
	@ButtonType()
	public WebElement Save;
	@LinkType()
	@FindBy(xpath = "//a/span[text()='Accounts']")
	public WebElement Accounts12;
			
}
