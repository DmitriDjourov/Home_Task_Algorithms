package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
		public static void main(String[] args) throws IOException {
				FileInputStream fis = new FileInputStream("temp.out");
				ObjectInputStream oin = new ObjectInputStream(fis);
				try {
						TestSerial ts = (TestSerial) oin.readObject();
						System.out.println("verstion = " +
								                   ts.version);
						System.out.println("count = " +
								                   ts.count);
				} catch (ClassNotFoundException e) {
						throw new RuntimeException(e);
				}
		}
}
