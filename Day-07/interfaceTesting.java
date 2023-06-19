interface bank{
    float rateOfInterest();
}

class SBI implements bank{
    public float rateOfInterest(){
        return 7.95f;
    }
}

class AndhraBank implements bank{
    public float rateOfInterest(){
        return 7.80f;
    }
}

class HDFC implements bank{
    public float rateOfInterest(){
        return 8.00f;
    }
}

public class interfaceTesting {
    public static void main(String[] args){
        bank mysbi = new SBI();
        System.out.println(mysbi.rateOfInterest() + "%");
    }
}

