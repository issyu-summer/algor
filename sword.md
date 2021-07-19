### 回溯:
- 12:矩阵中的路径
- 13:机器人的运动范围
- 17:打印从1到n的最大n位
- 34:二叉树中和为某个值的路径
- 38:全排列

### 动态规划:
- 10:🔗[斐波那契数列](src/main/java/sword/Main10sb1.java) ==> `dp[i]=dp[i-1]+dp[i-2]`
- 10.2:🔗[青蛙跳台阶](src/main/java/sword/Main10sb2.java) ==> `dp[i]=dp[i-1]+dp[i-2]`
- 14.1:🔗[剪绳子](src/main/java/sword/Main14sb1.java) ==>`dp[i]=max(dp[i-j]*j,dp[i-1])`
- 14.2:剪绳子 ==> `dp[i]=max(dp[i-j]*j,dp[i-1])%1e8+7`
- 19:正则表达式的匹配
- 42:🔗[连续子数组的最大和](src/main/java/sword/Main42.java) ==> `if(dp[i-1]<0) dp[i]=nums[i]; else dp[i]=dp[i]+nums[i]`
- 46:🔗[把数字翻译成字符串](src/main/java/sword/Main46.java) ==> `if(两位能表示一个字母) dp[i]=dp[i-1]*1+dp[i-2]*1 else dp[i]=dp[i-1]`
- 47:🔗[最大礼物价值](src/main/java/sword/Main47.java) ==> `dp[i][j]=max(dp[i-1][j],dp[i][j-1])+grid[i][j]`
- 48:🔗[最长不含重复字符的子字符串](src/main/java/sword/Main48.java)  ==> `if(遇到了重复字符){  if(在当前序列范围内)  dp[i]=i-j else dp[i]=dp[i-1]+1}  else dp[i]=dp[i-1]+1`
- 49:🔗[丑数](src/main/java/sword/Main49.java) ==> `n2=dp[a]*2;  n3=dp[b]*3;  n5=dp[c]*5;  dp[i]=min(n2,n3,n5)  if(dp[i]==n2)  a++  if(dp[i]==n3)  b++  if(dp[i]==n5)  c++`
- 60:🔗[n个骰子🎲的点数](src/main/java/sword/Main60.java)  ==> `tmp[j+k]+=dp[j]/6.0`
- 62:🔗[圆圈中最后剩下的数字(约瑟夫环)](src/main/java/sword/Main62.java) ==> `dp[i]=(dp[i]+m)%i`
- 63:🔗[股票的最大利润](src/main/java/sword/Main63.java) ==> `dp[i]=max(dp[i-1],ar[i]-min(ar[0:i]))`
- 67:🔗[构建乘积数组](src/main/java/sword/Main67.java) ==>

### 数组:
- 3:数组中的重复数字
- 4:二维数组中的查找
- 11:旋转数组的最小数字
- 21:奇数位于偶数前
- 39:数组中出现次数超过一半的数字
- 45:把数组排成最小的数
- 53.1:排序数组中查找数字
- 53.2:0～n-1中缺失的数字
- 56.1:数组中数字出现的次数
- 56.2:数组中数字出现的次数2
- 57.1:和为s的两个数

### 其他:
- 15:二进制中1的个数(汉明重量)
- 16:数值的整数次方
- 29:顺时针打印矩阵
- 40:最小的K个数
- 41:数据流中的中位数
- 57.2:和为s的连续正整数序列
- 59.2:队列的最大值
- 61:扑克牌中的顺子
  
### 数学问题
- 64:🔗[计算1+2+...+n(不使用运算符)](src/main/java/sword/Main67.java)

### 位运算
- 65:🔗[不使用加减乘除做加法](src/main/java/sword/Main65.java)

### 字符串
- 5:🔗[替换空格](src/main/java/sword/Main5.java)
- 50:🔗[字符串中第一个出现1次的数字](src/main/java/sword/Main50.java)
- 58.1:🔗[反转单词顺序](src/main/java/sword/Main58sb1.java)
- 58.2:🔗[左旋字符串](src/main/java/sword/Main58sb2.java)
- 67:🔗[字符串转数字](src/main/java/sword/Main67.java)

### 链表:
- 6:从尾到头打印链表
- 18:删除链表的节点
- 22:链表的倒数第K个节点
- 24:反转链表
- 25:合并两个排序链表
- 35:复杂链表的复制
- 36:二叉搜索树与排序循环双向链表
- 52:两个链表的第一个公共节点

### 二叉树:
- 7:重建二叉树
- 26:树的子结构
- 27:二叉树的镜像
- 28:对称的二叉树
- 32.1.2.3:从上到下打印二叉树
- 37:二叉树的序列化与反序列化
- 38:二叉搜索树中的第K大节点
- 55.1:二叉树的深度
- 55.2:平衡二叉树


### 二叉搜索树
- 33:🔗[二叉搜索树的后续遍历](src/main/java/sword/Main33.java)
- 36:🔗[二叉搜索树与排序循环双向链表](src/main/java/sword/Main36.java)
- 68.1:🔗[二叉搜索树的最近公共祖先](src/main/java/sword/Main68sb1.java)
- 68.2:🔗[二叉树的最近公共祖先](src/main/java/sword/Main68sb2.java)

### 队列、栈:
- 9:使用两个栈实现队列
- 30:包含min方法的栈
- 31:栈的压入、弹出序列

### 有限状态自动机
- 20:表示数值的字符串

### 找规律:
- 43:1到n中1出现的次数
- 44:数字序列中某一位数字

### 双指针:
- 48:字符串中最长不重复子串的长度
- 57.1:和为s的两个数
- 58.1:反转单词顺序

### 滑动窗口:
- 57.2:和为s的连续正整数序列
- 59.1:滑动窗口中的最大值

### 二分:
- 0.1:📕 log(n)

### 二叉搜索树:
- 0.1 📕 `中序遍历 ==> 递增序列`
- 0.2 📕 `右根左 ==> 递减序列`

### 位运算:
- 0.1 📕 `if(a==b) ==> a^b==0`
- 0.2 📕 `if(a==0) ==> b^a==b`
- 0.3 📕 `int m=1; while((n&m)==0){ m<<=1; }`
