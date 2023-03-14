
# Lab 5 Report

By: Ryandeep Shelopal

## Command-line options for find (with examples)

[Source1](https://linux.die.net/man/1/find) and
[Source2](https://man7.org/linux/man-pages/man1/find.1.html) 

* `-iname` option for find is allowing us to find the file by looking for a match from the base of the file's name and the -i portion makes this command case insensitive. 

  ```
  find ~/ -iname introindia.txt
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data-old/written_2/travel_guides/berlitz1/IntroIndia.txt
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data-old2/written_2/travel_guides/berlitz1/IntroIndia.txt
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt
  ```
  ```
  find . -iname california-whattodo.txt 'garden city' /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1
  
  ./California-WhatToDo.txt
  ```
> As we can see in our examples, the IntroIndia.txt file has capitalization, similar to the California-WhatToDo.txt, but by combination of -name and -i, into -iname, we are able to obtain the files regardless of case sensitivity. This is very useful as if you are working with many files, there is a chance that some files contain capitals, so rather than checking them each individually, this makes the search more specific and efficient.

* `-type` option for find, will find a file depending on the file type, which could be a regular file `f`, directory `d`, etc.
  ```
  find . -name grep_results.txt -type f
  
  ./grep_results.txt
  ```
  ```
  find ~/ -name written_2 -type d
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2
  ```
> In these examples, I used the -type f and -type d commands to find a specific directory written_2 and file grep_results.txt. This command can be useful because if you were to have a directory and file with the same name, the find command would show paths to both types, however utilizing the -type command allows us to narrow our search and be more specific.

* `-size` option for find will find a file according to it's size, which can be denoted by `b` (512-byte blocks), `c` (bytes), etc. And you can also utilize whether the file is greater than, less than, or exactly a specific size by using `+` and `-`.

  ```
  find ~/ -size 50b
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt
  ```
  ```
  find ~/ -size +1M
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/wavelet/.git/objects/pack/pack-569e4d7fd1ecca80e90cbcafc42f067ef12e27f3.pack
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.pack
  ```
> In the first example, I try and find files of 50b (50 for 512-byte blocks), which would be the default if no specification is given and got back the HandRJamaica.txt file path. Similarly for the second example, i find a file that is greater than 1 mebibyte, indicated by the +, and got returned 2 files with the .pack extention. This can be useful because if you have multiple versions of a file, it is likely that the latest file has the greatest size, so using -size is a quick way to pull it up. This could also be useful if you want your file to be within a certain size, this allows you to check and keep it within appropriate limits.

* `-maxdepth` option for find, is used to specify the maximum depth of the search, this is indicated by providing a non-negative integer corrresponding to levels of directories.

  ```
  find -maxdepth 1 -name grepResults.txt
  
  ./grepResults.txt
  ```
  ```
  find -maxdepth 3 -name grepResults.txt
  
  ./skill-demo1-data/written_2/grepResults.txt
  ./skill-demo1-data/grepResults.txt
  ```
> In the first example, i am currently in the skill-demo1-data directory which is holding the grepResults.txt file. So once i ran find -maxdepth 1 -name grepResults.txt, it specifically limited the search of the grepResults.txt file to that current directory. If i had used 2 instead of 1, it would've shown another path to a grepResults file which i created on the next level. In the second example, i am in the home directory, and tried to find the same file, but with 3 as my argument, so it would go 3 directories deep to find the other grepResults.txt file i made myself which was missed in the first example. This can be useful because if you have many files with the same name as i did in the second example, you can limit the search to a specific level by using maxdepth.











