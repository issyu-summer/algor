### åæº¯/dfs *4:
- 12:ð[ç©éµä¸­çè·¯å¾](src/main/java/sword/Main12.java)  
  `1.è¶ç`  
  `--> if(i<0||j<0||i>=row||j>=col) --> false`  
  `2.å­ç¬¦ä¸ç¸å`  
  `--> ar[i][j]==chars[k]`  
  `3.è®¿é®è¿`  
  `--> visited[i][j]`  
  `4.åæº¯`   
  `backTrace(i,j,k)`  
  `--> if(1||2||3) --> false`  
  `--> if(k==chars.len-1) --> true`  
  `--> visited[i][j]=true`  
  `--> res=backTrace(i-1,k+1)||backTrace(i+1,k+1)||backTrace(j-1,k+1)||backTrace(j+1,k+1)`  
  `--> visited[i][j]`  
  `--> return res`  
  `5.ä»ä»»ææ ¼å­å¼å§`  
  `fori forj if(backTrace(i,j,k)) return true`
- 13:ð[æºå¨äººçè¿å¨èå´](src/main/java/sword/Main13.java)  
  `1.æ°ä½å`  
  `s=0,sum() --> while(i!=0)`  
  `--> s+=i%10`  
  `--> i/=10`  
  `return s`  
  `2.è¶çï¼åªæä¸åå³ï¼`  
  `return i>=row||j>=col`  
  `3.è®¿é®è¿`  
  `visited[i][j]`  
  `4.æ¡ä»¶`  
  `ret sum(i)+sum(j)<=k`  
  `5.dfs(i,j)`  
  `if(2||3||4)  ret 0`  
  `visited[i][j]=true`  
  `ret 1+dfs(i+1,j)+dfs(i,j+1)`
- 17:ð[æå°ä»1å°nçæå¤§nä½](src/main/java/sword/Main17.java)
- 38:ð[å¨æå](src/main/java/sword/Main38.java)  
  `1.æ§å¶éå¤`  
  `-->1.1.swap + HashSet`  
  `-->1.2.sort + i>0&&!visited[i-1]&&chars[i]==chars[i-1]`  
  `2.dfs`  
  `-->2.1.`  
  `if(depth==len-1) --> add(sbuilder.toString())  and ret`  
  `set=new HashSet<>() --> fori deep~len`  
  `if(set.contains()) --> continue`  
  `set.add()`  
  `swap(i,deep)-->dfs(deep+1)-->swap(i,deep)`  
  `-->2.2.`

### å¨æè§å *14
- 10:ð[ææ³¢é£å¥æ°å](src/main/java/sword/Main10sb1.java)  
  `dp[i]=dp[i-1]+dp[i-2]`
- 10.2:ð[éèè·³å°é¶](src/main/java/sword/Main10sb2.java)  
  `dp[i]=dp[i-1]+dp[i-2]`
- 14.1:ð[åªç»³å­](src/main/java/sword/Main14sb1.java)  
  `dp[i]=max(dp[i-j]*j,dp[i])  j=2~i-1` 
- 14.2:ð[åªç»³å­2](src/main/java/sword/Main14sb2.java)    
  `dp[i]=max(dp[i-j]*j,dp[i-1])%1e8+7`
- 19:ð[æ­£åè¡¨è¾¾å¼çå¹é](src/main/java/sword/Main19.java)
- 42:ð[è¿ç»­å­æ°ç»çæå¤§å](src/main/java/sword/Main42.java)  
  `if(dp[i-1]<0) dp[i]=nums[i]; else dp[i]=dp[i]+nums[i]`
- 46:ð[ææ°å­ç¿»è¯æå­ç¬¦ä¸²](src/main/java/sword/Main46.java)   
  `if(ä¸¤ä½è½è¡¨ç¤ºä¸ä¸ªå­æ¯) dp[i]=dp[i-1]*1+dp[i-2]*1 else dp[i]=dp[i-1]`
- 47:ð[æå¤§ç¤¼ç©ä»·å¼](src/main/java/sword/Main47.java)   
  `dp[i][j]=max(dp[i-1][j],dp[i][j-1])+grid[i][j]`
- 48:ð[æé¿ä¸å«éå¤å­ç¬¦çå­å­ç¬¦ä¸²](src/main/java/sword/Main48.java)    
  `if(éå°äºéå¤å­ç¬¦){  if(å¨å½ååºåèå´å)  dp[i]=i-j else dp[i]=dp[i-1]+1}  else dp[i]=dp[i-1]+1`
