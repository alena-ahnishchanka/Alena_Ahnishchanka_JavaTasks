package Gift;

import Gift.Box.MetalBox;
import Gift.Content.BubbleGum;
import Gift.Content.BubbleGums.Fruit.BananaBubbleGum;
import Gift.Content.BubbleGums.Other.CocaColaBubbleGum;
import Gift.Content.Candies.Chocolate.ChocolateWithJelly.ChocolateWithJellyCandy;
import Gift.Content.Candies.Chocolate.ChocolateWithWaffles.ChocolateWithWafflesCandy;
import Gift.Content.Candies.Chocolate.PureBlackChocolate.PureBlackChocolateCandy;
import Gift.Content.Candies.Lollipop.LollipopCandy;
import Gift.Content.Candies.Toffee.ToffeeCandy;
import Gift.Content.Candy;
import Gift.Content.Cookie;
import Gift.Content.Cookies.Chocolate.ChocolateCookie;
import Gift.Content.Cookies.Shortbread.ShortbreadCookie;
import Gift.Exceptions.FileDoesNotExistException;
import Gift.Exceptions.NullCandyNameException;
import Gift.Exceptions.RemoveNotExistingElementException;
import Gift.IOStreamsReadWrite.IOStreamsReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */

public class GiftTest {

