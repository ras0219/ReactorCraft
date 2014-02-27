/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.ReactorCraft.TileEntities.TileEntityWasteStorage;

public class ContainerWasteStorage extends CoreContainer {

	public ContainerWasteStorage(EntityPlayer player, TileEntityWasteStorage te) {
		super(player, te);

		this.addSlotToContainer(new Slot(te, 0, 70, 20));
		this.addSlotToContainer(new Slot(te, 1, 90, 20));

		this.addSlotToContainer(new Slot(te, 2, 50, 40));
		this.addSlotToContainer(new Slot(te, 3, 70, 40));
		this.addSlotToContainer(new Slot(te, 4, 90, 40));
		this.addSlotToContainer(new Slot(te, 5, 110, 40));

		this.addSlotToContainer(new Slot(te, 6, 50, 60));
		this.addSlotToContainer(new Slot(te, 7, 70, 60));
		this.addSlotToContainer(new Slot(te, 8, 90, 60));
		this.addSlotToContainer(new Slot(te, 9, 110, 60));

		this.addSlotToContainer(new Slot(te, 10, 70, 80));
		this.addSlotToContainer(new Slot(te, 11, 90, 80));

		this.addPlayerInventoryWithOffset(player, 0, 20);
	}

}
