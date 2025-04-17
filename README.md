# MultiCurrencyConverterGUI
1.文件结构(可以复制到word文档或者记事本，这里的结构格式被打乱了）
MultiCurrencyConverterGUI
src/
├── model/
│   ├── Currency.java
│
├── service/
│   ├── CurrencyConverter.java
│
├── ui/
│   ├── CurrencyConverterGUI.java
│
└── Main.java 

2.编译整个项目：
在 src 的目录里 cmd :
javac model/*.java service/*.java ui/*.java Main.java

3.运行：
回到 src 的上一层目录 cmd :
java -cp src Main
