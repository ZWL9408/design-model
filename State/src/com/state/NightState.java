package com.state;

public class NightState implements State{
	private static NightState singleton = new NightState();

	public NightState() {
	}
	public static State getInstance(){
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		if (9<=hour&&hour<17){
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("urgent, use the money held at night");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("press the alarm button(at night)");
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("speaking recording at night");
	}
	@Override
	public String toString(){
		return "[at night]";
	}
}
