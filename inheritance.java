   class book {
    String name = "book";
    public void bookname()
   {
    System.out.println("computer science");
}
}
   class language extends book{
    String  languagename = "flowchart";
    public void languagename()
    {
        System.out.println("diagrams");

    }
}
   class algorithm extends language
   {
    String algorithmname = "pseudocode";
    public void algorithmname()
    {
        System.out.println("codes");
    }
}
   class programming extends algorithm
   {
    String Programmingname = "java";
    public void Programmingname() 
    {
        System.out.println("java codes");
    }
}
       public class inheritance
       {
            public static void main(String[]args)
            {
                programming obj = new programming();
                obj.bookname();
                obj.languagename();
                obj.algorithmname();
                    
}
       }