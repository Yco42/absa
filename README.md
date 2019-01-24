# absa
automated test cases

Pre-requisites:
1. Install NodeJS
2. $ npm install chai
3. $ npm install selenium-webdriver
4. Install Chromedriver
5. Install Postman app
6. Install Selenium’s language bindings for Javascript: https://www.seleniumhq.org/download/

Section A: Tasks

TASK1: 

I decided to use Postman's Collection functionality for this task as it's very lightweight, good for API testing, and can create Test Report files. 

Method:
1. Using POSTMAN (Collection Runner), Run the automated tests (click link in 'Section B: Resources' below)

![Alt text](https://github.com/Yco42/absa/blob/master/PostmanCollectionRunner.JPG?raw=true "shot1")

2. Click Export Results for a Test Result report and associated test evidence

TASK2:

There are two solutions:
Solution1 = NodeJS, Jscript + Webdriver
Solution2 = Chrome Selenium IDE

My first choice was to use technology that I've been getting experience with recently in the blockchain space: NodeJS with Webdriver to run the tests and enter data into the fields (Solution1). 

I encountered a bit of a baffling problem and spent perhaps way too long trying to figure out why a certain test didn't execute: 

(driver.findElement(webdriver.By.name('FirstName')).sendKeys('FName1');

It turned out that there were bugs in the webdriver! (typical!)

Bugs:
1) SeleniumHQ/selenium#6871
2) Workaround (requires new Selenium version to be published): SeleniumHQ/selenium-ide@925dd41

The bug causes the SendKeys event to not enter any of the expected data into a field, which was a problem for this approach because the site under test uses a Form in which the User variables should be entered. The automation was failing (without error) when trying to locate and populate the FirstName. 

Disappointed, I decided to switch my approach. Because I had already spent quite a while on the task, I decided to use Chrome's Selenium IDE recording tool. Although this is a less interesting solution, it is faster. I decided to still include my previous work on Solution1 for your review. 

Section B: Resources

// Link to TASK1 tests
https://www.getpostman.com/collections/75110d789b7ab94bf0e1

// Code to create Run button, which can execute Task1 tests
<div class="postman-run-button"
data-postman-action="collection/import"
data-postman-var-1="75110d789b7ab94bf0e1"></div>
<script type="text/javascript">
  (function (p,o,s,t,m,a,n) {
    !p[s] && (p[s] = function () { (p[t] || (p[t] = [])).push(arguments); });
    !o.getElementById(s+t) && o.getElementsByTagName("head")[0].appendChild((
      (n = o.createElement("script")),
      (n.id = s+t), (n.async = 1), (n.src = m), n
    ));
  }(window, document, "_pm", "PostmanRunObject", "https://run.pstmn.io/button.js"));
</script>

