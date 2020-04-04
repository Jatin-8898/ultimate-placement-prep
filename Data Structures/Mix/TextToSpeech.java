import com.sun.speech.engine;
import com.sun.speech.freetts;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import java.io.FileInputStream;


public class TextToSpeech {



void call(String msg){
    System.out.println("U r here");
    Voice voice;
    FreeTTS freetts;
    System.out.println("---------************");
    VoiceManager vm=VoiceManager.getInstance();
    System.out.println("--------------////");
    voice=vm.getVoice("kevin16");
    System.setProperty("com.sun.speech.freetts.voice.defaultAudioPlayer", "com.sun.speech.freetts.audio.SingleFileAudioPlayer");
    FileInputStream fis ;
    SingleFileAudioPlayer sfap;
    if(voice==null)
        System.out.println("voice is null");
        System.out.println("---0---");
        if(voice!=null)
        {
        voice.allocate();
        }
    System.out.println("---1---");
    freetts=new FreeTTS(voice);
    String text = new String(msg);
    byte b[] = text.getBytes();
    if(b==null)
    {
        System.out.println("no byte array");
        System.exit(1);
    }
    try
    {
        sfap = (SingleFileAudioPlayer)voice.getDefaultAudioPlayer();
        sfap.write(b);


    }
    catch(Exception e)
    {

    }
voice.speak(msg);
voice.deallocate();

System.out.println("---------?????-----------");
try {
    System.out.println("inside copy try block");
    String command="copy \"C:\\Program Files\\Apache Software Foundation\\Apache Tomcat 6.0.18\\bin\\freetts.wav\" \"C:\\Program Files\\Apache Software Foundation\\Apache Tomcat 6.0.18\\webapps\"";
    System.out.println("copying file from "+command);
    Runtime.getRuntime().exec("cmd.exe /c"+command);
    System.out.println("file copied");
    } catch (Exception e) {
    e.printStackTrace();
    }

// freetts.setStreamingAudio(true);
// freetts.urlToSpeech("http://10.0.0.109:8084/");
System.out.println("---2---");
// freetts.setAudioFile("c:\\test.wav");
// freetts.shutdown();
System.out.println("calling wav file");
//AePlayWave aw=new AePlayWave("C:/Program Files/Apache Software Foundation/Apache Tomcat 6.0.18/bin/freetts.wav");


System.out.println("---last---");

}
/*Main(){

}*/
// static Voice voice;
// static FreeTTS freetts;
// static
// {
// voice=VoiceManager.getInstance().getVoice("kevin16");
// if(voice!=null)
// {
// voice.allocate();
// }
// freetts=new FreeTTS(voice);
// voice.speak("hello,world");
//
// freetts.startup();
// freetts.urlToSpeech("http://10.0.0.109:8080/");
// freetts.setAudioFile("c:/test.wav");
// freetts.shutdown();
// }
void Main(String str){

System.out.println("Inside main");
//freetts.setAudioFile("c:/test.wav");
}
public static void main(String[] args)throws Exception {
// TODO code application logic here
}

}