- 49:ð[ä¸æ°](src/main/java/sword/Main49.java)   
  `n2=dp[a]*2;  n3=dp[b]*3;  n5=dp[c]*5;  dp[i]=min(n2,n3,n5)`  
  `if(dp[i]==n2)  a++  if(dp[i]==n3)  b++  if(dp[i]==n5)  c++`
- 60:ð[nä¸ªéª°å­ð²çç¹æ°](src/main/java/sword/Main60.java)    
  `tmp[j+k]+=dp[j]/6.0`
- 62:ð[ååä¸­æåå©ä¸çæ°å­(çº¦çå¤«ç¯)](src/main/java/sword/Main62.java)   
  `dp[i]=(dp[i-1]+m)%i`
- 63:ð[è¡ç¥¨çæå¤§å©æ¶¦](src/main/java/sword/Main63.java)   
  `dp[i]=max(dp[i-1],ar[i]-min(ar[0:i]))`
- 66:ð[æå»ºä¹ç§¯æ°ç»](src/main/java/sword/Main66.java)

### æ°ç» *6
- 3:ð[æ°ç»ä¸­çéå¤æ°å­](src/main/java/sword/Main3.java)  
  `1.åå°ç½®æ¢`  
  `2.HashSet`  
  `--> set -->foreach`  
  `--> if(!set.add(n))  return n;`  
  `3.hashMapç»è®¡`
- 4:ð[äºç»´æ°ç»ä¸­çæ¥æ¾](src/main/java/sword/Main4.java) ==> å·¦å°å³éå¢,ä¸å°ä¸éå¢
- 11:ð[æè½¬æ°ç»çæå°æ°å­](src/main/java/sword/Main11.java) ==> äºå  
  `l=0,r=len-1,mid=l+(r-l)>>1`  
  `midå¤§ål=mid+1`  
  `midå°år=mid`  
  `ç¸ç­år--`
- 56.1:ð[æ°ç»ä¸­æ°å­åºç°çæ¬¡æ°](src/main/java/sword/Main56sb1.java) ==> ä½è¿ç®
- 56.2:ð[æ°ç»ä¸­æ°å­åºç°çæ¬¡æ°2](src/main/java/sword/Main56sb2.java) ==> æªå­¦ä¹ 
- 57.1:ð[åä¸ºsçä¸¤ä¸ªæ°](src/main/java/sword/Main57sb1.java) ==> åæé
### äºå *1
- 11:ð[æè½¬æ°ç»çæå°æ°å­](src/main/java/sword/Main11.java) ==> äºå`if(midå¤§äºr) ä¸å¯è½æ¯æå°l=m+1  else if(midå°äºl) ä¸å¯è½æ¯æå°r=m  else(ç¸ç­) r--;`

### æ©å°æç¥¨ *1
- 39:ð[æ°ç»ä¸­åºç°æ¬¡æ°è¶è¿ä¸åçæ°å­](src/main/java/sword/Main39.java)   
  `foreach`  
  `-->if(votes==0) x=n;`  
  `-->x += x==n?1:-1`

### åå°ç½®æ¢
- 3:ð[æ°ç»ä¸­çéå¤æ°å­](src/main/java/sword/Main3.java) ==> 1.åå°ç½®æ¢\2.hashSet`if(!set.add(e))  {return e;}`\3.hashMapç»è®¡
- 53.2:ð[0ï½n-1ä¸­ç¼ºå¤±çæ°å­](src/main/java/sword/Main53sb2.java) ==>`fori if(i!=ar[i]){ return i; }`

### å¶ä»:
- 16:ð[æ°å¼çæ´æ°æ¬¡æ¹](src/main/java/sword/Main16.java)  
  `n==0 ret1  n<0  n=-n ret 1.0/pow(x,n) else ret pow(x,n)`
- 29:ð[é¡ºæ¶éæå°ç©éµ](src/main/java/sword/Main29.java)
- 41:ð[æ°æ®æµä¸­çä¸­ä½æ°](src/main/java/sword/Main41.java)
- 57.2:åä¸ºsçè¿ç»­æ­£æ´æ°åºå
- 59.2:ð[éåçæå¤§å¼](src/main/java/sword/Main59sb2.java)

### æ°å­¦é®é¢ *2
- 64:ð[è®¡ç®1+2+...+n(ä¸ä½¿ç¨è¿ç®ç¬¦)](src/main/java/sword/Main64.java)  
  `é»è¾ç¬¦ç­è·¯`  
  `boolean b=n>1&&(n+=sum(n-1))>0 --> return n`
