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
public node insert_at_front(node a,int f)
{
  if(head==null)
  {
    head.data=f;
    head.next=null;
  }
  else
  {
  node nw=new node(f);
  nw.next=head;
  head=nw;
  }
 return head;
}
public node insert_at_any_pos(node a,int pos,int m)
{
  node nw=new node(m);
 
node temp=a;
for(int i=1;i<pos-1;i++)
{
  temp=temp.next;
}
node ptr=temp.next;
nw.next=ptr;
temp.next=nw;
//temp.next=nw;

//nw.next=temp.next;
  

return head;
}
public void print(node a)
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
  l.print(a);
  System.out.println("enter element to be inserted at front of ll");
  int f=s.nextInt();
  a=l.insert_at_front(a,f);
  System.out.println("link list after insertion at BEGINNING is :");
  l.print(a);
  System.out.println("enter position on which you want to insert element ");
  int pos=s.nextInt();
  System.out.println("enter value to be inserted at "+pos+":");
  int m=s.nextInt();
  a=l.insert_at_any_pos(a,pos,m);
  System.out.println("link list after insertion at DESIRED POSITION is :");
  l.print(a);
}
}