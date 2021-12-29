package Utilities;

import Pages.BasketPage;
import Pages.ConfirmationPage;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Pages.ShopPage;

public class PageInitializer extends Driver {

	public static HomePage hp;
	public static ShopPage sp;
	public static ItemPage ip;
	public static BasketPage bp;
	public static PaymentPage pp;
	public static ConfirmationPage cp;
	public static LoginPage lp;
	public static DashboardPage dp;

	public static void initializer() {

		hp = new HomePage();
		sp = new ShopPage();
		ip = new ItemPage();
		bp = new BasketPage();
		pp = new PaymentPage();
		cp = new ConfirmationPage();
		lp = new LoginPage();
		dp = new DashboardPage();
	}
}
