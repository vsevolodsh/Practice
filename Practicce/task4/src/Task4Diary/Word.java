package Task4Diary;

public class Word {
    private char[] word;

    public Word(String word) {
        if (word.equals("")) {
            throw new IllegalArgumentException("Слово не может быть пустым");
        }
            this.word = word.toCharArray();
    }

    public char[] getWord() {
        return word;
    }

    public int getSymbolCount(){
        return word.length;
    }

    public String getOriginalWord(){
        return new String(word);
    }

}
