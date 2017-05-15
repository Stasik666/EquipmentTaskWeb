package by.htp.sportequip.command;

import static by.htp.sportequip.util.ConstantValue.ACTION_AUTHORISE;
import static by.htp.sportequip.util.ConstantValue.ACTION_MAKE_ORDER;
import static by.htp.sportequip.util.ConstantValue.ACTION_ORDER;

public class CommandChooser {

	public static CommandAction chooseAction(String action) {
		switch (action) {
		case ACTION_AUTHORISE:
			System.out.println("Login action" + action);
			return new LoginCommandAction();
		case ACTION_MAKE_ORDER:
			System.out.println("Create order action" + action);
			return new OrderCreateAction();
		case ACTION_ORDER:
			System.out.println("Make order action" + action);
			return new MakeOrderAction();
		}
		///STUB!!!!
		return null;
	}
}
