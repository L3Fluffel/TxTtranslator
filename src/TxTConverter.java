import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxTConverter {

    private File f;
    private String[] s;
    private DataString[] Strings;


    public TxTConverter(){

    }

    public void convertFile(String s){

        f = new File(s);

        try {

            Scanner count = new Scanner(f);
            int numberofstrings = 0;

            while (count.hasNext()){

                numberofstrings +=1;
                count.next();

            }

            if(!count.hasNext()){
                count.close();


                Scanner read = new Scanner(f);

                while (read.hasNext()){

                    Strings = new DataString[numberofstrings];


                    for (int i = 0;i<numberofstrings;i++){
                        Strings[i] = new DataString("",1);
                        Strings[i].data = read.next();

                    }

                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void sort(){

        for(int i = 1;i<Strings.length;i++){

            for(int a = 1;a<Strings.length;a++){

                if(Strings[i].data == Strings[a].data){
                    if(i == a){

                    }
                    else {
                    Strings[i].usage += 1;

                    }
                }




            }

        }



    }

    public DataString[] TxTContent() {
        return Strings;
    }


}
