/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRMain
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_runner_intTovoid;
	public Cap_ext_ JRget_op_runner_intTovoid() {
		return op_runner_intTovoid;
	}
	public void JRset_op_runner_intTovoid(Cap_ext_ op_runner_intTovoid) {
		this.op_runner_intTovoid = op_runner_intTovoid;
	}

	public JRMain(JRMain copy)
	{
	this.op_runner_intTovoid = copy.op_runner_intTovoid;

	}
	public JRMain(Object ... opSig)
	{
	this.op_runner_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRMain(boolean dummy)	{
	    super(dummy);
	this.op_runner_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRMain(true);
	}
    }