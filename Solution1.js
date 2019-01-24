
// Definitions
var webdriver = require("selenium-webdriver");
var driver = new webdriver.Builder().forBrowser('chrome').build();

// Slow things down
function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function demo() {
  console.log('Taking a break...');
  await sleep(2000);
  console.log('Two seconds later');
};

// driver.manage().setTimeouts( { implicit: 200 } );

// Navigate to page
driver.get('http://www.way2automation.com/angularjs-protractor/webtables');

// Click Add User
driver.findElement(webdriver.By.className('btn btn-link pull-right')).click();

// driver.findElement(webdriver.By.name('FirstName')).click();

//driver.findElement(webdriver.By.className('smart-table-edit-data-cell ng-scope')).sendKeys('new user name stuff');

// Add test data
async function AddFirstName()
{
  sleep(3000);
  driver.findElement(webdriver.By.name('FirstName')).click();
  sleep(3000);
  driver.findElement(webdriver.By.name('FirstName')).clear();
  sleep(3000);
AddFName = driver.findElement(webdriver.By.name('FirstName'))
.then(function(AddFName)
  {
AddFName.sendKeys('new user name stuff');
webElement.sendKeys(Keys.TAB);
// AddFName.submit();
  });
};



//driver.findElement(webdriver.By.name('FirstName')).sendKeys('new user name stuff');

//driver.findElement(webdriver.By.name('LastName')).sendKeys('2');

//driver.findElement(webdriver.By.name('UserName')).sendKeys('3');

// driver.quit();
