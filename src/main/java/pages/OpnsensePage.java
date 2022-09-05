package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OpnsensePage {

    public OpnsensePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[normalize-space()='Dashboard']")
    public WebElement dashboardMenudisplayed;

    @FindBy(xpath = "/html/body/main/aside/div/nav/div/div/div[8]/a[1]/div/div/div[1]")
    public WebElement dashboardMenu;

    @FindBy(xpath = "//div[contains(text(),'5 Minutes')]")
    public WebElement refreshIntervalDropdown;

    @FindBy(xpath = " //span[normalize-space()='15 Minutes']")
    public WebElement select15minDropdown;

    @FindBy(xpath = "//a[normalize-space()='Refresh Reports']")
    public WebElement refreshButton1;


    @FindBy(xpath = "//div[contains(text(),'Last 30 Days')]")
    public WebElement reportIntervalDropdown;

    @FindBy(xpath = "//span[normalize-space()='Last 7 Days']")
    public WebElement select7DaysDropdown;


    @FindBy(xpath = " //a[@class='btn btn-default pull-right au-target']")
    public WebElement addSortChart;

    @FindBy(xpath = "//input[@au-target-id='1136']")
    public WebElement webTopCategoriesCheckBox;

    @FindBy(xpath = "//a[@id='reportFilterBtn_Id']")
    public WebElement saveChanges;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/button")
    public WebElement refreshButton2;


    //input[contains(@id, ‘subscribe’)]
    //*input[contains(@name,'Email')]
    //input[starts-with(@id, ‘submit_’)]
    //button[starts-with(@id, 'save') and contains(@class,'publish')]

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy(xpath = "//input[@id='usernamefld']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='passwordfld']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='Add Filter']")
    public WebElement addFilterButton;

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    public WebElement appCatDropdown;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/reports-filter/div[2]/div/div/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span")
    public WebElement appNamedrpdwn;

    @FindBy(xpath = "//input[@class='form-control au-target']")
    public WebElement textbox;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/reports-filter/div[2]/div/div/div[3]/button[2]")
    public WebElement addbutton;

    @FindBy(xpath = "//reports-filter[@class='au-target']//div[@role='alert']//div[1]")

    public WebElement googleDisplayed;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[2]/router-view[1]/reports-filter[1]/div[1]/div[3]/i[3]")
    public WebElement removeFilter;


    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[4]/router-view/compose[1]/div/div[1]/i[2]")
    public WebElement mailSign;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div")
    public WebElement messageOfMailSign;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement okButton;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[4]/router-view/compose[1]/div/div[1]/i[1]")
    public WebElement maximizeSign;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[4]/router-view/compose[1]/div/div[1]/div[2]/button/div/div/div")
    public WebElement maxDisplayed;

    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='Top 5']")
    public WebElement selectTop5;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[4]/router-view/compose[1]/div/div[1]/i[1]")
    public WebElement closeMaximize;

    @FindBy(xpath = "//div[normalize-space()='App Categories Breakdown']")
    public WebElement appBreakdown;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[2]/compose[22]/div/div[2]/canvas")
    public WebElement networkManagement;

    @FindBy(xpath = "//div[contains(text(),'Reports')]")
    public WebElement reportMenu;
    @FindBy(xpath = "//label[normalize-space()='Reports']")
    public WebElement reportHeader;
    @FindBy(xpath = "//a[@id='Connection_explorer_btn_id']")
    public WebElement liveSessionsExplorer;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[2]/router-view[1]/connection-sessions[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")
    public WebElement sessionDetailsHeader;
    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/button")
    public WebElement sortBy;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div/ul/li[4]/a/span")
    public WebElement protocol;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div/button")
    public WebElement descendingdropdwn;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div/div/ul/li[1]/a/span")
    public WebElement selectdescending;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div/button")
    public WebElement showColumns;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div/div/form/label[6]/input")
    public WebElement srcMac;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[2]/div[1]/div/div/abp-datetime-picker/div/input")
    public WebElement startTime;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[2]/div[2]/div/div/abp-datetime-picker/div/input")
    public WebElement endTime;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/button")
    public WebElement filterBy;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/div/div/ul/li[2]/a/span")
    public WebElement sourceIp;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[2]/div[2]/div[3]/div/div[3]/a")
    public WebElement reportSearchButton;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/connection-sessions/div/div/div/div[1]/button/span")
    public WebElement reportCloseMenu;

    @FindBy(xpath = "/html/body/main/aside/div/nav/div/div/div[8]/a[2]/div/div/div[1]")
    public WebElement statusMenu;

    @FindBy(xpath = "//label[normalize-space()='Status']")
    public WebElement statusVerify;

    @FindBy(xpath = "//a[@click.delegate=\"checkUpdates('engine')\"]")
    public WebElement checkUpdates;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/notice-check/div[2]/update-check/div[2]/div/div/div[2]/div[1]")
    public WebElement checkUpdatesmessage;


    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/notice-check/div[2]/update-check/div[2]/div/div/div[3]/div/div/button[1]")
    public WebElement closeCheckUpdatesMessage;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div[4]/div[2]/table/tbody/tr[3]/td[5]/label/i")
    public WebElement cloudAgent;

    @FindBy(xpath = "//*[contains(text(), 'Configuration has been changed successfully.')]")
    public WebElement cloudAgentToasterMessage;

    @FindBy(xpath = " /html/body/main/div/header/div/ul/li[1]/h1/label")
    public WebElement dashboardHeader;

    @FindBy(xpath = "//div[@class='modal fade p-0 o-y-hidden au-target in']//div[@class='modal-header']//span[@aria-hidden='true'][normalize-space()='×']")
    public WebElement closeMenu;

    @FindBy(xpath = "/html/body/main/aside/div/nav/div/div/div[8]/a[4]/div/div/div[1]")
    public WebElement policyMenu;

    @FindBy(xpath = "/html/body/main/div/header/div/ul/li[1]/h1/label")
    public WebElement policyVerify;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/div[3]/table/tbody/tr/td[3]/label/i")
    public WebElement deselectStatuspolicy;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div")
    public WebElement deselectStatusMessage;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement deselectOkButton;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/div[3]/table/tbody/tr/td[8]/a[1]")
    public WebElement statusActionButton;

    @FindBy(xpath = "/html/body/main/div/header/div/ul/li[1]/h1/label")
    public WebElement verifyPoliciesDefault;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div/table/tbody/tr[1]/td[1]/div/table/tbody/tr[2]/td/div[1]/div[2]/label/i")
    public WebElement blockPhishingService;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/ul[2]/li[5]/a")
    public WebElement exclusionPolicy;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[1]/div[3]/div[1]/div/div[2]/div[1]/input")
    public WebElement whitelist;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[1]/div[3]/div[1]/div/div[2]/div[1]/a[2]")
    public WebElement whitelistAddButton;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[1]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[3]/input")
    public WebElement globalCheckbox;
    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[1]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/a/i")
    public WebElement globalActionCheckBox;


    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[1]/div[3]/div[1]/div/div[2]/div[4]/div/a")
    public WebElement deleteListPolicy;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/router-view/router-view/div[2]/a[2]")
    public WebElement saveChangesPolicy;

    @FindBy(xpath = "//*[contains(text(), 'Configuration has been changed successfully.')]")
    public WebElement policyToastContainerMessage;
}
