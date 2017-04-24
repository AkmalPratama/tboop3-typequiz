import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asuspc on 4/24/2017.
 */
public class QuestionHandler {
  Question[] data;
  int level;

  QuestionHandler(int level) {
    this.level = level;
    data = new Question[25];
  }
  public void drawQuestion() throws IOException {
    if (level == 1) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("src/question/GeneralKnowledgeLvl1.txt")));
        String strLine;
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("src/question/MathLvl1.txt")));
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionMath(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("src/question/Typing1.txt")));
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionTyping(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
          br.close();
        }
    } else if (level == 2) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("src/question/GeneralKnowledgeLvl2.txt")));
        String strLine;
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 2);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("src/question/MathLvl2.txt")));
        try {
            while ((strLine = br.readLine()) != null) {
                String tempQuest;
                String tempAns;
                int i = 0;
                while(strLine.charAt(i) != '|') {
                    i++;
                }
                tempQuest = strLine.substring(0,i);
                i++;
                tempAns = strLine.substring(i,strLine.length());
                data[indeksData] = new QuestionMath(tempQuest, tempAns, 2);
                indeksData++;
            }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("src/question/Typing2.txt")));
        try {
            while ((strLine = br.readLine()) != null) {
                String tempQuest;
                String tempAns;
                int i = 0;
                while(strLine.charAt(i) != '|') {
                    i++;
                }
                tempQuest = strLine.substring(0,i);
                i++;
                tempAns = strLine.substring(i,strLine.length());
                data[indeksData] = new QuestionTyping(tempQuest, tempAns, 2);
                indeksData++;
            }
        } finally {
            br.close();
        }
    } else if (level == 3) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("src/question/GeneralKnowledgeLvl3.tc")));
      String strLine;
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
      br = new BufferedReader((new FileReader("src/question/MathLvl3.txt")));
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionMath(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
      br = new BufferedReader((new FileReader("src/question/Typing3.txt")));
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionTyping(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
    }
  }
}