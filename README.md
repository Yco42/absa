# absa
automated test cases

Task1 = Automate tests against API: https://dog.ceo/dog-api/

Task2 = Automate tests against website: http://www.way2automation.com/angularjs-protractor/webtables/

Files:
See files attached in this project. 

**Pre-requisites:**

**TASK1:**

1. Install Postman app, or use the Chrome extension

**TASK2:**

SOLUTION1:
1. Install NodeJS
2. $ npm install selenium-webdriver
3. Install Chromedriver
4. Install Selenium’s language bindings for Javascript: https://www.seleniumhq.org/download/

SOLUTION2:

1. Install Katalon IDE (Chrome)

**Section A: Tasks**

**TASK1:**

I decided to use Postman's Collection functionality for this task as it's very lightweight, good for API testing, and can create Test Report files. 

Method:
1. Using POSTMAN (Collection Runner), Run the tests: https://www.getpostman.com/collections/75110d789b7ab94bf0e1

![Alt text](https://github.com/Yco42/absa/blob/master/PostmanCollectionRunner.JPG?raw=true "shot1")

2. Click Export Results for a Test Result report and associated test evidence

**TASK2:**

I will describe two solutions:
Solution1 = NodeJS, Jscript + Webdriver
Solution2 = Katalon Chrome IDE

**SOLUTION1:**

My first choice was to use technology that I've been getting experience with recently in the blockchain space: NodeJS with Webdriver to run the tests and enter data into the fields. I like NodeJS, NPM and Newman. 

I encountered a bit of a baffling problem and spent perhaps far too long trying to figure out why a certain test didn't execute: 

> (driver.findElement(webdriver.By.name('FirstName')).sendKeys('FName1');

It turned out that there were bugs in the webdriver! (Appropriate that we are Testers, I think)  ;)

> Bugs:
> 1) SeleniumHQ/selenium#6871
> 2) Workaround (requires new Selenium version to be published): SeleniumHQ/selenium-ide@925dd41

The bug causes the SendKeys event to not enter any of the expected data into a field, which was a problem for this approach because the site under test uses a Form in which the User variables should be entered. The automation was failing (without error) when trying to locate and populate the FirstName, resulting in quite a lot of investigation and research until bugs were uncovered. 

I switched to Solution2. 

**SOLUTION2:**

Because I had already spent some time on the task, I decided to use Chrome's Katalon IDE recording tool. Although this is perhaps a less inventive solution, it is faster. (I decided to still include my incomplete work on Solution1 for your interest, as I believe NodeJS webdriver automation is important technology for things like blockchain testing, API testing and so on). 

1. Load Katalon Chrome IDE
2. Open Solution2.java
3. Run All Tests
4. Export results
5. Sample results from my own run = Solution2 test run report.html

**Section B: Resources**

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

