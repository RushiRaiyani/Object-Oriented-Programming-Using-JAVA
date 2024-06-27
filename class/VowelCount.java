import java.util.Scanner;
class StringVowel{
    int ans[]=new int[5];
    StringVowel(){
        for(int i=0;i<5;i++){
            ans[i]=0;
        }
    }
    int[] count(char check,int arr[]){
if(check=='A' || check=='a'){
    ans[0]++;
}
else if(check=='E' || check=='e'){
ans[1]++;
}
else if(check=='I' || check=='i'){
ans[2]++;
}
else if(check=='O' || check=='o'){
ans[3]++;
}
else if(check=='U' || check=='u'){
ans[4]++;
}
return ans;
    }
}

public class VowelCount {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    for(int i=0;i<5;i++){
        arr[i]=0;
    }
String s;
    StringVowel vowels=new StringVowel();
    byte x=0;
    while(x!=1){
        System.out.print("Enter a string:");
        System.out.println("vowels count will be displayed till you enter word 'quit':");
        s=sc.nextLine();
        if(s.equals("quit")){
            x=1;
            break;
        }
        else{
            x=0;
        }
    for(int i=0;i<s.length();i++){
        char l=s.charAt(i);
        arr=vowels.count(l,arr);
    }
}
System.out.println("A:"+arr[0]);
System.out.println("E:"+arr[1]);
System.out.println("I:"+arr[2]);
System.out.println("O:"+arr[3]);
System.out.println("U:"+arr[4]);
}    
}