import java.util.Scanner;

public class Console {

    private TxTConverter converter = new TxTConverter();

    public Console(TxTConverter converter){

        this.converter = converter;

        while(1==1){
            run();
        }

    }

    public void SetFile(String s){

        converter.SetFile(s);
        System.out.println("Filepath: "+s);

    }

    public void ConvertFile(){
        converter.ConvertFile();
        System.out.println("Converted");
    }

    public void GetTxTContent(){

        System.out.println("TxTContent:");

        for (int i = 0;i<converter.TxTContent().length;i++){
            System.out.println(converter.TxTContent()[i]);
        }
    }

    public void run(){
        Scanner s = new Scanner(System.in);
        String comand = s.next();


        switch (comand){
            case "Content":

                GetTxTContent();

                break;

            case "setFile":

                System.out.println("Write filepath");
                SetFile(s.next());

                break;

            case "convert":

                ConvertFile();

                break;

            case "close":

                System.exit(0);
                s.close();
                break;


        }

    }

}
