# absa
automated test cases

Pre-requisites:
1. Install NodeJS
2. $ npm install chai
3. $ npm install selenium-webdriver
4. Install Chromedriver
5. Install Postman app

Section A: Tasks

TASK1: 

I decided to use Postman's Collection functionality for this task as it's very lightweight, good for API testing, and can create Test Report files. 

Method:
1. Using POSTMAN (Collection Runner), Run the automated tests (click link in 'Section B: Resources' below)
2. Click Export Results for a Test Result report and associated test evidence

TASK2:



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

