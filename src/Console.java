import java.util.Scanner;

public class Console {

    private TxTConverter converter = new TxTConverter();

    public Console(TxTConverter converter){

        this.converter = converter;

        while(1==1){
            run();
        }

    }

    public void convertFile(String s){

        converter.convertFile(s);
        System.out.println("File: "+s+" "+"converted");

    }

    public void getTxTContent(){

        System.out.println("TxTContent:");

        for (int i = 1;i<converter.TxTContent().length;i++){
            System.out.println(converter.TxTContent()[i].data+" : "+converter.TxTContent()[i].usage);
        }
    }

    public void sort(){

        converter.sort();
        System.out.println("File sorted");

    }

    public void run(){
        Scanner s = new Scanner(System.in);
        String comand = s.next();


        switch (comand){
            case "content":

                getTxTContent();

                break;

            case "convertFile":

                System.out.println("Write filepath");
                convertFile(s.next());

                break;

            case "sort":

                sort();

                break;

            case "close":

                System.exit(0);
                s.close();
                break;


        }

    }

}
