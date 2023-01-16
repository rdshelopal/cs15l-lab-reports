# Lab 1 Report

By: Ryandeep Shelopal

**To begin logging into a course-specific account on ieng6, you must follow these steps.**

## 1. Installing Visual Studio Code

* Click this link to [VisualStudioCode](https://code.visualstudio.com/) and follow the instructions to download and install onto your system.
* However, since I already had Visual Studio Code installed on my system, I was able to skip this step.
* Once installed, open the application, and you should have a window appear similar to the image below. ![Image](https://user-images.githubusercontent.com/122515834/212444711-a063c917-d04c-4474-8c6d-d4582d8d6b56.png)

## 2. Remotely Connecting

* Before connecting remotely to the server, we must reset our course-specific password.
* Click this [link,](https://sdacs.ucsd.edu/~icc/index.php) enter your UCSD username + PID, and then press submit. 
* It will then show an account name. Click the account name and you will be able to see a blue **change your password** hyperlink. Click it.
* After entering in your current and new password, **DO NOT** click the check password button, just press enter/return on your keyboard.
![Image](https://user-images.githubusercontent.com/122515834/212577068-d36369df-55fa-4fc8-8ac7-c157678729cf.png)
* Next, to remotely connect, open up a terminal in VisualStudioCode by going to the drop down menu in the top left corner and selecting **New Terminal**
* In the terminal, type `ssh cs15lwi23zzz@ieng6.ucsd.edu`, however in place of "zzz", type the sequence of characters which correspond with your account (this can be found by logging into this [website](https://sdacs.ucsd.edu/~icc/index.php) by using your username and PID).
* Then enter in your course-specific password and you should be successfully connected!
![Image](https://user-images.githubusercontent.com/122515834/212579401-fcfa646c-eae4-45ff-8f3a-fae59179f523.png)


## 3. Trying Some Commands

* The `cat /home/linux/ieng6/cs15lwi23/public/hello.txt` command will allow you to run the hello.txt file.
* Using `ls /home/linux/ieng6/cs15lwi23/cs15lwi23aqk` will not work, as you cannot view the files of an account that is not yours.
* The `pwd` will allow you to print your current working directory.
* Lastly, `exit` will allow you to logout of the remote server.
![Image](https://user-images.githubusercontent.com/122515834/212580421-ca04a507-5ca1-4315-9c1a-fc3cd36d060a.png)
