package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://public.karat.io/content/urls2.txt");
			// URL url = new URL("https://public.karat.io/content/q015/single_url.txt");

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputline;
			ArrayList<String> ar = new ArrayList<String>();
			while ((inputline = in.readLine()) != null) {

				ar.add(inputline);

			}
			// System.out.println(ar);
			in.close();

			int count = 0;
			int maxcount = 0;
			String MostRepeatedString = "";

			for (int i = 0; i < ar.size() - 1; i++) {
				count = 1;
				for (int j = i + 1; j < ar.size(); j++) {

					if (ar.get(i).equals(ar.get(j))) {
						count++;
					}
				}

				if (count > maxcount) {
					maxcount = count;
					MostRepeatedString = ar.get(i);
				}
			}

			System.out.println("Most repeated word: " + MostRepeatedString + " and Count is : " + maxcount);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
