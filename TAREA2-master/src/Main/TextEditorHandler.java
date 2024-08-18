/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Usuario
 */
public class TextEditorHandler {
    public String translateToMurcielago(String text){
        StringBuilder translatedText = new StringBuilder();
        for (char c : text.toCharArray()){
            switch(Character.toLowerCase(c)){
                case'm':translatedText.append('0'); break;
                case'u':translatedText.append('1'); break;
                case'r':translatedText.append('2'); break;
                case'c':translatedText.append('3'); break;
                case'i':translatedText.append('4'); break;
                case'e':translatedText.append('5'); break;
                case'l':translatedText.append('6'); break;
                case'a':translatedText.append('7'); break;
                case'g':translatedText.append('8'); break;
                case'o':translatedText.append('9'); break;
                default: translatedText.append(c);
            }
        }
        return translatedText.toString();
    }
}
