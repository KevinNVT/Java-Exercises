# Test cases
## One arrys

### Test Case 1: Positive numbers in the array
```java
int[] array = {5, 3, 8, 7, 10};
// Expected output: Numbers multiplied: 10 and 8
// Biggest product = 80
```

### Test Case 2: Mixed positive and negative numbers
```java
int[] array = {5, -3, 8, 7, -10};
// Expected output: Numbers multiplied: -10 and -3
// Biggest product = 30
```

### Test Case 3: All negative numbers
```java
int[] array = {-1, -3, -5, -2, -6};
// Expected output: Numbers multiplied: -1 and -2
// Biggest product = 2
```

### Test Case 4: Array contains zeros
```java
int[] array = {0, 3, -5, 0, 10};
// Expected output: Numbers multiplied: 10 and 3
// Biggest product = 30
```

### Test Case 5: Array contains duplicate values
```java
int[] array = {4, 4, 4, 4, 4};
// Expected output: Numbers multiplied: 4 and 4
// Biggest product = 16
```

### Test Case 6: Only two elements in the array
```java
int[] array = {9, 10};
// Expected output: Numbers multiplied: 10 and 9
// Biggest product = 90
```

### Test Case 7: Large numbers in the array
```java
int[] array = {1000, 5000, 10000, 7000, 3000};
// Expected output: Numbers multiplied: 10000 and 7000
// Biggest product = 70000000
```

### Test Case 8: Array contains negative and large positive numbers
```java
int[] array = {100, -100, 50, -50, 1000};
// Expected output: Numbers multiplied: 1000 and 100
// Biggest product = 100000
```

### Test Case 9: Small numbers including decimals (cast to int)
```java
int[] array = {(int) 0.5, (int) 1.5, 2, 3, (int) 0.1};
// Expected output: Numbers multiplied: 3 and 2
// Biggest product = 6
```

### Test Case 10: Only one element (invalid case)
```java
int[] array = {5};
// Expected output: Array must contain at least two elements.
```

## Two arryas
### Test Case 1: Both arrays contain only positive numbers
```java
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {6, 7, 8, 9, 10};
// Expected output: Numbers multiplied: 5 and 10
// Biggest product = 50
```

### Test Case 2: Both arrays contain positive and negative numbers
```java
int[] array1 = {-10, -20, 5, 3};
int[] array2 = {-4, -6, 2, 8};
// Expected output: Numbers multiplied: -10 and -6
// Biggest product = 60
```

### Test Case 3: Arrays with zeros and positive numbers
```java
int[] array1 = {0, 1, 2, 3};
int[] array2 = {4, 5, 0, 6};
// Expected output: Numbers multiplied: 3 and 6
// Biggest product = 18
```

### Test Case 4: Arrays with zeros and negative numbers
```java
int[] array1 = {0, -1, -2, -3};
int[] array2 = {0, -4, -5, -6};
// Expected output: Numbers multiplied: -3 and -6
// Biggest product = 18
```

### Test Case 5: Mixed large positive and negative numbers
```java
int[] array1 = {-1000, 500, -200, 300};
int[] array2 = {-800, 400, 200};
// Expected output: Numbers multiplied: -1000 and -800
// Biggest product = 800000
```

### Test Case 6: One array has all positive numbers, other has all negative
```java
int[] array1 = {2, 4, 6, 8};
int[] array2 = {-1, -2, -3, -4};
// Expected output: Numbers multiplied: 8 and -1
// Biggest product = -8
```

### Test Case 7: Small arrays (with only two elements each)
```java
int[] array1 = {1, 2};
int[] array2 = {-3, -4};
// Expected output: Numbers multiplied: 2 and -3
// Biggest product = -6
```

### Test Case 8: Arrays with a mix of large and small values, including zeros
```java
int[] array1 = {0, 100, 1000, -10000};
int[] array2 = {0, -500, 100, 2000};
// Expected output: Numbers multiplied: -10000 and -500
// Biggest product = 5000000
```

### Test Case 9: Arrays with repeated numbers
```java
int[] array1 = {2, 2, 2, 2};
int[] array2 = {3, 3, 3, 3};
// Expected output: Numbers multiplied: 2 and 3
// Biggest product = 6
```

### Test Case 10: Arrays with only one element (invalid case)
```java
int[] array1 = {5};
int[] array2 = {10};
// Expected output: Both arrays must contain at least two elements.
```
