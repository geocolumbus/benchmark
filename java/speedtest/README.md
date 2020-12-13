# Java Speed Test

## Usage
 
    cd src
    javac org/tallgeorge/Main.java
    java org.tallgeorge.Main

## Results

Executes a floating point division and adds it to a Double LinkedList.
Repeats 5,000,000 times.

| Device                         | time (sec) | cycle (usec) |
|--------------------------------|------------|--------------|
| 2012 MacBook Pro               | 0.849      | 0.170        |
| Raspberry Pi 4B 4GB            | 3.821      | 0.764        |
| AMD Athlon 5350 w/Debian Linux | 4.613      | 0.926        |
| Raspberry Pi 0                 | 29.682     | 5.936        |

## Notes

### Raspberry Pi 0

* You must compile -source 1.8 -target 1.8 to work on the Raspberry Pi 0
* You must run with the -Xmx2G option
