### git
git config --global --unset http.proxy
git config --global http.sslVerify "false"
### 数组
- 1、两数之和`排序+双指针->找到两个数`/`哈希表先判断后放,找到两个索引`
### 链表
- 2、两数相加  
  `模拟`  
  `carry=0`  
  
### 双指针  
- 3、最长不含重复字符的字符串 
- 10、盛最多水的容器  
  `寻找短板`
### 动态规划
- 5、最长回文串  
  `需要枚举长度`
- 1143、最长公共序列
  `if c1==c2 dp[i][j]=dp[i-1][j-1]+1`  
  `else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])`
### 字符串
- 8、字符串转整数  
  `ar=s.trim().toCharArray(),res=0,sign=1,i=1,boundary=Integer.MAX_VALUE/10`  
  `--> if(ar[0]=='-') sign=-1`  
  `--> else if(ar[0]!='+') i=0`
  `--> for i~len(s)`  
  `--> if(ar[i]<'0'||ar[i]>'9')  break`  
  `--> if(res>boundary||res==boundary&&ar[i]>'7') return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE`  
  `--> res=10*res+(ar[i]-'0')`
  `--> return sign*res`
### 回文串
- 5、最长回文串
- 9、回文数
### 二分
- 33、旋转数组中搜索数字
### 其他
- 7、整数反转  
  `res=0,tmp,last-->while(x!=0)`  
  `--> tmp=x%10`  
  `--> res=10*res+tmp`  
  `--> last=res`  
  `--> if(last!=res/10) --> return 0`  
  `--> x/=10`  
  `return res`
- 8、下一个排列  
  
  
