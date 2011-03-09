/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRAlarm
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_timer_voidTovoid;
	public Cap_ext_ JRget_op_timer_voidTovoid() {
		return op_timer_voidTovoid;
	}
	public void JRset_op_timer_voidTovoid(Cap_ext_ op_timer_voidTovoid) {
		this.op_timer_voidTovoid = op_timer_voidTovoid;
	}

	public JRAlarm(JRAlarm copy)
	{
	this.op_timer_voidTovoid = copy.op_timer_voidTovoid;

	}
	public JRAlarm(Object ... opSig)
	{
	this.op_timer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRAlarm(boolean dummy)	{
	    super(dummy);
	this.op_timer_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRAlarm(true);
	}
    }
