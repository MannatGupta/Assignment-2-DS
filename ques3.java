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
public node del_val(int dv)
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
public node update(node a)
{
  node d=null;
  node temp=head;
  node ptr=head;
  while(temp!=null)
  {
    while(ptr!=null)
    {

      if(temp.data+ptr.data==0)
      {
        d=del_val(temp.data);
        d=del_val(ptr.data);
      }
      ptr=ptr.next;
    }
    temp=temp.next;
ptr=head;
  }
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
  System.out.println("After deletion of elements having same value but different signs");
  a=l.update(a);
  l.fwd_print(a);
   
}
}
