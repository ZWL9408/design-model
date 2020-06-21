package com.state;

public class DayState implements State {
	private static DayState singleton = new DayState();

	public DayState() {
	}

	public static State getInstance(){
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		if (hour<9||17<=hour){
			context.changeState(NightState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("use money held(daytime)");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("press alarm button(daytime)");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("normally speaking(daytime)");
	}
	@Override
	public String toString(){
		return "[daytime]";
	}
}
