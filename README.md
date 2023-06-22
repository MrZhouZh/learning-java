# Learning Java

用于记录学习 Java 知识

## Quick Started

```
# Compile
javac file.java

# run
java file
```

## Java 基础

基础知识

### 基本数据类型

- 整数: `byte` `short` `int` `long`
- 浮点数: `float` `double`
- 字符: `char`
- 布尔: `boolean`

计算机内存的最小存储单元是字(byte), 一个字节就是一个8位二进制数, 即8个bit。它的二进制表示范围从00000000~11111111, 换算成十进制是0~255, 换算成十六进制是00~ff.

一个字节是 1byte，1024字节是 1K，1024K 是 1M，1024M 是 1G，1024G 是 1T

Java基本数据类型占用的字节数:

```
       ┌───┐
  byte │   │
       └───┘
       ┌───┬───┐
 short │   │   │
       └───┴───┘
       ┌───┬───┬───┬───┐
   int │   │   │   │   │
       └───┴───┴───┴───┘
       ┌───┬───┬───┬───┬───┬───┬───┬───┐
  long │   │   │   │   │   │   │   │   │
       └───┴───┴───┴───┴───┴───┴───┴───┘
       ┌───┬───┬───┬───┐
 float │   │   │   │   │
       └───┴───┴───┴───┘
       ┌───┬───┬───┬───┬───┬───┬───┬───┐
double │   │   │   │   │   │   │   │   │
       └───┴───┴───┴───┴───┴───┴───┴───┘
       ┌───┬───┐
  char │   │   │
       └───┴───┘
```