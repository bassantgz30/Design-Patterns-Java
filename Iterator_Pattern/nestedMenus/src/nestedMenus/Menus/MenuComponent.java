package nestedMenus.Menus;

public abstract class MenuComponent {
	
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

}
