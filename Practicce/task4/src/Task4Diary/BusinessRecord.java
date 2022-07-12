package Task4Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class BusinessRecord {

    private ArrayList<Word> words = new ArrayList<Word>();
    private String executeDate;
    private String createdWhen;

    public BusinessRecord() {
    }

    public BusinessRecord(String[] words) {
        for (int i = 0; i < words.length; i++) {
            this.words.add(new Word(words[i]));
        }
    }


    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String date) {
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 8));
        int hour = Integer.parseInt(date.substring(10, 12));
        int minute = Integer.parseInt(date.substring(13));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy; HH:mm");
        executeDate = dtf.format(LocalDateTime.of(year, month, day, hour, minute));
    }

    public String getCreatedWhen() {
        return createdWhen;
    }

    public void setCreatedWhen() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy; HH:mm");
        createdWhen = dtf.format(LocalDateTime.now());
    }

    public int getWordsCount() {
        return words.size();
    }

    public Word getWordByPosition(int pos) {
        return words.get(pos - 1);
    }

    public String getOriginalSentence() {
        String str = "";
        for (int i = 0; i < words.size(); i++) {
            str += (words.get(i).getOriginalWord() + " ");
        }
        return str;
    }

    public void printRecord() {
        System.out.println(getOriginalSentence() + "; Дата создания: "
                + getCreatedWhen() + "; Дата выполнения: " + getExecuteDate());
    }


}
