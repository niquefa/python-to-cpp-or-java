# Python-to-cpp-or-java-in-programming-contest

This is a small repo with tools and concept for those looking to change from python to C++ and/or java for programming contests.


Starting the language change from Python to C++ or java for programming contests, has six main differences that could be challenging at first: 
- [x] Using parenthesis
- [x] Ending sentences
- [x] Data types.
- [x] Indentation vs brackets.
- [x] Reading data 
- [x] Printing data.

# Using parenthesis
In Python we are use to just not using parenthesis in conditionals and loops, but in C++ and java these are mandatory and will produce a lot of compiling errors if not used.

# Ending sentences
In Java and C++ practically all sentences, flow control sentences and data construction should be ended either by a bracket (}) or by a semicolon (;), this could be specially frustrating in C++ because the compiler warnings and errors are not so specific and precise as the ones in Java and even far more obscures that the ones in Python. Be patient, try to understand what the compiler is trying to tell you and check your code to eliminate all this errors and warnings.

# Data types
In python we are used to just declare, initialize and/or use variables without declaring its type (https://realpython.com/python-data-types/), this is because the type is assigned during the interpretation. In C++ (https://cplusplus.com/doc/tutorial/variables/ ) and java(https://www.javatpoint.com/java-variables ) we usually specify the types when declaring a variable, and even inside the argument declarations inside functions(methods in java). Although, there are workarounds for this in both C++ (https://docs.microsoft.com/en-us/cpp/cpp/auto-cpp?view=msvc-170 ) and java (https://www.geeksforgeeks.org/var-keyword-in-java/), somehow we always must at least use a reserved word to declare a variable, **auto** in c++ or **var** in java for example.

# Control structures and loops one liners:
In python we do not use brackets **{}** to group lines of code in the same level, we use indentation, but in C++ and java we must use brackets, in fact, correct indentation is desirable for good practices, but not mandatory to get the code to compile, but, we also can do one liners if we omit the brackets, for example in C++:

```
 for( int i = 0; i < 10; ++i )
   if( i%2 == 0 )
     cout << "Even" << endl;
   else
     cout << "Odd" << endl;
```

is equivalent to:

```
 for( int i = 0; i < 10; ++i ) {
   if( i%2 == 0 ) {
     cout << "Even" << endl;
   }
   else {
     cout << "Odd" << endl;
   } 
 }
```

Substitute the “cout” lines by System.out.println() and that code is just java:

```
 for( int i = 0; i < 10; ++i ) 
   if( i%2 == 0 ) 
     System.out.println("Even")
   else
     System.out.println("Odd")
```

Is equivalent to:

```
 for( int i = 0; i < 10; ++i ) {
   if( i%2 == 0 ) {
     System.out.println("Even")
   }
   else {
     System.out.println("Odd")
   } 
 }
```

# Reading data
In python we are used to reading data line by line, either using ```input()```, ```raw_input()```, ```sys.stdin``` and other tools, but it is generally used to read line by line. In C++ and Java we have multiple tools to read either line by line, or token by token (token for this purpose is just a fancy synonymous of word), as a general good practice, is better to stick to reading all the input in a problem’s solution line by line or all the input token by token, but not mixing the two ways in the same solution to a problem, mainly because the new line characters will be enoing to dealt with.  

In this repo you will find several templates to read data from standard input in C++ and java. Their names are quite self explanatory, those are just a couple of ways for reading data on each language.

When reading line by line, java offers a couple of tools much more simpler to tokenize or split a string into tokens (words). This will be the ```split()``` method and the ```StringTokenizer``` class. After tokenizing, many times we need to transform strings to native data types (int, long, double, etc) or vice versa, and in Java is also quite straightforward using their wrapper classes:https://www.javatpoint.com/wrapper-class-in-java (Integer, Long, Double, etc) and the plus operator (+) to concatenate native types to Strings. In C++, those tasks are a bit less straightforward, as always there are many ways to do it.

In this file https://github.com/niquefa/python-to-cpp-or-java/blob/main/LineByLineWithTestCases.cpp you will find some useful functions to process strings in C++.

I strongly suggest using the terminal to compile and execute programs to take the input from some file. For all the C++ and java templates in this repo, the file sample_input_lines.txt should work.

Check how to do it in C++ https://stackoverflow.com/questions/17531573/command-to-run-c-with-input-from-file and in java https://stackoverflow.com/questions/39151749/input-file-in-java .

# Printing Data

The main difference you will notice going from python to C++ or Java in printing data in programming contests, is that in python we are used to always getting a new line for each call to print(). Although we have a workaround in python to not print the new line, and is use ```print(“Some message or variable”, end=””)``` or to use import sys and sys.stdout.write("Hello there!") , but in C++ and java is the other way around, we must explicitly print the new line:

In C++ we usually use ```endl``` to print a new line:

```
cout << “Some message or variable” << answer << endl;
```

And in Java we use either ```System.out.println(“Some message or variable”)``` for printing with newline, or ```System.out.print(“Some message or variable”)``` to print without newline.

Additionally to these hints about printing in C++ and Java, there are some special tools in both languages for printing with even more speed, thus increasing the advantage of using this languages instead of Python for programming contests.

In java we can use StringBuilder to build the answer before printing it and saving time in the process, this is suggested for problems with many data to print: https://www.javatpoint.com/StringBuffer-class .

In C++ we have also several tools to fast printing data, but that is not so necessary for the huge majority of cases in programming competitions: https://stackoverflow.com/questions/18412164/fast-c-string-output 

# Extra notes on java
As a rule, every java program in a programming contest you should have a class and the method main inside that class, and generally that class name should have a specific name, in sites as uva online judge generally is Main, and in icpc style contests generally should have a specific name related to the problem identification letter or name, make sure your program meets that requirement or you will get a compilation error. .

# Useful links:
* Notes on C++ in mac:https://codeforces.com/blog/entry/101012
* Reading standard input in python: https://stackoverflow.com/questions/1450393/how-do-i-read-from-stdin 

# Next topics to add to this repo:
- [ ] Complete the templates for C++ and java
- [ ] Serious C++ advantages over java and python
- [ ] Serious Java advantages over java and C++
- [ ] Serious python advantages over java and C++
- [ ] Serious C++ disadvantages over java and python
- [ ] Serious Java disadvantages over java and C++
- [ ] Serious python disadvantages over java and C++
- [ ] Compare the use of vector, list in C++ and ArrayList and LinkedList in Java with the lists in python
- [ ] Compare the use of set, unordered_set in C++ and TreeSet and HashSet in Java with the sets in python
- [ ] Compare the use of map, unordered_map in C++ and TreeMap and HashMap in Java with the maps in python

Feel free to [contribute]([url](https://github.com/firstcontributions/first-contributions)), there is a lot we can do here. 

Also feel free to use this resources as you want. 
