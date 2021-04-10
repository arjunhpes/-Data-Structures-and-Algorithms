class LoveLetter 
{
    public static int rotateWords(String words,int k)
    {
        //splitting the string into words 
        String rotateWord[]=words.split("\\s");
        //making a copy of original string
        String cpy=words.intern();
        //initializing count ot 0
        int count=0;
       //this loop is for total number of rotation        
       for(int i=1;i<=k;i++)
       {   //using this loop for ratotaion of character in each word
           for (int j = 0; j < rotateWord.length; j++) 
           {
              //rotating character of each word
              rotateWord[j]= rotateWord[j].substring(1)+rotateWord[j].charAt(0);
           }
       }
       //splitting the copy of string
       String actualWrod[]=cpy.split("\\s");
       
       //using this loop for rotating word
        for (int i = 0; i < rotateWord.length; i++) 
        {
            //using this loop for actual word
            for (int j = 0; j < actualWrod.length; j++) 
            {
               //comparing rotated words with actual words
               if(rotateWord[i].equals(actualWrod[j]))
                //increment the counter if found same word after rotation
                   count++;
            }
        }
        //return counter
        return count;
    }
    public static void main(String[] args) {
        //printing the results;
        System.out.println(rotateWords("adaada", 3));//1
        System.out.println(rotateWords("loHel endFri", 3));//0
        System.out.println(rotateWords("Hello dFrien", 5));//1
    }
    