- 61:ð[æåçä¸­çé¡ºå­](src/main/java/sword/Main61.java)  
 `ééå¤(HashSet) + max-min<5`  
  `set,min=14,max=0 --> foreach`  
  `--> if(n==0) continue;`  
  `--> if(!set.add(n)) return false`  
  `--> max=max(max,n)  min=min(min,n)`  
  `return max-min<4`
  
### ä½è¿ç® *2
- 65:ð[ä¸ä½¿ç¨å åä¹é¤åå æ³](src/main/java/sword/Main65.java)  
  `å = è¿ä½åã(a^b)<<1ã + éè¿ä½åãa^bã`  
  `add(a,b) --> return b==0ï¼a:add(a^b,(a&b)<<1)`
- 15:ð[äºè¿å¶ä¸­1çä¸ªæ°(æ±æéé)](src/main/java/sword/Main15.java)  
  `1.n&n-1æ¶æ1ä½1`  
  `res=0 --> while(n!=0)`  
  `res++`  
  `n&=n-1`  
  `return res`  
  `2.n&1==1 æå³ä½æ¯1`  
  `res=0 --> while(n!=0)`
  `res+=n&1 n>>>=1`  
  `return res`

### å­ç¬¦ä¸² *5
- 5:ð[æ¿æ¢ç©ºæ ¼](src/main/java/sword/Main5.java)
- 50:ð[å­ç¬¦ä¸²ä¸­ç¬¬ä¸ä¸ªåºç°1æ¬¡çæ°å­](src/main/java/sword/Main50.java)
- 58.1:ð[åè½¬åè¯é¡ºåº](src/main/java/sword/Main58sb1.java)
- 58.2:ð[å·¦æå­ç¬¦ä¸²](src/main/java/sword/Main58sb2.java)
- 67:ð[å­ç¬¦ä¸²è½¬æ°å­](src/main/java/sword/Main67.java)

### é¾è¡¨ *7
- 6:ð[ä»å°¾å°å¤´æå°é¾è¡¨](src/main/java/sword/Main6.java)  
  `1.æ `  
  `ret,stack,node=head --> while(head!=null)`  
  `--> stack.push(node.val)`  
  `--> node=node.next`  
  `while(!stack.isEmpty())`  
  `--> ret.add(stack.pop())`  
  `2.éå½`  
  `ret,node=head --> recur(node)`  
  `--> if(node==null) return;`  
  `--> recur(node.next)`  
  `--> ret.add(node.val)`
- 18:ð[å é¤é¾è¡¨çèç¹](src/main/java/sword/Main18.java)  
  `åé©±ååç»§`  
  `åç¬å¤çhead --> if(val=head.val) return head.next`  
  `pre=head,cur=head.next --> while(cur!=null)`  
  `--> if(val==cur.val) break`    
  `--> pre=pre.next  cur=cur.next}`  
  `if(cur!=null) pre.next=cur.next --> return head`
- 22:ð[é¾è¡¨çåæ°ç¬¬Kä¸ªèç¹](src/main/java/sword/Main22.java)  
  `node=tmp=head --> while(tmp!=null)`  
  `--> if(k--<0) node=node.next`
- 24:ð[åè½¬é¾è¡¨](src/main/java/sword/Main24.java)  
  `1.åé©±ååç»§`  
  `pre=null,cur=head`  
  `while(cur!=null)`  
  `--> tmp=cur.next`  
  `--> cur.next=pre`  
  `--> pre=cur`  
  `--> cur=tmp`  
  `return pre`  
  `2.éå½`  
  `recur(cur,pre)`  
  `--> if(cur==null) return pre`  
  `--> res = recur(cur.next,cur)`  
  `--> cur.next=pre`  
  `--> return res`
- 25:ð[åå¹¶ä¸¤ä¸ªæåºé¾è¡¨](src/main/java/sword/Main25.java)  
  `èæå¤´èç¹`
- 35:ð[å¤æé¾è¡¨çå¤å¶](src/main/java/sword/Main35.java)
  `è¾å©çº¿`
- 52:ð[ä¸¤ä¸ªé¾è¡¨çç¬¬ä¸ä¸ªå¬å±èç¹](src/main/java/sword/Main52.java)
  `tmpA=headA,tmpB=headB --> while(tmpA!=tmpB)`  
  `-->tmpA=tmpA==null?headB:tmpA.next`  
  `-->tmpB=tmpB==null>headA:tmpB.next`  
  `return tmpA`

