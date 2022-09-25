package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZenarmorConfigPages {

    public ZenarmorConfigPages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/main/aside/div/nav/div/div/a[8]")
    public WebElement zenarmorMenu;

    @FindBy(xpath = "//*[@id=\"Zenarmor\"]/a[5]/div/div/div[1]")
    public WebElement configMenu;

    @FindBy(xpath = "/html/body/main/div/header/div/ul/li[1]/h1/label")
    public WebElement configMenuDisplayed ;

    @FindBy(xpath = "//a[@class='au-target'][normalize-space()='General']")
    public WebElement generalTab;

    @FindBy(xpath = "//label[contains(text(),'Routed Mode (L3 Mode, Reporting + Blocking) with e')]//input[@type='radio']")
    public WebElement deploymentEmulated;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/interface-select/div/table/tbody/tr/td/a")
    public WebElement  refreshInterfaces;

    @FindBy(xpath = "//select[@id='selectFlavorId']")
    public WebElement deploymentSize;

    @FindBy(xpath = "//select[@id='selectseverityLevelId']")
    public WebElement loggerLevel ;

    @FindBy(xpath = "//select[@id='selectRotationId']")
    public WebElement loggerRotation;


    @FindBy(xpath = "//select[@id='selectRetireId']")
    public WebElement loggerRetire;

    @FindBy(xpath = "//a[normalize-space()='Delete Now']")
    public WebElement deleteNow;

    @FindBy(xpath = "//*[contains(text(),'Deleted log files for 5 days')]")
    public WebElement deleteToastContMessage ;


    @FindBy(xpath = "//a[@class='btn btn-default m-t-10 au-target']")
    public WebElement createNewToken;

    @FindBy(xpath = "//i[@class='fa fa-minus-square']")
    public WebElement deleteToken ;

      @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]")
      public WebElement verifyDeleteToken ;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button[2]")
    public WebElement tokenDeleteMessageYes ;

    @FindBy(xpath = "//a[@class='au-target btn btn-primary'] ")
    public WebElement saveChanges ;
   
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div")
     public WebElement configSuccesfulMessage ;

    @FindBy(xpath ="/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement  refreshButton ;


    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/ul/li[2]/a")
    public WebElement ctiMenu ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/thead/tr/th[1]")
    public WebElement verifyCTIDisplayed;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/tbody/tr[1]/td[2]/label/i")
    public WebElement enabledButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]")
    public WebElement verifyAreYouSure;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button[1]")
    public WebElement cancelButton ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/tbody/tr[2]/td[2]/a")
    public WebElement clearCloudCacheButton;

    @FindBy(xpath = " //*[contains(text(),'Cloud cache cleaned')]")
    public WebElement clearCacheMsg ;


    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/tbody/tr[3]/td[2]/div[1]/input")
    public WebElement textbox ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/tbody/tr[4]/td[2]/table/tbody/tr[3]/td[1]/label/i")
    public WebElement  usEast;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]")
    public WebElement warning ;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement okButton;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/cloud-config/div/table/tbody/tr[4]/td[2]/a")
    public WebElement recheckNode;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/div/table/tbody/tr/td[2]/a")
    public WebElement saveChngs ;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div")
    public WebElement successMsg ;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement refreshButtn ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/div/table/thead/tr/th[2]/a")
    public WebElement privacy ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/ul/li[3]/a")
    public WebElement updateHealthMenu;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/health-config/div/table/tbody/tr[1]/td[2]/label/i")
    public WebElement enabled ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/health-config/div/table/tbody/tr[2]/td[2]/label/i")
    public WebElement heartbeat ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/health-config/div/table/tbody/tr[4]/td[2]/label/i")
    public WebElement helpSvn ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/div/table/thead/tr/th[2]/a")
    public WebElement privacyPolicy ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/updates-config/div/table/tbody/tr[1]/td[2]/label/i")
    public WebElement checkUpdate ;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/updates-config/div/table/tbody/tr[2]/td[2]/label/i")
    public WebElement  appDb;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/updates-config/div/table/tbody/tr[3]/td[2]/label/i")
    public WebElement coreFile;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/updates-config/div/table/tbody/tr[4]/td[2]/select")
    public WebElement  swap;

    @FindBy(xpath = "/html/body/main/div/section/div/div/section/div[2]/router-view/div/router-view/div/table/tbody/tr/td[2]/a")
    public WebElement savechanges ;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]")
    public WebElement successfulMsg ;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div/div/button")
    public WebElement refreshUpdateHealth ;












}






///html/body/div[3]/div/div/div[3]/div/div/button



