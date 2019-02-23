/**
 * 
 */
/**
 * @author Dr_Coungrations
 *
 */
package drcoungrations.drcoungrations_graphics_core;

import java.util.logging.Logger;

import drcoungrations.drcoungrations_graphics_core.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GraphicsCoreMod.MODID, name = GraphicsCoreMod.NAME, version = GraphicsCoreMod.VERSION, acceptedMinecraftVersions = GraphicsCoreMod.MC_VERSION)
public class GraphicsCoreMod {
	
	public static final String MODID = "dcgraphicscoremod";
	public static final String NAME = "Dr_Coungrations' Graphics Core";
	public static final String VERSION = "0.1 Dev";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "drcoungrations.drcoungrations_graphics_core.proxy.ClientProxy";
	public static final String SERVER = "drcoungrations.drcoungrations_graphics_core.proxy.ServerProxy";
	
	@SidedProxy(clientSide = GraphicsCoreMod.CLIENT, serverSide = GraphicsCoreMod.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
	}

}
