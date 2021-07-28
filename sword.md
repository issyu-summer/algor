### 回溯/dfs *4:
- 12:🔗[矩阵中的路径](src/main/java/sword/Main12.java)  
  `1.越界`  
  `--> if(i<0||j<0||i>=row||j>=col) --> false`  
  `2.字符不相同`  
  `--> ar[i][j]==chars[k]`  
  `3.访问过`  
  `--> visited[i][j]`  
  `4.回溯`   
  `backTrace(i,j,k)`  
  `--> if(1||2||3) --> false`  
  `--> if(k==chars.len-1) --> true`  
  `--> visited[i][j]=true`  
  `--> res=backTrace(i-1,k+1)||backTrace(i+1,k+1)||backTrace(j-1,k+1)||backTrace(j+1,k+1)`  
  `--> visited[i][j]`  
  `--> return res`  
  `5.从任意格子开始`  
  `fori forj if(backTrace(i,j,k)) return true`
- 13:🔗[机器人的运动范围](src/main/java/sword/Main13.java)  
  `1.数位和`  
  `s=0,sum() --> while(i!=0)`  
  `--> s+=i%10`  
  `--> i/=10`  
  `return s`  
  `2.越界（只有下和右）`  
  `return i>=row||j>=col`  
  `3.访问过`  
  `visited[i][j]`  
  `4.条件`  
  `ret sum(i)+sum(j)<=k`  
  `5.dfs(i,j)`  
  `if(2||3||4)  ret 0`  
  `visited[i][j]=true`  
  `ret 1+dfs(i+1,j)+dfs(i,j+1)`
- 17:打印从1到n的最大n位
- 38:🔗[全排列](src/main/java/sword/Main38.java)  
  `1.控制重复`  
  `-->1.1.swap + HashSet`  
  `-->1.2.sort + i>0&&!visited[i-1]&&chars[i]==chars[i-1]`  
  `2.dfs`  
  `-->2.1.`  
  `if(depth==len-1) --> add(sbuilder.toString())  and return`  
  `set=new HashSet<>() --> fori deep~len`  
  `if(set.contains()) --> continue`  
  `set.add()`  
  `swap(i,deep)-->dfs(deep+1)-->swap(i,deep)`  
  `-->2.2.`

### 动态规划 *14
- 10:🔗[斐波那契数列](src/main/java/sword/Main10sb1.java)  
  `dp[i]=dp[i-1]+dp[i-2]`
- 10.2:🔗[青蛙跳台阶](src/main/java/sword/Main10sb2.java)  
  `dp[i]=dp[i-1]+dp[i-2]`
- 14.1:🔗[剪绳子](src/main/java/sword/Main14sb1.java)  
  `dp[i]=max(dp[i-j]*j,dp[i-1])`
- 14.2:剪绳子  
  `dp[i]=max(dp[i-j]*j,dp[i-1])%1e8+7`
- 19:正则表达式的匹配
- 42:🔗[连续子数组的最大和](src/main/java/sword/Main42.java)  
  `if(dp[i-1]<0) dp[i]=nums[i]; else dp[i]=dp[i]+nums[i]`
- 46:🔗[把数字翻译成字符串](src/main/java/sword/Main46.java)   
  `if(两位能表示一个字母) dp[i]=dp[i-1]*1+dp[i-2]*1 else dp[i]=dp[i-1]`
- 47:🔗[最大礼物价值](src/main/java/sword/Main47.java)   
  `dp[i][j]=max(dp[i-1][j],dp[i][j-1])+grid[i][j]`
- 48:🔗[最长不含重复字符的子字符串](src/main/java/sword/Main48.java)    
  `if(遇到了重复字符){  if(在当前序列范围内)  dp[i]=i-j else dp[i]=dp[i-1]+1}  else dp[i]=dp[i-1]+1`
- 49:🔗[丑数](src/main/java/sword/Main49.java)   
  `n2=dp[a]*2;  n3=dp[b]*3;  n5=dp[c]*5;  dp[i]=min(n2,n3,n5)`  
  `if(dp[i]==n2)  a++  if(dp[i]==n3)  b++  if(dp[i]==n5)  c++`
- 60:🔗[n个骰子🎲的点数](src/main/java/sword/Main60.java)    
  `tmp[j+k]+=dp[j]/6.0`
- 62:🔗[圆圈中最后剩下的数字(约瑟夫环)](src/main/java/sword/Main62.java)   
  `dp[i]=(dp[i]+m)%i`
- 63:🔗[股票的最大利润](src/main/java/sword/Main63.java)   
  `dp[i]=max(dp[i-1],ar[i]-min(ar[0:i]))`
- 67:🔗[构建乘积数组](src/main/java/sword/Main67.java)

### 数组 *6
- 3:🔗[数组中的重复数字](src/main/java/sword/Main3.java)  
  `1.原地置换`  
  `2.HashSet`  
  `--> set -->foreach`  
  `--> if(!set.add(n))  return n;`  
  `3.hashMap统计`
