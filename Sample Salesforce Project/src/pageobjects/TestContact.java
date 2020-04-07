package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TestContact"                                
     , summary=""
     , relativeUrl=""
     , connection="CGI"
     )             
public class TestContact {

	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Search Salesforce']/parent::div/parent::div/parent::div/parent::header/parent::div/parent::div/parent::body")
	public WebElement New;
	@LinkType()
	@AuraBy(componentXPath = "//ui:menuTriggerLink[@aura:id= 'actionsMenuTrigger']")
	public WebElement trigger;
	@LinkType()
	@FindByLabel(label = "New")
	public WebElement New1;
			
}
