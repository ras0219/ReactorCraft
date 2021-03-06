package Reika.ReactorCraft.Auxiliary.Lua;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import Reika.ReactorCraft.Base.TileEntityReactorBase;

public class LuaReactorGetName extends LuaMethod {

	public LuaReactorGetName() {
		super("getName", TileEntityReactorBase.class);
	}

	@Override
	public Object[] invoke(TileEntity te, Object[] args) throws Exception {
		return new Object[]{((TileEntityReactorBase)te).getName()};
	}

	@Override
	public String getDocumentation() {
		return "Returns the name of the machine.";
	}

	@Override
	public String getArgsAsString() {
		return "";
	}

}