### äºåæ  *9
- 7:ð[éå»ºäºåæ ](src/main/java/sword/Main7.java)  
  `ååº+ä¸­åºæèååº+ä¸­åº`  
  `ç¼å­ä¸­åºéådict`  
  `éå½æå»ºæ ` 
  `node = new TreeNode(preorder[root])`  
  `--> i=dict.get(preorder[root])`
  `--> node.left=ï¼root+1,left,i-1ï¼`  
  `--> node.right=(i-left+root+1,i+1,right)`
- 26:ð[æ çå­ç»æ](src/main/java/sword/Main26.java)  
  `recur(s,sb)||isSubStruce(s.left,sb)||isSubStrurctue(s.right,sb)`
  `recur(s,sb)  å¦æsbä¸ºç©ºï¼åå¨é¨æ¾å°è¿åtrueï¼å¦æsä¸ºç©ºæès.val!=sb.val åè¿åfalse ret recur(s.left,sb.left)&&recur(s.right,sb.right)`
- 27:ð[äºåæ çéå](src/main/java/sword/Main27.java)  `æå­äº¤æ¢ï¼ææ ¹è¿å`  
  `recur(root)`  
  `--> if(root==null) return null`  
  `--> tmp=root.left`  
  `--> root.left=recur(root.right)`  
  `--> root.right=recur(tmp)`  
  `--> return root`
- 28::ð[å¯¹ç§°çäºåæ ](src/main/java/sword/Main28.java)  
  `æå·¦è¾¹ä¸æå³è¾¹æ¯è¾ï¼ä¸­é´åä¸­é´æ¯è¾recur(l.left,r.right)&&recur(l.right,r.left)`
- 32.1.2.3:ð[ä»ä¸å°ä¸æå°äºåæ ](src/main/java/sword/Main32sb1.java)
- 37:ð[äºåæ çåºååä¸ååºåå](src/main/java/sword/Main37.java)
- 38:äºåæç´¢æ ä¸­çç¬¬Kå¤§èç¹
- 55.1:ð[äºåæ çæ·±åº¦](src/main/java/sword/Main55sb1.java)
- 55.2:ð[å¹³è¡¡äºåæ ](src/main/java/sword/Main55sb2.java)
#### éå
- 34:ð[äºåæ ä¸­åä¸ºæä¸ªå¼çè·¯å¾](src/main/java/sword/Main34.java)  
  `ååºéå:æ ¹å·¦å³`  
  `dfs(root)`  
  `if(root==null) --> return`  
  `tmp.add(root.val)`  
  `target-=root.val`  
  `if(target==0&&root.right==null&&root.left==null) --> list.add(new ArrayList(tmp))`  
  `dfs(root.left)`  
  `dfs(root.right)`  
  `tmp.remove(root.val)`


### äºåæç´¢æ  *4
- 33:ð[äºåæç´¢æ çåç»­éå](src/main/java/sword/Main33.java)
- 36:ð[äºåæç´¢æ ä¸æåºå¾ªç¯ååé¾è¡¨](src/main/java/sword/Main36.java)
- 68.1:ð[äºåæç´¢æ çæè¿å¬å±ç¥å](src/main/java/sword/Main68sb1.java)  
  `éå½ï¼åæ¶æ¯æ ¹å¤§ï¼å¨æ ¹å·¦ï¼åæ¶æ¯æ ¹å°ï¼å¨æ ¹å³`
- 68.2:ð[äºåæ çæè¿å¬å±ç¥å](src/main/java/sword/Main68sb2.java)

### éåãæ  *4
- 9:ð[ä½¿ç¨ä¸¤ä¸ªæ å®ç°éå](src/main/java/sword/Main9.java)
  `é¡ºåºæ ï¼å¥ï¼+éåºæ ï¼å°é¡ºåºæ åç´ æ¾å¥éåºæ ãåºï¼`  
- 30:ð[åå«minæ¹æ³çæ ](src/main/java/sword/Main30.java)
  `æ ãéåºæ ï¼å¥ï¼æ å¥ï¼å¦æéåºæ ä¸ºç©ºï¼éåºæ å¥ï¼å¦åå¦æåç´ æ¯éåºæ é¡¶é¨åç´ å°ï¼åå¥ï¼åºï¼å¦ææ åºç­äºéåºæ é¡¶é¨ï¼éåºæ åºï¼`
- 31:ð[æ çåå¥ãå¼¹åºåºå](src/main/java/sword/Main31.java)

