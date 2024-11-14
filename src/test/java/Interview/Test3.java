package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test3 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://public.karat.io/content/urls2.txt");
			// URL url = new URL("https://public.karat.io/content/q015/single_url.txt");

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputline;
			while ((inputline = in.readLine()) != null) {

				System.out.println(inputline);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
