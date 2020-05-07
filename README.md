
Pre-Req:
1. I did setup the Java home
2. Install Android SDK and Android Home env variables
3. Connected by actual android device via USB 

Before run:
1. Clone the repo
2. Install the .apk file on to the actual / emulator device
3. Or place the .apk file under app folder and MobileDriver.java enabled line 19/20
4. If step 3, make sure chmod 777 for the file
5. Now change the deviceName in MobileDriver.java under utils to your deviceName
Note:deviceName(line 28) can be found using adb devices 
Note:also the ver to be changed in line 29

To Run:
1. Right click on the runner and run as TestNG runner

Expected:
1. The app should launch on the device
2. Click on the search bar and enter "65_inch tv"

Problem to continue:
1. Unable to find the locators for the element to tap on listed saerch item

Action to Debug:
1. tried with uiautomatorbat to find element
2. tried using the appium locators to find 
3. non of them help

Structure of the framework:

1. Cucumber featuers file - src/test/java/features
2. Steps def/ Glue code - src/test/java/Steps
3. Cucumber runner - src/test/java/runner
4. locators - src/main/java/page
5. actions - src/main/java/page
6. utils - src/main/java/utils
7. pom.xml - Dependency
8. apk file - app


Output result log:

Launch the App-test
log4j:WARN No appenders could be found for logger (org.apache.http.client.protocol.RequestAddCookies).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
==========================
Tap on More information about this dealer
Element not displayed
Element is not present
==========================
Tap on menu icon
Element is displayed
The home menu icon is present
Element is clicked
@And -- user enter the text: search
65-inch tv
key typed
Swipe
(1440, 2768)
Not displayed
Element is not present
driver.quit()
driver.close()

1 Scenarios (1 passed)
4 Steps (4 passed)
0m25.226s


===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0
