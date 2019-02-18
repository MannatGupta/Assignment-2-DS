import java.util.*;
class node
{
int data;
node  next;
node(int data)
{
  this.data=data;
  this.next=null;
}
}
class link
{
   node head=null;
public node add(int data)
{
  
  if(head==null)
  {
    head=new node(data);
  }
  else
  {
    node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=new node(data);
  }
  return head;
}
public node del_at_front(node a)
{
node temp=head;
node ptr=null;

head=temp.next;
temp.next=ptr;
return head;

}
public node del_val(node a,int dv)
{
node temp=head;
node ptr=null;
while(temp.data!=dv)
{
  ptr=temp;
  temp=ptr.next;
}
ptr.next=temp.next;
return head;
}
public node del_at_end(node a)
{
  node temp=head;
  node ptr=null;
  while(temp.next.next!=null)
  {
    temp=temp.next;
  }
  temp.next=ptr;
  return head;
}
public void fwd_print(node a)
{
node temp=a;
while(temp!=null)
{
  System.out.print(temp.data+" ");
  temp=temp.next;
}
System.out.println();
}

}

class Main{
  public static void main(String[] args)
  {
  link l=new link();
  Scanner s=new Scanner(System.in);
  System.out.println("enter size");
  int size=s.nextInt();
  node a=null;
  System.out.println("insert elements in linklist");
  for(int i=1;i<=size;i++)
  {
  int data=s.nextInt();
  a=l.add(data);
  }
  System.out.println("printed link list is :");
  l.fwd_print(a);
  a=l.del_at_front(a);
  System.out.println("after deletion from FRONT");
  l.fwd_print(a);
  System.out.println("enter value of element t be deleted from ll");
  int dv=s.nextInt();
  a=l.del_val(a,dv);
  System.out.println("after deletion of DESIRED element");
  l.fwd_print(a);
  System.out.println("after deletion from END");
  a=l.del_at_end(a);
  l.fwd_print(a);
  

  
}
}