/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRRollerCoaster
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_runner_voidTovoid;
	public Cap_ext_ JRget_op_runner_voidTovoid() {
		return op_runner_voidTovoid;
	}
	public void JRset_op_runner_voidTovoid(Cap_ext_ op_runner_voidTovoid) {
		this.op_runner_voidTovoid = op_runner_voidTovoid;
	}

	public JRRollerCoaster(JRRollerCoaster copy)
	{
	this.op_runner_voidTovoid = copy.op_runner_voidTovoid;

	}
	public JRRollerCoaster(Object ... opSig)
	{
	this.op_runner_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRRollerCoaster(boolean dummy)	{
	    super(dummy);
	this.op_runner_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRRollerCoaster(true);
	}
    }
