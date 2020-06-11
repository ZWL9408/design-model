package framework;

public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		shoWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
