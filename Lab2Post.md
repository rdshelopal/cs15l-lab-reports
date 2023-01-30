# Lab 2 Report

By: Ryandeep Shelopal

## Part 1 - StringServer

```
class Handler implements URLHandler {

    String add = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message"))
        {
            String[] parameters = url.getQuery().split("="); 
            if(parameters[0].equals("s"))
            {
                add += parameters[1] + "\n";
                return add;
            }
        }
        return "404 not found!";
    }
}
```
![Image](https://user-images.githubusercontent.com/122515834/215408274-60b8760a-e165-4d6c-9425-5f06f207f3d2.png)
* My code calls a few functions being `.getPath()`, `.equals()`, `.getQuery()`, and `.split()`
* `.getPath()` is relevant to retrieving the path of the given url object, in this case being `"/add-message"`
* `.equals()` takes relevant arguments including the path of the url being `"/add-message"` and `"s"`, which is incredibly important to verifying whether we want to add a message to the `add` string. In this case, we are able to add `"Ryandeep"` to the webpage.
* `.getQuery` retrieves the query of the given url object, which in combination with `.split` will take `"="` as an argument, which will break the string using a delimiter, and ultimately allow us to add messages easier.
* From utilizing the `add-message` request, the `URI url` object changes after every addition, as well as the continuing concatination of the `String add`.
* However, the rest of our conditions stay the same, even with many uses of this request. As the path `/add-message` stays the same and are still using `"="` for our delimiter which would mean `"s"` would still be the first element in the parameters array.


![Image](https://user-images.githubusercontent.com/122515834/215408128-5e94e9e0-5316-4138-bdc6-f9d206840041.png)
* My code calls a few functions being `.getPath()`, `.equals()`, `.getQuery()`, and `.split()`
* `.getPath()` is relevant to retrieving the path of the given url object, in this case being `"/add-message"`
* `.equals()` takes relevant arguments including the path of the url being `"/add-message"` and `"s"`, which is incredibly important to verifying whether we want to add a message to the `add` string. In this case, we are able to add `"Shelopal"` to the webpage, similar to prior when we added '"Ryandeep"'.
* `.getQuery` retrieves the query of the given url object, which in combination with `.split` will take `"="` as an argument, which will break the string using a delimiter, and ultimately allow us to add messages easier.
* From utilizing the `add-message` request, the `URI url` object changes after every addition, as well as the continuing concatination of the `String add`.
* However, the rest of our conditions stay the same, even with many uses of this request. As the path `/add-message` stays the same and are still using `"="` for our delimiter which would mean `"s"` would still be the first element in the parameters array.

## Part 2 - JUnit

Failure-Inducing Input
---

```
@Test
public void testReversedCase()
{
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
}
```

Non-Failure-Inducing Input
---

```
@Test
public void testReversedCase() 
{   
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
}
```

Symptoms
---

> Fail-Induced


![Image](https://user-images.githubusercontent.com/122515834/215419902-eed2291f-f820-4765-8ee2-37c01bd05312.png)
> Non-Fail Induced


![Image](https://user-images.githubusercontent.com/122515834/215420060-4defadff-ad6b-4c66-aefb-8a1d912cb122.png)

The Bug
---

> Before fix

```
static int[] reversed(int[] arr) 
{
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) 
    {
      arr[i] = newArray[newArray.length - i - 1]; 
    }
    return arr;
 }
```

> After fix

```
static int[] reversed(int[] arr)
{
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) 
    {
      newArray[i] = arr[arr.length - i - 1]; 
    }
    return newArray;
 }
```
* The bug is that the elements are not being stored in the newArray. Also the array that is being returned is not the newArray.
* Therefore, switching the orientation of both arrays will allow the correct array (the new array) to store the reversed elements and return the newArray.

## Part 3 - Learned
* During week 2, I learned how to create my own webserver and run it on my own local computer or remote. I also learned the different parts of a url, as well as local host and ports. I also learned how to use github/github desktop to save changes to my code and push them to be viewed on github.
* During week 3, I learned about JUnit, which is important as I took a CSE12 equivalent at a cc, and never learned about it. And now i know how to use it to create and test my own test cases.






