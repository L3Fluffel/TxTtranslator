import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxTConverter {

    private File f;
    private String[] s;
    private String recreation;


    public TxTConverter(){

    }

    public void SetFile(String s){
        f = new File(s);

    }

    public void ConvertFile(){
        try {

            Scanner count = new Scanner(f);
            int numberofstrings = 0;

            while (count.hasNext()){

                numberofstrings +=1;
                count.next();

            }

            if(!count.hasNext()){
                count.close();

                s = new String[numberofstrings];
                Scanner read = new Scanner(f);

                while (read.hasNext()){

                    for (int i = 0;i<numberofstrings;i++){
                        s[i] = read.next();

                    }

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String[] TxTContent() {
        return s;
    }


}
