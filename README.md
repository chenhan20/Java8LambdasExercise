# Java8LambdasExercise
Exercise java 8 by steve


## lambda
- Predicate方法使用  
**先創建一個類似function的感覺**  
```java
    Predicate<String> testPredicate = x -> x.length()>=5;
    if(testPredicate.test(testString)){
        System.out.println(testString + "length > 5");
    }
```java
```   





## Java基本功能
- String串接  
```java  
    //------------------------------------------------------
    String str = "1";
    str +="123";
    //------------------------------------------------------
    StringBuffer strBuffer = new StringBuffer();
    strBuffer.append("123");
    //------------------------------------------------------
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append("123");
```   
```
for迴圈跑十萬次
StringAdd         5481ms
StringBuffer      14ms
StringBuilder     7ms
```

**測試結論  雖然java預設string串接使用StringBuilder物件所以若不是for迴圈其實沒什麼差別 但如果是for迴圈跑 會一直new StringBuilder物件**
