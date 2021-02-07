# FindDuplicates

Require Java minimum version - 1.8.
The program accepts a directory as an argument, if there is no argument, then use directory where the executable file will be located is used.

- Analyzes on which operating system was launched :  Windows / Linux / MacOs
- Goes through the specified directory and to all subdirectories inside. Those files are skipped that are hidden, unreadable and there is no access to them, as well as that their names do not contains names specified in the configuration files of the corresponding OS
- Creates a HashMap1 in which it will write all the files that match the condition. (key - file name, value - list of paths to files with this name)
- Removes all values(lists) from HashMap1 which length is < 2
- Creates another HashMap2 (key - file size, value - list of paths to files)
- Loops through all values of HashMap1 and through each list, filling in HashMap2
- Creates a separate list that will copy all values(lists) of HashMap2 which length > 1
- Creates HashMap3 (key - MD5 checksum, value - list of paths to files). Based on a single list, it fills in HashMap3, after which it overwrites the link to a separate list in which it will re-save all values(lists) of HashMap3 which length > 1
- StringBuilder stores all the elements of the list with file paths
- Creates a file result.txt in which it will write all the data of the StringBuilder
