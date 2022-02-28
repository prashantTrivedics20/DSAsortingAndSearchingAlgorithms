// it is the combination of searching and swapping
public class SelectionSort1 {
    public static void main(String[] args) {
        String a[]={"prashant","kumar","Archana","little","kamasi"};
        int min;
        String temp;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[min].compareTo(a[j])>0)// compareTo() method present in the String class it will compare unicode value
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
