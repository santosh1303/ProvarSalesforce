package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ContactUs"                                
     , summary=""
     , relativeUrl=""
     , connection="CGI"
     )             
public class ContactUs {

	@FindBy(xpath = "//div[@id='block-cgicontactusblockcontact']/a")
	@LinkType()
	public WebElement cONTACT;
	@TextType()
	@FindBy(xpath = "//input[@name='name']")
	public WebElement name;
	@TextType()
	@FindBy(xpath = "//input[@name='company']")
	public WebElement company;
	@TextType()
	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@name='phone']")
	public WebElement phone;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='relationship_to_cgi[select]']")
	public WebElement relationshipToCGI;
	@TextType()
	@FindBy(xpath = "//textarea[@name='message']")
	public WebElement message;
			
}