### æéç¶æèªå¨æº
- 20:è¡¨ç¤ºæ°å¼çå­ç¬¦ä¸²

### æ¾è§å¾:
- 43:1å°nä¸­1åºç°çæ¬¡æ°
- 44:æ°å­åºåä¸­æä¸ä½æ°å­

### åæé *4
- 21:ð[å¥æ°ä½äºå¶æ°å](src/main/java/sword/Main21.java) ==> ä»å·¦æ¾å¶æ°,ä»å³æ¾å¥æ°,æ¾å°ä¸ç»å³äº¤æ¢
- 48:ð[å­ç¬¦ä¸²ä¸­æé¿ä¸éå¤å­ä¸²çé¿åº¦](src/main/java/sword/Main48.java)
- 57.1:ð[åä¸ºsçä¸¤ä¸ªæ°](src/main/java/sword/Main57sb1.java)  
  `i=0,j=len-1`  
  `while i<=j`  
  `if  target<ar[i]+ar[j]`  
  `-->  j--`  
  `else if target>ar[i]+ar[j]`  
  `--> i++`  
  `else`  
  `--> break`
- 58.1:åè½¬åè¯é¡ºåº


### æ»å¨çªå£: *2
- 57.2:ð[åä¸ºsçè¿ç»­æ­£æ´æ°åºå](src/main/java/sword/Main57sb2.java)
- 59.1:ð[æ»å¨çªå£ä¸­çæå¤§å¼](src/main/java/sword/Main59sb1.java)

### äºå:
- 0.1:ð log(n)

### äºåæç´¢æ :
- 0.1 ð `ä¸­åºéå ==> éå¢åºå`
- 0.2 ð `å³æ ¹å·¦ ==> éååºå`

### ä½è¿ç®:
- 0.1 ð `if(a==b) ==> a^b==0`
- 0.2 ð `if(a==0) ==> b^a==b`
- 0.3 ð `int m=1; while((n&m)==0){ m<<=1; }`
- 53.2:ð[0ï½n-1ä¸­ç¼ºå¤±çæ°å­](src/main/java/sword/Main53sb2.java)  
  `ans=0-->fori ans^=(i+1)^ar[i]`
- 56.1:ð[æ°ç»ä¸­æ°å­åºç°çæ¬¡æ°](src/main/java/sword/Main56sb1.java)   
  `1. ans=0-->foreach ans^=n`  
  `2. åç» m=1-->while((ans&m)==0) m<<=1`  
  `3. x=0,y=0-->foreach if(x&m==0) x^=n else y^=n`


### æªå­¦ä¹ 
- 45:ð[ææ°ç»æææå°çæ°](src/main/java/sword/Main45.java)  
  `æ ¹æ®è§åæ¥æåº Arrays.sort(ar,(x,y)->(x+y).compareTo(y+x));`
- 53.1:ð[æåºæ°ç»ä¸­æ¥æ¾æ°å­](src/main/java/sword/Main53sb1.java) 
- 56.2:ð[æ°ç»ä¸­æ°å­åºç°çæ¬¡æ°2](src/main/java/sword/Main56sb2.java)

### topK *1
- 40:ð[æå°çKä¸ªæ°(topKé®é¢)](src/main/java/sword/Main40.java)  
  `1.ä¼åéåï¼å ï¼é»è®¤æ¯å°æ ¹å `  
  `queue=new PriorityQueue<>((v1,v2)->v2-v1) --> å¤§æ ¹å ,æ¯æ¬¡éè¦pollæ¯è¾å¤§ç`  
  `foreach --> if(queue.size()<k) --> queue.add(n)`  
  `--> else if(queue.peek()>n) --> queue.poll() and queue.add(n)`  
  `2.å¿«æææ³  è¶çç´æ¥returnå³å¯ æ³¨ææ¯è¾å¤§å°æç­å·ï¼`   
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
  `3.è®¡æ°æåºï¼æéä¸ªï¼`

### æåº
- QuickSort:ð[å¿«éæåº](src/main/java/sort/QuickSort.java)
- CountSort:ð[è®¡æ°æåº](src/main/java/sort/CountSort.java)
- MergeSort:ð[å½å¹¶æåº](src/main/java/sort/MergeSort.java)
- HeapSort:ð[å æåº](src/main/java/sort/HeapSort.java)

### ä¼åéå(æ±ç¸åç)
- å°é¡¶å æ±åKå¤§
- å¤§é¡¶å æ±åKå°
###
- 40äº¿ä¸­æ¾1ä¸ª,ä½å¾ææå
