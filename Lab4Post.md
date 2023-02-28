# Lab 4 Report

By: Ryandeep Shelopal

## 4. Log into ieng6
![Image](https://user-images.githubusercontent.com/122515834/221757224-c3ba34a0-60bd-4e02-81f0-54cb10085290.png)
Keys Pressed: `<ctrl+r> <'s'> <Enter>`
* I pressed the ctrl + r keys to access my command history, followed by `'s'` to filter through the history to locate the ssh command, and then pressed `enter`
  to login as the account has been configured to login without typing a password by generating SSH keys for ieng6.


## 5. Clone fork of the repository from Github account
![Image](https://user-images.githubusercontent.com/122515834/221758522-1630626d-a9ee-41c0-a40f-5721a846057e.png)
Keys pressed: `<git clone git@github.com:rdshelopal/lab7.git> <Enter>`
* I typed git clone, followed by the SSH clone url, which can be done after generating SSH keys for github, and pressed enter to clone the repository.

## 6. Run the tests, demonstrating that they fail
![Image](https://user-images.githubusercontent.com/122515834/221759193-ba1b53c6-be0a-4010-aa1d-dd653bc6bd01.png)
![Image](https://user-images.githubusercontent.com/122515834/221759265-9206a2a5-8a64-4609-a074-92be8ca93713.png)
Keys Pressed: `<cd lab7> <Enter>, <ctrl+r> <javac> <Enter>, <ctrl+r> <java> <Enter>`
* I first changed into the cloned lab7 directory, than pressed ctrl+r to access my command history, typed out javac, because if i were to just out java, it wouldnt be able to distinguish between java and javac, and pressed enter to compile the tests.
* Then i pressed ctrl+r to access my history, typed java, and then pressed enter to run my tests, which failed as expected.

## 7. Edit the code file to fix the failing test
![Image](https://user-images.githubusercontent.com/122515834/221760558-040dd27d-7b58-4af7-96a1-35626dd40e11.png)
![Image](https://user-images.githubusercontent.com/122515834/221760594-e99dbff4-0608-4e1c-8f6d-b1dd283c4c0d.png)
Keys Pressed: `<nano L> <tab> <j> <tab> <enter>, <ctrl + w> <index1 += 2> <enter>, <index2 += 1>, <ctrl + o> <Enter> <ctrl + x>`
* I first typed nano L, followed by the tab key to complete the file name, ListExamples and did the same for .java
* I then typed ctrl+w to search for the error which was index1 += 2, i then changed it to index2 +=1, typed ctrl + o, followed by enter to save, and ctrl+x to exit.

## 8. Run the tests, demonstrating that they now succeed
![Image](https://user-images.githubusercontent.com/122515834/221760692-e24387dd-9e51-4f03-aa6a-b4ab8df7cd98.png)
Keys Pressed: `<ctrl+r> <javac> <Enter>, <ctrl+r> <java> <Enter>`
* I once again typed ctrl + r to access my command history, typed javac to compile, and then typed java to run, similar to step 6, and the tests passed as expected from our changes in the previous step.

## 9. Commit and push the resulting change to Github account (choose any commit message)
![Image](https://user-images.githubusercontent.com/122515834/221760761-407e981d-7583-4225-bdc2-782e4020f6ca.png)
Keys Pressed: `<git add> <L> <tab> <j> <tab> <Enter>, <git commit -m "updated"> <Enter>`
* I typed git add, followed by L and tab to complete the ListExamples file name, and did the same for the j in java.
* I then typed git commit -m "updated", which gives commit the message "updated".

