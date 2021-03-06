/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.TileEntities.PowerGen;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import Reika.ReactorCraft.Base.TileEntityTankedReactorMachine;
import Reika.ReactorCraft.Registry.ReactorBlocks;
import Reika.ReactorCraft.Registry.ReactorTiles;
import Reika.ReactorCraft.Registry.WorkingFluid;
import Reika.RotaryCraft.Base.TileEntity.TileEntityPiping.Flow;
import Reika.RotaryCraft.Registry.MachineRegistry;
import buildcraft.api.transport.IPipeTile.PipeType;

public class TileEntityCondenser extends TileEntityTankedReactorMachine {

	@Override
	public int getIndex() {
		return ReactorTiles.CONDENSER.ordinal();
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		thermalTicker.update();
		//this.getSteam(world, x, y, z);
		if (world.getBlockId(x, y-1, z) == ReactorBlocks.STEAM.getBlockID() && !tank.isFull() && temperature < 100 && !world.isRemote) {
			int smeta = world.getBlockMetadata(x, y-1, z);
			Fluid f = this.getFluidFromSteamMetadata(smeta);
			//ReikaJavaLibrary.pConsole(f.getName());
			if (tank.isEmpty() || tank.getActualFluid().equals(f)) {
				world.setBlock(x, y-1, z, 0);
				tank.addLiquid(TileEntityReactorBoiler.WATER_PER_STEAM, f);
			}
		}

		this.balance(world, x, y, z);
		//tank.addLiquid(100, ReactorCraft.H2O_lo);
	}

	private Fluid getFluidFromSteamMetadata(int smeta) {
		if ((smeta&4) != 0)
			return FluidRegistry.getFluid("lowpammonia");
		return FluidRegistry.getFluid("lowpwater");
	}

	private void balance(World world, int x, int y, int z) {
		for (int i = 0; i < 6; i++) {
			ForgeDirection dir = dirs[i];
			int dx = x+dir.offsetX;
			int dy = y+dir.offsetY;
			int dz = z+dir.offsetZ;
			ReactorTiles rt = ReactorTiles.getTE(world, dx, dy, dz);
			if (rt == ReactorTiles.CONDENSER) {
				TileEntityCondenser te = (TileEntityCondenser)world.getBlockTileEntity(dx, dy, dz);
				int dL = te.tank.getLevel() - tank.getLevel();
				if (dL/4 > 0) {
					tank.addLiquid(dL/4, FluidRegistry.WATER);
					te.tank.removeLiquid(dL/4);
				}
			}
		}
	}

	@Override
	public void animateWithTick(World world, int x, int y, int z) {

	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		int maxDrain = resource.amount;
		if (this.canDrain(from, resource.getFluid()) && this.isValidFluid(resource.getFluid())) {
			return tank.drain(maxDrain, doDrain);
		}
		return null;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		//ReikaJavaLibrary.pConsole(from, Side.SERVER);
		if (this.canDrain(from, null)) {
			return tank.drain(maxDrain, doDrain);
		}
		return null;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return from == ForgeDirection.UP;
	}

	@Override
	public boolean canConnectToPipe(MachineRegistry m) {
		return m == MachineRegistry.PIPE;
	}

	@Override
	public int getCapacity() {
		return 12000;
	}

	@Override
	public boolean canReceiveFrom(ForgeDirection from) {
		return false;
	}

	@Override
	public Fluid getInputFluid() {
		return null;
	}

	@Override
	public void readFromNBT(NBTTagCompound NBT)
	{
		super.readFromNBT(NBT);

		tank.readFromNBT(NBT);
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound NBT)
	{
		super.writeToNBT(NBT);

		tank.writeToNBT(NBT);
	}

	@Override
	public boolean isValidFluid(Fluid f) {
		return WorkingFluid.isWorkingFluid(f);
	}

	@Override
	public ConnectOverride overridePipeConnection(PipeType type, ForgeDirection with) {
		return type == PipeType.FLUID ? (with == ForgeDirection.UP ? ConnectOverride.CONNECT : ConnectOverride.DISCONNECT) : ConnectOverride.DEFAULT;
	}

	@Override
	public boolean canConnectToPipeOnSide(MachineRegistry p, ForgeDirection side) {
		return side == ForgeDirection.UP && this.canConnectToPipe(p);
	}

	@Override
	public Flow getFlowForSide(ForgeDirection side) {
		return side == ForgeDirection.UP ? Flow.OUTPUT : Flow.NONE;
	}

}
