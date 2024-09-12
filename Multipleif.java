public class Multipleif {
    public static void main(String args[]){
        int salary=1000;
        if(salary<1000){
            salary+=2000;
        }else if(salary>500){
            salary+=500;
        }else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}
