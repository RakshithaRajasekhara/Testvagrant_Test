public class TEST{
public class products{
int unit_price;
int gst;
int quantity;
void products(unit_price,gst,quantity){
this.unitprice=unit_price;
this.gst=gst;
this.quantity=quantity;
}
}
public class Leather_wallet extends products
{
float total=0;
float total_price=unit_price*quantity;
total=total_price(1+(gst/100);
gst_amount=total_price*(gst/100);
if (total>500)
{
total=total(1-.05)
}
public class umbrella extends products
{
float total=0;
float total_price=unit_price*quantity;
total=total_price(1+(gst/100);
gst_amount=total_price*(gst/100);
if (total>500)
{
total=total(1-.05)
}
}
public class cigarette extends products
{
float total=0;
float total_price=unit_price*quantity;
total=total_price(1+(gst/100);
gst_amount=total_price*(gst/100);
if (total>500)
{
total=total(1-.05)
}
}
public class Honey extends products
{
float total=0;
float total_price=unit_price*quantity;
gst_amount=total_price*(gst/100);
total=total_price(1+(gst/100);
if (total>500)
{
total=total(1-.05)
}
}
public static void main(String args[])
{
Leather_wallet item1= new Leather_wallet(1100,18,1)
Umbrealla item2=new Umbrella(900,12,4)
cigarette item3=new cigarette(200,28,3)
Honey item4=new Honey(100,0,3)
total_amount=item1.total+item2.total+item3.total+item4.total;
print(total_amount);
int[] gst={item1.gst_amount,item2.gst_amount,item3.gst_amount,item4.gst_amount};
int max=gst[0];
for(int i=0;i<gst.length;i++)
{
max=Math.max(max,gst[i]);
}
print(max);


}
}