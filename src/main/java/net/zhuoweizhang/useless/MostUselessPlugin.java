package net.zhuoweizhang.useless;
import org.spout.api.plugin.CommonPlugin;
public class MostUselessPlugin extends CommonPlugin {
	@Override
	public void onDisable() {
		getLogger().info(getName() + " has been disabled!");
	}

	@Override
	public void onEnable() {
		pdfFile = getDescription();
		getLogger().info(getName() + " has been enabled!");
		getEngine().getPluginManager().disablePlugin(this);
	}
}
