package com.company;

import static java.lang.Math.pow;

public class Brain {
    double a,b;
    int quarter;
    public void findNumber(String complexNumber){
        StringBuilder number1= new StringBuilder();
        StringBuilder number2= new StringBuilder();
        char []complexNumberChars = complexNumber.toCharArray();
        int i=0;
        if(complexNumberChars[0]=='-' || complexNumberChars[0]=='+') i++;
        while(complexNumberChars[i]!='+' && complexNumberChars[i]!='-') i++;
        for(int j=0;j<i-1;j++){
            number1.append(Character.toString(complexNumberChars[j]));
        }
        while(i<complexNumberChars.length-1){
            number2.append(Character.toString(complexNumberChars[i++]));
        }
        a = Double.parseDouble(number1.toString());
        b = Double.parseDouble(number2.toString());
    }
    public int findQuarter(){
        if(a>0){
            if(b>0) quarter=1;
            else quarter=4;
        }else{
            if(b>0) quarter=2;
            else quarter=3;
        }
        return quarter;
    }
    public double findFi(){
        double fi;
        switch(quarter){
            case 1:
            case 4:
                fi=Math.atan(b/a);
                return fi;
            case 2:
                fi=Math.PI+Math.atan(b/a);
                return fi;
            case 3:
                fi=-Math.PI+Math.atan(b/a);
                return fi;
        }
        return -1;
    }
    public double findModule(){
        double module;
        module=Math.sqrt((pow(a,2))+ pow(b,2));
        return module;
    }
    public double findRoot(int extent,int k){
        double root;
        root= pow(findModule(),(1/extent))*((Math.cos((findFi()+2*Math.PI*k))/extent)+(Math.sin((findFi()+2*Math.PI*k)/extent)));
        return root;
    }
    Brain(String complexNumber){
        findNumber(complexNumber);
        findQuarter();
    }
}
