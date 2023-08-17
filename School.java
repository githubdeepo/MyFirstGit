class School{
void details(String name){
System.out.println(name);
}
void details(int strength){
System.out.println(strength);
}
void details(String address,int pincode){
System.out.println(address+" "+pincode);
}
void details(String course,double fee){
System.out.println(course+" "+fee);
}
public static void main(String[] args){
School s=new School();
s.details("BPS");
s.details(1500);
s.details("buxar",802101);
s.details("b.tech",34987.876);
}
 }