    public static void main(String[] args) {

        // �������� ������ ��� �������� ������ � �� �������
        ArrayList<Candy> candyList = new ArrayList<>();

// ���������� ������ � ������� (������)
// catch ArithmeticException
        try {
            candyList.add(new LollipopCandy("Barbaris", 85.5));
            candyList.add(new PureBlackChocolateCandy("Ferrero Rocher", 32));
            candyList.add(new ChocolateWithWafflesCandy("Mishka na severe", 56.5));
            candyList.add(new ToffeeCandy("BelochkaToffeeBig", 44.5));
            candyList.add(new ChocolateWithJellyCandy("BelochkaJelly", 60));
            candyList.add(new ToffeeCandy("BelochkaToffeeLittle", 20));
            candyList.add(new ToffeeCandy(null, 20));
            candyList.add(new ToffeeCandy("BelochkaNewException", 5 / 0));
        } catch (ArithmeticException ar) {
            System.out.println();
            System.out.println("!!!   ArithmeticException is catched: division by zero. Please specify a correct content weight.");
        }

        try {
            candyList.remove(75);
        } catch (IndexOutOfBoundsException e) {
            try {
                throw new RemoveNotExistingElementException("!!!   RemoveNotExistingElementException is catched: misuse of a blank link");
            } catch (RemoveNotExistingElementException r) {
                System.out.println();
                System.out.println("!!!   RemoveNotExistingElementException is catched: misuse of a blank link. Please specify an existing index of the item you want to remove from array list.");
            }

// ����� ������ �������� ���� ������ � ������� �� ����������:

            System.out.println();
            System.out.println("List of candies in the gift before sorting: ");
            System.out.println();

                for (Candy d : candyList) {
                    System.out.println(d.getName() + " " + d.getWeight() + "g");
                }


// ���������� ������ �� �������� � ����� ��������������� ������
// catch NullPointerException

            try {
                Collections.sort(candyList, new CandyNameComparator());
            } catch (NullPointerException n) {
                System.out.println();
                System.out.println("!!!   NullPointerException is catched: misuse of a blank link. Please specify a not-null name of the item.");
            }

// wrap NullPointerException into NullGiftItemNameException

            System.out.println();
            System.out.println("Order of candies sorted by name: ");

            try {
                Collections.sort(candyList, new CandyNameComparator());
            } catch (NullPointerException nu) {
                try {
                    throw new NullCandyNameException("Null candy name was used.");
                } catch (NullCandyNameException ng) {
                    System.out.println();
                    System.out.println("!!!   NullGiftItemNameException is catched: null candy name was used. Please specify a correct name for the item.");
                    System.out.println();
                }
            }


// catch IndexOutOfBoundsException
            try {
                for (int i = 0; i < candyList.size() + 1; i++) {
                    System.out.println(candyList.get(i).getName() + " " + candyList.get(i).getWeight() + "g");
                }
            } catch (IndexOutOfBoundsException i) {
                System.out.println();
                System.out.println("!!!   IndexOutOfBoundsException is catched: index type out of range. Please specify an existing index of array list.");
            }

// catch ArrayIndexOutOfBoundsException
            try {
                for (int i = -1; i < candyList.size(); i++) {
                    System.out.println(candyList.get(i).getName() + " " + candyList.get(i).getWeight() + "g");
                }
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println();
                System.out.println("!!!   ArrayIndexOutOfBoundsException is catched: index element is out of bounds. Please specify an existing index of array list.");
            }

// ����������� ���� ���� ������ � �������:
            for (int i = 0; i < candyList.size(); i++) {
                GiftWeight.candiesWeight += candyList.get(i).getWeight();
            }
            System.out.println();
            System.out.println("Candies total weight = " + GiftWeight.candiesWeight);

// ����� ���������� � ����� �������� ������, ��������������� ��������� ��������� ����������
            System.out.println();
            System.out.println("Candies that correspond to a range of parameters: ");
            System.out.println();

            for (Candy d : candyList) {
                if (d.contentWeight > 20 && (d.toffee == true || d.chocolateWithJelly == true)) {
                    System.out.println(d.getName() + " " + d.getWeight() + "g");
                }
            }

// ���������� ������ � �������, ����� ������ �������� ���� ������ � �������:
            ArrayList<BubbleGum> bubbleGumList = new ArrayList<>();
            bubbleGumList.add(new CocaColaBubbleGum("Cola Aromali", 25.0));
            bubbleGumList.add(new BananaBubbleGum("Bombibom Banana", 28.0));

            System.out.println();
            System.out.println("List of bubble gums in the gift: ");
            System.out.println();

            for (BubbleGum d : bubbleGumList) {
                System.out.println(d.getName() + " " + d.getWeight() + "g");
            }

// ����������� ���� ���� ������ � �������:
            for (int i = 0; i < bubbleGumList.size(); i++) {
                GiftWeight.bubbleGumsWeight += bubbleGumList.get(i).getWeight();
            }
            System.out.println();
            System.out.println("Bubble gums total weight = " + GiftWeight.bubbleGumsWeight);

// ���������� ������� � �������, ����� ������ �������� ����� ������� � �������:
            ArrayList<Cookie> cookieList = new ArrayList<>();
            cookieList.add(new ShortbreadCookie("Princess", 65.5));
            cookieList.add(new ChocolateCookie("ChocoPie", 45.0));
            cookieList.add(new ChocolateCookie("ChocoPie", 45.0));
            cookieList.add(new ChocolateCookie("ChocoPie", 45.0));
            cookieList.add(new ChocolateCookie("Hello Cookies", 90.0));

            System.out.println();
            System.out.println("List of cookies in the gift: ");
            System.out.println();

            for (Cookie d : cookieList) {
                System.out.println(d.getName() + " " + d.getWeight() + "g");
            }

// ����������� ���� ����� ������� � �������:
            for (int i = 0; i < cookieList.size(); i++) {
                GiftWeight.cookiesWeight += cookieList.get(i).getWeight();
            }
            System.out.println();
            System.out.println("Cookies total weight = " + GiftWeight.cookiesWeight);

// ���������� �������, ����� �� ���� � ����
            MetalBox mbox1 = new MetalBox(100);
            mbox1.giftBoxInfo();

// ����������� � ����� ���� ����� �������:
            System.out.println();
            GiftWeight giftWeight = new GiftWeight();
            giftWeight.giftWeight();
            System.out.println();

// catch IllegalAccessException
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException ia) {
                System.out.println("!!!   IllegalAccessException is catched: access to the class is forbidden. Just for fun.");
                System.out.println();
            }


// Reading data from file / writing data to file using I/O Streams (with exception):

            File source = new File("source.txt");
            File dest = new File("dest.txt");

            source.delete();
            dest.delete();

// catch IOException

            try {
                IOStreamsReadWrite stream = new IOStreamsReadWrite();
            } catch (IOException e1) {
                    System.out.println("!!!   IOException is catched: specified file is not found. Please check the file's existence.");
//                    e1.printStackTrace();
                    System.out.println();

                }

// wrap IOException in FileDoesNotExistException
// catch FileDoesNotExistException

            try {
                IOStreamsReadWrite stream = new IOStreamsReadWrite();
            } catch (IOException e1) {
                try {
                    throw new FileDoesNotExistException("(�� ������� ����� ��������� ����)");
                } catch (FileDoesNotExistException e2) {
                    System.out.println("!!!   FileDoesNotExistException is catched: specified file is not found. Please check the file's existence.");
//                    e2.printStackTrace();
                    System.out.println();
                }
            }

// create 'source' and 'dest' files for reading and writing data

            try {
                source.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            try {
                source.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

// Reading data from file / writing data to file using I/O Streams (successfully):

            try {
                IOStreamsReadWrite stream = new IOStreamsReadWrite();
                System.out.println("Reading data from file / writing data to file using I/O Streams was performed successfully.");
            } catch (IOException e1) {
                try {
                    throw new FileDoesNotExistException();
                } catch (FileDoesNotExistException e2) {
                    System.out.println("!!!   FileDoesNotExistException is catched: specified file is not found. Please check the file's existence.");
                    System.out.println();
                }
            }
        }
    }
}

