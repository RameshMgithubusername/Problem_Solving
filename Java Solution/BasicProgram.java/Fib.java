class Fib{
public static void main(String args[]){
int n=10,f1=0,f2=1,c;
for(int i=1;i<=n;i++){
if (i==1)
{
System.out.println(f1);
}
else{
c = f2+f1;
System.out.println(c);
f2 = f1;
f1 = c;
}
}
}
}