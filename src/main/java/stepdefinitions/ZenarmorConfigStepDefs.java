package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.OpnsensePage;
import pages.ZenarmorConfigPages;
import utilities.ConfigReader;
import utilities.Driver;


public class ZenarmorConfigStepDefs {
    ZenarmorConfigPages configPages=new ZenarmorConfigPages();
    OpnsensePage opnsensePage=new OpnsensePage();

    @Given("Client goes to url")
    public void clientGoesToUrl() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        Thread.sleep(3000);
    }

    @And("Client enters username and password")
    public void clientEntersUsernameAndPassword() throws InterruptedException {
        opnsensePage.detailsButton.click();
        opnsensePage.proceedLink.click();
        Thread.sleep(5000);
        opnsensePage.userName.sendKeys("root");
        opnsensePage.password.sendKeys("opnsense");
        opnsensePage.loginButton.click();
        Thread.sleep(5000);
    }

    @When("User navigates to Zenarmor and clicks Configuration")
    public void user_navigates_to_zenarmor_and_clicks_configuration() throws InterruptedException {

        configPages.configMenu.click();
        Thread.sleep(5000);

    }
    @When("User verifies that Configuration page is displayed .User selects General Menu")
    public void user_verifies_that_configuration_page_is_displayed_user_selects_general_menu() throws InterruptedException {
        Assert.assertTrue(configPages.configMenuDisplayed.isDisplayed());
        configPages.generalTab.click();
        Thread.sleep(5000);


    }
    @When("User  clicks on Emulated netmap driver on Deployment mode")
    public void user_clicks_on_emulated_netmap_driver_on_deployment_mode() {
        Driver.waitAndClick(configPages.deploymentEmulated,3);
        Driver.wait(5);

    }
    @When("User clicks on refresh interfaces list")
    public void user_clicks_on_refresh_interfaces_list() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(configPages.refreshInterfaces);
        Thread.sleep(5000);

    }
    @When("User selects Medium on Deployment menu")
    public void user_selects_medium_on_deployment_menu() throws InterruptedException {
        Driver.clickWithJS(configPages.deploymentSize);
        Select select=new Select(configPages.deploymentSize);
        select.selectByVisibleText("Medium (Max 100 Devices)");
        Thread.sleep(3000);

    }
    @When("User selects options from dropdown")
    public void user_selects_options_from_dropdown() throws InterruptedException {
        Driver.clickWithJS(configPages.loggerLevel);
        Thread.sleep(5000);
        Select select=new Select(configPages.loggerLevel);
        select.selectByVisibleText("DEBUG2");
        Thread.sleep(3000);
        Driver.clickWithJS(configPages.loggerRotation);
        Select select1=new Select(configPages.loggerRotation);
        select1.selectByVisibleText("1 Day");
        Driver.wait(2);
        Driver.clickWithJS(configPages.loggerRetire);
        Select select2=new Select(configPages.loggerRetire);
        select2.selectByVisibleText("5 days");
        Thread.sleep(5000);

    }

    @And("User clicks on Delete now button and verify the delete log message")
    public void userClicksOnDeleteNowButtonAndVerifyTheDeleteLogMessage() throws InterruptedException {

        configPages.deleteNow.click();
        Thread.sleep(2000);
        Assert.assertTrue(configPages.deleteToastContMessage.isDisplayed());

    }
    @When("User clicks create new token button")
    public void userClicksCreateNewTokenButton() throws InterruptedException {
        Thread.sleep(5000);
        configPages.createNewToken.click();
    }
    @And("User clicks delete token and verify the message is displayed")
    public void userClicksDeleteTokenAndVerifyTheMessageIsDisplayed() throws InterruptedException {
        configPages.deleteToken.click();
        Assert.assertTrue(configPages.verifyDeleteToken.isDisplayed());
        Thread.sleep(4000);
    }

    @When("User clicks yes and click on save changes")
    public void user_clicks_yes_and_click_on_save_changes() throws InterruptedException {
        Driver.waitAndClick(configPages.tokenDeleteMessageYes,3);
        Thread.sleep(4000);
        configPages.saveChanges.click();

    }

    @Then("User clicks on refresh button")
    public void user_clicks_on_refresh_button() throws InterruptedException {
        Thread.sleep(10000);
        configPages.refreshButton.click();

    }


    @When("User  selects Cloud Threat Intel and verifies the page is displayed")
    public void user_selects_cloud_threat_intel_and_verifies_the_page_is_displayed() throws InterruptedException {
        configPages.configMenu.click();
        Thread.sleep(2000);
        configPages.ctiMenu.click();
        Assert.assertTrue(configPages.verifyCTIDisplayed.isDisplayed());
        Thread.sleep(3000);

    }
    @When("User clicks Enabled option and verifies the message is displayed")
    public void user_clicks_enabled_option_and_verifies_the_message_is_displayed() throws InterruptedException {
        Driver.waitAndClick(configPages.enabledButton);
        Thread.sleep(3000);
        Assert.assertTrue(configPages.verifyAreYouSure.isDisplayed());

    }
    @When("User clicks ok and clicks clear cloud cache button and verify the message is displayed")
    public void user_clicks_ok_and_clicks_clear_cloud_cache_button_and_verify_the_message_is_displayed() throws InterruptedException {
        Driver.waitAndClick(configPages.cancelButton,2);
        Thread.sleep(5000);
        Driver.waitAndClick(configPages.clearCloudCacheButton,2);
        Assert.assertTrue(configPages.clearCacheMsg.isDisplayed());
        Thread.sleep(3000);

    }
    @When("User enters the domain name to the text box")
    public void user_enters_the_domain_name_to_the_text_box() throws InterruptedException {
        Driver.waitAndSendText(configPages.textbox,"www.gmail.com");
        Thread.sleep(4000);

    }
    @When("User clicks cloud node name and verify the message Then  clicks  ok")
    public void user_clicks_cloud_node_name_and_verify_the_message_then_clicks_ok() throws InterruptedException {
        Driver.clickWithJS(configPages.usEast);
        Assert.assertTrue(configPages.warning.isDisplayed());
        Thread.sleep(5000);
        Driver.waitAndClick(configPages.okButton,2);

    }
    @When("User clicks re-check  nodes status")
    public void user_clicks_re_check_nodes_status() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(configPages.recheckNode);

    }

    @When("User clicks Privacy policy and verify the page is displayed")
    public void userClicksPrivacyPolicyAndVerifyThePageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        String page = Driver.getDriver().getWindowHandle();
        Driver.waitAndClick(configPages.privacy);

        //        Switch between TABS
        Thread.sleep(7000);
        Driver.getDriver().switchTo().window(page);
        Thread.sleep(5000);
    }

    @When("User clicks save changes and verify the message is displayed")
    public void user_clicks_save_changes_and_verify_the_message_is_displayed() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(configPages.saveChngs);
        Assert.assertTrue(configPages.successMsg.isDisplayed());
        Thread.sleep(2000);

    }
    @Then("User click on refresh button")
    public void user_click_on_refresh_button() {
        Driver.waitAndClick(configPages.refreshButtn,2);
    }

    @When("User clicks Updates&Health Menu")
    public void user_clicks_updates_health_menu() throws InterruptedException {
        Driver.waitAndClick(configPages.updateHealthMenu,2);
        Thread.sleep(2000);

    }
    @When("User clicks on Enabled ,engine heartbeat, help button")
    public void user_clicks_on_enabled_engine_heartbeat_help_button() throws InterruptedException {
        Driver.waitAndClick(configPages.enabled);
        Thread.sleep(5000);
        Driver.waitAndClick(configPages.heartbeat,2);
        Thread.sleep(5000);
        Driver.waitAndClick(configPages.helpSvn);
        Thread.sleep(3000);



    }
    @When("User clicks on check updates,app database and core file button")
    public void user_clicks_on_check_updates_app_database_and_core_file_button() throws InterruptedException {
        Driver.clickWithJS(configPages.checkUpdate);
        Thread.sleep(3000);
        Driver.waitAndClick(configPages.appDb,2);
        Thread.sleep(3000);
        Driver.waitAndClick(configPages.coreFile);
        Thread.sleep(3000);


    }
    @When("User selects max swap utilization dropdown")
    public void user_selects_max_swap_utilization_dropdown() {
        Driver.clickWithJS(configPages.swap);
        Select select1=new Select(configPages.swap);
        select1.selectByVisibleText("60");

    }
    @When("User clicks policy link")
    public void user_clicks_policy_link() throws InterruptedException {
        Thread.sleep(5000);
        String home= Driver.getDriver().getWindowHandle();
        Driver.clickWithJS(configPages.privacyPolicy);

        //        Switch between TABS
        Thread.sleep(7000);
        Driver.getDriver().switchTo().window(home);
        Thread.sleep(5000);

    }
    @When("User clicks  save chnges and verify the sussessful message")
    public void user_clicks_save_chnges_and_verify_the_sussessful_message() throws InterruptedException {
        Driver.clickWithJS(configPages.savechanges);
        Thread.sleep(10000);

        Assert.assertTrue(configPages.successfulMsg.isDisplayed());
        Thread.sleep(5000);
    }
    @When("User clicks on Refresh bttn")
    public void user_clicks_on_refresh_bttn() throws InterruptedException {
        Driver.clickWithJS(configPages.refreshUpdateHealth);
        Thread.sleep(5000);

    }
    @Then("User closes the driver")
    public void user_closes_the_driver() {
        Driver.closeDriver();

    }


}






