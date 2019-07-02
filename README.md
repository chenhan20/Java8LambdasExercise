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
StringAdd         5481 ms
StringBuffer      14ms
StringBuilder     7 ms
```
### 結論  
測試結論  雖然java預設string串接使用`StringBuilder`物件  
所以若不是for迴圈其實沒什麼差別 但若是在for回圈內串接  
**例如**  
```java  
String testStr = "test";
for(int i = 0;i<100000;i++){
    testStr += "123";
}
```  
這樣在for迴圈內每次都會在new StringBuilder()`
物件所以會導致很慢10萬筆就要跑七秒了
但用`stringBuilder`直接`append`的話是一千倍以上的速度
所以sql直接`+=`基本上算是沒什麼問題 但for迴圈串接就要注意  
例如: 組合string成`xml`並跑迴圈串接List的`xml`就要特別避開傳統`+=`的方法
