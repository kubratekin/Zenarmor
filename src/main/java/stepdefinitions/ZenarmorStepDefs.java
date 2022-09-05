package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.OpnsensePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ZenarmorStepDefs {

    OpnsensePage opnsensePage = new OpnsensePage();
    Select select;
    ChromeDriver driver;


    @Given("User goes to url")
    public void userGoesToUrl() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        Thread.sleep(3000);
    }

    @And("User enters username and password")
    public void userEntersUsernameAndPassword() throws InterruptedException {
        opnsensePage.detailsButton.click();
        opnsensePage.proceedLink.click();
        Thread.sleep(3000);
        opnsensePage.userName.sendKeys("root");
        opnsensePage.password.sendKeys("opnsense");
        opnsensePage.loginButton.click();
    }


    @When("User verifies that Dashboard page is displayed")
    public void user_verifies_that_dashboard_page_is_displayed() {
        Assert.assertTrue(opnsensePage.dashboardMenudisplayed.isDisplayed());
        Driver.wait(2);

    }

    @When("User  clicks on Refresh Reports  button")
    public void user_clicks_on_refresh_reports_button() throws InterruptedException {
        opnsensePage.refreshButton1.click();
    }

    @When("User selects Refresh intervals dropdown and click on {int} minutes")
    public void user_selects_refresh_intervals_dropdown_and_click_on_minutes(Integer int1) {

        Driver.waitAndClick(opnsensePage.refreshIntervalDropdown, 2);
        Driver.waitAndClick(opnsensePage.select15minDropdown, 2);


    }

    @When("User selects Reports intervals dropdown and click on Last {int} days")
    public void user_selects_reports_intervals_dropdown_and_click_on_last_days(Integer int1) {
        Driver.waitAndClick(opnsensePage.reportIntervalDropdown, 2);
        Driver.waitAndClick(opnsensePage.select7DaysDropdown, 2);
        Driver.wait(3);

    }

    @When("User clicks on Add&Sort Charts dropdown and select Web -Top Categories")
    public void user_clicks_on_add_sort_charts_dropdown_and_select_web_top_categories() {
        opnsensePage.addSortChart.click();
        Driver.clickWithJS(opnsensePage.webTopCategoriesCheckBox);
        Driver.wait(2);


        //new WebDriverWait(driver, 10).until(ExpectedConditions.
        //      elementToBeClickable(By.xpath("//input[@id='srclang-selectized']"))).sendKeys("English");
        // new WebDriverWait(driver, 10).until(ExpectedConditions.
        // visibilityOfElementLocated(By.xpath("//select[@id='srclang' and @name='srclang']/option[contains(., 'English')]"))).click();


        // identify element
        // WebElement t=driver.findElement(By.xpath("//*[@name='continents']"));
        //Select class for dropdown
        // Select select = new Select(t);
        // select an item with text visible
        // select.selectByVisibleText("Australia");
        // select an item with item index
        //select.selectByIndex(1);

    }

    @Then("User clicks save changes and refresh the pages")
    public void user_clicks_save_changes_and_refresh_the_pages() throws InterruptedException {
        opnsensePage.saveChanges.click();
        Thread.sleep(2000);
        opnsensePage.refreshButton2.click();
    }

    @Given("User verifies Add filter is displayed")
    public void user_verifies_add_filter_is_displayed() {
        Assert.assertTrue(opnsensePage.addFilterButton.isDisplayed());

    }

    @Given("User clicks on Add  Filter button")
    public void user_clicks_on_add_filter_button() throws InterruptedException {
        Thread.sleep(2000);
        opnsensePage.addFilterButton.click();
    }

    @Given("User clicks on Application category dropdown and select Application name")
    public void user_clicks_on_application_category_dropdown_and_select_application_name() {
        Driver.waitAndClick(opnsensePage.appCatDropdown);
        Driver.clickWithJS(opnsensePage.appNamedrpdwn);
        Driver.wait(2);

    }

    @When("User clicks textbox and type Google and click on Add button")
    public void user_clicks_textbox_and_type_google_and_click_on_add_button() {
        Driver.waitAndClick(opnsensePage.textbox, 1);
        opnsensePage.textbox.sendKeys("Google");
        opnsensePage.addbutton.click();
        Driver.wait(2);
    }

    @When("User verifies Google is displayed")
    public void user_verifies_google_is_displayed() {
        Assert.assertTrue(opnsensePage.googleDisplayed.isDisplayed());

    }

    @Then("User clicks {string}")
    public void user_clicks(String string) throws InterruptedException {
        Thread.sleep(2000);
        opnsensePage.removeFilter.click();
    }

    @When("User clicks the mail symbol")
    public void user_clicks_the_mail_symbol() throws InterruptedException {
        Thread.sleep(3000);
        Driver.waitForClickablility(opnsensePage.mailSign, 10);
        opnsensePage.mailSign.click();
        Thread.sleep(1000);

    }

    @When("User should see the message {string}")
    public void user_should_see_the_message(String string) {
        Assert.assertTrue(opnsensePage.messageOfMailSign.isDisplayed());
        Driver.wait(2);
    }

    @When("User clicks OK button")
    public void user_clicks_ok_button() throws InterruptedException {
        Thread.sleep(1000);
        opnsensePage.okButton.click();

    }

    @When("User clicks the maximize sign and verifies the  part is maximized")
    public void user_clicks_the_maximize_sign_and_verifies_the_part_is_maximized() throws InterruptedException {
        Driver.waitAndClick(opnsensePage.maximizeSign, 2);
        Assert.assertTrue(opnsensePage.maxDisplayed.isDisplayed());
        Thread.sleep(2000);

    }

    @Then("User clicks the dropdown and selects Top {int}")
    public void user_clicks_the_dropdown_and_selects_top(Integer int1) {
        opnsensePage.maxDisplayed.click();
        Driver.clickWithJS(opnsensePage.selectTop5);
        Driver.wait(2);

    }

    @Then("User close the max page")
    public void userCloseTheMaxPage() {
        Driver.wait2(2);
        opnsensePage.closeMaximize.click();
    }

    @When("User clicks the Network Management in Donut chart")
    public void user_clicks_the_network_management_in_donut_chart() throws InterruptedException {
        Thread.sleep(1000);
        Driver.scrollIntoViewJS(opnsensePage.appBreakdown);
        Assert.assertTrue(opnsensePage.appBreakdown.isDisplayed());
        Thread.sleep(5000);
        // Driver.selectCanvasArea(0,0,-250,-250);
        opnsensePage.networkManagement.click();

    }

    @And("User  scrolls down  and up to  Menu")
    public void userScrollsDownAndUpToMenu() throws InterruptedException {
        Thread.sleep(2000);
        Driver.scrollIntoViewJS(opnsensePage.dashboardHeader);
        Assert.assertTrue(opnsensePage.dashboardHeader.isDisplayed());
    }

    @When("User clicks on Reports  on Zenarmor segment and verifies  the Report Header is displayed")
    public void user_clicks_on_reports_on_zenarmor_segment_and_verifies_the_report_header_is_displayed() throws InterruptedException {
        Driver.waitAndClick(opnsensePage.reportMenu);
        Thread.sleep(2000);
        Assert.assertTrue(opnsensePage.reportHeader.isDisplayed());

    }

    @When("User clicks on Live sessions Explorer button")
    public void user_clicks_on_live_sessions_explorer_button() throws InterruptedException {
        opnsensePage.liveSessionsExplorer.click();
        Thread.sleep(2000);

    }

    @When("User select Protocol from Sort by dropdown")
    public void user_select_protocol_from_sort_by_dropdown() {
        opnsensePage.sortBy.click();
        Driver.wait(2);
        Driver.clickWithJS(opnsensePage.protocol);

    }

    @When("User selects descending from dropdown")
    public void user_selects_descending_from_dropdown() throws InterruptedException {
        Thread.sleep(3000);
        opnsensePage.descendingdropdwn.click();
        Driver.clickWithJS(opnsensePage.selectdescending);

    }

    @When("User clicks on show columns  dropdown and unselect src mac")
    public void user_clicks_on_show_columns_dropdown_and_unselect_src_mac() {
        Driver.wait(2);
        opnsensePage.showColumns.click();
        Driver.clickWithJS(opnsensePage.srcMac);
    }

    @And("User clicks on the start time dropdown and select the {string}")
    public void userClicksOnTheStartTimeDropdownAndSelectThe(String date1) throws InterruptedException {
        opnsensePage.startTime.clear();
        Thread.sleep(2000);
        opnsensePage.startTime.sendKeys(date1+Keys.TAB);

    }

    @And("User clicks on the end time dropdown and select the {string}")
    public void userClicksOnTheEndTimeDropdownAndSelectThe(String date2) throws InterruptedException {
        opnsensePage.endTime.clear();
        Thread.sleep(2000);
        opnsensePage.endTime.sendKeys(date2);
    }

    @When("User selects source ip from filter by dropdown")
    public void user_selects_source_ip_from_filter_by_dropdown() {
        Driver.wait(2);
        opnsensePage.filterBy.click();
        Driver.clickWithJS(opnsensePage.sourceIp);

    }

    @Then("User clicks search button")
    public void user_clicks_search_button() {
        Driver.wait(2);
        opnsensePage.reportSearchButton.click();
    }

    @Then("Usr closes the page")
    public void usrClosesThePage() throws InterruptedException {
        Thread.sleep(2000);
        opnsensePage.reportCloseMenu.click();
    }

    @When("User clicks on the status  segment")
    public void user_clicks_on_the_status_segment() {
        opnsensePage.statusMenu.click();

    }
    @When("User Verifies that status page is displayed")
    public void user_verifies_that_status_page_is_displayed() throws InterruptedException {
        Assert.assertTrue(opnsensePage.statusVerify.isDisplayed());
        Thread.sleep(3000);

    }
    @When("User clicks check updates for Engine Version")
    public void user_clicks_check_updates_for_engine_version() throws InterruptedException {
        Driver.waitAndClick(opnsensePage.checkUpdates,5);
        Thread.sleep(9000);

    }
    @When("User should see the message There are no updates available for you. You are using the latest Engine version.")
    public void user_should_see_the_message_there_are_no_updates_available_for_you_you_are_using_the_latest_engine_version() {
       Assert.assertTrue(opnsensePage.checkUpdatesmessage.isDisplayed());
       Driver.wait(3);

    }
    @Then("User clicks on the close button")
    public void user_clicks_on_the_close_button() {
        opnsensePage.closeCheckUpdatesMessage.click();

    }

    @And("User clicks on  cloud Agent boot button")
    public void userClicksOnCloudAgentBootButton() {
        Driver.scrollIntoViewJS(opnsensePage.cloudAgent);
        opnsensePage.cloudAgent.click();
        Driver.wait(3);
        
    }

    @And("User should see Configuration has been changes successfully message")
    public void userShouldSeeConfigurationHasBeenChangesSuccessfullyMessage() {
        Assert.assertTrue(opnsensePage.cloudAgentToasterMessage.isDisplayed());
        Driver.wait(2);

    }

    @When("User  clicks on the  policy menu and verify  policy page is visible")
    public void user_clicks_on_the_policy_menu_and_verify_policy_page_is_visible() {
        Driver.waitAndClick(opnsensePage.policyMenu,2);
        Assert.assertTrue(opnsensePage.policyVerify.isDisplayed());

    }
    @When("User deselects status and should see the message  You can not disable default policy.")
    public void user_deselects_status_and_should_see_the_message_you_can_not_disable_default_policy() throws InterruptedException {
        opnsensePage.deselectStatuspolicy.click();
        Thread.sleep(3000);
        Assert.assertTrue(opnsensePage.deselectStatusMessage.isDisplayed());
        opnsensePage.deselectOkButton.click();

    }
    @When("User clicks on actions and verify the security page is visible")
    public void user_clicks_on_actions_and_verify_the_security_page_is_visible() {
        Driver.wait(3);
        opnsensePage.statusActionButton.click();
        Assert.assertTrue(opnsensePage.verifyPoliciesDefault.isDisplayed());

    }

    @When("User selects block phishing service button")
    public void user_selects_block_phishing_service_button() throws InterruptedException {
        Thread.sleep(3000);
        opnsensePage.blockPhishingService.click();

    }
    @When("User click on Exclusion part and enters {string} to the whitelist")
    public void user_click_on_exclusion_part_and_enters_to_the_whitelist(String link) {
        Driver.wait(3);
        opnsensePage.exclusionPolicy.click();
        Driver.waitAndSendText(opnsensePage.whitelist,link,2);

    }
    @When("User clicks add button and verify the link is added to the list")
    public void user_clicks_add_button_and_verify_the_link_is_added_to_the_list() throws InterruptedException {
        Thread.sleep(3000);
        opnsensePage.whitelistAddButton.click();
        Assert.assertTrue(opnsensePage.globalCheckbox.isDisplayed());

    }
    @And("User clicks Action checkbox")
    public void userClicksActionCheckbox() {
        Driver.waitAndClick(opnsensePage.globalActionCheckBox,2);
        opnsensePage.deleteListPolicy.click();
    }

    @When("User clicks on Save changes button")
    public void user_clicks_on_save_changes_button() throws InterruptedException {
        Thread.sleep(3000);
        opnsensePage.saveChangesPolicy.click();

    }

    @Then("User should see Configuration has been changed succesfully  toast container message")
    public void userShouldSeeConfigurationHasBeenChangedSuccesfullyToastContainerMessage() {
        Driver.wait(3);
        Assert.assertTrue(opnsensePage.policyToastContainerMessage.isDisplayed());
    }


    @When("User click Report Menu")
    public void userClickReportMenu() {
        opnsensePage.reportMenu.click();
    }

    @When("User click on Dashboard  Menu")
    public void userClickOnDashboardMenu() {
        opnsensePage.dashboardMenu.click();
    }

    @When("User select dashboard menu")
    public void userSelectDashboardMenu() {
        opnsensePage.dashboardMenu.click();
    }
}