- 4:🔗[二维数组中的查找](src/main/java/sword/Main4.java) ==> 左到右递增,上到下递增
- 11:🔗[旋转数组的最小数字](src/main/java/sword/Main11.java) ==> 二分
- 56.1:🔗[数组中数字出现的次数](src/main/java/sword/Main56sb1.java) ==> 位运算
- 56.2:🔗[数组中数字出现的次数2](src/main/java/sword/Main56sb2.java) ==> 未学习
- 57.1:🔗[和为s的两个数](src/main/java/sword/Main57sb1.java) ==> 双指针
### 二分 *1
- 11:🔗[旋转数组的最小数字](src/main/java/sword/Main11.java) ==> 二分`if(mid大于r) 不可能是最小l=m+1  else if(mid小于l) 不可能是最小r=m  else(相等) r--;`

### 摩尔投票 *1
- 39:🔗[数组中出现次数超过一半的数字](src/main/java/sword/Main39.java)   
  `foreach`  
  `-->if(votes==0) x=n;`  
  `-->x += x==n?1:-1`

### 原地置换
- 3:🔗[数组中的重复数字](src/main/java/sword/Main3.java) ==> 1.原地置换\2.hashSet`if(!set.add(e))  {return e;}`\3.hashMap统计
- 53.2:🔗[0～n-1中缺失的数字](src/main/java/sword/Main53sb2.java) ==>`fori if(i!=ar[i]){ return i; }`

### 其他:
- 16:数值的整数次方
- 29:顺时针打印矩阵
- 41:数据流中的中位数
- 57.2:和为s的连续正整数序列
- 59.2:队列的最大值

### 数学问题 *2
- 64:🔗[计算1+2+...+n(不使用运算符)](src/main/java/sword/Main64.java)  
  `逻辑符短路`  
  `boolean b=n>1&&(n+=sum(n-1))>0 --> return n`
- 61:🔗[扑克牌中的顺子](src/main/java/sword/Main61.java)  
 `非重复(HashSet) + max-min<5`  
  `set,min=14,max=0 --> foreach`  
  `--> if(n==0) continue;`  
  `--> if(!set.add(n)) return false`  
  `--> max=max(max,n)  min=min(min,n)`  
  `return max-min<4`
  
### 位运算 *2
- 65:🔗[不使用加减乘除做加法](src/main/java/sword/Main65.java)  
  `和 = 进位和【(a^b)<<1】 + 非进位和【a^b】`  
  `add(a,b) --> return b==0？a:add(a^b,(a&b)<<1)`
- 15:🔗[二进制中1的个数(汉明重量)](src/main/java/sword/Main15.java)  
  `1.n&n-1消掉1位1`  
  `res=0 --> while(n!=0)`  
  `res++`  
  `n&=n-1`  
  `return res`  
  `2.n&1==1 最右位是1`  
  `res=0 --> while(n!=0)`
  `res+=n&1 n>>>=1`  
  `return res`

### 字符串 *5
- 5:🔗[替换空格](src/main/java/sword/Main5.java)
- 50:🔗[字符串中第一个出现1次的数字](src/main/java/sword/Main50.java)
- 58.1:🔗[反转单词顺序](src/main/java/sword/Main58sb1.java)
- 58.2:🔗[左旋字符串](src/main/java/sword/Main58sb2.java)
- 67:🔗[字符串转数字](src/main/java/sword/Main6ytop7.java)

### 链表 *7
- 6:🔗[从尾到头打印链表](src/main/java/sword/Main6.java)  
  `1.栈`  
  `ret,stack,node=head --> while(head!=null)`  
  `--> stack.push(node.val)`  
  `--> node=node.next`  
  `while(!stack.isEmpty())`  
  `--> ret.add(stack.pop())`  
  `2.递归`  
  `ret,node=head --> recur(node)`  
  `--> if(node==null) return;`  
  `--> recur(node.next)`  
  `--> ret.add(node.val)`
- 18:🔗[删除链表的节点](src/main/java/sword/Main18.java)  
  `前驱和后继`  
  `单独处理head --> if(val=head.val) return head.next`  
  `pre=head,cur=head.next --> while(cur!=null)`  
  `--> if(val==cur.val) break`    
  `--> pre=pre.next  cur=cur.next}`  
  `if(cur!=null) pre.next=cur.next --> return head`
- 22:🔗[链表的倒数第K个节点](src/main/java/sword/Main22.java)  
  `node=tmp=head --> while(tmp!=null)`  
  `--> if(k--<0) node=node.next`
- 24:🔗[反转链表](src/main/java/sword/Main24.java)  
  `1.前驱和后继`  
  `pre=null,cur=head`  
  `while(cur!=null)`  
  `--> tmp=cur.next`  
  `--> cur.next=pre`  
  `--> pre=cur`  
  `--> cur=tmp`  
  `return pre`  
  `2.递归`  
  `recur(cur,pre)`  
  `--> if(cur==null) return pre`  
  `--> res = recur(cur.next,cur)`  
  `--> cur.next=pre`  
  `--> return res`
- 25:🔗[合并两个排序链表](src/main/java/sword/Main25.java)  
  `虚拟头节点`
