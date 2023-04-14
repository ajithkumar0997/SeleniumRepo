package week2.day2;


public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Text="Welcome to Chennai";
int maxchar=256;
int count[] = new int[maxchar];
int len = Text.length();
for (int i = 0; i < len; i++) {
    count[Text.charAt(i)]++;
	}
char ch[] = new char[Text.length()];
for (int i = 0; i < len; i++) {
    ch[i] = Text.charAt(i);
    int find = 0;
    for (int j = 0; j <= i; j++) {

        if (Text.charAt(i) == ch[j]) {
            find++;
    }
    }
    if (find == 1) {
        System.out.println(
            "Number of Occurrence of "
            + Text.charAt(i)
            + " is:" + count[Text.charAt(i)]);
}

}
}
}

