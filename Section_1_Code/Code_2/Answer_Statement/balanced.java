class balanced {
    
    public static String[] fun(String s2[])
    {
        int count=0;
        
        String x[]=new String[s2.length];
        for(int j=0;j<s2.length;j++)
        {
            
            String q=s2[j];
            char a[]=q.toCharArray();
            int flag=0;
            Stack<Character>f=new Stack<>();
  
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='(')
            {
                f.push(')');
            }
            else if(a[i]=='{')
            {
                f.push('}');
            }
            else if(a[i]=='[')
            {
                f.push(']');
            }
            else
            {
                if(f.isEmpty())
                {
                     flag=1;
                    break;
                }
                else if(f.peek()==a[i])
                {
                    f.pop();
                }
                else
                {
                     flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            x[count++]="NO";
       
        }
        else
        {
            if(f.isEmpty())
        {
           x[count++]="YES";
        
        }
        else{
             x[count++]="NO";
            
        }
        }
        }
        return x;
           
        
    }
 public static void main (String[] args) {
     
    String s[]=new String[]{"{}","{[}]"};
    String arr[]=fun(s);
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);  
    }
    
 }
}