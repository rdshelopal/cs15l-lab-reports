
# Lab 3 Report

By: Ryandeep Shelopal

## Command-line options for grep (with examples)

[Source1](https://www.gnu.org/software/grep/manual/grep.html) and
[Source2](https://linux.die.net/man/1/grep)

* `-r` option for grep, which reads all files under each directory, recursively. 

  ```
  grep -r 'garden city' /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt: 
  “garden city. ” The spectacular growth of India’ s boom town in
  ```
  ```
  grep -rh 'garden city' /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1
  
  “garden city. ” The spectacular growth of India’ s boom town in
  ```
> The `-r` option for grep is allowing us to find the string `"garden city"` in the directory of berlitz1 by going through all the files in that directory recursively, which means that it will go through the contents of berlitz1, as well as the subdirectories within berlitz1. This can be useful as the word could be in multiple files of berlitz1, so instead of checking each file one at a time, this allows us to quickly go through all the files in berlitz1, including its subdirectories. This can be used in conjunction with `-h` which would return the string without the path, in turn helping clear clutter.

* `-n` option for grep, which will tell us which line numbers our target string is found.

  ```
  grep -n 're-education' China-WhatToDo.txt
  
  55:During the Cultural Revolution, Beethoven and Tchaikovsky were banned and many musicians banished to the countryside 
  for “re-education.” So if you go    to a concert today, you’ll sense the drama of recovery from mad xenophobia. This 
  needn’t obscure the fact that some professional musicians haven’t yet reached world standards. But the enthusiasm 
  of players and audience is exciting in itself.
  ```
  ```
  grep -rn 'garden city' /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:
  2130: “garden city. ” The spectacular growth of India’ s boom town in
  ```
> The `-n` option for grep will prefix each line where our grep input `"re-education"` or `"garden city"` occurs with the corresponding line in the txt file. This way we will know in which line of the file, the string is present. Knowing the line number the search term appears on can be useful if you have a very large file, in which knowing the line number can help navigate the file easier. This is useful especially in conjunction with other commands, as in my second example I utilize `-rn` to search through all the files in the directory to see which line the word was present.

* `-i` option for grep, which will ignore case distinctions in both the pattern and input files when looking for all occurences of a string in a large txt file.

  ```
  grep -i 'place' WhatToIndia.txt
  
        still a great place to shop.
        products you like from places you will be visiting later, such as
        Place in New Delhi and Mumbai’s Pundole and Chemould Galleries, not to
        to buy until your last day. The best places to buy Indian spices are
  ```
  ```
  grep -iw 'place' WhatToIndia.txt
  
        still a great place to shop.
        Place in New Delhi and Mumbai’s Pundole and Chemould Galleries, not to
  ```
> The `-i` option for grep will ignore case distinctions in pattern and input data. This is useful because if you are looking for a string in a text file, it will print all cases, rather than having to repeat the grep command for every case. This can work well in conjunction with the `-w` as it will allow us to find `"place"` as a complete word for all cases, rather than just part of a string, as seen in second example.

* `-c` option for grep, which will print a count of matching lines for each string input from our file.

  ```
  grep -c 'India' WhatToIndia.txt
  
  28
  ```
  ```
  grep -cr 'History' /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2
  
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt:1
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt:0
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:0
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt:0
  /home/linux/ieng6/cs15lwi23/cs15lwi23aqp/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt:1
  ```
> This can be useful because if you search for a string and it occurs many times. Instead of counting each occurance one at a time, we can get this information right way by using this command. This can be useful in the scenario in which you have a txt file with student grades A-F. You can find the total amount of students that fall under each category and calculate useful information regarding class averages, etc. This can also be used in conjunction with `-v` and print the lines that do not match. This can also be used with `-r` as i've used in the second example to go through all the files in the berlitz2 directory to find the word `"History"`, and as seen it tells us how many times it occurs, even if it occurs 0 times.











