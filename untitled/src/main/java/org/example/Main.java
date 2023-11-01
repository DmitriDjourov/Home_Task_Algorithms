package org.example;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
		public static void main(String[] args) throws Exception {
				FileOutputStream fos = new FileOutputStream("temp.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				TestSerial ts = new TestSerial();

				oos.writeObject(ts);
				oos.flush();
				oos.close();
		}

}


class TestSerial implements Serializable {
		public byte version = 100;
		public byte count = 0;
}
