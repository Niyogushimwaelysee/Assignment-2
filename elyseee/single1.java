

class Single 
{
public static void main(String args[]) 
{
Bob d = new Bob();
d.Study();
d.Play();
}
}class Student 
{
void Play() 
{
System.out.println("Playing Fooball...");
}
}
class Bob extends Student 
{
void Study() 
{
System.out.println("Studing Physic...");
}
}
