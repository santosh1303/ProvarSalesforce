package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Page Object_ Task"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceTest"
     )             
public class MyPageObject_Task {

	@LinkType()
	@FindBy(xpath = "//a/span[text()='Tasks']")
	public WebElement Tasks;	
	@LinkType()
	@FindBy(xpath = "//a[@title='Show one more action']")
	public WebElement Show_one_more_action;		
	@LinkType()
	@FindBy(xpath = "//a[@title='New Task']")
	public WebElement NewTask;
	@TextType()
	@FindBy(xpath = "//label[text()='Subject']/following-sibling::div//input")
	public WebElement Subject;	
	@LinkType()
	@FindBy(xpath = "//*[@data-value='Send Letter']")
	public WebElement Datavalue_for_Subject;
	
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Change Date']")
	public WebElement changeDate;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Edit Comments']")
	public WebElement editComments;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Create Follow-Up Task']")
	public WebElement createFollowUpTask;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New']")
	public WebElement New;
			
}
