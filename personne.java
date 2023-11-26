 class personne{
    private string name;
    private int  age;
    private static int count=0;

    public personne(){
        name ="zineb " ,age ="20",count++ ;
    public personne(string name, int age)
         self.name = name ;
         self.age  = age;
         count++;
    public static  int getcount(){return count;}
    public string info(){
        return "name ="+name +"\tage="+age;

    class stagiaire{
        public static void main (string[] args)
       personne p1 =new personne();
       personne p2 =new personne();
       system.out.println(p1.info())
    }   
    }    


    }
    
}

