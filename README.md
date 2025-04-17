# MultiCurrencyConverterGUI
文件结构
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

编译整个项目：
在 src 的目录里 cmd :
javac model/*.java service/*.java ui/*.java Main.java

运行：
回到 src 的上一层目录 cmd :
java -cp src Main
