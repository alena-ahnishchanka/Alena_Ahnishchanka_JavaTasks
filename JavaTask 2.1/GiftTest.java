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
        candyList.add(new LollipopCandy ("Barbaris", 85.5));
        candyList.add(new PureBlackChocolateCandy ("Ferrero Rocher", 32));
        candyList.add(new ChocolateWithWafflesCandy ("Mishka na severe", 56.5));
        candyList.add(new ToffeeCandy ("BelochkaToffeeBig", 44.5));
        candyList.add(new ChocolateWithJellyCandy("BelochkaJelly", 60));
        candyList.add(new ToffeeCandy("BelochkaToffeeLittle", 20));

// ����� ������ �������� ���� ������ � ������� �� ����������:
        System.out.println("List of candies in the gift before sorting: ");
        System.out.println();

        for (Candy d : candyList) {
            System.out.println(d.getName() + " " + d.getWeight() + "g");
        }

// ���������� ������ �� �������� � ����� ��������������� ������
        Collections.sort(candyList, new CandyNameComparator());
        System.out.println();
        System.out.println("Order of candies sorted by name: ");
        System.out.println();

        for(int i=0; i < candyList.size(); i++){
            System.out.println(candyList.get(i).getName() + " " + candyList.get(i).getWeight() + "g");
        }

// ����������� ���� ���� ������ � �������:
        for(int i=0; i < candyList.size(); i++){
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
        for(int i=0; i < bubbleGumList.size(); i++){
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
        for(int i=0; i < cookieList.size(); i++){
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
    }
}