- 35:🔗[复杂链表的复制](src/main/java/sword/Main35.java)
  `辅助线`
- 52:🔗[两个链表的第一个公共节点](src/main/java/sword/Main52.java)
  `tmpA=headA,tmpB=headB --> while(tmpA!=tmpB)`  
  `-->tmpA=tmpA==null?headB:tmpA.next`  
  `-->tmpB=tmpB==null>headA:tmpB.next`  
  `return tmpA`

### 二叉树 *9
- 7:重建二叉树
- 26:树的子结构
- 27:🔗[二叉树的镜像](src/main/java/sword/Main27.java)  
  `recur(root)`  
  `--> if(root==null) return null`  
  `--> tmp=root.left`  
  `--> root.left=recur(root.right)`  
  `--> root.right=recur(tmp)`  
  `--> return root`
- 28:对称的二叉树
- 32.1.2.3:从上到下打印二叉树
- 37:二叉树的序列化与反序列化
- 38:二叉搜索树中的第K大节点
- 55.1:二叉树的深度
- 55.2:平衡二叉树
#### 遍历
- 34:🔗[二叉树中和为某个值的路径](src/main/java/sword/Main34.java)  
  `前序遍历:根左右`  
  `dfs(root)`  
  `if(root==null) --> return`  
  `tmp.add(root.val)`  
  `target-=root.val`  
  `if(target==0&&root.right==null&&root.left==null) --> list.add(new ArrayList(tmp))`  
  `dfs(root.left)`  
  `dfs(root.right)`  
  `tmp.remove(root.val)`


### 二叉搜索树 *4
- 33:🔗[二叉搜索树的后续遍历](src/main/java/sword/Main33.java)
- 36:🔗[二叉搜索树与排序循环双向链表](src/main/java/sword/Main36.java)
- 68.1:🔗[二叉搜索树的最近公共祖先](src/main/java/sword/Main68sb1.java)
- 68.2:🔗[二叉树的最近公共祖先](src/main/java/sword/Main68sb2.java)

### 队列、栈 *4
- 9:使用两个栈实现队列
- 30:🔗[包含min方法的栈](src/main/java/sword/Main30.java)
- 31:栈的压入、弹出序列

### 有限状态自动机
- 20:表示数值的字符串

### 找规律:
- 43:1到n中1出现的次数
- 44:数字序列中某一位数字

### 双指针 *4
- 21:🔗[奇数位于偶数前](src/main/java/sword/Main21.java) ==> 从左找偶数,从右找奇数,找到一组即交换
- 48:🔗[字符串中最长不重复子串的长度](src/main/java/sword/Main48.java)
- 57.1:🔗[和为s的两个数](src/main/java/sword/Main57sb1.java)  
  `i=0,j=len-1`  
  `while i<=j`  
  `if  target<ar[i]+ar[j]`  
  `-->  j--`  
  `else if target>ar[i]+ar[j]`  
  `--> i++`  
  `else`  
  `--> break`
- 58.1:反转单词顺序


### 滑动窗口: *2
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
- 53.2:🔗[0～n-1中缺失的数字](src/main/java/sword/Main53sb2.java)  
  `ans=0-->fori ans^=(i+1)^ar[i]`
- 56.1:🔗[数组中数字出现的次数](src/main/java/sword/Main56sb1.java)   
  `1. ans=0-->foreach ans^=n`  
  `2. 分组 m=1-->while((ans&m)==0) m<<=1`  
  `3. x=0,y=0-->foreach if(x&m==0) x^=n else y^=n`


### 未学习
- 45:🔗[把数组排成最小的数](src/main/java/sword/Main45.java) 
- 53.1:🔗[排序数组中查找数字](src/main/java/sword/Main53sb1.java) 
- 56.2:🔗[数组中数字出现的次数2](src/main/java/sword/Main56sb2.java)

### topK *1
- 40:🔗[最小的K个数(topK问题)](src/main/java/sword/Main40.java)  
  `1.优先队列（堆）`  
  `queue=new PriorityQueue<>((v1,v2)->v2-v1) --> 大根堆,每次需要poll比较大的`  
  `foreach --> if(queue.size()<k) --> queue.add(n)`  
  `--> else if(queue.peek()>n) --> queue.poll() and queue.add(n)`  
  `2.快排思想`   
  `ret:int [] --> quickSort(int []ar,int l,int r)`   
  `int i=l,j=r`  
  `while(i<j)`  
  `--> while(i<j&&ar[j]>=ar[l])  j--`  
  `--> while(i<j&&ar[i]<=ar[l])  i++`  
  `--> swap(ar,i,j)`  
  `swap(ar,i,l)`  
  `if(i<k) return quickSort(ar,i+1,r)`  
  `if(i>k) reutnr quickSort(ar,l,i-1)`  
  `return Arrays.copyOf(ar,k)`  
  `3.计数排序（有限个）`

### 排序
- QuickSort:🔗[快速排序](src/main/java/sort/QuickSort.java)
- CountSort:🔗[计数排序](src/main/java/sort/CountSort.java)
