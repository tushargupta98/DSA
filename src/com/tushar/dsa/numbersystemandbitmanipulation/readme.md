Number System and Bit Manipulations

Basics

1. Computer understands Binary Numbers
2. Three Important Operations
   1. AND Operation = &
   2. OR Operation = |
   3. XOR Operation = ^
3. For Two numbers a=4=[1,0,0] b=3=[0,1,1] {Decimal and Binary Representation Respectively}
      1. [4] AND [3] = [1,0,0] AND [0,1,1] = [0,0,0] = 0
      2. [4] OR [3] = [1,0,0] OR [0,1,1] = [1,1,1] = 7
      3. [4] XOR [3] = [1,0,0] XOR [0,1,1] = [1,1,1] = 7
4. a&b&c = a&c&b = b&a&c = c&b&a = c&a&b = b&c&a 
5. a|b|c = a|c|b = b|a&c = c|b|a = c|a|b = b|c|a
6. a^b^c = a^c^b = b^a^c = c^b^a = c^a^b = b^c^a
7. a^a = b^b = c^c = 0 
8. a^a^b^b^c = c
9. 0^a = a

Examples:
1. In an integer array numbers repeat in pairs except one. Find that number.
2. In an integer array all the numbers appear in a sequence however one number is missing. Find the missing number.